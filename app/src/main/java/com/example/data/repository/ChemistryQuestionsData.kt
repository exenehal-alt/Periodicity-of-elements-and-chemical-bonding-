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
        QuestionTypeInfo(1, "পর্যায় সারণির মৌলিক ধারণা, ইতিহাস ও গঠন", "মোজলের সূত্র, পর্যায় ও শ্রেণি বিন্যাস, নতুন মৌল", false, Difficulty.EASY, 9),
        QuestionTypeInfo(2, "মৌলসমূহের ভৌত অবস্থা, প্রাচুর্য ও নামকরণ", "হালকা-ভারী ধাতু, তরল মৌল, মুদ্রাধাতু, অপধাতু", false, Difficulty.EASY, 12),
        QuestionTypeInfo(3, "মৌলের ব্লক পরিচিতি ও সংখ্যা গণনা", "s, p, d, f ব্লক মৌলসমূহ, ল্যান্থানাইড ও অ্যাক্টিনাইড", false, Difficulty.EASY, 12),
        QuestionTypeInfo(4, "ইলেকট্রন বিন্যাস হতে পর্যায় সারণিতে অবস্থান", "প্রধান শক্তিস্তর ও গ্রুপ নির্ণয়ের কৌশল", false, Difficulty.EASY, 5),
        QuestionTypeInfo(5, "নিষ্ক্রিয় গ্যাস ও এদের বৈশিষ্ট্য", "ইলেকট্রন বিন্যাস, ফ্ল্যাশ বাতি, স্ফুটনাঙ্কের ক্রম", false, Difficulty.EASY, 5),
        QuestionTypeInfo(6, "s-ব্লক মৌলসমূহের ধর্ম ও কর্ণ সম্পর্ক", "ক্ষার ও মৃৎক্ষার ধাতু, সক্রিয়তা, দ্রাব্যতা ও কর্ণ সম্পর্ক", false, Difficulty.MEDIUM, 8),
        QuestionTypeInfo(7, "p-ব্লক মৌলসমূহের সাধারণ ধর্ম ও রূপভেদ", "কার্বন, সিলিকন, হীরক-গ্রাফাইট ও হ্যালোজেন এসিড", false, Difficulty.MEDIUM, 8),
        QuestionTypeInfo(8, "যৌগের অস্তিত্ব ও পানিতে আর্দ্রবিশ্লেষণ", "d-অরবিটালের ভূমিকা, অষ্টক সীমা, SiCl₄ ও CCl₄", false, Difficulty.MEDIUM, 6),
        QuestionTypeInfo(9, "আকরিক, সংকর ধাতু ও পরিচিত যৌগের সংকেত", "লাফিং গ্যাস, বরফ, প্লাস্টার অব প্যারিস, ব্লিচিং পাউডার", false, Difficulty.MEDIUM, 11),
        QuestionTypeInfo(10, "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম", "ধাতব ও অধাতব অক্সাইড, সুপার-অক্সাইড, পাইরো-হাইপো", false, Difficulty.MEDIUM, 27),
        QuestionTypeInfo(11, "পর্যায়বৃত্ত ধর্ম ও পরমাণু-আয়নের আকার", "শিল্ডিং ইফেক্ট, আইসোইলেকট্রনিক আয়ন, পারমাণবিক ব্যাস", false, Difficulty.MEDIUM, 18),
        QuestionTypeInfo(12, "আয়নীকরণ শক্তি (Ionization Energy)", "পর্যায়বৃত্ত হ্রাস-বৃদ্ধি, ২য় আয়নীকরণ, স্থিতিশীল উপস্তর", false, Difficulty.MEDIUM, 12),
        QuestionTypeInfo(13, "ইলেকট্রন আসক্তি ও তড়িৎ ঋণাত্মকতা", "হ্যালোজেনের ব্যতিক্রম, পলিং স্কেল, কার্যকর টান", false, Difficulty.MEDIUM, 10),
        QuestionTypeInfo(14, "অবস্থান্তর মৌল ও d-ব্লক মৌলের বৈশিষ্ট্য", "Sc ও Zn এর ব্যতিক্রম, জারণ অবস্থা, নন-ডিজেনারেট অরবিটাল", false, Difficulty.MEDIUM, 11),
        QuestionTypeInfo(15, "চৌম্বক ধর্ম ও অযুগ্ম ইলেকট্রন নির্ণয়", "ডায়াম্যাগনেটিক, প্যারাম্যাগনেটিক ও বোর ম্যাগনেটন", false, Difficulty.MEDIUM, 8),
        QuestionTypeInfo(16, "রঙিন যৌগ ও আয়নের বর্ণ", "d-d ইলেকট্রন ট্রানজিশন, কপার ও ক্রোমেটের রঙ", false, Difficulty.MEDIUM, 7),
        QuestionTypeInfo(17, "জটিল যৌগ, লিগ্যান্ড ও সংকরায়ন", "সন্নিবেশ সংখ্যা, চিলেট, শক্তিশালী লিগ্যান্ড, d²sp³", false, Difficulty.HARD, 14),
        QuestionTypeInfo(18, "রাসায়নিক বন্ধনের প্রকারভেদ ও অষ্টক নিয়ম", "আয়নিত, সমযোজী, সন্নিবেশ ও ধাতব বন্ধন", false, Difficulty.MEDIUM, 15),
        QuestionTypeInfo(19, "সিগমা (σ) ও পাই (π) বন্ধন এবং বন্ধন ক্রম", "অরবিটালের অধিক্রমণ, বন্ড অর্ডার, বন্ধন সংখ্যা গণনা", false, Difficulty.HARD, 9),
        QuestionTypeInfo(20, "অরবিটালের সংকরায়ন (Hybridization) নির্ণয়", "sp, sp², sp³, sp³d, sp³d² নির্ণয় ও জৈব যৌগের সংকরণ", false, Difficulty.HARD, 14),
        QuestionTypeInfo(21, "অণুর জ্যামিতিক আকৃতি ও মুক্তজোড় (VSEPR)", "সরলরৈখিক, ত্রিকোণাকার, চতুস্তলকীয়, লোন পেয়ার", false, Difficulty.HARD, 11),
        QuestionTypeInfo(22, "বন্ধন কোণ ও বন্ধন দৈর্ঘ্য", "লোন পেয়ার বিকর্ষণ, ড্র্যাগো রুল, কোণের ক্রম", false, Difficulty.HARD, 14),
        QuestionTypeInfo(23, "পোলারিটি ও ডাইপোল মোমেন্ট", "ভেক্টর লব্ধি, প্রতিসম ও অপ্রতিসম অণু, পানির কোণ", false, Difficulty.HARD, 10),
        QuestionTypeInfo(24, "পোলারায়ন (ফাজানের নীতি) ও বৈশিষ্ট্য", "চার্জ ঘনত্ব, অ্যানায়নের আকার, সমযোজী গুণ বৃদ্ধি", false, Difficulty.HARD, 10),
        QuestionTypeInfo(25, "ল্যাটিস শক্তি, দ্রাব্যতা, গলনাঙ্ক ও তাপীয় বিয়োজন", "হাইড্রেশন এনথালপি, ক্ষারীয় লবণের বিয়োজন", false, Difficulty.HARD, 10),
        QuestionTypeInfo(26, "হাইড্রোজেন বন্ধন ও ভ্যানডার ওয়ালস বল", "আন্তঃ ও অন্তঃআণবিক H-বন্ধন, ডিএনএ, স্ফুটনাঙ্কের বৃদ্ধি", false, Difficulty.HARD, 13),
        QuestionTypeInfo(27, "বিগত ভর্তি পরীক্ষার লিখিত প্রশ্নাবলি", "বুয়েট, ঢাবি, জাবি, চবি, খুবি ভর্তি পরীক্ষার প্রশ্ন ও সমাধান", true, Difficulty.MEDIUM, 15),
        QuestionTypeInfo(28, "লিখিত (Written) প্র্যাকটিস প্রবলেম", "ল্যান্থানাইড সংকোচন, ফাজানের প্রয়োগ, জটিল যৌগের গঠন", true, Difficulty.HARD, 20)
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
