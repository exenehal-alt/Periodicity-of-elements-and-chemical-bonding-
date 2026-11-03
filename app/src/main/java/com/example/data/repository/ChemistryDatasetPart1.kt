package com.example.data.repository

import com.example.data.model.Difficulty
import com.example.data.model.MCQQuestion

object ChemistryDatasetPart1 {
    val questions: List<MCQQuestion> = listOf(
        // টাইপ ১: পর্যায় সারণির মৌলিক ধারণা, ইতিহাস ও গঠন
        MCQQuestion(
            id = "t1_q1",
            typeId = 1,
            typeName = "পর্যায় সারণির মৌলিক ধারণা, ইতিহাস ও গঠন",
            question = "আধুনিক পর্যায় সারণির মূল ভিত্তি কী?",
            options = listOf("পারমাণবিক সংখ্যা", "পারমাণবিক ভর", "আণবিক ভর", "ইলেকট্রন বিন্যাস"),
            correctIndex = 0,
            explanation = "মোজলের সূত্রানুসারে আধুনিক পর্যায় সারণির মূল ভিত্তি হলো পারমাণবিক সংখ্যা (প্রোটন সংখ্যা)। ইলেকট্রন বিন্যাস পর্যায় সারণির অন্যতম প্রধান ভিত্তি হলেও মূল প্রোটন সংখ্যার আলোকেই পর্যায়বৃত্ত রূপ পায়।",
            reference = "মোজলের সূত্র",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t1_q2",
            typeId = 1,
            typeName = "পর্যায় সারণির মৌলিক ধারণা, ইতিহাস ও গঠন",
            question = "আধুনিক পর্যায় সারণিতে কয়টি কলাম (গ্রুপ) রয়েছে?",
            options = listOf("8", "12", "9", "18"),
            correctIndex = 3,
            explanation = "আধুনিক দীর্ঘ পর্যায় সারণিতে ১ থেকে ১৮ পর্যন্ত মোট ১৮টি খাড়া কলাম বা গ্রুপ রয়েছে।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t1_q3",
            typeId = 1,
            typeName = "পর্যায় সারণির মৌলিক ধারণা, ইতিহাস ও গঠন",
            question = "মেন্ডেলিফ পর্যায় সারণিতে মৌলসমূহকে কয়টি পর্যায়ে সজ্জিত করেন?",
            options = listOf("69", "63", "12", "8"),
            correctIndex = 1,
            explanation = "মেন্ডেলিফের প্রাথমিক পর্যায় সারণি আবিষ্কারের সময় সর্বমোট ৬৩টি আবিষ্কৃত মৌল উপস্থিত ছিল।",
            reference = "ইতিহাস",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t1_q4",
            typeId = 1,
            typeName = "পর্যায় সারণির মৌলিক ধারণা, ইতিহাস ও গঠন",
            question = "আধুনিক দীর্ঘ পর্যায় সারণিতে যথাক্রমে কতটি পর্যায় ও শ্রেণি আছে?",
            options = listOf("8 ও 8", "7 ও 8", "7 ও 16", "16 ও 7"),
            correctIndex = 2,
            explanation = "সনাতন উপগ্রুপ পদ্ধতিতে মোট ৭টি পর্যায় এবং উপশ্রেণি A ও B মিলিয়ে ১৬টি শ্রেণি/উপশ্রেণি ধরা হতো। (আধুনিক রূপ ১৮ গ্রুপ)।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t1_q5",
            typeId = 1,
            typeName = "পর্যায় সারণির মৌলিক ধারণা, ইতিহাস ও গঠন",
            question = "ষষ্ঠ পর্যায় এর মৌল কয়টি?",
            options = listOf("30", "33", "32", "31"),
            correctIndex = 2,
            explanation = "ষষ্ঠ পর্যায়ে 6s (2), 4f (14), 5d (10) এবং 6p (6) মিলিয়ে সর্বমোট ৩২টি মৌল বিদ্যমান।",
            reference = "কবীর স্যার",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t1_q6",
            typeId = 1,
            typeName = "পর্যায় সারণির মৌলিক ধারণা, ইতিহাস ও গঠন",
            question = "আধুনিক পর্যায় সারণিতে মৌলসমূহের ভৌত ও রাসায়নিক ধর্ম পর্যায়ক্রমে নিম্নের কোনটির সংখ্যার ভিত্তিতে আবর্তিত হয়?",
            options = listOf("নিউট্রন", "প্রোটন", "প্রোটন ও নিউট্রন", "ইলেকট্রন ও নিউট্রন"),
            correctIndex = 1,
            explanation = "আধুনিক পর্যায় সূত্র অনুযায়ী মৌলসমূহের ভৌত ও রাসায়নিক ধর্মাবলি তাদের পরমাণুর পারমাণবিক সংখ্যা তথা প্রোটন সংখ্যার ক্রমানুসারে পর্যায়ক্রমে আবর্তিত হয়।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t1_q7",
            typeId = 1,
            typeName = "পর্যায় সারণির মৌলিক ধারণা, ইতিহাস ও গঠন",
            question = "পর্যায় সারণিতে সম্প্রতি সংযুক্ত নতুন মৌলগুলির পারমাণবিক সংখ্যা হলো-",
            options = listOf("112, 113, 114, 116", "112, 114, 115, 117", "114, 115, 117, 118", "113, 115, 117, 118"),
            correctIndex = 3,
            explanation = "IUPAC কর্তৃক সর্বশেষ অনুমোদিত ও ৭ম পর্যায় পূর্ণকারী নতুন চার মৌল হলো নিহোনিয়াম (113), মস্কোভিয়াম (115), তেনেসিন (117) ও ওগানেসন (118)।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t1_q8",
            typeId = 1,
            typeName = "পর্যায় সারণির মৌলিক ধারণা, ইতিহাস ও গঠন",
            question = "পর্যায় সারণির কোন গ্রুপগুলোতে ধাতু ও অধাতু উভয়ই থাকে?",
            options = listOf("IA, IIA, IIIA, IVA", "IIA, IIIA, IVA, VA", "IIIA, IVA, VA, VIA", "IIA, IVA, VA, VIIA"),
            correctIndex = 2,
            explanation = "গ্রুপ IIIA (13), IVA (14), VA (15), VIA (16) গ্রুপগুলোতে উপরের দিকে অধাতু/উপধাতু এবং নিচের দিকে ধাতু বিদ্যমান।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t1_q9",
            typeId = 1,
            typeName = "পর্যায় সারণির মৌলিক ধারণা, ইতিহাস ও গঠন",
            question = "পর্যায় সারণিতে টেলুরিয়াম (Te) কেন আয়োডিনের (I) পূর্বে আসে?",
            options = listOf(
                "Te এর সর্ববহিঃস্থ অরবিটালে I অপেক্ষা একটি ইলেকট্রন বেশি আছে",
                "Te এর নিউক্লিয়াসে I অপেক্ষা একটি নিউট্রন কম আছে",
                "Te এর I অপেক্ষা একটি প্রোটন কম আছে",
                "Te এর I অপেক্ষা একটি প্রোটন বেশি আছে"
            ),
            correctIndex = 2,
            explanation = "টেলুরিয়ামের পারমাণবিক সংখ্যা ৫২ এবং আয়োডিনের ৫৩। মেন্ডেলিফের ভরসংখ্যার অসঙ্গতি আধুনিক মোজলের প্রোটন সংখ্যার ভিত্তিতে নিরসন হয়, কারণ Te এর I অপেক্ষা ১টি প্রোটন কম রয়েছে।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.HARD
        ),

        // টাইপ ২: মৌলসমূহের ভৌত অবস্থা, প্রাচুর্য ও বিশেষ নামকরণ
        MCQQuestion(
            id = "t2_q1",
            typeId = 2,
            typeName = "মৌলসমূহের ভৌত অবস্থা, প্রাচুর্য ও বিশেষ নামকরণ",
            question = "সবচেয়ে হালকা ধাতু কোনটি?",
            options = listOf("লিথিয়াম", "পটাশিয়াম", "পারদ", "প্লাটিনাম"),
            correctIndex = 0,
            explanation = "লিথিয়াম (Li) সবচেয়ে হালকা ধাতু, যার ঘনত্ব মাত্র ০.৫৩৪ গ্রাম/ঘন সেমি (পানির চেয়েও হালকা)।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t2_q2",
            typeId = 2,
            typeName = "মৌলসমূহের ভৌত অবস্থা, প্রাচুর্য ও বিশেষ নামকরণ",
            question = "সবচেয়ে ভারী কোনটি?",
            options = listOf("Osmium", "Mercury", "Iron", "Nickel"),
            correctIndex = 0,
            explanation = "অসমিয়াম (Os) এর ঘনত্ব প্রায় ২২.৫৯ গ্রাম/ঘন সেমি, যা সমস্ত মৌলের মধ্যে সর্বাধিক ঘন ও ভারী ধাতু।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t2_q3",
            typeId = 2,
            typeName = "মৌলসমূহের ভৌত অবস্থা, প্রাচুর্য ও বিশেষ নামকরণ",
            question = "কক্ষ তাপমাত্রায় কোনটি তরল অবস্থায় থাকে?",
            options = listOf("I₂", "Hg", "H₂", "N₂"),
            correctIndex = 1,
            explanation = "পারদ (Hg) একমাত্র ধাতু যা সাধারণ কক্ষ তাপমাত্রায় তরল থাকে। (অধাতুর মধ্যে ব্রোমিন Br₂ তরল)।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t2_q4",
            typeId = 2,
            typeName = "মৌলসমূহের ভৌত অবস্থা, প্রাচুর্য ও বিশেষ নামকরণ",
            question = "নিচের কোন অধাতুটি (Non-metal) সাধারণ তাপমাত্রায় কঠিন অবস্থায় থাকে?",
            options = listOf("আয়োডিন", "ফ্লোরিন", "ক্লোরিন", "ব্রোমিন"),
            correctIndex = 0,
            explanation = "হ্যালোজেনগুলোর মধ্যে F₂ ও Cl₂ গ্যাসীয়, Br₂ তরল এবং I₂ কঠিন স্ফটিকাকার অধাতু।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t2_q5",
            typeId = 2,
            typeName = "মৌলসমূহের ভৌত অবস্থা, প্রাচুর্য ও বিশেষ নামকরণ",
            question = "নিম্নের কোন মৌলটি ভূ-স্তরে সবচেয়ে বেশি বিদ্যমান?",
            options = listOf("অক্সিজেন", "আয়রন", "সিলিকন", "অ্যালুমিনিয়াম"),
            correctIndex = 0,
            explanation = "ভূত্বকে ভরের দিক থেকে সর্বাধিক বিদ্যমান মৌল অক্সিজেন (প্রায় ৪৬.৬%), দ্বিতীয় সিলিকন (প্রায় ২৭.৭%) এবং ধাতুর মধ্যে অ্যালুমিনিয়াম (প্রায় ৮.১%)।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t2_q6",
            typeId = 2,
            typeName = "মৌলসমূহের ভৌত অবস্থা, প্রাচুর্য ও বিশেষ নামকরণ",
            question = "মুদ্রাধাতু বলা হয় কোন গ্রুপের মৌলসমূহকে?",
            options = listOf("IB", "IA", "VIIA", "IIA"),
            correctIndex = 0,
            explanation = "গ্রুপ IB (আধুনিক গ্রুপ 11) এর কপার (Cu), সিলভার (Ag) ও গোল্ড (Au) মৌলগুলোকে প্রাচীনকাল থেকে মুদ্রা তৈরিতে ব্যবহৃত হওয়ায় মুদ্রাধাতু বলে।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t2_q7",
            typeId = 2,
            typeName = "মৌলসমূহের ভৌত অবস্থা, প্রাচুর্য ও বিশেষ নামকরণ",
            question = "‘মুদ্রাধাতু’ নামে পরিচিত-",
            options = listOf("Cu, Ag, Ni", "Cu, Au, Cr", "Ag, Cu, Au", "Au, Al, Ag"),
            correctIndex = 2,
            explanation = "Ag (সিলভার), Cu (কপার) এবং Au (স্বর্ণ) মুদ্রাধাতু হিসেবে সুপরিচিত।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t2_q8",
            typeId = 2,
            typeName = "মৌলসমূহের ভৌত অবস্থা, প্রাচুর্য ও বিশেষ নামকরণ",
            question = "কোনটি উপধাতু?",
            options = listOf("Na", "Ge", "S", "Co"),
            correctIndex = 1,
            explanation = "জার্মেনিয়াম (Ge) ধাতু ও অধাতু উভয়ের ধর্ম প্রদর্শনকারী একটি সুপরিচিত উপধাতু বা মেটালয়েড।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t2_q9",
            typeId = 2,
            typeName = "মৌলসমূহের ভৌত অবস্থা, প্রাচুর্য ও বিশেষ নামকরণ",
            question = "কোনগুলো অপধাতু?",
            options = listOf("Si, Ge, As", "Na, K, Rb", "Mg, Al, Sb", "B, Fe, Ni"),
            correctIndex = 0,
            explanation = "সিলিকন (Si), জার্মেনিয়াম (Ge) এবং আর্সেনিক (As) প্রত্যেকেই অপধাতু বা মেটালয়েড।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t2_q10",
            typeId = 2,
            typeName = "মৌলসমূহের ভৌত অবস্থা, প্রাচুর্য ও বিশেষ নামকরণ",
            question = "পর্যায় সারণির IIB-গ্রুপের মৌলগুলো কোনটি?",
            options = listOf("Zn, Cd, Hg", "Ca, Ag, Au", "Ni, Co, Fe", "Na, K, Li"),
            correctIndex = 0,
            explanation = "গ্রুপ IIB (গ্রুপ ১২)-এর তিনটি প্রধান মৌল হলো দস্তা (Zn), ক্যাডমিয়াম (Cd) এবং পারদ (Hg)।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t2_q11",
            typeId = 2,
            typeName = "মৌলসমূহের ভৌত অবস্থা, প্রাচুর্য ও বিশেষ নামকরণ",
            question = "পর্যায় সারণির ২য় পর্যায়ে উপস্থিত মৌলগুলোকে বলে-",
            options = listOf("Normal elements", "Noble gases", "Transition elements", "Rare earth elements"),
            correctIndex = 0,
            explanation = "২য় ও ৩য় পর্যায়ের মৌলগুলোকে আদর্শ বা Normal elements (প্রতিনিধি মৌল) বলা হয়।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t2_q12",
            typeId = 2,
            typeName = "মৌলসমূহের ভৌত অবস্থা, প্রাচুর্য ও বিশেষ নামকরণ",
            question = "Representative elements বলা হয় কোনটিকে?",
            options = listOf("p-ব্লক", "d-ব্লক", "f-ব্লক", "কোনোটিই নয়"),
            correctIndex = 0,
            explanation = "s-ব্লক এবং p-ব্লক মৌলগুলোকে একত্রে Representative বা আদর্শ প্রতিনিধি মৌল বলা হয়।",
            difficulty = Difficulty.MEDIUM
        ),

        // টাইপ ৩: মৌলের ব্লক পরিচিতি ও সংখ্যা গণনা (s, p, d, f ব্লক)
        MCQQuestion(
            id = "t3_q1",
            typeId = 3,
            typeName = "মৌলের ব্লক পরিচিতি ও সংখ্যা গণনা (s, p, d, f ব্লক)",
            question = "'O' কোন গ্রুপের মৌল?",
            options = listOf("s-ব্লক", "p-ব্লক", "d-ব্লক", "f-ব্লক"),
            correctIndex = 1,
            explanation = "অক্সিজেন (Z=8) এর ইলেকট্রন বিন্যাস 1s² 2s² 2p⁴, শেষ ইলেকট্রন p-অরবিটালে প্রবেশ করায় এটি p-ব্লকের মৌল।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t3_q2",
            typeId = 3,
            typeName = "মৌলের ব্লক পরিচিতি ও সংখ্যা গণনা (s, p, d, f ব্লক)",
            question = "'S' কোন গ্রুপের অন্তর্ভুক্ত মৌল?",
            options = listOf("s-ব্লক", "p-ব্লক", "d-ব্লক", "f-ব্লক"),
            correctIndex = 1,
            explanation = "সালফার (Z=16) এর যোজ্যতা স্তরের ইলেকট্রন বিন্যাস 3s² 3p⁴, অর্থাৎ এটি p-ব্লকের মৌল।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t3_q3",
            typeId = 3,
            typeName = "মৌলের ব্লক পরিচিতি ও সংখ্যা গণনা (s, p, d, f ব্লক)",
            question = "s-ব্লকের মৌল সংখ্যা কয়টি?",
            options = listOf("14", "36", "41", "27"),
            correctIndex = 0,
            explanation = "গ্রুপ ১ (৭টি), গ্রুপ ২ (৬টি) এবং হিলিয়াম (১টি) মিলিয়ে s-ব্লকে মোট ১৪টি মৌল রয়েছে।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t3_q4",
            typeId = 3,
            typeName = "মৌলের ব্লক পরিচিতি ও সংখ্যা গণনা (s, p, d, f ব্লক)",
            question = "p-ব্লক মৌল কতটি?",
            options = listOf("12", "18", "36", "6"),
            correctIndex = 2,
            explanation = "গ্রুপ ১৩ থেকে ১৮ পর্যন্ত ৬টি গ্রুপে মোট ৬×৬ = ৩৬টি মৌল p-ব্লকের অন্তর্ভুক্ত।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t3_q5",
            typeId = 3,
            typeName = "মৌলের ব্লক পরিচিতি ও সংখ্যা গণনা (s, p, d, f ব্লক)",
            question = "f-ব্লক মৌলের সংখ্যা কতটি?",
            options = listOf("14", "36", "41", "27"),
            correctIndex = 3,
            explanation = "আধুনিক IUPAC তালিকা অনুযায়ী খাঁটি f-ব্লকের মৌল সংখ্যা ২৭টি (ল্যান্থানাম, অ্যাক্টিনিয়াম ও লুটিশিয়ামকে d-ব্লকে গণ্য করলে ২৭টি)।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t3_q6",
            typeId = 3,
            typeName = "মৌলের ব্লক পরিচিতি ও সংখ্যা গণনা (s, p, d, f ব্লক)",
            question = "কোনটি p-ব্লক মৌল নয়?",
            options = listOf("Al", "C", "N", "He"),
            correctIndex = 3,
            explanation = "হিলিয়াম (He) এর ইলেকট্রন বিন্যাস 1s² হওয়ায় এটি নিষ্ক্রিয় গ্যাস হলেও s-ব্লকের মৌল।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t3_q7",
            typeId = 3,
            typeName = "মৌলের ব্লক পরিচিতি ও সংখ্যা গণনা (s, p, d, f ব্লক)",
            question = "₇₉Au একটি-",
            options = listOf("s-block মৌল", "p-block মৌল", "f-block মৌল", "d-block মৌল"),
            correctIndex = 3,
            explanation = "স্বর্ণ (Au, Z=79) এর ইলেকট্রন বিন্যাস [Xe] 4f¹⁴ 5d¹⁰ 6s¹, শেষ ইলেকট্রন d-অরবিটালে যাওয়ায় এটি d-ব্লকের মৌল।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t3_q8",
            typeId = 3,
            typeName = "মৌলের ব্লক পরিচিতি ও সংখ্যা গণনা (s, p, d, f ব্লক)",
            question = "অ্যাক্টিনাইডস এর সংখ্যা কতটি?",
            options = listOf("14", "15", "16", "17"),
            correctIndex = 1,
            explanation = "৮৯ নং অ্যাক্টিনিয়াম (Ac) থেকে ১০৩ নং লরেনশিয়াম (Lr) পর্যন্ত অ্যাক্টিনাইড সিরিজে মোট ১৫টি মৌল রয়েছে।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t3_q9",
            typeId = 3,
            typeName = "মৌলের ব্লক পরিচিতি ও সংখ্যা গণনা (s, p, d, f ব্লক)",
            question = "পর্যায় সারণিতে Inner transition মৌলের সংখ্যা-",
            options = listOf("24", "26", "28", "30"),
            correctIndex = 2,
            explanation = "ল্যান্থানাইড (১৪টি) এবং অ্যাক্টিনাইড (১৪টি) এর ২৮টি মৌলকে অন্তর্বর্তী অবস্থান্তর বা Inner Transition মৌল বলা হয়।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t3_q10",
            typeId = 3,
            typeName = "মৌলের ব্লক পরিচিতি ও সংখ্যা গণনা (s, p, d, f ব্লক)",
            question = "প্রকৃতিতে খনিজরূপে প্রাপ্ত স্থায়ী বিরল মৃত্তিকা মৌল কয়টি?",
            options = listOf("17", "16", "15", "18"),
            correctIndex = 2,
            explanation = "প্রকৃতিতে খনিজরূপে প্রাপ্ত বিরল মৃত্তিকা বা রেয়ার আর্থ মৌল ১৫টি।",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t3_q11",
            typeId = 3,
            typeName = "মৌলের ব্লক পরিচিতি ও সংখ্যা গণনা (s, p, d, f ব্লক)",
            question = "কোনটি অ্যাক্টিনাইড সিরিজের সদস্য?",
            options = listOf("Zr", "Tl", "Nd", "Lr"),
            correctIndex = 3,
            explanation = "১০৩ নং মৌল লরেনশিয়াম (Lr) অ্যাক্টিনাইড সিরিজের সর্বশেষ সদস্য।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t3_q12",
            typeId = 3,
            typeName = "মৌলের ব্লক পরিচিতি ও সংখ্যা গণনা (s, p, d, f ব্লক)",
            question = "কোনটি অ্যাক্টিনাইড সিরিজের মৌল নয়?",
            options = listOf("Cf", "No", "Lr", "Er"),
            correctIndex = 3,
            explanation = "ইরবিয়াম (Er, Z=68) ল্যান্থানাইড সিরিজের মৌল, অ্যাক্টিনাইড নয়।",
            difficulty = Difficulty.MEDIUM
        ),

        // টাইপ ৪: ইলেকট্রন বিন্যাস হতে পর্যায় সারণিতে অবস্থান নির্ণয়
        MCQQuestion(
            id = "t4_q1",
            typeId = 4,
            typeName = "ইলেকট্রন বিন্যাস হতে পর্যায় সারণিতে অবস্থান নির্ণয়",
            question = "একটি মৌলের পরমাণুর ইলেকট্রন বিন্যাস 1s²2s²2p⁶3s²3p² দেওয়া আছে। আধুনিক পর্যায় সারণিতে মৌলটির অবস্থান নির্ণয় কর।",
            options = listOf("পর্যায় 3, গ্রুপ 14", "পর্যায় 3, গ্রুপ 4", "পর্যায় 4, গ্রুপ 14", "পর্যায় 4, গ্রুপ 4"),
            correctIndex = 0,
            explanation = "সর্বোচ্চ মুখ্য কোয়ান্টাম সংখ্যা n=3 হওয়ায় পর্যায় ৩। যোজ্যতা স্তরে 3s² 3p² ইলেকট্রন থাকায় গ্রুপ = 10 + 2 + 2 = 14 (সিলিকন)।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t4_q2",
            typeId = 4,
            typeName = "ইলেকট্রন বিন্যাস হতে পর্যায় সারণিতে অবস্থান নির্ণয়",
            question = "কোনো মৌলের পরমাণুর যোজ্যতা স্তরে ns²np⁵ ইলেকট্রন বিন্যাস থাকলে ঐ মৌলের অবস্থান পর্যায় সারণিতে কোন গ্রুপে হবে?",
            options = listOf("15", "5", "17", "2"),
            correctIndex = 2,
            explanation = "ns² np⁵ মানে যোজ্যতা শেলে মোট ৭টি ইলেকট্রন। p-ব্লকের নিয়মানুযায়ী গ্রুপ = 10 + (2 + 5) = 17 (হ্যালোজেন গ্রুপ)।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t4_q3",
            typeId = 4,
            typeName = "ইলেকট্রন বিন্যাস হতে পর্যায় সারণিতে অবস্থান নির্ণয়",
            question = "₃₉Y মৌলটির পর্যায় সারণিতে অবস্থান কোনটি?",
            options = listOf("পর্যায়-5, গ্রুপ-1", "পর্যায়-5, গ্রুপ-2", "পর্যায়-5, গ্রুপ-3", "পর্যায়-5, গ্রুপ-13"),
            correctIndex = 2,
            explanation = "ইট্রিয়াম (₃₉Y): [Kr] 4d¹ 5s²। সর্বোচ্চ n=5 হওয়ায় পর্যায় ৫। d-ব্লকে s ও d এর মোট ইলেকট্রন (২+১) = ৩, তাই গ্রুপ ৩।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t4_q4",
            typeId = 4,
            typeName = "ইলেকট্রন বিন্যাস হতে পর্যায় সারণিতে অবস্থান নির্ণয়",
            question = "4s²3d⁷ ইলেকট্রন বিন্যাসের জন্য নিচের কোনটি ভুল?",
            options = listOf("অবস্থান্তর মৌল", "যোজনী ২ বা ৩", "ধাতু", "গ্রুপ VIIA এর অন্তর্ভুক্ত"),
            correctIndex = 3,
            explanation = "4s² 3d⁷ হলো কোবাল্টের (Co) বিন্যাস। কোবাল্ট গ্রুপ VIIIB (আধুনিক গ্রুপ ৯) এর অন্তর্ভুক্ত, VIIA এর নয়। তাই (d) ভুল।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t4_q5",
            typeId = 4,
            typeName = "ইলেকট্রন বিন্যাস হতে পর্যায় সারণিতে অবস্থান নির্ণয়",
            question = "একটি মৌলের ইলেকট্রন বিন্যাস......... 4s²4p⁶4d¹⁰4f³5s²5p⁶6s² হলে পর্যায় সারণিতে তার অবস্থান হবে-",
            options = listOf("৬ষ্ঠ পর্যায়, ২য় গ্রুপ", "৫ম পর্যায়, ৬ষ্ঠ গ্রুপ", "৪র্থ পর্যায়, ৩য় গ্রুপ", "৬ষ্ঠ পর্যায়, ৩য় গ্রুপ"),
            correctIndex = 3,
            explanation = "সর্বোচ্চ কোয়ান্টাম সংখ্যা n=6 হওয়ায় পর্যায় ৬ষ্ঠ। ল্যান্থানাইড সিরিজের সমস্ত মৌলই ৩য় গ্রুপের অন্তর্ভুক্ত বলে বিবেচিত হয়।",
            difficulty = Difficulty.HARD
        ),

        // টাইপ ৫: নিষ্ক্রিয় গ্যাস ও এদের বৈশিষ্ট্য
        MCQQuestion(
            id = "t5_q1",
            typeId = 5,
            typeName = "নিষ্ক্রিয় গ্যাস ও এদের বৈশিষ্ট্য",
            question = "কোনটি নিষ্ক্রিয় গ্যাস?",
            options = listOf("N₂", "Ar", "I₂", "O₂"),
            correctIndex = 1,
            explanation = "আর্গন (Ar) ১৮ নং গ্রুপের একটি নিষ্ক্রিয় গ্যাস।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t5_q2",
            typeId = 5,
            typeName = "নিষ্ক্রিয় গ্যাস ও এদের বৈশিষ্ট্য",
            question = "কোন নিষ্ক্রিয় গ্যাসটি p ব্লকের মৌল নয়?",
            options = listOf("He", "Ne", "Ar", "Kr"),
            correctIndex = 0,
            explanation = "হিলিয়াম (He, 1s²) এর কোনো p-অরবিটাল নেই, তাই এটি s-ব্লকের মৌল।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t5_q3",
            typeId = 5,
            typeName = "নিষ্ক্রিয় গ্যাস ও এদের বৈশিষ্ট্য",
            question = "নিচের কোন নিষ্ক্রিয় গ্যাসের ইলেকট্রন বিন্যাস এরূপ- 1s²2s²2p⁶3s²3p⁶",
            options = listOf("Ne", "Ar", "Kr", "Xe"),
            correctIndex = 1,
            explanation = "মোট ১৮টি ইলেকট্রন বিশিষ্ট মৌল হলো আর্গন (Ar)।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t5_q4",
            typeId = 5,
            typeName = "নিষ্ক্রিয় গ্যাস ও এদের বৈশিষ্ট্য",
            question = "ফটোগ্রাফিক ফ্ল্যাশ বাতি তৈরি করতে কোন মিশ্রণটি ব্যবহৃত হয়?",
            options = listOf("Kr-Xe", "Kr-Rn", "Xe-Rn", "Ar-Xe"),
            correctIndex = 0,
            explanation = "ফটোগ্রাফির উচ্চ তীব্রতার ফ্ল্যাশ টিউবে ক্রিপ্টন (Kr) ও জেনন (Xe) এর মিশ্রণ ব্যবহৃত হয়।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t5_q5",
            typeId = 5,
            typeName = "নিষ্ক্রিয় গ্যাস ও এদের বৈশিষ্ট্য",
            question = "নিষ্ক্রিয় গ্যাসসমূহের ক্ষেত্রে স্ফুটনাঙ্কের সঠিক ক্রমটি হলো-",
            options = listOf("Xe > Kr > Ar > Ne > He", "He > Ne > Ar > Kr > Xe", "Rn > Xe > Kr > Ne > Ar", "Rn > Kr > Ar > He > Ne"),
            correctIndex = 0,
            explanation = "গ্রুপে উপর থেকে নিচে পারমাণবিক আকার ও ইলেকট্রন সংখ্যা বাড়ায় ভ্যানডার ওয়ালস আকর্ষণ বল বাড়ে, ফলে স্ফুটনাঙ্ক বৃদ্ধি পায়: Xe > Kr > Ar > Ne > He।",
            reference = "গুহ স্যার",
            difficulty = Difficulty.MEDIUM
        ),

        // টাইপ ৬: s-ব্লক মৌলসমূহের ধর্ম ও কর্ণ সম্পর্ক
        MCQQuestion(
            id = "t6_q1",
            typeId = 6,
            typeName = "s-ব্লক মৌলসমূহের ধর্ম ও কর্ণ সম্পর্ক",
            question = "s-ব্লক মৌলসমূহ সাধারণত কী প্রকৃতির হয়?",
            options = listOf("মৃদু বিজারক", "তীব্র বিজারক", "মৃদু জারক", "তীব্র জারক"),
            correctIndex = 1,
            explanation = "s-ব্লকের মৌলগুলোর কম আয়নীকরণ বিভব থাকায় এরা সহজে ইলেকট্রন ত্যাগ করে এবং অত্যন্ত তীব্র বিজারক হিসেবে কাজ করে।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t6_q2",
            typeId = 6,
            typeName = "s-ব্লক মৌলসমূহের ধর্ম ও কর্ণ সম্পর্ক",
            question = "কোনটি সবচেয়ে শক্তিশালী ক্ষার?",
            options = listOf("NaOH", "KOH", "LiOH", "RbOH"),
            correctIndex = 3,
            explanation = "গ্রুপ ১-এর উপর থেকে নিচে ক্যাটায়নের আকার বাড়লে ল্যাটিস শক্তি কমে এবং OH⁻ মুক্তির প্রবণতা বাড়ে, তাই RbOH এদের মধ্যে সবচেয়ে শক্তিশালী ক্ষার।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t6_q3",
            typeId = 6,
            typeName = "s-ব্লক মৌলসমূহের ধর্ম ও কর্ণ সম্পর্ক",
            question = "ক্ষার ধাতুসমূহের মধ্যে সবচেয়ে কম তড়িৎ ঋণাত্মক ধাতু নিচের কোনটি?",
            options = listOf("Li", "Na", "K", "Cs"),
            correctIndex = 3,
            explanation = "সিজিয়ামের (Cs) আকার সবচেয়ে বড় ও আয়নীকরণ শক্তি সর্বনিম্ন হওয়ায় এর তড়িৎ ঋণাত্মকতা সবচেয়ে কম (০.৭৯)।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t6_q4",
            typeId = 6,
            typeName = "s-ব্লক মৌলসমূহের ধর্ম ও কর্ণ সম্পর্ক",
            question = "কোন সক্রিয়তার ক্রমটি সঠিক?",
            options = listOf("Na > Li > Cs", "Na > K > Cs", "Cs > K > Na", "Rb > Cs > Na"),
            correctIndex = 2,
            explanation = "ক্ষার ধাতুগুলোর ক্ষেত্রে গ্রুপে নিচের দিকে নামলে আকার বৃদ্ধি পায় ও ইলেকট্রন ত্যাগের প্রবণতা বাড়ে, ফলে সক্রিয়তা বৃদ্ধি পায়: Cs > K > Na।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t6_q5",
            typeId = 6,
            typeName = "s-ব্লক মৌলসমূহের ধর্ম ও কর্ণ সম্পর্ক",
            question = "কোন দুটি মৌলের মধ্যে কর্ণ সম্পর্ক (Diagonal relationship) বিদ্যমান?",
            options = listOf("B, Na", "O, Cl", "Mg, Al", "Li, Mg"),
            correctIndex = 3,
            explanation = "পর্যায় ২ ও পর্যায় ৩ এর মৌলগুলোর মধ্যে চার্জ ঘনত্বের সাদৃশ্যের কারণে Li ও Mg এর মধ্যে কর্ণ সম্পর্ক বিদ্যমান।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t6_q6",
            typeId = 6,
            typeName = "s-ব্লক মৌলসমূহের ধর্ম ও কর্ণ সম্পর্ক",
            question = "পরমাণু ক্রমাঙ্ক বৃদ্ধির সাথে সাথে মৃৎক্ষার ধাতুর যে ধর্ম বৃদ্ধি পায়-",
            options = listOf("সালফেট যৌগগুলোর দ্রাব্যতা", "তড়িৎ ঋণাত্মকতা", "হাইড্রোক্সাইড যৌগগুলোর দ্রাব্যতা", "আয়নীকরণ বিভব"),
            correctIndex = 2,
            explanation = "গ্রুপ ২-এ নিচে নামলে ল্যাটিস শক্তি দ্রুত হ্রাস পায়, ফলে মৃৎক্ষার ধাতুর হাইড্রোক্সাইডগুলোর পানিতে দ্রাব্যতা বৃদ্ধি পায়: Be(OH)₂ < Mg(OH)₂ < Ca(OH)₂ < Ba(OH)₂।",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t6_q7",
            typeId = 6,
            typeName = "s-ব্লক মৌলসমূহের ধর্ম ও কর্ণ সম্পর্ক",
            question = "পর্যায় সারণির গ্রুপ IA এর মৌল সমূহের বেলায় যতই নিচের দিকে যাওয়া যায় ততই-\n(i) ইলেকট্রনের একটি নতুন স্তর যুক্ত হয় (ii) পারমাণবিক ব্যাসার্ধ হ্রাস পায় (iii) ধাতুর সক্রিয়তা বৃদ্ধি পায়।\nনিচের কোনটি সঠিক?",
            options = listOf("i, ii", "ii, iii", "i, iii", "i, ii, iii"),
            correctIndex = 2,
            explanation = "গ্রুপ ১-এ নিচে নামলে নতুন শক্তিস্তর যুক্ত হয় (i) এবং সক্রিয়তা বাড়ে (iii)। ব্যাসার্ধ হ্রাস পায় না বরং বৃদ্ধি পায়, তাই ii ভুল।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t6_q8",
            typeId = 6,
            typeName = "s-ব্লক মৌলসমূহের ধর্ম ও কর্ণ সম্পর্ক",
            question = "s-ব্লক মৌলসমূহের ধর্ম সম্পর্কে সঠিক উক্তি কোনটি?",
            options = listOf(
                "Mg²⁺ এর আয়নিক ব্যাসার্ধ Na⁺ অপেক্ষা উচ্চতর",
                "Na-এর গলনাঙ্ক Mg অপেক্ষা নিম্নতর",
                "Mg-এর প্রথম আয়নীকরণ শক্তি Na অপেক্ষা নিম্নতর",
                "K-এর প্রথম আয়নীকরণ শক্তি Na অপেক্ষা উচ্চতর"
            ),
            correctIndex = 1,
            explanation = "ম্যাগনেসিয়ামের যোজ্যতা ইলেকট্রন ২টি এবং পারমাণবিক আকার ছোট হওয়ায় এর ধাতব বন্ধন সোডিয়াম অপেক্ষা অনেক দৃঢ়, তাই Na-এর গলনাঙ্ক Mg অপেক্ষা নিম্নতর।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.HARD
        ),

        // টাইপ ৭: p-ব্লক মৌলসমূহের সাধারণ ধর্ম ও রূপভেদ (কার্বন, সিলিকন ও হ্যালোজেন)
        MCQQuestion(
            id = "t7_q1",
            typeId = 7,
            typeName = "p-ব্লক মৌলসমূহের সাধারণ ধর্ম ও রূপভেদ",
            question = "নিচের কোন গ্যাসটি অপেক্ষাকৃত নিষ্ক্রিয়?",
            options = listOf("O₂", "N₂", "Cl₂", "F₂"),
            correctIndex = 1,
            explanation = "নাইট্রোজেনের অণুতে শক্তিশালী ত্রিবন্ধন (N≡N) এবং অতি উচ্চ বন্ধন বিয়োজন শক্তি (945 kJ/mol) থাকায় এটি সাধারণ তাপমাত্রায় প্রায় নিষ্ক্রিয়।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t7_q2",
            typeId = 7,
            typeName = "p-ব্লক মৌলসমূহের সাধারণ ধর্ম ও রূপভেদ",
            question = "নিম্নের কোন মৌলটি সবচেয়ে বেশি সমযোজী বন্ধন সৃষ্টির প্রবণতা দেখায়?",
            options = listOf("Si", "Al", "Cl", "N"),
            correctIndex = 0,
            explanation = "সিলিকন চতুর্যোজী এবং সমযোজী ত্রিমাত্রিক পলিমার গঠন করার তীব্র প্রবণতা প্রদর্শন করে।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t7_q3",
            typeId = 7,
            typeName = "p-ব্লক মৌলসমূহের সাধারণ ধর্ম ও রূপভেদ",
            question = "(SiO₂)ₙ এর স্ফুটনাঙ্ক কত?",
            options = listOf("2230°C", "2130°C", "2330°C", "2320°C"),
            correctIndex = 1,
            explanation = "সিলিকন ডাই-অক্সাইডের (সিলিকা) দৈত্যাকার পলিমারিক কেলাসের স্ফুটনাঙ্ক প্রায় ২২৩০°C (বইয়ের মানানুযায়ী ২২৩০°C বা ২২৩০-২৩৩০°C)।",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t7_q4",
            typeId = 7,
            typeName = "p-ব্লক মৌলসমূহের সাধারণ ধর্ম ও রূপভেদ",
            question = "কত ডিগ্রি তাপমাত্রায় হীরক গ্রাফাইটে পরিণত হয়?",
            options = listOf("1000°C", "2000°C", "3600°C", "4800°C"),
            correctIndex = 1,
            explanation = "প্রায় ২০০০°C তাপমাত্রায় বাতাসের অনুপস্থিতিতে উত্তপ্ত করলে তাপগতীয়ভাবে স্থিতিশীল গ্রাফাইটে রূপান্তরিত হয়।",
            reference = "কবীর স্যার",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t7_q5",
            typeId = 7,
            typeName = "p-ব্লক মৌলসমূহের সাধারণ ধর্ম ও রূপভেদ",
            question = "গ্রাফাইটের ক্ষেত্রে কোন তথ্যটি সত্য নয়?",
            options = listOf(
                "গ্রাফাইটে প্রতিটি কার্বন পরমাণু sp² সংকরিত",
                "সঞ্চারণশীল ইলেকট্রন থাকায় গ্রাফাইট তড়িৎ পরিবাহী",
                "প্রতিটি কার্বন পরমাণু সমযোজী বন্ধন দ্বারা চারটি কার্বন পরমাণুর সাথে যুক্ত",
                "গ্রাফাইট কার্বনের একটি অ্যালোট্রপ"
            ),
            correctIndex = 2,
            explanation = "গ্রাফাইটে প্রতিটি কার্বন ৩টি কার্বনের সাথে যুক্ত হয়ে ষড়ভুজাকার স্তর তৈরি করে; ৪টি কার্বনের সাথে যুক্ত হয় হীরকে।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t7_q6",
            typeId = 7,
            typeName = "p-ব্লক মৌলসমূহের সাধারণ ধর্ম ও রূপভেদ",
            question = "হীরক ও গ্রাফাইট হলো কার্বন মৌলের ভিন্নরূপ। এদের ক্ষেত্রে কোন উক্তিটি সত্য নয়?",
            options = listOf(
                "উভয়েই কার্বন মৌল দ্বারা গঠিত",
                "হীরক ও গ্রাফাইটে কার্বন পরমাণুর সংকরায়ন হলো যথাক্রমে sp³ ও sp²",
                "উভয়ের বিদ্যুৎ পরিবাহিতা ভিন্ন",
                "উভয়ের দহন তাপ একই"
            ),
            correctIndex = 3,
            explanation = "হীরক ও গ্রাফাইটের অভ্যন্তরীণ বন্ধন শক্তি ও কেলাস গঠন ভিন্ন হওয়ায় এদের মোলার দহন তাপ সমান নয়।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t7_q7",
            typeId = 7,
            typeName = "p-ব্লক মৌলসমূহের সাধারণ ধর্ম ও রূপভেদ",
            question = "কোন লবণ গাঢ় সালফিউরিক এসিডের সাথে বিক্রিয়া করে সালফার তৈরি করে?",
            options = listOf("NaF", "NaCl", "NaBr", "NaI"),
            correctIndex = 3,
            explanation = "আয়োডাইড তীব্র বিজারক হওয়ায় গাঢ় H₂SO₄ কে বিজারিত করে SO₂ ছাড়াও মুক্ত সালফার (S) ও H₂S উৎপন্ন করে।",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t7_q8",
            typeId = 7,
            typeName = "p-ব্লক মৌলসমূহের সাধারণ ধর্ম ও রূপভেদ",
            question = "গাঢ় সালফিউরিক এসিডের সাথে সোডিয়াম আয়োডাইডকে উত্তপ্ত করলে কোনটি তৈরি হয় না?",
            options = listOf("S", "SO₂", "SO₃", "H₂S"),
            correctIndex = 2,
            explanation = "NaI এর সাথে গাঢ় H₂SO₄ এর বিক্রিয়ায় বিজারিত উৎপাদ হিসেবে SO₂, S ও H₂S উৎপন্ন হলেও জারক SO₃ তৈরি হয় না।",
            reference = "Agri.'25-26",
            difficulty = Difficulty.HARD
        )
    )
}
