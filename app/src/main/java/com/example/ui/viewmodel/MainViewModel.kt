package com.example.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.model.Difficulty
import com.example.data.model.MCQQuestion
import com.example.data.model.QuestionTypeInfo
import com.example.data.model.QuizSessionResult
import com.example.data.model.TimerMode
import com.example.data.model.UserAnswerRecord
import com.example.data.model.UserProfile
import com.example.data.model.WrittenQuestion
import com.example.data.repository.ChemistryQuestionsData
import com.example.data.repository.ChemistryRepository
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch

sealed class ScreenDestination {
    data object Home : ScreenDestination()
    data class Quiz(val typeId: Int) : ScreenDestination()
    data class WrittenStudy(val typeId: Int) : ScreenDestination()
    data class QuizResult(val result: QuizSessionResult) : ScreenDestination()
    data object Leaderboard : ScreenDestination()
    data object Profile : ScreenDestination()
}

data class QuizState(
    val typeId: Int = 1,
    val typeTitle: String = "",
    val questions: List<MCQQuestion> = emptyList(),
    val currentIndex: Int = 0,
    val selectedOptionIndex: Int? = null,
    val isAnswerRevealed: Boolean = false,
    val answersRecord: MutableList<UserAnswerRecord> = mutableListOf(),
    val timeSpentSeconds: Int = 0,
    val remainingSecondsForTimed: Int = 30,
    val timerMode: TimerMode = TimerMode.UNLIMITED,
    val isTimerRunning: Boolean = false,
    val correctCount: Int = 0,
    val wrongCount: Int = 0
) {
    val currentQuestion: MCQQuestion?
        get() = questions.getOrNull(currentIndex)

    val progress: Float
        get() = if (questions.isNotEmpty()) (currentIndex + 1) / questions.size.toFloat() else 0f
}

class MainViewModel(application: Application) : AndroidViewModel(application) {

    val repository = ChemistryRepository(application)
    val userProfile: StateFlow<UserProfile> = repository.userProfile
    val leaderboard = repository.leaderboard

    private val _currentScreen = MutableStateFlow<ScreenDestination>(ScreenDestination.Home)
    val currentScreen: StateFlow<ScreenDestination> = _currentScreen.asStateFlow()

    private val _quizState = MutableStateFlow(QuizState())
    val quizState: StateFlow<QuizState> = _quizState.asStateFlow()

    private val _homeSearchQuery = MutableStateFlow("")
    val homeSearchQuery: StateFlow<String> = _homeSearchQuery.asStateFlow()

    private val _selectedCategoryFilter = MutableStateFlow("ALL") // "ALL", "MCQ", "WRITTEN"
    val selectedCategoryFilter: StateFlow<String> = _selectedCategoryFilter.asStateFlow()

    private val _selectedDifficultyFilter = MutableStateFlow<Difficulty?>(null)
    val selectedDifficultyFilter: StateFlow<Difficulty?> = _selectedDifficultyFilter.asStateFlow()

    // Timer Job
    private var timerJob: Job? = null

    fun navigateTo(destination: ScreenDestination) {
        _currentScreen.value = destination
    }

    fun updateSearchQuery(query: String) {
        _homeSearchQuery.value = query
    }

    fun setCategoryFilter(category: String) {
        _selectedCategoryFilter.value = category
    }

    fun setDifficultyFilter(difficulty: Difficulty?) {
        _selectedDifficultyFilter.value = difficulty
    }

    fun getFilteredTypes(): List<QuestionTypeInfo> {
        val query = _homeSearchQuery.value.trim().lowercase()
        val category = _selectedCategoryFilter.value
        val diff = _selectedDifficultyFilter.value

        return repository.getAllTypes().filter { type ->
            val matchesQuery = query.isEmpty() ||
                    type.title.lowercase().contains(query) ||
                    type.subtitle.lowercase().contains(query) ||
                    type.id.toString() == query

            val matchesCategory = when (category) {
                "MCQ" -> !type.isWritten
                "WRITTEN" -> type.isWritten
                else -> true
            }

            val matchesDiff = diff == null || type.difficulty == diff

            matchesQuery && matchesCategory && matchesDiff
        }
    }

    // --- Quiz Management ---

    fun startQuiz(typeId: Int, timerMode: TimerMode = userProfile.value.preferredTimerMode) {
        val typeInfo = ChemistryQuestionsData.getTypeInfo(typeId)
        val questions = repository.getMCQsForType(typeId)
        if (questions.isEmpty()) return

        val initialRemaining = when (timerMode) {
            TimerMode.TIMED_30S -> 30
            TimerMode.TIMED_60S -> 60
            TimerMode.UNLIMITED -> 0
        }

        _quizState.value = QuizState(
            typeId = typeId,
            typeTitle = typeInfo?.title ?: "টাইপ $typeId",
            questions = questions,
            currentIndex = 0,
            selectedOptionIndex = null,
            isAnswerRevealed = false,
            answersRecord = mutableListOf(),
            timeSpentSeconds = 0,
            remainingSecondsForTimed = initialRemaining,
            timerMode = timerMode,
            isTimerRunning = true,
            correctCount = 0,
            wrongCount = 0
        )

        startTimer()
        _currentScreen.value = ScreenDestination.Quiz(typeId)
    }

    private fun startTimer() {
        timerJob?.cancel()
        timerJob = viewModelScope.launch {
            while (isActive && _quizState.value.isTimerRunning) {
                delay(1000)
                val state = _quizState.value
                val newSpent = state.timeSpentSeconds + 1

                if (state.timerMode == TimerMode.UNLIMITED) {
                    _quizState.value = state.copy(timeSpentSeconds = newSpent)
                } else {
                    val remaining = state.remainingSecondsForTimed - 1
                    if (remaining <= 0) {
                        // Time's up for current question: auto reveal or move
                        if (!state.isAnswerRevealed) {
                            submitAnswer(-1) // timeout marked
                        }
                    } else {
                        _quizState.value = state.copy(
                            timeSpentSeconds = newSpent,
                            remainingSecondsForTimed = remaining
                        )
                    }
                }
            }
        }
    }

    fun selectOption(index: Int) {
        val state = _quizState.value
        if (state.isAnswerRevealed) return // cannot change after reveal
        _quizState.value = state.copy(selectedOptionIndex = index)
    }

    fun submitAnswer(forcedIndex: Int? = null) {
        val state = _quizState.value
        if (state.isAnswerRevealed) return

        val chosen = forcedIndex ?: state.selectedOptionIndex
        val q = state.currentQuestion ?: return
        val isCorrect = chosen == q.correctIndex

        val newRecord = UserAnswerRecord(
            questionId = q.id,
            selectedIndex = chosen ?: -1,
            correctIndex = q.correctIndex,
            timeSpentSeconds = state.timeSpentSeconds
        )

        val updatedRecords = state.answersRecord.toMutableList().apply { add(newRecord) }
        val newCorrect = if (isCorrect) state.correctCount + 1 else state.correctCount
        val newWrong = if (!isCorrect) state.wrongCount + 1 else state.wrongCount

        _quizState.value = state.copy(
            selectedOptionIndex = chosen,
            isAnswerRevealed = true,
            answersRecord = updatedRecords,
            correctCount = newCorrect,
            wrongCount = newWrong
        )
    }

    fun nextQuestion() {
        val state = _quizState.value
        if (state.currentIndex + 1 < state.questions.size) {
            val initialRemaining = when (state.timerMode) {
                TimerMode.TIMED_30S -> 30
                TimerMode.TIMED_60S -> 60
                TimerMode.UNLIMITED -> 0
            }
            _quizState.value = state.copy(
                currentIndex = state.currentIndex + 1,
                selectedOptionIndex = null,
                isAnswerRevealed = false,
                remainingSecondsForTimed = initialRemaining
            )
        } else {
            finishQuiz()
        }
    }

    fun finishQuiz() {
        timerJob?.cancel()
        val state = _quizState.value
        val total = state.questions.size
        val correct = state.correctCount
        val wrong = state.wrongCount
        val unattempted = (total - correct - wrong).coerceAtLeast(0)
        val score = (correct * 10) - (wrong * 2).coerceAtLeast(0)
        val accuracy = if (total > 0) ((correct.toDouble() / total) * 100).toInt() else 0

        val sessionResult = QuizSessionResult(
            typeId = state.typeId,
            typeTitle = state.typeTitle,
            totalQuestions = total,
            correctCount = correct,
            wrongCount = wrong,
            unattemptedCount = unattempted,
            totalScore = score,
            totalTimeSeconds = state.timeSpentSeconds,
            accuracy = accuracy,
            answers = state.answersRecord
        )

        repository.recordQuizResult(sessionResult)
        _currentScreen.value = ScreenDestination.QuizResult(sessionResult)
    }

    fun toggleBookmarkMCQ(questionId: String) {
        repository.toggleBookmarkMCQ(questionId)
    }

    fun toggleBookmarkWritten(questionId: String) {
        repository.toggleBookmarkWritten(questionId)
    }

    fun toggleMasteredWritten(questionId: String) {
        repository.toggleMasteredWritten(questionId)
    }

    fun updateProfile(name: String, avatarId: String) {
        repository.updateProfile(name, avatarId)
    }

    fun setTimerMode(mode: TimerMode) {
        repository.setTimerMode(mode)
    }

    fun setDarkTheme(setting: String) {
        repository.setDarkTheme(setting)
    }

    fun resetProgress() {
        repository.resetProgress()
    }

    override fun onCleared() {
        super.onCleared()
        timerJob?.cancel()
    }
}
