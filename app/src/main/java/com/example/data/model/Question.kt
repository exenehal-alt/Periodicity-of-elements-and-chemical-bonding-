package com.example.data.model

enum class Difficulty(val labelBn: String) {
    EASY("সহজ"),
    MEDIUM("মাঝারি"),
    HARD("কঠিন")
}

enum class TimerMode(val titleBn: String, val descriptionBn: String) {
    UNLIMITED("আনলিমিটেড টাইমার", "কোনো সময়ের চাপ নেই, নিশ্চিন্তে ভাবুন ও শিখুন"),
    TIMED_30S("৩০ সেকেন্ড/প্রশ্ন", "ভর্তি পরীক্ষার অনুরূপ গতিময় অনুশীলন"),
    TIMED_60S("৬০ সেকেন্ড/প্রশ্ন", "চিন্তা করার জন্য পর্যাপ্ত সময়")
}

data class MCQQuestion(
    val id: String,
    val typeId: Int,
    val typeName: String,
    val question: String,
    val options: List<String>,
    val correctIndex: Int, // 0 = a, 1 = b, 2 = c, 3 = d
    val explanation: String,
    val reference: String? = null,
    val difficulty: Difficulty = Difficulty.MEDIUM
)

data class WrittenQuestion(
    val id: String,
    val typeId: Int,
    val typeName: String,
    val question: String,
    val answer: String,
    val reference: String? = null,
    val difficulty: Difficulty = Difficulty.MEDIUM
)

data class QuestionTypeInfo(
    val id: Int,
    val title: String,
    val subtitle: String,
    val isWritten: Boolean = false,
    val difficulty: Difficulty = Difficulty.MEDIUM,
    val totalQuestions: Int = 0,
    val starMark: String? = null,
    val sessions: String = "",
    val cluster: Int = 1
)
