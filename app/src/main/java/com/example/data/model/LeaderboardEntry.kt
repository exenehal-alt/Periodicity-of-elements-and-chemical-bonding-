package com.example.data.model

data class LeaderboardEntry(
    val rank: Int,
    val name: String,
    val institute: String,
    val score: Int,
    val accuracy: Int,
    val solvedCount: Int,
    val streak: Int,
    val avatarId: String,
    val isCurrentUser: Boolean = false
)

data class UserAnswerRecord(
    val questionId: String,
    val selectedIndex: Int,
    val correctIndex: Int,
    val timeSpentSeconds: Int
)

data class QuizSessionResult(
    val typeId: Int,
    val typeTitle: String,
    val totalQuestions: Int,
    val correctCount: Int,
    val wrongCount: Int,
    val unattemptedCount: Int,
    val totalScore: Int,
    val totalTimeSeconds: Int,
    val accuracy: Int,
    val answers: List<UserAnswerRecord>,
    val timestamp: Long = System.currentTimeMillis()
)
