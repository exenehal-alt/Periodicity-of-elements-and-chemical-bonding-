package com.example.data.repository

import com.example.data.model.Difficulty
import com.example.data.model.MCQQuestion
import com.example.data.model.QuestionTypeInfo
import com.example.data.model.WrittenQuestion

object ChemistryQuestionsData {

    val allMCQQuestions: List<MCQQuestion> by lazy {
        ChemistryDatasetPart1.questions +
        ChemistryDatasetPart2.questions +
        ChemistryDatasetPart3.questions +
        ChemistryDatasetPart4.questions
    }

    val allWrittenQuestions: List<WrittenQuestion> by lazy {
        ChemistryDatasetWritten.questions
    }

    val typeInfoList: List<QuestionTypeInfo> = listOf(
        // Cluster 1 (মৌল, গঠন ও সাধারণ রসায়ন) - Types 1 to 10
        QuestionTypeInfo(
            id = 1,
            title = "পর্যায় সারণির মৌলিক ধারণা, ইতিহাস ও গঠন",
            subtitle = "মোজলের সূত্র, পর্যায় ও শ্রেণি বিন্যাস, নতুন মৌল",
            isWritten = false,
            difficulty = Difficulty.EASY,
            totalQuestions = 9,
            starMark = null,
            sessions = "সাধারণ ও সমন্বিত ভর্তি প্রশ্নাবলি",
            cluster = 1
        ),
        QuestionTypeInfo(
            id = 2,
            title = "মৌলসমূহের ভৌত অবস্থা, প্রাচুর্য ও বিশেষ নামকরণ",
            subtitle = "হালকা-ভারী ধাতু, তরল মৌল, মুদ্রাধাতু, অপধাতু",
            isWritten = false,
            difficulty = Difficulty.EASY,
            totalQuestions = 13,
            starMark = null,
            sessions = "ঐতিহ্যবাহী বোর্ড ও সাধারণ বিশ্ববিদ্যালয় প্রশ্ন",
            cluster = 1
        ),
        QuestionTypeInfo(
            id = 3,
            title = "মৌলের ব্লক পরিচিতি ও সংখ্যা গণনা (s, p, d, f ব্লক)",
            subtitle = "s, p, d, f ব্লক মৌলসমূহ, ল্যান্থানাইড ও অ্যাক্টিনাইড",
            isWritten = false,
            difficulty = Difficulty.EASY,
            totalQuestions = 12,
            starMark = null,
            sessions = "বিজ্ঞান ও প্রযুক্তি বিশ্ববিদ্যালয়ের প্রাথমিক প্রশ্ন",
            cluster = 1
        ),
        QuestionTypeInfo(
            id = 4,
            title = "ইলেকট্রন বিন্যাস হতে পর্যায় সারণিতে অবস্থান নির্ণয়",
            subtitle = "প্রধান শক্তিস্তর ও গ্রুপ নির্ণয়ের সহজ কৌশল",
            isWritten = false,
            difficulty = Difficulty.EASY,
            totalQuestions = 6,
            starMark = null,
            sessions = "মেডিকেল ও ইঞ্জিনিয়ারিং প্রাথমিক প্রশ্ন",
            cluster = 1
        ),
        QuestionTypeInfo(
            id = 5,
            title = "নিষ্ক্রিয় গ্যাস ও এদের বৈশিষ্ট্য",
            subtitle = "ইলেকট্রন বিন্যাস, ফ্ল্যাশ বাতি, স্ফুটনাঙ্কের ক্রম",
            isWritten = false,
            difficulty = Difficulty.EASY,
            totalQuestions = 5,
            starMark = null,
            sessions = "KU'25-26, বিজ্ঞান ও প্রযুক্তি বিশ্ববিদ্যালয়",
            cluster = 1
        ),
        QuestionTypeInfo(
            id = 6,
            title = "s-ব্লক মৌলসমূহের ধর্ম ও কর্ণ সম্পর্ক",
            subtitle = "ক্ষার ও মৃৎক্ষার ধাতু, সক্রিয়তা, দ্রাব্যতা ও কর্ণ সম্পর্ক",
            isWritten = false,
            difficulty = Difficulty.MEDIUM,
            totalQuestions = 9,
            starMark = null,
            sessions = "বিভিন্ন বিশ্ববিদ্যালয় ভর্তি প্রশ্নাবলি",
            cluster = 1
        ),
        QuestionTypeInfo(
            id = 7,
            title = "p-ব্লক মৌলসমূহের সাধারণ ধর্ম ও রূপভেদ",
            subtitle = "কার্বন, সিলিকন, হীরক-গ্রাফাইট ও হ্যালোজেন এসিড",
            isWritten = false,
            difficulty = Difficulty.MEDIUM,
            totalQuestions = 8,
            starMark = null,
            sessions = "Agri.'25-26, অন্যান্য বিশ্ববিদ্যালয়",
            cluster = 1
        ),
        QuestionTypeInfo(
            id = 8,
            title = "যৌগের অস্তিত্ব ও পানিতে আর্দ্রবিশ্লেষণ",
            subtitle = "d-অরবিটালের ভূমিকা, অষ্টক সীমা, SiCl₄ ও CCl₄",
            isWritten = false,
            difficulty = Difficulty.MEDIUM,
            totalQuestions = 6,
            starMark = null,
            sessions = "বোর্ড ও স্ট্যান্ডার্ড মেডিকেল প্রশ্ন",
            cluster = 1
        ),
        QuestionTypeInfo(
            id = 9,
            title = "আকরিক, সংকর ধাতু ও পরিচিত যৌগের সংকেত",
            subtitle = "লাফিং গ্যাস, বরফ, প্লাস্টার অব প্যারিস, ব্লিচিং পাউডার",
            isWritten = false,
            difficulty = Difficulty.MEDIUM,
            totalQuestions = 11,
            starMark = null,
            sessions = "Agri.'25-26, JU'24-25, Agri'24-25, JU'22-23, JU'21-22, RU'14-15, JnU'14-15",
            cluster = 1
        ),
        QuestionTypeInfo(
            id = 10,
            title = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            subtitle = "ধাতব ও অধাতব অক্সাইড, সুপার-অক্সাইড, পাইরো-হাইপো এসিড",
            isWritten = false,
            difficulty = Difficulty.MEDIUM,
            totalQuestions = 27,
            starMark = null,
            sessions = "DU, JU, RU, CU, GST বিভিন্ন বিশ্ববিদ্যালয়",
            cluster = 1
        ),

        // Cluster 2 (পর্যায়বৃত্ত ধর্ম, d-ব্লক ও সাধারণ বন্ধন) - Types 11 to 20
        QuestionTypeInfo(
            id = 11,
            title = "পর্যায়বৃত্ত ধর্ম ও পরমাণু-আয়নের আকার",
            subtitle = "শিল্ডিং ইফেক্ট, আইসোইলেকট্রনিক আয়ন, পারমাণবিক ব্যাসার্ধ",
            isWritten = false,
            difficulty = Difficulty.MEDIUM,
            totalQuestions = 22,
            starMark = null,
            sessions = "DU, JU, RU, CU, GST ভর্তি পরীক্ষা",
            cluster = 2
        ),
        QuestionTypeInfo(
            id = 12,
            title = "আয়নীকরণ শক্তি (Ionization Energy)",
            subtitle = "পর্যায়বৃত্ত পরিবর্তন, ২য় আয়নীকরণ শক্তি, স্থিতিশীল উপস্তর",
            isWritten = false,
            difficulty = Difficulty.MEDIUM,
            totalQuestions = 16,
            starMark = null,
            sessions = "BUET, DU, Medical, RU ভর্তি পরীক্ষা",
            cluster = 2
        ),
        QuestionTypeInfo(
            id = 13,
            title = "ইলেকট্রন আসক্তি ও তড়িৎ ঋণাত্মকতা",
            subtitle = "হ্যালোজেনের ব্যতিক্রম, পলিং স্কেল, কার্যকর নিউক্লীয় চার্জ",
            isWritten = false,
            difficulty = Difficulty.MEDIUM,
            totalQuestions = 16,
            starMark = null,
            sessions = "DU, JU, SUST, CU ভর্তি পরীক্ষা",
            cluster = 2
        ),
        QuestionTypeInfo(
            id = 14,
            title = "অবস্থান্তর মৌল ও d-ব্লক মৌলের বৈশিষ্ট্য",
            subtitle = "Sc ও Zn এর ব্যতিক্রম, জারণ অবস্থা, অনুঘটক ধর্ম",
            isWritten = false,
            difficulty = Difficulty.MEDIUM,
            totalQuestions = 15,
            starMark = null,
            sessions = "BUET, CKET, DU, JU ভর্তি পরীক্ষা",
            cluster = 2
        ),
        QuestionTypeInfo(
            id = 15,
            title = "চৌম্বক ধর্ম ও অযুগ্ম ইলেকট্রন নির্ণয়",
            subtitle = "ডায়াম্যাগনেটিক, প্যারাম্যাগনেটিক, বোর ম্যাগনেটন হিসাব",
            isWritten = false,
            difficulty = Difficulty.MEDIUM,
            totalQuestions = 9,
            starMark = null,
            sessions = "RU, CU, SUST, KU ভর্তি পরীক্ষা",
            cluster = 2
        ),
        QuestionTypeInfo(
            id = 16,
            title = "রঙিন যৌগ ও আয়নের বর্ণ",
            subtitle = "d-d ইলেকট্রন ট্রানজিশন, কপার, ক্রোমেট ও পারম্যাঙ্গানেট বর্ণ",
            isWritten = false,
            difficulty = Difficulty.MEDIUM,
            totalQuestions = 9,
            starMark = null,
            sessions = "Medical, DU, JU, RU ভর্তি পরীক্ষা",
            cluster = 2
        ),
        QuestionTypeInfo(
            id = 17,
            title = "জটিল যৌগ, লিগ্যান্ড ও সংকরায়ন",
            subtitle = "সন্নিবেশ সংখ্যা, চিলেট লিগ্যান্ড, শক্তিশালী ও দুর্বল লিগ্যান্ড",
            isWritten = false,
            difficulty = Difficulty.HARD,
            totalQuestions = 14,
            starMark = null,
            sessions = "BUET, DU, CKET, SUST ভর্তি পরীক্ষা",
            cluster = 2
        ),
        QuestionTypeInfo(
            id = 18,
            title = "রাসায়নিক বন্ধনের প্রকারভেদ ও অষ্টক নিয়ম",
            subtitle = "আয়নিত, সমযোজী, সন্নিবেশ ও ধাতব বন্ধন, অষ্টক সংকোচন-প্রসারণ",
            isWritten = false,
            difficulty = Difficulty.MEDIUM,
            totalQuestions = 25,
            starMark = null,
            sessions = "DU, JU, RU, CU, JnU ভর্তি পরীক্ষা",
            cluster = 2
        ),
        QuestionTypeInfo(
            id = 19,
            title = "সিগমা (σ) ও পাই (π) বন্ধন এবং বন্ধন ক্রম",
            subtitle = "অরবিটালের অক্ষীয় ও পার্শ্বীয় অধিক্রমণ, বন্ড অর্ডার গণনা",
            isWritten = false,
            difficulty = Difficulty.HARD,
            totalQuestions = 12,
            starMark = null,
            sessions = "BUET, DU, Medical, JU ভর্তি পরীক্ষা",
            cluster = 2
        ),
        QuestionTypeInfo(
            id = 20,
            title = "অরবিটালের সংকরায়ন (Hybridization) নির্ণয়",
            subtitle = "sp, sp², sp³, sp³d, sp³d² নির্ণয় ও জৈব-অজৈব সংকরণ",
            isWritten = false,
            difficulty = Difficulty.HARD,
            totalQuestions = 30,
            starMark = "⭐ সর্বাধিক গুরুত্বপূর্ণ",
            sessions = "BUET'24, DU'24, CKET'23, JU'23, RU'22, Medical'21",
            cluster = 2
        ),

        // Cluster 3 (আণবিক গঠন, আন্তঃআণবিক বল ও লিখিত) - Types 21 to 28
        QuestionTypeInfo(
            id = 21,
            title = "অণুর জ্যামিতিক আকৃতি ও মুক্তজোড় (VSEPR)",
            subtitle = "সরলরৈখিক, ত্রিকোণাকার, চতুস্তলকীয়, লোন পেয়ার বিকর্ষণ",
            isWritten = false,
            difficulty = Difficulty.HARD,
            totalQuestions = 20,
            starMark = "⭐ অত্যন্ত গুরুত্বপূর্ণ",
            sessions = "DU'24, BUET'23, JU'23, RU'22, CU'21, GST'21",
            cluster = 3
        ),
        QuestionTypeInfo(
            id = 22,
            title = "বন্ধন কোণ ও বন্ধন দৈর্ঘ্য",
            subtitle = "লোন পেয়ার-বন্ড পেয়ার বিকর্ষণ, ড্র্যাগো রুল, কোণের ক্রম",
            isWritten = false,
            difficulty = Difficulty.HARD,
            totalQuestions = 15,
            starMark = "⭐ অত্যন্ত গুরুত্বপূর্ণ",
            sessions = "BUET'24, DU'23, Medical'23, JU'22, CKET'21",
            cluster = 3
        ),
        QuestionTypeInfo(
            id = 23,
            title = "পোলারিটি ও ডাইপোল মোমেন্ট",
            subtitle = "ভেক্টর লব্ধি, প্রতিসম ও অপ্রতিসম অণু, ডাইপোল মান",
            isWritten = false,
            difficulty = Difficulty.HARD,
            totalQuestions = 11,
            starMark = "⭐ অত্যন্ত গুরুত্বপূর্ণ",
            sessions = "DU'24, JU'23, RU'22, Medical'22, CU'20",
            cluster = 3
        ),
        QuestionTypeInfo(
            id = 24,
            title = "পোলারায়ন (ফাজানের নীতি) ও বৈশিষ্ট্য",
            subtitle = "ক্যাটায়নের চার্জ ঘনত্ব, অ্যানায়নের আকার, সমযোজী বৈশিষ্ট্যের ক্রম",
            isWritten = false,
            difficulty = Difficulty.HARD,
            totalQuestions = 12,
            starMark = "⭐ অত্যন্ত গুরুত্বপূর্ণ",
            sessions = "BUET'24, DU'23, CKET'23, JU'22, RU'21",
            cluster = 3
        ),
        QuestionTypeInfo(
            id = 25,
            title = "ল্যাটিস শক্তি, দ্রাব্যতা, গলনাঙ্ক ও তাপীয় বিয়োজন",
            subtitle = "হাইড্রেশন এনথালপি, ক্ষারীয় লবণের বিয়োজন, দ্রাব্যতার ক্রম",
            isWritten = false,
            difficulty = Difficulty.HARD,
            totalQuestions = 14,
            starMark = "⭐ অত্যন্ত গুরুত্বপূর্ণ",
            sessions = "BUET'24, DU'24, Medical'23, JU'22, GST'22",
            cluster = 3
        ),
        QuestionTypeInfo(
            id = 26,
            title = "হাইড্রোজেন বন্ধন ও ভ্যানডার ওয়ালস বল",
            subtitle = "আন্তঃ ও অন্তঃআণবিক H-বন্ধন, ডিএনএ, স্ফুটনাঙ্কের অস্বাভাবিকতা",
            isWritten = false,
            difficulty = Difficulty.HARD,
            totalQuestions = 23,
            starMark = "⭐ সর্বাধিক গুরুত্বপূর্ণ",
            sessions = "DU'24, BUET'23, Medical'23, JU'22, RU'21, CU'20",
            cluster = 3
        ),
        QuestionTypeInfo(
            id = 27,
            title = "বিগত ভর্তি পরীক্ষার লিখিত প্রশ্নাবলি",
            subtitle = "বুয়েট, ঢাবি, জাবি, চবি, খুবি ভর্তি পরীক্ষার প্রশ্ন ও পুঙ্খানুপুঙ্খ সমাধান",
            isWritten = true,
            difficulty = Difficulty.MEDIUM,
            totalQuestions = 15,
            starMark = null,
            sessions = "BUET, DU, JU, RU, CU, SUST লিখিত ভর্তি পরীক্ষা",
            cluster = 3
        ),
        QuestionTypeInfo(
            id = 28,
            title = "লিখিত (Written) প্র্যাকটিস প্রবলেম",
            subtitle = "ল্যান্থানাইড সংকোচন, ফাজানের প্রয়োগ, জটিল যৌগের গঠন ও বন্ধন ব্যাখ্যা",
            isWritten = true,
            difficulty = Difficulty.HARD,
            totalQuestions = 20,
            starMark = null,
            sessions = "BUET, CKET, DU মাস্টার রিটেন প্র্যাকটিস",
            cluster = 3
        )
    )

    fun getMCQsForType(typeId: Int): List<MCQQuestion> {
        return allMCQQuestions.filter { it.typeId == typeId }
    }

    fun getWrittenForType(typeId: Int): List<WrittenQuestion> {
        return allWrittenQuestions.filter { it.typeId == typeId }
    }

    fun getTypeInfo(typeId: Int): QuestionTypeInfo? {
        return typeInfoList.find { it.id == typeId }
    }
}
