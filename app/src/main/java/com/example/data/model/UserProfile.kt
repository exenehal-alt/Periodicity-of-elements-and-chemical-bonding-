package com.example.data.model

data class UserProfile(
    val name: String = "রসায়নপ্রেমী",
    val avatarId: String = "atom",
    val title: String = "নবীন রসায়নবিদ",
    val totalSolved: Int = 0,
    val correctAnswers: Int = 0,
    val totalScore: Int = 0,
    val streakDays: Int = 1,
    val completedTypes: Set<Int> = emptySet(),
    val bookmarkedMCQIds: Set<String> = emptySet(),
    val bookmarkedWrittenIds: Set<String> = emptySet(),
    val masteredWrittenIds: Set<String> = emptySet(),
    val preferredTimerMode: TimerMode = TimerMode.UNLIMITED,
    val darkThemeSetting: String = "SYSTEM" // "LIGHT", "DARK", "SYSTEM"
) {
    val accuracy: Int
        get() = if (totalSolved > 0) ((correctAnswers.toDouble() / totalSolved) * 100).toInt() else 0

    val level: Int
        get() = (totalScore / 150) + 1
}

data class Achievement(
    val id: String,
    val titleBn: String,
    val descriptionBn: String,
    val iconEmoji: String,
    val isUnlocked: Boolean,
    val progress: Float = 0f
)
