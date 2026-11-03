package com.example.data.repository

import com.example.data.model.Difficulty
import com.example.data.model.MCQQuestion

object ChemistryDatasetPart4 {
    val questions: List<MCQQuestion> = listOf(
        // টাইপ ২২: বন্ধন কোণ ও বন্ধন দৈর্ঘ্য
        MCQQuestion(
            id = "t22_q1",
            typeId = 22,
            typeName = "বন্ধন কোণ ও বন্ধন দৈর্ঘ্য",
            question = "sp² হাইব্রিডাইজেশনে বন্ধন কোণ হয়-",
            options = listOf("180°", "120°", "107°", "109.5°"),
            correctIndex = 1,
            explanation = "sp² সংকরায়নে ৩টি সংকর অরবিটাল ১২০° কোণে সমতলে বিন্যস্ত থাকে।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t22_q2",
            typeId = 22,
            typeName = "বন্ধন কোণ ও বন্ধন দৈর্ঘ্য",
            question = "BCl₃ এর বন্ধন কোণ কত?",
            options = listOf("104.5°", "107°", "120°", "180°"),
            correctIndex = 2,
            explanation = "BCl₃ অণুর সমতলীয় ত্রিকোণাকার জ্যামিতি হওয়ায় Cl-B-Cl বন্ধন কোণ ১২০°।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t22_q3",
            typeId = 22,
            typeName = "বন্ধন কোণ ও বন্ধন দৈর্ঘ্য",
            question = "H₂S এর H - S - H বন্ধনের কোণ কত?",
            options = listOf("180°", "104.5°", "92.1°", "109.5°"),
            correctIndex = 2,
            explanation = "সালফারের তড়িৎ ঋণাত্মকতা কম ও আকার বড় হওয়ায় বন্ধনজোড় ইলেকট্রন নিউক্লিয়াস থেকে দূরে থাকে, ফলে বিকর্ষণে কোণ সঙ্কুচিত হয়ে প্রায় ৯২.১° হয়।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t22_q4",
            typeId = 22,
            typeName = "বন্ধন কোণ ও বন্ধন দৈর্ঘ্য",
            question = "PH₃ অণুতে ∠HPH বন্ধন কোণের মান কত?",
            options = listOf("93.3°", "107°", "109.28°", "105°"),
            correctIndex = 0,
            explanation = "ড্র্যাগো নীতি অনুসারে ফসফিনের বন্ধন বিশুদ্ধ p-অরবিটাল দ্বারা গঠিত হওয়ায় বন্ধন কোণ প্রায় ৯৩.৩°।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t22_q5",
            typeId = 22,
            typeName = "বন্ধন কোণ ও বন্ধন দৈর্ঘ্য",
            question = "হাইড্রাজিন (N₂H₄) অণুতে ∠HNH বন্ধন কোণ কত?",
            options = listOf("105°", "107°", "109.5°", "120°"),
            correctIndex = 1,
            explanation = "হাইড্রাজিনে নাইট্রোজেন পরমাণুতে ১ জোড়া মুক্তজোড় ইলেকট্রন থাকায় বন্ধন কোণ ১০৭° এর কাছাকাছি হয়।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t22_q6",
            typeId = 22,
            typeName = "বন্ধন কোণ ও বন্ধন দৈর্ঘ্য",
            question = "NH₃ ও PCl₃ এর বন্ধন কোণ যথাক্রমে কত?",
            options = listOf("109.5° ও 120°", "107° ও 100°", "109.5° ও 100°", "107° ও 120°"),
            correctIndex = 1,
            explanation = "NH₃ এর বন্ধন কোণ ১০৭° এবং PCl₃ এর বন্ধন কোণ প্রায় ১০০°।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t22_q7",
            typeId = 22,
            typeName = "বন্ধন কোণ ও বন্ধন দৈর্ঘ্য",
            question = "নিচের কোনটিতে সবচেয়ে বড় বন্ধন কোণ (Bond angle) আছে?",
            options = listOf("CH₄", "BCl₃", "NH₃", "H₂O"),
            correctIndex = 1,
            explanation = "BCl₃ এর বন্ধন কোণ ১২০°, যেখানে CH₄ এর ১০৯.৫°, NH₃ এর ১০৭° এবং H₂O এর ১০৪.৫°।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t22_q8",
            typeId = 22,
            typeName = "বন্ধন কোণ ও বন্ধন দৈর্ঘ্য",
            question = "কোন অণুটির বন্ধন কোণের মান সবচেয়ে কম?",
            options = listOf("CH₄", "H₂O", "NH₃", "BCl₃"),
            correctIndex = 1,
            explanation = "পানির অণুতে ২টি নিঃসঙ্গ জোড়ের তীব্র বিকর্ষণের কারণে চতুস্তলকীয় কোণ কমে ১০৪.৫° হয়, যা এদের মধ্যে সর্বনিম্ন।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t22_q9",
            typeId = 22,
            typeName = "বন্ধন কোণ ও বন্ধন দৈর্ঘ্য",
            question = "কোন যৌগটির বন্ধন কোণ সবচেয়ে কম?",
            options = listOf("H₂O", "NCl₃", "H₂S", "PH₃"),
            correctIndex = 2,
            explanation = "H₂S এর বন্ধন কোণ প্রায় ৯২.১°, যা বিকল্পগুলোর মধ্যে সবচেয়ে কম।",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t22_q10",
            typeId = 22,
            typeName = "বন্ধন কোণ ও বন্ধন দৈর্ঘ্য",
            question = "SiCl₄, BF₃ এবং NH₃ যৌগগুলোতে বন্ধন কোণের সঠিক ক্রম কোনটি?",
            options = listOf("SiCl₄ > BF₃ > NH₃", "NH₃ > BF₃ > SiCl₄", "BF₃ > SiCl₄ > NH₃", "BF₃ > NH₃ > SiCl₄"),
            correctIndex = 2,
            explanation = "BF₃ (১২০°) > SiCl₄ (১০৯.৫° চতুস্তলকীয়) > NH₃ (১০৭° পিরামিডীয়)।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t22_q11",
            typeId = 22,
            typeName = "বন্ধন কোণ ও বন্ধন দৈর্ঘ্য",
            question = "CH₄, NH₃, H₂S ও H₂O এর বন্ধন কোণের ক্রম কোনটি?",
            options = listOf("NH₃ > CH₄ > H₂O > H₂S", "CH₄ > NH₃ > H₂O > H₂S", "H₂O > NH₃ > CH₄ > H₂S", "CH₄ > H₂O > NH₃ > H₂S"),
            correctIndex = 1,
            explanation = "CH₄ (109.5°) > NH₃ (107°) > H₂O (104.5°) > H₂S (92.1°)।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t22_q12",
            typeId = 22,
            typeName = "বন্ধন কোণ ও বন্ধন দৈর্ঘ্য",
            question = "XeF₄ অণুতে ∠F - Xe - F বন্ধন কোণ 90° এর সংখ্যা কতটি?",
            options = listOf("1", "2", "3", "4"),
            correctIndex = 3,
            explanation = "XeF₄ বর্গাকার সমতলীয় (Square planar) হওয়ায় সন্নিহিত ৪টি F-Xe-F কোণ প্রত্যেকেই ৯০° (মোট ৪টি)।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t22_q13",
            typeId = 22,
            typeName = "বন্ধন কোণ ও বন্ধন দৈর্ঘ্য",
            question = "নিচের কোনটিতে বন্ধন দৈর্ঘ্য কম?",
            options = listOf("H - H", "H₃C - H", "F - F", "H - F"),
            correctIndex = 0,
            explanation = "H-H বন্ধন দৈর্ঘ্য সবচেয়ে ক্ষুদ্র (মাত্র ০.৭৪ Å বা ৭৪ pm), কারণ দুটি হাইড্রোজেন পরমাণুর আকার সবচেয়ে ক্ষুদ্র।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t22_q14",
            typeId = 22,
            typeName = "বন্ধন কোণ ও বন্ধন দৈর্ঘ্য",
            question = "কার্বন-কার্বন বন্ধন দূরত্ব সবচেয়ে কম কোন সংকরণের ক্ষেত্রে?",
            options = listOf("সংকরণের প্রভাব নেই", "sp", "sp²", "sp³"),
            correctIndex = 1,
            explanation = "sp সংকরণে ৫০% s-চরিত্র থাকায় ইলেকট্রন নিউক্লিয়াসের অতি নিকটে টানা হয় এবং ত্রিবন্ধনে C≡C দূরত্ব মাত্র ১.২০ Å, যা সর্বনিম্ন।",
            difficulty = Difficulty.EASY
        ),

        // টাইপ ২৩: পোলারিটি ও ডাইপোল মোমেন্ট
        MCQQuestion(
            id = "t23_q1",
            typeId = 23,
            typeName = "পোলারিটি ও ডাইপোল মোমেন্ট",
            question = "কোনটি পোলার অণু?",
            options = listOf("CO₂", "BF₃", "NH₃", "CCl₄"),
            correctIndex = 2,
            explanation = "NH₃ পিরামিডীয় হওয়ায় এর বন্ধন ডাইপোলগুলো পরস্পরকে নিষ্ক্রিয় করতে পারে না, ফলে নিট ডাইপোল মোমেন্ট (μ = 1.47 D) থাকে।",
            reference = "GST'24-25",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t23_q2",
            typeId = 23,
            typeName = "পোলারিটি ও ডাইপোল মোমেন্ট",
            question = "কোনটি স্থায়ী ডাইপোলার অণু?",
            options = listOf("HCl", "H₂O", "NH₃", "সবগুলো"),
            correctIndex = 3,
            explanation = "HCl, H₂O এবং NH₃ তিনটিই অপ্রতিসম ও স্থায়ী ডাইপোল মোমেন্টযুক্ত পোলার অণু।",
            reference = "লিংকন স্যার",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t23_q3",
            typeId = 23,
            typeName = "পোলারিটি ও ডাইপোল মোমেন্ট",
            question = "কোন যৌগটি সবচেয়ে কম পোলার?",
            options = listOf("H₂O", "NH₃", "CO₂", "HF"),
            correctIndex = 2,
            explanation = "CO₂ সরলরৈখিক প্রতিসম অণু হওয়ায় দুটি C=O বিপরীতমুখী ডাইপোল পরস্পরকে বাতিল করে নিট ডাইপোল শূন্য হয় (অপোলার)।",
            reference = "JnU'25-26",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t23_q4",
            typeId = 23,
            typeName = "পোলারিটি ও ডাইপোল মোমেন্ট",
            question = "নিচের কোনটির ডাইপোল মোমেন্ট শূন্য?",
            options = listOf("ClF", "PCl₃", "SiF₄", "CFCl₃"),
            correctIndex = 2,
            explanation = "SiF₄ নিয়মিত চতুস্তলকীয় প্রতিসম অণু হওয়ায় এর সামগ্রিক ভেক্টর লব্ধি ডাইপোল মোমেন্ট শূন্য হয়।",
            reference = "CU'23-24",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t23_q5",
            typeId = 23,
            typeName = "পোলারিটি ও ডাইপোল মোমেন্ট",
            question = "ডাইপোল মোমেন্ট আছে যে যৌগে?",
            options = listOf("CCl₄", "CH₂Cl₂", "C₂Cl₂", "C₂Cl₄"),
            correctIndex = 1,
            explanation = "ডাইক্লোরোমিথেন (CH₂Cl₂) অপ্রতিসম চতুস্তলকীয় হওয়ায় এর ডাইপোল মোমেন্ট (μ ≠ 0) থাকে।",
            reference = "RU'22-23",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t23_q6",
            typeId = 23,
            typeName = "পোলারিটি ও ডাইপোল মোমেন্ট",
            question = "নিচের কোন অণুতে স্থায়ী ডাইপোল আছে?",
            options = listOf("SF₄", "BF₃", "SiF₄", "XeF₄"),
            correctIndex = 0,
            explanation = "SF₄ সী-স (See-saw) আকৃতির অপ্রতিসম অণু এবং ১টি লোন পেয়ার থাকায় স্থায়ী ডাইপোল মোমেন্ট বিদ্যমান।",
            reference = "DU'25-26",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t23_q7",
            typeId = 23,
            typeName = "পোলারিটি ও ডাইপোল মোমেন্ট",
            question = "কোন যৌগটি সবচেয়ে বেশি পোলার?",
            options = listOf("CH₄", "CCl₄", "CH₂Cl₂", "CHCl₃"),
            correctIndex = 3,
            explanation = "ক্লোরোফর্মের (CHCl₃) তিনটি Cl ও একটি H এর অপ্রতিসম বন্টনের কারণে এর ডাইপোল মোমেন্ট প্রদত্তগুলোর মধ্যে সর্বাধিক লক্ষণীয়।",
            reference = "GST'22-23",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t23_q8",
            typeId = 23,
            typeName = "পোলারিটি ও ডাইপোল মোমেন্ট",
            question = "যদি AB₃ অণুর ডাইপোল মোমেন্টের মান শূন্য হয়, তবে A পরমাণু B পরমাণুর সাথে বন্ধনের ক্ষেত্রে কোন ধরনের সংকরিত অরবিটাল ব্যবহার করবে?",
            options = listOf("sp", "sp²", "sp³", "বিশুদ্ধ তিনটি p-অরবিটাল"),
            correctIndex = 1,
            explanation = "AB₃ অণুর ডাইপোল মোমেন্ট শূন্য হতে হলে অণুটিকে নিখুঁত প্রতিসম সমতলীয় ত্রিকোণাকার হতে হবে, যা sp² সংকরায়নে ঘটে।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t23_q9",
            typeId = 23,
            typeName = "পোলারিটি ও ডাইপোল মোমেন্ট",
            question = "পানিতে H - O - H বন্ধন কোণের মান যদি 180° হতো, তাহলে কোনটি সত্য?",
            options = listOf("পানির পোলারিটি বেড়ে যেত", "পানি গ্যাসীয় হয়ে গেলে জীবনধারণ অসম্ভব হতো", "হাইড্রোজেন বন্ধন শক্তি বেড়ে যেত", "পানিতে লবণের দ্রাব্যতা বেড়ে যেত"),
            correctIndex = 1,
            explanation = "১৮০° হলে পানি অপোলার হয়ে যেত, ফলে হাইড্রোজেন বন্ধন বিলুপ্ত হতো এবং সাধারণ তাপমাত্রায় পানি গ্যাসীয় পদার্থে পরিণত হয়ে জীবনধারণ অসম্ভব হতো।",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t23_q10",
            typeId = 23,
            typeName = "পোলারিটি ও ডাইপোল মোমেন্ট",
            question = "একটি দ্বি-পরমাণুক যৌগের অণুতে দুটি পরমাণুর মধ্যে আধান দূরত্ব 1.27 Å এবং উভয়ের আধান 1.602 × 10⁻¹⁹ C হলে, যৌগটির ডাইপোল মোমেন্ট C·m এককে কত?",
            options = listOf("2.0345 × 10⁻¹⁹", "2.0345 × 10⁻²⁹", "3.0345 × 10⁻¹⁹", "3.0345 × 10⁻²⁹"),
            correctIndex = 1,
            explanation = "μ = q × d = (1.602 × 10⁻¹⁹ C) × (1.27 × 10⁻¹⁰ m) = 2.0345 × 10⁻²⁹ C·m।",
            reference = "RU'25-26",
            difficulty = Difficulty.HARD
        ),

        // টাইপ ২৪: পোলারায়ন (ফাজানের নীতি) এবং সমযোজী ও আয়নিক বৈশিষ্ট্য
        MCQQuestion(
            id = "t24_q1",
            typeId = 24,
            typeName = "পোলারায়ন (ফাজানের নীতি) ও বৈশিষ্ট্য",
            question = "অণুর পোলারাইজেশন বলতে বোঝায়—",
            options = listOf("অণুর আকার পরিবর্তন", "অণুর ইলেকট্রনের অসম বণ্টন", "পরমাণুর নিউট্রন সংখ্যা বৃদ্ধি", "অণুর বন্ধনের শক্তি বৃদ্ধি"),
            correctIndex = 1,
            explanation = "ক্যাটায়নের আকর্ষণে অ্যানায়নের ঋণাত্মক ইলেকট্রন মেঘের বিকৃতি ঘটে ইলেকট্রনের অসম বণ্টন ঘটাকে পোলারায়ন বা পোলারাইজেশন বলে।",
            reference = "RU'25-26",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t24_q2",
            typeId = 24,
            typeName = "পোলারায়ন (ফাজানের নীতি) ও বৈশিষ্ট্য",
            question = "দুটি মৌলের তড়িৎ ঋণাত্মকতার পার্থক্য কত হলে সমযোজী বন্ধনে আংশিক পোলারায়ন সৃষ্টি হয়?",
            options = listOf("0.2-0.5", "0.3-0.9", "0.5-1.9", "1.3-1.9"),
            correctIndex = 2,
            explanation = "তড়িৎ ঋণাত্মকতার পার্থক্য ০.৫ থেকে ১.৯ এর মধ্যে থাকলে সমযোজী বন্ধনে পোলারিটি ও ডাইপোল সৃষ্টি হয়।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t24_q3",
            typeId = 24,
            typeName = "পোলারায়ন (ফাজানের নীতি) ও বৈশিষ্ট্য",
            question = "পোলারাইজিং ক্ষমতা কোনটির বেশি?",
            options = listOf("Li⁺", "Mg²⁺", "Al³⁺", "Be²⁺"),
            correctIndex = 2,
            explanation = "ফাজানের নীতি অনুসারে ক্যাটায়নের চার্জ যত বেশি ও আকার যত ছোট, তার পোলারায়ন ক্ষমতা তত বেশি। Al³⁺ এর চার্জ সর্বোচ্চ (+3)।",
            reference = "HSTU'25-26",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t24_q4",
            typeId = 24,
            typeName = "পোলারায়ন (ফাজানের নীতি) ও বৈশিষ্ট্য",
            question = "নিচের কোন আয়নে পোলারায়ন কম ঘটে?",
            options = listOf("Cl⁻", "F⁻", "Br⁻", "I⁻"),
            correctIndex = 1,
            explanation = "অ্যানায়নের আকার যত ছোট হবে তার ইলেকট্রন মেঘ তত দৃঢ়ভাবে আবদ্ধ থাকে, ফলে ফ্লোরাইড (F⁻) আয়নে পোলারায়ন সর্বনিম্ন ঘটে।",
            reference = "JU'24-25",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t24_q5",
            typeId = 24,
            typeName = "পোলারায়ন (ফাজানের নীতি) ও বৈশিষ্ট্য",
            question = "আয়নিক বন্ধনে ক্যাটায়নের পোলারায়ন ক্ষমতার ক্রম নিচের কোনটি সঠিক?",
            options = listOf("H⁺ > Na⁺ > K⁺", "H⁺ > K⁺ > Na⁺", "K⁺ > Na⁺ > H⁺", "Na⁺ > K⁺ > H⁺"),
            correctIndex = 0,
            explanation = "ক্যাটায়নের আকার যত ছোট, পোলারায়ন ক্ষমতা তত বেশি। H⁺ এর আকার অতি ক্ষুদ্র হওয়ায় পোলারায়ন ক্ষমতা সর্বাধিক: H⁺ > Na⁺ > K⁺।",
            reference = "JU'24-25",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t24_q6",
            typeId = 24,
            typeName = "পোলারায়ন (ফাজানের নীতি) ও বৈশিষ্ট্য",
            question = "ধনাত্মক আয়নের পোলারায়ন ক্ষমতার ক্ষেত্রে নিচের কোনটি সঠিক নয়?",
            options = listOf("Be²⁺ > Mg²⁺", "Al³⁺ > Mg²⁺", "Fe³⁺ > Fe²⁺", "Ba²⁺ > Be²⁺"),
            correctIndex = 3,
            explanation = "গ্রুপে নিচের ব্যারিয়াম ক্যাটায়ন (Ba²⁺) আকারে অনেক বড় হওয়ায় এর পোলারায়ন ক্ষমতা বেরিলিয়াম অপেক্ষা অনেক কম। তাই (d) ভুল।",
            reference = "RU'16-17",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t24_q7",
            typeId = 24,
            typeName = "পোলারায়ন (ফাজানের নীতি) ও বৈশিষ্ট্য",
            question = "আয়নিক পটেনশিয়ালের মান অনুসারে কোন সিরিজটি সঠিক?",
            options = listOf("Cu²⁺ > Mn²⁺ > Sc²⁺", "Cu²⁺ < Mn²⁺ < Sc²⁺", "Cu²⁺ = Mn²⁺ = Sc²⁺", "Cu²⁺ = Mn²⁺ > Sc²⁺"),
            correctIndex = 0,
            explanation = "চার্জ সমান (+2) হলেও ডানদিকের কপার আয়নের আকার ছোট হওয়ায় কার্যকর আয়নিক পটেনশিয়াল (ϕ = charge/radius) কপার আয়নের বেশি।",
            reference = "SUST'25-26",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t24_q8",
            typeId = 24,
            typeName = "পোলারায়ন (ফাজানের নীতি) ও বৈশিষ্ট্য",
            question = "নিচের যৌগগুলির কোনটির আয়নিক বৈশিষ্ট্য সবচেয়ে বেশি?",
            options = listOf("SiF₄", "AlCl₃", "NaI", "CsF"),
            correctIndex = 3,
            explanation = "CsF এ সবচেয়ে বড় ক্যাটায়ন (Cs⁺) এবং সবচেয়ে ছোট অ্যানায়ন (F⁻) থাকায় পোলারায়ন শূন্যের কাছাকাছি, ফলে এর আয়নিক বৈশিষ্ট্য সর্বোচ্চ (৯২%)।",
            reference = "কবীর স্যার",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t24_q9",
            typeId = 24,
            typeName = "পোলারায়ন (ফাজানের নীতি) ও বৈশিষ্ট্য",
            question = "কোন যৌগটি অধিক সমযোজী বৈশিষ্ট্য সম্পন্ন?",
            options = listOf("MgCl₂", "FeCl₂", "FeCl₃", "CaCl₂"),
            correctIndex = 2,
            explanation = "Fe³⁺ ক্যাটায়নের উচ্চ চার্জ (+3) এবং d-ইলেকট্রনের দুর্বল শিল্ডিংয়ের কারণে Cl⁻ অ্যানায়নের প্রবল পোলারায়ন ঘটিয়ে অধিক সমযোজী হয়।",
            reference = "JU'25-26",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t24_q10",
            typeId = 24,
            typeName = "পোলারায়ন (ফাজানের নীতি) ও বৈশিষ্ট্য",
            question = "KI এবং CsI এর মধ্যে সমযোজী বন্ধনীর মাত্রা-",
            options = listOf("KI এর কম", "সমান", "KI এর বেশি", "কোনোটিই নয়"),
            correctIndex = 2,
            explanation = "K⁺ আয়নের আকার Cs⁺ অপেক্ষা ছোট হওয়ায় I⁻ অ্যানায়নকে বেশি পোলারায়িত করে, তাই KI এর সমযোজী বৈশিষ্ট্য CsI অপেক্ষা বেশি।",
            reference = "কবীর স্যার",
            difficulty = Difficulty.HARD
        ),

        // টাইপ ২৫: ল্যাটিস শক্তি, যৌগের দ্রাব্যতা, গলনাঙ্ক ও তাপীয় বিয়োজন
        MCQQuestion(
            id = "t25_q1",
            typeId = 25,
            typeName = "ল্যাটিস শক্তি, যৌগের দ্রাব্যতা ও গলনাঙ্ক",
            question = "নিম্নের কোনটি NaCl এর গলনাঙ্ক?",
            options = listOf("776°C", "801°C", "826°C", "862°C"),
            correctIndex = 1,
            explanation = "বিশুদ্ধ সোডিয়াম ক্লোরাইডের (খাদ্য লবণ) গলনাঙ্ক ৮০১°C।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t25_q2",
            typeId = 25,
            typeName = "ল্যাটিস শক্তি, যৌগের দ্রাব্যতা ও গলনাঙ্ক",
            question = "নিচের কোন মৌলের গলনাঙ্ক কম?",
            options = listOf("Na", "S", "P", "Mg"),
            correctIndex = 0,
            explanation = "সোডিয়ামের ধাতব বন্ধন দুর্বল হওয়ায় এর গলনাঙ্ক মাত্র ৯৭.৮°C।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t25_q3",
            typeId = 25,
            typeName = "ল্যাটিস শক্তি, যৌগের দ্রাব্যতা ও গলনাঙ্ক",
            question = "কোন যৌগের গলনাঙ্ক সবচেয়ে বেশি?",
            options = listOf("CaCl₂", "SrCl₂", "BaCl₂", "MgCl₂"),
            correctIndex = 2,
            explanation = "BaCl₂ এর ক্যাটায়নের আকার বড় হওয়ায় পোলারায়ন সর্বনিম্ন এবং আয়নিক বৈশিষ্ট্য ও সুস্থিত কেলাসের কারণে গলনাঙ্ক প্রায় ৯৬২°C (সর্বাধিক)।",
            reference = "RU'24-25",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t25_q4",
            typeId = 25,
            typeName = "ল্যাটিস শক্তি, যৌগের দ্রাব্যতা ও গলনাঙ্ক",
            question = "কোন যৌগটি সবচেয়ে কম তাপমাত্রায় বিয়োজিত হবে?",
            options = listOf("Na₂CO₃", "K₂CO₃", "MgCO₃", "BaCO₃"),
            correctIndex = 2,
            explanation = "Mg²⁺ এর ক্ষুদ্র আকার ও উচ্চ চার্জ ঘনত্বের জন্য কার্বনেট আয়নের C-O বন্ধনকে দুর্বল করে দেয়, ফলে MgCO₃ খুব কম তাপমাত্রায় (৫৪০°C) বিয়োজিত হয়।",
            reference = "Agri.'20-21",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t25_q5",
            typeId = 25,
            typeName = "ল্যাটিস শক্তি, যৌগের দ্রাব্যতা ও গলনাঙ্ক",
            question = "NaF, NaBr, NaI ও CsI লবণগুলোর ল্যাটিস শক্তির ক্রম-",
            options = listOf("NaF > NaBr > NaI > CsI", "CsI > NaF > NaBr > NaI", "NaI > NaBr > NaF > CsI", "NaF > NaBr > CsI > NaI"),
            correctIndex = 0,
            explanation = "ল্যাটিস শক্তি অ্যানায়ন ও ক্যাটায়নের ব্যাসার্ধের যোগফলের ব্যস্তানুপাতিক। অ্যানায়নের আকার ছোট হলে ল্যাটিস শক্তি বাড়ে: NaF > NaBr > NaI > CsI।",
            reference = "কবীর স্যার",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t25_q6",
            typeId = 25,
            typeName = "ল্যাটিস শক্তি, যৌগের দ্রাব্যতা ও গলনাঙ্ক",
            question = "নিচের কোনটি পানিতে দ্রবণীয়?",
            options = listOf("AgF", "AgCl", "AgBr", "AgI"),
            correctIndex = 0,
            explanation = "সিলভার হ্যালাইডগুলোর মধ্যে AgF অত্যন্ত দ্রবণীয়, কিন্তু AgCl, AgBr ও AgI ফাজানের পোলারায়নের কারণে পানিতে অদ্রবণীয় অধঃক্ষেপ দেয়।",
            reference = "JU'19-20",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t25_q7",
            typeId = 25,
            typeName = "ল্যাটিস শক্তি, যৌগের দ্রাব্যতা ও গলনাঙ্ক",
            question = "নিম্নের কোন যৌগটি পানিতে দ্রবণীয়?",
            options = listOf("BaSO₄", "PbSO₄", "PbSO₃", "Na₂SO₄"),
            correctIndex = 3,
            explanation = "গ্রুপ ১-এর ক্ষার ধাতুর সমস্ত সালফেট পানিতে সম্পূর্ণরূপে দ্রবণীয় (Na₂SO₄ দ্রবণীয়, BaSO₄ অদ্রবণীয়)।",
            reference = "CU'18-19",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t25_q8",
            typeId = 25,
            typeName = "ল্যাটিস শক্তি, যৌগের দ্রাব্যতা ও গলনাঙ্ক",
            question = "কোনটি পানিতে অদ্রবণীয়?",
            options = listOf("CaCl₂", "CaBr₂", "CaI₂", "CaF₂"),
            correctIndex = 3,
            explanation = "CaF₂-এ ক্ষুদ্র F⁻ এবং Ca²⁺ এর কারণে ল্যাটিস শক্তি হাইড্রেশন শক্তি অপেক্ষা অনেক বেশি হওয়ায় এটি পানিতে প্রায় অদ্রবণীয়।",
            reference = "Agri.'19-20",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t25_q9",
            typeId = 25,
            typeName = "ল্যাটিস শক্তি, যৌগের দ্রাব্যতা ও গলনাঙ্ক",
            question = "পানিতে নিচের কোন পদার্থের দ্রাব্যতা বেশি?",
            options = listOf("NaCl", "CaCl₂", "BaCl₂", "AlCl₃"),
            correctIndex = 1,
            explanation = "CaCl₂ এর হাইড্রেশন শক্তি অতি উচ্চ হওয়ায় এটি পানিতে প্রচণ্ড দ্রবণীয় এবং পানিগ্রাসী পদার্থ।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t25_q10",
            typeId = 25,
            typeName = "ল্যাটিস শক্তি, যৌগের দ্রাব্যতা ও গলনাঙ্ক",
            question = "নিচের কোন আয়নটি সবচেয়ে বেশি দ্রবণীয় হাইড্রোক্সাইড গঠন করবে?",
            options = listOf("K⁺", "Mg²⁺", "Zn²⁺", "Al³⁺"),
            correctIndex = 0,
            explanation = "K⁺ এর ক্ষারকীয় হাইড্রোক্সাইড KOH পানিতে সম্পূর্ণ ও অত্যন্ত তীব্রভাবে দ্রবণীয়।",
            reference = "কবীর স্যার",
            difficulty = Difficulty.EASY
        ),

        // টাইপ ২৬: হাইড্রোজেন বন্ধন ও ভ্যানডার ওয়ালস বল (আন্তঃআণবিক আকর্ষণ ও স্ফুটনাঙ্ক)
        MCQQuestion(
            id = "t26_q1",
            typeId = 26,
            typeName = "হাইড্রোজেন বন্ধন ও ভ্যানডার ওয়ালস বল",
            question = "DNA শিকলে বিদ্যমান ক্ষারগুলো পরস্পর কী বন্ধনে আবদ্ধ থাকে?",
            options = listOf("আয়নিক", "সমযোজী", "হাইড্রোজেন", "ভ্যানডার ওয়ালস"),
            correctIndex = 2,
            explanation = "ডিএনএ ডাবল হেলিক্সের পরিপূরক নাইট্রোজেনাস বেসগুলো (A=T এবং G≡C) হাইড্রোজেন বন্ধন দ্বারা পরস্পর জোড় বাঁধে।",
            reference = "KU'16-17",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t26_q2",
            typeId = 26,
            typeName = "হাইড্রোজেন বন্ধন ও ভ্যানডার ওয়ালস বল",
            question = "পানির উচ্চ স্ফুটনাঙ্কের কারণ-",
            options = listOf("পোলারিটি", "উচ্চ ডাইইলেকট্রিক ধ্রুবক", "দুর্বল বিভাজন", "হাইড্রোজেন বন্ধন"),
            correctIndex = 3,
            explanation = "পানির প্রতিটি অণু ৪টি শক্তিশালী হাইড্রোজেন বন্ধন দ্বারা চতুস্তলকীয় জালিকা গঠন করায় এর স্ফুটনাঙ্ক অস্বাভাবিকভাবে বেশি (১০০°C)।",
            reference = "CU'20-21",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t26_q3",
            typeId = 26,
            typeName = "হাইড্রোজেন বন্ধন ও ভ্যানডার ওয়ালস বল",
            question = "নিম্নের কোন যৌগটি হাইড্রোজেন বন্ধন গঠন করতে পারে?",
            options = listOf("HCl", "CH₄", "CCl₄", "NH₃"),
            correctIndex = 3,
            explanation = "তীব্র তড়িৎ ঋণাত্মক নাইট্রোজেনের সাথে যুক্ত H থাকায় অ্যামোনিয়া (NH₃) শক্তিশালী হাইড্রোজেন বন্ধন গঠন করতে পারে।",
            reference = "Agri.'25-26",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t26_q4",
            typeId = 26,
            typeName = "হাইড্রোজেন বন্ধন ও ভ্যানডার ওয়ালস বল",
            question = "কোন যৌগটিতে হাইড্রোজেন বন্ধন নেই?",
            options = listOf("CH₃ - CH₂ - OH", "CH₃ - CHO", "H - COOH", "CH₃ - NH₂"),
            correctIndex = 1,
            explanation = "অ্যাসিটালডিহাইডে (CH₃-CHO) কোনো অক্সিজেন বা নাইট্রোজেনের সাথে সরাসরি হাইড্রোজেন যুক্ত নেই, তাই এর অণুগুলোর মাঝে H-বন্ধন নেই।",
            reference = "CU'17-18",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t26_q5",
            typeId = 26,
            typeName = "হাইড্রোজেন বন্ধন ও ভ্যানডার ওয়ালস বল",
            question = "এক অণু পানিতে সর্বোচ্চ কয়টি H - bond থাকতে পারে?",
            options = listOf("1", "2", "3", "4"),
            correctIndex = 3,
            explanation = "পানির এক অণুর ২টি H পরমাণু ২টি এবং অক্সিজেনের ২টি মুক্তজোড় অপর ২টি হাইড্রোজেন বন্ধন তৈরি করে সর্বমোট ৪টি H-বন্ধন গঠন করে।",
            reference = "JU'14-15",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t26_q6",
            typeId = 26,
            typeName = "হাইড্রোজেন বন্ধন ও ভ্যানডার ওয়ালস বল",
            question = "ইথানয়িক এসিডের ডাইমারে কতটি হাইড্রোজেন বন্ধন বিদ্যমান?",
            options = listOf("1", "2", "3", "4"),
            correctIndex = 1,
            explanation = "দুটি অ্যাসিটিক অ্যাসিড অণু মুখোমুখি ২টি হাইড্রোজেন বন্ধনের মাধ্যমে একটি সুস্থিত আট সদস্যবিশিষ্ট রিং ডাইমার তৈরি করে।",
            reference = "RU'19-20",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t26_q7",
            typeId = 26,
            typeName = "হাইড্রোজেন বন্ধন ও ভ্যানডার ওয়ালস বল",
            question = "বরফের যে বন্ধন আছে তা হলো-\n(i) হাইড্রোজেন বন্ধন (ii) সন্নিবেশ বন্ধন (iii) সমযোজী বন্ধন\nনিচের কোনটি সঠিক?",
            options = listOf("i, ii", "ii, iii", "i, iii", "i, ii, iii"),
            correctIndex = 2,
            explanation = "বরফে পানির অভ্যন্তরীণ O-H সমযোজী বন্ধন এবং আন্তঃআণবিক হাইড্রোজেন বন্ধন বিদ্যমান (কোনো সন্নিবেশ বন্ধন নেই)।",
            reference = "JU'23-24; GST'21-22",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t26_q8",
            typeId = 26,
            typeName = "হাইড্রোজেন বন্ধন ও ভ্যানডার ওয়ালস বল",
            question = "কোন যৌগে সবচেয়ে শক্তিশালী H-বন্ধন ঘটে?",
            options = listOf("H₂O", "H₂S", "HF", "NH₃"),
            correctIndex = 2,
            explanation = "ফ্লোরিনের তড়িৎ ঋণাত্মকতা (৪.০) সমস্ত মৌলের মধ্যে সর্বোচ্চ হওয়ায় একক H···F হাইড্রোজেন বন্ধনটি সবচেয়ে শক্তিশালী (প্রায় ৪১.৮ kJ/mol)।",
            reference = "RU'24-25; DU'22-23",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t26_q9",
            typeId = 26,
            typeName = "হাইড্রোজেন বন্ধন ও ভ্যানডার ওয়ালস বল",
            question = "কোনটিতে অন্তঃআণবিক হাইড্রোজেন বন্ধন তৈরি হয় না?",
            options = listOf("স্যালিসাইলিক এসিড", "2-নাইট্রোফেনল", "4-নাইট্রোফেনল", "2-ক্লোরোফেনল"),
            correctIndex = 2,
            explanation = "৪-নাইট্রোফেনলে -OH এবং -NO₂ গ্রুপ দুটি বিপরীত দিকে (প্যারা অবস্থানে) থাকায় এরা নিজেদের মধ্যে বন্ধন না করে আন্তঃআণবিক বন্ধন করে।",
            reference = "GST'20-21",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t26_q10",
            typeId = 26,
            typeName = "হাইড্রোজেন বন্ধন ও ভ্যানডার ওয়ালস বল",
            question = "নিম্নের কোনটির স্ফুটনাঙ্ক সবচেয়ে বেশি?",
            options = listOf("HF", "HCl", "HBr", "HI"),
            correctIndex = 0,
            explanation = "তীব্র হাইড্রোজেন বন্ধনের উপস্থিতির কারণে HF এর স্ফুটনাঙ্ক (+১৯.৫°C), যেখানে অন্য হ্যালোজেন অ্যাসিডগুলো সাধারণ তাপমাত্রায় গ্যাসীয়।",
            reference = "CU'15-16",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t26_q11",
            typeId = 26,
            typeName = "হাইড্রোজেন বন্ধন ও ভ্যানডার ওয়ালস বল",
            question = "NH₃, PH₃, AsH₃ ও SbH₃ এর স্ফুটনাঙ্কের ক্রম-",
            options = listOf("NH₃ > SbH₃ > PH₃ > AsH₃", "SbH₃ > NH₃ > AsH₃ > PH₃", "AsH₃ > PH₃ > SbH₃ > NH₃", "PH₃ > SbH₃ > NH₃ > AsH₃"),
            correctIndex = 1,
            explanation = "SbH₃ এর ভর অতি উচ্চ হওয়ায় শক্তিশালী ভ্যানডার ওয়ালস বলের কারণে এর স্ফুটনাঙ্ক সর্বোচ্চ, এরপর হাইড্রোজেন বন্ধনের কারণে NH₃: SbH₃ > NH₃ > AsH₃ > PH₃।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t26_q12",
            typeId = 26,
            typeName = "হাইড্রোজেন বন্ধন ও ভ্যানডার ওয়ালস বল",
            question = "এক পরমাণুক নিষ্ক্রিয় গ্যাস যেমন: He, Ne ইত্যাদিতে কোন ধরনের আকর্ষণ বল দেখা যায়?",
            options = listOf("ডাইপোল-আবিষ্ট ডাইপোল", "আবিষ্ট ডাইপোল-আবিষ্ট ডাইপোল", "স্থির বৈদ্যুতিক আকর্ষণ", "ডাইপোল-ডাইপোল"),
            correctIndex = 1,
            explanation = "নিষ্ক্রিয় গ্যাসের ক্ষণস্থায়ী ইলেকট্রন মেঘের দোলায় আবিষ্ট ডাইপোল-আবিষ্ট ডাইপোল (লন্ডন বিচ্ছুরণ বল) সৃষ্টি হয়।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t26_q13",
            typeId = 26,
            typeName = "হাইড্রোজেন বন্ধন ও ভ্যানডার ওয়ালস বল",
            question = "পর্যায় সারণির গ্রুপ VIIA মৌলসমূহের ভ্যানডার ওয়ালস আকর্ষণ বলের বৃদ্ধির ক্রম কোনটি?",
            options = listOf("F₂ > Cl₂ > Br₂ > I₂", "Cl₂ > F₂ > Br₂ > I₂", "Br₂ > F₂ > Cl₂ > I₂", "I₂ > Br₂ > Cl₂ > F₂"),
            correctIndex = 3,
            explanation = "আণবিক ভর ও আকার বাড়ার সাথে সাথে পোলারায়নযোগ্যতা বৃদ্ধি পায়, ফলে ভ্যানডার ওয়ালস বলের ক্রম: I₂ > Br₂ > Cl₂ > F₂।",
            reference = "RU'13-14",
            difficulty = Difficulty.MEDIUM
        )
    )
}
