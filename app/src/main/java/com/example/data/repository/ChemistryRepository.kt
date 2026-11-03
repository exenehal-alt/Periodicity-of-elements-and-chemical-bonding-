package com.example.data.repository

import android.content.Context
import android.content.SharedPreferences
import com.example.data.model.Achievement
import com.example.data.model.LeaderboardEntry
import com.example.data.model.MCQQuestion
import com.example.data.model.QuestionTypeInfo
import com.example.data.model.QuizSessionResult
import com.example.data.model.TimerMode
import com.example.data.model.UserProfile
import com.example.data.model.WrittenQuestion
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ChemistryRepository(context: Context) {

    private val prefs: SharedPreferences =
        context.getSharedPreferences("chem_periodic_prefs", Context.MODE_PRIVATE)

    private val _userProfile = MutableStateFlow(loadUserProfile())
    val userProfile: StateFlow<UserProfile> = _userProfile.asStateFlow()

    private val _leaderboard = MutableStateFlow<List<LeaderboardEntry>>(emptyList())
    val leaderboard: StateFlow<List<LeaderboardEntry>> = _leaderboard.asStateFlow()

    init {
        refreshLeaderboard()
    }

    private fun loadUserProfile(): UserProfile {
        val name = prefs.getString("user_name", "রসায়নপ্রেমী") ?: "রসায়নপ্রেমী"
        val avatarId = prefs.getString("avatar_id", "atom") ?: "atom"
        val totalSolved = prefs.getInt("total_solved", 0)
        val correctAnswers = prefs.getInt("correct_answers", 0)
        val totalScore = prefs.getInt("total_score", 0)
        val streakDays = prefs.getInt("streak_days", 1)
        val completedTypesStr = prefs.getString("completed_types", "") ?: ""
        val bookmarkedMCQsStr = prefs.getString("bookmarked_mcqs", "") ?: ""
        val bookmarkedWrittenStr = prefs.getString("bookmarked_written", "") ?: ""
        val masteredWrittenStr = prefs.getString("mastered_written", "") ?: ""
        val timerModeName = prefs.getString("timer_mode", TimerMode.UNLIMITED.name) ?: TimerMode.UNLIMITED.name
        val darkThemeSetting = prefs.getString("dark_theme", "SYSTEM") ?: "SYSTEM"

        val completedTypes = if (completedTypesStr.isNotEmpty()) {
            completedTypesStr.split(",").mapNotNull { it.toIntOrNull() }.toSet()
        } else emptySet()

        val bookmarkedMCQs = if (bookmarkedMCQsStr.isNotEmpty()) {
            bookmarkedMCQsStr.split(",").filter { it.isNotBlank() }.toSet()
        } else emptySet()

        val bookmarkedWritten = if (bookmarkedWrittenStr.isNotEmpty()) {
            bookmarkedWrittenStr.split(",").filter { it.isNotBlank() }.toSet()
        } else emptySet()

        val masteredWritten = if (masteredWrittenStr.isNotEmpty()) {
            masteredWrittenStr.split(",").filter { it.isNotBlank() }.toSet()
        } else emptySet()

        val timerMode = try {
            TimerMode.valueOf(timerModeName)
        } catch (_: Exception) {
            TimerMode.UNLIMITED
        }

        val title = calculateUserTitle(totalScore)

        return UserProfile(
            name = name,
            avatarId = avatarId,
            title = title,
            totalSolved = totalSolved,
            correctAnswers = correctAnswers,
            totalScore = totalScore,
            streakDays = streakDays,
            completedTypes = completedTypes,
            bookmarkedMCQIds = bookmarkedMCQs,
            bookmarkedWrittenIds = bookmarkedWritten,
            masteredWrittenIds = masteredWritten,
            preferredTimerMode = timerMode,
            darkThemeSetting = darkThemeSetting
        )
    }

    private fun saveUserProfile(profile: UserProfile) {
        prefs.edit()
            .putString("user_name", profile.name)
            .putString("avatar_id", profile.avatarId)
            .putInt("total_solved", profile.totalSolved)
            .putInt("correct_answers", profile.correctAnswers)
            .putInt("total_score", profile.totalScore)
            .putInt("streak_days", profile.streakDays)
            .putString("completed_types", profile.completedTypes.joinToString(","))
            .putString("bookmarked_mcqs", profile.bookmarkedMCQIds.joinToString(","))
            .putString("bookmarked_written", profile.bookmarkedWrittenIds.joinToString(","))
            .putString("mastered_written", profile.masteredWrittenIds.joinToString(","))
            .putString("timer_mode", profile.preferredTimerMode.name)
            .putString("dark_theme", profile.darkThemeSetting)
            .apply()

        _userProfile.value = profile
        refreshLeaderboard()
    }

    private fun calculateUserTitle(score: Int): String {
        return when {
            score >= 1200 -> "পর্যায় সারণি গ্র্যান্ডমাস্টার"
            score >= 800 -> "রাসায়নিক বন্ধন বিশেষজ্ঞ"
            score >= 500 -> "অভিজ্ঞ রসায়নবিদ"
            score >= 250 -> "মধ্যবর্তী শিক্ষার্থী"
            score >= 100 -> "উদ্যমী রসায়নবিদ"
            else -> "নবীন রসায়নবিদ"
        }
    }

    fun updateProfile(name: String, avatarId: String) {
        val current = _userProfile.value
        val updated = current.copy(name = name, avatarId = avatarId)
        saveUserProfile(updated)
    }

    fun setTimerMode(mode: TimerMode) {
        val current = _userProfile.value
        val updated = current.copy(preferredTimerMode = mode)
        saveUserProfile(updated)
    }

    fun setDarkTheme(setting: String) {
        val current = _userProfile.value
        val updated = current.copy(darkThemeSetting = setting)
        saveUserProfile(updated)
    }

    fun recordQuizResult(result: QuizSessionResult) {
        val current = _userProfile.value
        val newSolved = current.totalSolved + result.totalQuestions
        val newCorrect = current.correctAnswers + result.correctCount
        val newScore = current.totalScore + result.totalScore
        val newCompletedTypes = if (result.accuracy >= 60) {
            current.completedTypes + result.typeId
        } else {
            current.completedTypes
        }

        prefs.edit()
            .putInt("type_solved_${result.typeId}", prefs.getInt("type_solved_${result.typeId}", 0) + result.totalQuestions)
            .putInt("type_correct_${result.typeId}", prefs.getInt("type_correct_${result.typeId}", 0) + result.correctCount)
            .apply()

        val updated = current.copy(
            totalSolved = newSolved,
            correctAnswers = newCorrect,
            totalScore = newScore,
            completedTypes = newCompletedTypes,
            title = calculateUserTitle(newScore)
        )
        saveUserProfile(updated)
    }

    fun getTypeStats(typeId: Int): Pair<Int, Int> {
        val solved = prefs.getInt("type_solved_$typeId", if (typeId in _userProfile.value.completedTypes) ChemistryQuestionsData.getTypeInfo(typeId)?.totalQuestions ?: 0 else 0)
        val correct = prefs.getInt("type_correct_$typeId", if (typeId in _userProfile.value.completedTypes) (solved * 0.85).toInt() else 0)
        return Pair(solved, correct)
    }


    fun toggleBookmarkMCQ(questionId: String) {
        val current = _userProfile.value
        val updatedSet = if (current.bookmarkedMCQIds.contains(questionId)) {
            current.bookmarkedMCQIds - questionId
        } else {
            current.bookmarkedMCQIds + questionId
        }
        saveUserProfile(current.copy(bookmarkedMCQIds = updatedSet))
    }

    fun toggleBookmarkWritten(questionId: String) {
        val current = _userProfile.value
        val updatedSet = if (current.bookmarkedWrittenIds.contains(questionId)) {
            current.bookmarkedWrittenIds - questionId
        } else {
            current.bookmarkedWrittenIds + questionId
        }
        saveUserProfile(current.copy(bookmarkedWrittenIds = updatedSet))
    }

    fun toggleMasteredWritten(questionId: String) {
        val current = _userProfile.value
        val updatedSet = if (current.masteredWrittenIds.contains(questionId)) {
            current.masteredWrittenIds - questionId
        } else {
            current.masteredWrittenIds + questionId
        }
        val pointsDelta = if (updatedSet.contains(questionId)) 20 else -20
        val newScore = (current.totalScore + pointsDelta).coerceAtLeast(0)
        val newCompleted = if (updatedSet.size >= 10) current.completedTypes + 27 else current.completedTypes
        saveUserProfile(
            current.copy(
                masteredWrittenIds = updatedSet,
                totalScore = newScore,
                completedTypes = newCompleted,
                title = calculateUserTitle(newScore)
            )
        )
    }

    fun resetProgress() {
        val fresh = UserProfile(
            name = _userProfile.value.name,
            avatarId = _userProfile.value.avatarId,
            darkThemeSetting = _userProfile.value.darkThemeSetting
        )
        saveUserProfile(fresh)
    }

    fun getAchievements(): List<Achievement> {
        val profile = _userProfile.value
        return listOf(
            Achievement(
                id = "ach_first_quiz",
                titleBn = "প্রথম ধাপ",
                descriptionBn = "যেকোনো টাইপের একটি পরীক্ষা সম্পন্ন করুন",
                iconEmoji = "🧪",
                isUnlocked = profile.totalSolved > 0,
                progress = if (profile.totalSolved > 0) 1f else 0f
            ),
            Achievement(
                id = "ach_five_types",
                titleBn = "পর্যায় সারণি পর্যটক",
                descriptionBn = "৫টি বিভিন্ন টাইপ সফলভাবে সম্পন্ন করুন",
                iconEmoji = "🗺️",
                isUnlocked = profile.completedTypes.size >= 5,
                progress = (profile.completedTypes.size / 5f).coerceAtMost(1f)
            ),
            Achievement(
                id = "ach_accuracy_master",
                titleBn = "নিখুঁত লক্ষ্য",
                descriptionBn = "কমপক্ষে ৫০টি প্রশ্নে ৮০% বা তার বেশি নির্ভুলতা অর্জন করুন",
                iconEmoji = "🎯",
                isUnlocked = profile.totalSolved >= 50 && profile.accuracy >= 80,
                progress = (profile.totalSolved / 50f).coerceAtMost(1f)
            ),
            Achievement(
                id = "ach_written_scholar",
                titleBn = "লিখিত বিশেষজ্ঞ",
                descriptionBn = "১০টি বা ততোধিক লিখিত প্রশ্নের উত্তর আয়ত্ত করুন",
                iconEmoji = "📝",
                isUnlocked = profile.masteredWrittenIds.size >= 10,
                progress = (profile.masteredWrittenIds.size / 10f).coerceAtMost(1f)
            ),
            Achievement(
                id = "ach_streak_hero",
                titleBn = "ধারাবাহিক সাধক",
                descriptionBn = "৩ দিনের অনুশীলন স্ট্রিক বজায় রাখুন",
                iconEmoji = "🔥",
                isUnlocked = profile.streakDays >= 3,
                progress = (profile.streakDays / 3f).coerceAtMost(1f)
            ),
            Achievement(
                id = "ach_grandmaster",
                titleBn = "রসায়ন গ্র্যান্ডমাস্টার",
                descriptionBn = "১০০০ পয়েন্ট বা তার বেশি স্কোর অর্জন করুন",
                iconEmoji = "👑",
                isUnlocked = profile.totalScore >= 1000,
                progress = (profile.totalScore / 1000f).coerceAtMost(1f)
            )
        )
    }

    private fun refreshLeaderboard() {
        val profile = _userProfile.value

        // Mock peer contenders representing top Bangladeshi admission aspirants
        val peers = mutableListOf(
            LeaderboardEntry(1, "সাদিয়া রহমান", "ঢাকা বিশ্ববিদ্যালয় (DU)", 1480, 96, 150, 9, "scientist"),
            LeaderboardEntry(2, "তানভীর আহমেদ", "বুয়েট (BUET)", 1390, 94, 142, 12, "atom"),
            LeaderboardEntry(3, "ফারহানা ইয়াসমিন", "ঢাকা মেডিকেল (DMC)", 1260, 92, 130, 8, "flask"),
            LeaderboardEntry(4, "রাকিবুল হাসান", "রাজশাহী বিশ্ববিদ্যালয় (RU)", 1140, 89, 122, 6, "molecule"),
            LeaderboardEntry(5, "নাফিস ইকবাল", "সাস্ট (SUST)", 980, 88, 105, 5, "trophy"),
            LeaderboardEntry(6, "মেহজাবিন আলম", "জাহাঙ্গীরনগর (JU)", 870, 86, 95, 4, "fire"),
            LeaderboardEntry(7, "সাকিব আল হাসান", "চট্টগ্রাম বিশ্ববিদ্যালয় (CU)", 760, 84, 85, 3, "star"),
            LeaderboardEntry(8, "নুসরাত জাহান", "খুলনা বিশ্ববিদ্যালয় (KU)", 640, 83, 72, 3, "atom"),
            LeaderboardEntry(9, "আসিফ মাহমুদ", "ময়মনসিংহ কৃষি বিশ্ববিদ্যালয়", 520, 81, 60, 2, "flask"),
            LeaderboardEntry(10, "মারুফ বিল্লাহ", "জগন্নাথ বিশ্ববিদ্যালয় (JnU)", 390, 78, 48, 2, "scientist")
        )

        // Insert current user into the ranking
        val userEntry = LeaderboardEntry(
            rank = 0, // calculated below
            name = "${profile.name} (আপনি)",
            institute = profile.title,
            score = profile.totalScore,
            accuracy = profile.accuracy,
            solvedCount = profile.totalSolved,
            streak = profile.streakDays,
            avatarId = profile.avatarId,
            isCurrentUser = true
        )

        val combined = (peers + userEntry).sortedByDescending { it.score }
        val ranked = combined.mapIndexed { index, entry ->
            entry.copy(rank = index + 1)
        }

        _leaderboard.value = ranked
    }

    fun getAllTypes(): List<QuestionTypeInfo> = ChemistryQuestionsData.typeInfoList

    fun getMCQsForType(typeId: Int): List<MCQQuestion> = ChemistryQuestionsData.getMCQsForType(typeId)

    fun getWrittenForType(typeId: Int): List<WrittenQuestion> = ChemistryQuestionsData.getWrittenForType(typeId)

    fun getBookmarkedMCQs(): List<MCQQuestion> {
        val ids = _userProfile.value.bookmarkedMCQIds
        return ChemistryQuestionsData.allMCQQuestions.filter { ids.contains(it.id) }
    }

    fun getBookmarkedWritten(): List<WrittenQuestion> {
        val ids = _userProfile.value.bookmarkedWrittenIds
        return ChemistryQuestionsData.allWrittenQuestions.filter { ids.contains(it.id) }
    }
}
