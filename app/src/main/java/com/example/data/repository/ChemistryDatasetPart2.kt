package com.example.data.repository

import com.example.data.model.Difficulty
import com.example.data.model.MCQQuestion

object ChemistryDatasetPart2 {
    val questions: List<MCQQuestion> = listOf(
        // টাইপ ৮: যৌগের অস্তিত্ব ও পানিতে আর্দ্রবিশ্লেষণ
        MCQQuestion(
            id = "t8_q1",
            typeId = 8,
            typeName = "যৌগের অস্তিত্ব ও পানিতে আর্দ্রবিশ্লেষণ",
            question = "কোন যৌগটির অস্তিত্ব নেই?",
            options = listOf("SF₂", "SF₆", "OF₂", "OF₆"),
            correctIndex = 3,
            explanation = "অক্সিজেন ২য় পর্যায়ের মৌল হওয়ায় এর যোজ্যতা স্তরে কোনো ফাঁকা d-অরবিটাল নেই এবং আকারের তুলনায় ৬টি ফ্লোরিন ধারন অসম্ভব হওয়ায় OF₆ গঠিত হতে পারে না।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t8_q2",
            typeId = 8,
            typeName = "যৌগের অস্তিত্ব ও পানিতে আর্দ্রবিশ্লেষণ",
            question = "নিচের কোন যৌগটি সম্ভব নয়?",
            options = listOf("Cl₂O", "OF₂", "NCl₅", "SO₂"),
            correctIndex = 2,
            explanation = "নাইট্রোজেনের কোনো d-অরবিটাল নেই, তাই এটি ৫টি বন্ধন তৈরি করে অষ্টক সম্প্রসারণ ঘটাতে পারে না। ফলে NCl₅ এর অস্তিত্ব নেই।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t8_q3",
            typeId = 8,
            typeName = "যৌগের অস্তিত্ব ও পানিতে আর্দ্রবিশ্লেষণ",
            question = "কোন যৌগের অস্তিত্ব নেই?",
            options = listOf("PCl₅", "PF₅", "PH₅", "সবাই exist করে"),
            correctIndex = 2,
            explanation = "হাইড্রোজেনের তড়িৎ ঋণাত্মকতা ফসফরাসের d-অরবিটালকে সংকুচিত করার মতো যথেষ্ট তীব্র নয়, তাই PH₅ এর অস্তিত্ব নেই।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t8_q4",
            typeId = 8,
            typeName = "যৌগের অস্তিত্ব ও পানিতে আর্দ্রবিশ্লেষণ",
            question = "কোন যৌগটি আর্দ্রবিশ্লেষিত হয় না?",
            options = listOf("CCl₄", "PCl₃", "PCl₅", "SiCl₄"),
            correctIndex = 0,
            explanation = "কার্বন পরমাণুর যোজ্যতা স্তরে কোনো ফাঁকা d-অরবিটাল নেই, ফলে পানির অক্সিজেনের নিঃসঙ্গ ইলেকট্রন জোড় গ্রহণ করে বন্ধন তৈরি করতে পারে না।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t8_q5",
            typeId = 8,
            typeName = "যৌগের অস্তিত্ব ও পানিতে আর্দ্রবিশ্লেষণ",
            question = "কোন হ্যালাইডটি পানিতে আর্দ্র বিশ্লেষিত হয় না?",
            options = listOf("NCl₃", "PCl₃", "PCl₅", "NF₃"),
            correctIndex = 3,
            explanation = "NF₃ অণুতে নাইট্রোজেন ও ফ্লোরিন কোনো পরমাণুরই ফাঁকা d-অরবিটাল নেই এবং N-F বন্ধন অত্যন্ত দৃঢ় হওয়ায় এটি আর্দ্রবিশ্লেষিত হয় না।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t8_q6",
            typeId = 8,
            typeName = "যৌগের অস্তিত্ব ও পানিতে আর্দ্রবিশ্লেষণ",
            question = "কোন যৌগটি জলীয় দ্রবণে সবচেয়ে সহজে আর্দ্রবিশ্লেষিত হয়?",
            options = listOf("CCl₄", "SnCl₂", "SiCl₄", "PbCl₄"),
            correctIndex = 2,
            explanation = "SiCl₄ এর সিলিকন পরমাণুতে ফাঁকা 3d অরবিটাল থাকায় পানির অণুর সাথে দ্রুত সন্নিবেশ যৌগ গঠন করে ও দ্রুত আর্দ্রবিশ্লেষিত হয়।",
            difficulty = Difficulty.MEDIUM
        ),

        // টাইপ ৯: আকরিক, সংকর ধাতু ও পরিচিত যৌগের সংকেত
        MCQQuestion(
            id = "t9_q1",
            typeId = 9,
            typeName = "আকরিক, সংকর ধাতু ও পরিচিত যৌগের সংকেত",
            question = "লাফিং গ্যাসের সংকেত হল-",
            options = listOf("NO", "NO₂", "N₂O₂", "N₂O"),
            correctIndex = 3,
            explanation = "ডাইনাইট্রোজেন মনোক্সাইড (N₂O) গ্যাসকে নিশ্বাসের সাথে গ্রহণ করলে মৃদু হাসির উদ্রেক হয় বলে একে লাফিং গ্যাস বলে।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t9_q2",
            typeId = 9,
            typeName = "আকরিক, সংকর ধাতু ও পরিচিত যৌগের সংকেত",
            question = "কোনটি বরফের সঠিক সংকেত?",
            options = listOf("H₂O", "(H₂O₂)", "(H₂O₂)₄", "(H₂O)ₙ"),
            correctIndex = 3,
            explanation = "বরফে হাইড্রোজেন বন্ধনের মাধ্যমে পানির অসংখ্য অণু পলিমারিক ত্রিমাত্রিক জালিকা গঠন করায় একে (H₂O)ₙ হিসেবে প্রকাশ করা হয়।",
            reference = "RU'08-09",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t9_q3",
            typeId = 9,
            typeName = "আকরিক, সংকর ধাতু ও পরিচিত যৌগের সংকেত",
            question = "কোনটি স্ট্যানিক ক্লোরাইড এর সংকেত?",
            options = listOf("CCl₄", "SnCl₂", "SnCl₄", "FeCl₂"),
            correctIndex = 2,
            explanation = "টিনের উচ্চ জারণ অবস্থা (+4) বোঝাতে 'স্ট্যানিক' প্রত্যয় ব্যবহৃত হয়, তাই SnCl₄ স্ট্যানিক ক্লোরাইড।",
            reference = "JU'21-22",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t9_q4",
            typeId = 9,
            typeName = "আকরিক, সংকর ধাতু ও পরিচিত যৌগের সংকেত",
            question = "নিচের কোনটি প্লাস্টার অব প্যারিসের সঠিক সংকেত?",
            options = listOf("MgSO₄.7H₂O", "ZnSO₄.2H₂O", "CaSO₄.2H₂O", "CaSO₄.½H₂O"),
            correctIndex = 3,
            explanation = "প্লাস্টার অব প্যারিস হলো ক্যালসিয়াম সালফেট হেমিহাইড্রেট: CaSO₄·½H₂O বা (CaSO₄)₂·H₂O।",
            reference = "গুহ স্যার",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t9_q5",
            typeId = 9,
            typeName = "আকরিক, সংকর ধাতু ও পরিচিত যৌগের সংকেত",
            question = "ব্লিচিং পাউডারের রাসায়নিক নাম কী?",
            options = listOf("ক্যালসিয়াম হাইপোক্লোরাইট", "ক্যালসিয়াম ক্লোরাইট", "ক্যালসিয়াম ক্লোরোহাইপোক্লোরাইট", "ক্যালসিয়াম ক্লোরোহাইপোব্রোমাইট"),
            correctIndex = 2,
            explanation = "ব্লিচিং পাউডারের সংকেত Ca(OCl)Cl, যার রাসায়নিক নাম ক্যালসিয়াম ক্লোরোহাইপোক্লোরাইট।",
            reference = "JU'22-23",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t9_q6",
            typeId = 9,
            typeName = "আকরিক, সংকর ধাতু ও পরিচিত যৌগের সংকেত",
            question = "CuSO₄ (s) + 5H₂O → A; উৎপন্ন A যৌগটি:",
            options = listOf("সাদা ভিট্রিয়ল", "নীল ভিট্রিয়ল", "সবুজ ভিট্রিয়ল", "খাদ্য লবণ"),
            correctIndex = 1,
            explanation = "CuSO₄·5H₂O কে তুঁতে বা ব্লু ভিট্রিয়ল (Blue Vitriol) বলা হয়।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t9_q7",
            typeId = 9,
            typeName = "আকরিক, সংকর ধাতু ও পরিচিত যৌগের সংকেত",
            question = "‘গ্যালেনা’ (Galena) কোন ধাতুর আকরিক (Ore)?",
            options = listOf("Pb", "Fe", "Mg", "Mn"),
            correctIndex = 0,
            explanation = "গ্যালেনা হলো লেড সালফাইড (PbS), যা সীসা (Pb) ধাতুর প্রধান আকরিক।",
            reference = "JnU'14-15",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t9_q8",
            typeId = 9,
            typeName = "আকরিক, সংকর ধাতু ও পরিচিত যৌগের সংকেত",
            question = "ম্যাগনেটাইট এক ধরনের আয়রন অক্সাইড। এর রাসায়নিক সংকেত কী?",
            options = listOf("Fe₂O₃", "Fe₃O₄", "FeO", "Fe₂O₃.H₂O"),
            correctIndex = 1,
            explanation = "ম্যাগনেটাইটের সংকেত Fe₃O₄ (FeO·Fe₂O₃)।",
            reference = "গুহ স্যার",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t9_q9",
            typeId = 9,
            typeName = "আকরিক, সংকর ধাতু ও পরিচিত যৌগের সংকেত",
            question = "কোন আকরিকটি অ্যালুমিনিয়াম এর আকরিক নয়?",
            options = listOf("করান্ডাম", "ইলমেনাইট", "ক্রায়োলাইট", "ডায়াস্পোর"),
            correctIndex = 1,
            explanation = "ইলমেনাইট (FeTiO₃) টাইটানিয়ামের প্রধান আকরিক, অ্যালুমিনিয়ামের নয়।",
            reference = "RU'14-15",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t9_q10",
            typeId = 9,
            typeName = "আকরিক, সংকর ধাতু ও পরিচিত যৌগের সংকেত",
            question = "জার্মান সিলভার কোন কোন ধাতুর সংকর?",
            options = listOf("Cu ও Zn", "Cu, Zn ও Ni", "Cu, Zn ও Ag", "Cu ও Sn"),
            correctIndex = 1,
            explanation = "জার্মান সিলভারে কোনো রূপা থাকে না! এটি কপার (৫০%), জিংক (৩০%) এবং নিকেল (২০%) ধাতুর একটি সংকর।",
            reference = "Agri'24-25",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t9_q11",
            typeId = 9,
            typeName = "আকরিক, সংকর ধাতু ও পরিচিত যৌগের সংকেত",
            question = "ব্লিস্টার কপারের অপদ্রব্য হিসেবে কোন ধাতুটি থাকে?",
            options = listOf("Ni", "Pt", "Mg", "Cr"),
            correctIndex = 0,
            explanation = "ব্লিস্টার কপারে (৯৮% কপার) অপদ্রব্য হিসেবে নিকেল (Ni), আয়রন, আর্সেনিক প্রভৃতি ধাতু উপস্থিত থাকে।",
            reference = "JU'24-25",
            difficulty = Difficulty.HARD
        ),

        // টাইপ ১০: অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম
        MCQQuestion(
            id = "t10_q1",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "পানি কী ধরনের অক্সাইড?",
            options = listOf("উভধর্মী", "প্রশমধর্মী", "ক্ষারীয়", "অম্লীয়"),
            correctIndex = 1,
            explanation = "বিশুদ্ধ পানি নিরপেক্ষ বা প্রশম অক্সাইড (Neutral Oxide), যা লিটমাসে কোনো বর্ণ পরিবর্তন করে না।",
            reference = "কবীর স্যার",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t10_q2",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "পর্যায় সারণির যে কোন পর্যায়ের বাম দিকের অক্সাইডগুলো-",
            options = listOf("মৃদু ক্ষারধর্মী", "মৃদু অম্লধর্মী", "ক্ষারকীয়", "উভধর্মী"),
            correctIndex = 2,
            explanation = "পর্যায়ের বামের মৌলগুলো তীব্র তড়িৎ-ধনাত্মক ধাতু হওয়ায় এদের অক্সাইডসমূহ শক্তিশালী ক্ষারকীয় হয়।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t10_q3",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "অধাতুর অক্সাইড এর ধর্ম কোনটি?",
            options = listOf("সাধারণত ক্ষারকীয়", "সাধারণত নিরপেক্ষ", "সাধারণত অম্লীয়", "সাধারণত মৃদু ক্ষারধর্মী"),
            correctIndex = 2,
            explanation = "অধাতুর অক্সাইডগুলো পানির সাথে বিক্রিয়া করে অ্যাসিড তৈরি করে, তাই এরা সাধারণত অম্লীয়।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t10_q4",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "তীব্র ক্ষার ধাতুর অক্সাইড ও হাইড্রোক্সাইডসমূহ-",
            options = listOf("তীব্র ক্ষারক", "তীব্র অম্ল", "মৃদু ক্ষার", "মৃদু অম্ল"),
            correctIndex = 0,
            explanation = "গ্রুপ ১-এর ক্ষার ধাতুর অক্সাইড ও হাইড্রোক্সাইডসমূহ পানিতে সম্পূর্ণ আয়নিত হয়ে OH⁻ দান করে তীব্র ক্ষারকীয় দ্রবণ গঠন করে।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t10_q5",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "Li₂O এর জলীয় দ্রবণ-",
            options = listOf("অম্লীয়", "ক্ষারীয়", "উভধর্মী", "নিরপেক্ষ"),
            correctIndex = 1,
            explanation = "Li₂O + H₂O → 2LiOH, যা একটি ক্ষারীয় জলীয় দ্রবণ।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t10_q6",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "Na₂O এর জলীয় দ্রবণ-",
            options = listOf("অম্লীয়", "ক্ষারীয়", "উভধর্মী", "নিরপেক্ষ"),
            correctIndex = 1,
            explanation = "Na₂O + H₂O → 2NaOH (তীব্র ক্ষারীয় দ্রবণ)।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t10_q7",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "কোনটি ক্ষারকীয় অক্সাইড?",
            options = listOf("N₂O₅", "Na₂O", "H₂O", "PbO₂"),
            correctIndex = 1,
            explanation = "Na₂O ধাতব ক্ষারকীয় অক্সাইড।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t10_q8",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "ক্ষারধর্মী অক্সাইড কোনটি?",
            options = listOf("MgO", "Al₂O₃", "ZnO", "CaO"),
            correctIndex = 0,
            explanation = "MgO ক্ষারকীয় অক্সাইড (Al₂O₃ ও ZnO উভধর্মী)।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t10_q9",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "কোনটি ক্ষারধর্মী অক্সাইড?",
            options = listOf("N₂O₅", "Na₂O", "MgO", "SiO₂"),
            correctIndex = 1,
            explanation = "Na₂O তীব্র ক্ষারধর্মী অক্সাইড।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t10_q10",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "কোনটি অম্লীয় জলীয় দ্রবণ তৈরি করে?",
            options = listOf("Na₂O", "ZnO", "Al₂O₃", "CO₂"),
            correctIndex = 3,
            explanation = "CO₂ অধাতুর অম্লীয় অক্সাইড যা পানির সাথে কার্বনিক এসিড (H₂CO₃) উৎপন্ন করে।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t10_q11",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "কোনটি অম্লীয় অক্সাইড নয়?",
            options = listOf("CO", "CO₂", "NO₂", "SO₂"),
            correctIndex = 0,
            explanation = "কার্বন মনোক্সাইড (CO) একটি প্রশম বা নিরপেক্ষ অক্সাইড, অম্লীয় নয়।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t10_q12",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "কোনটি অম্লধর্মী অক্সাইড নয়?",
            options = listOf("SO₂", "NO₂", "N₂O₅", "N₂O"),
            correctIndex = 3,
            explanation = "N₂O (নাইট্রাস অক্সাইড) প্রশম অক্সাইড।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t10_q13",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "নিচের কোনটি উভধর্মী অক্সাইড?",
            options = listOf("H₂O", "CaO", "Al₂O₃", "Cl₂O₇"),
            correctIndex = 2,
            explanation = "Al₂O₃ অম্ল এবং ক্ষারক উভয়ের সাথেই বিক্রিয়া করে লবণ ও পানি উৎপন্ন করে, তাই এটি উভধর্মী।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t10_q14",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "নিচের কোনটি উভধর্মী (amphoteric) ধাতব হাইড্রোক্সাইড?",
            options = listOf("KOH", "Ba(OH)₂", "Pb(OH)₂", "LiOH"),
            correctIndex = 2,
            explanation = "Pb(OH)₂ অ্যাসিড ও ক্ষার উভয়ের সাথেই বিক্রিয়া করতে পারে, তাই এটি উভধর্মী হাইড্রোক্সাইড।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t10_q15",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "কোন অক্সাইডগুলো উভধর্মী?",
            options = listOf("PbO, SnO₂, SiO₂", "SiO₂, SnO₂, Al₂O₃", "Al₂O₃, PbO, SnO₂", "Al₂O₃, PbO, SiO₂"),
            correctIndex = 2,
            explanation = "Al₂O₃, PbO এবং SnO₂ তিনটিই সুপরিচিত উভধর্মী অক্সাইড (SiO₂ কেবল অম্লীয়)।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t10_q16",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "নিচের কোনটি সুপার অক্সাইড?",
            options = listOf("KO₂", "Pb₃O₄", "MnO₂", "Na₂O₂"),
            correctIndex = 0,
            explanation = "KO₂-তে অক্সিজেনের জারণ মান -½, তাই এটি সুপার অক্সাইড। Na₂O₂ পারক্সাইড, Pb₃O₄ মিশ্র অক্সাইড।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t10_q17",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "কোন গ্রুপের মৌল প্রশম অক্সাইড উৎপন্ন করতে পারে?",
            options = listOf("2 ও 13", "13 ও 14", "14 ও 15", "15 ও 17"),
            correctIndex = 2,
            explanation = "১৪ নং গ্রুপের কার্বন (CO) এবং ১৫ নং গ্রুপের নাইট্রোজেন (NO, N₂O) প্রশম অক্সাইড উৎপন্ন করে।",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t10_q18",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "নিচের কোন অক্সাইডটি সবচেয়ে বেশি অম্লধর্মী?",
            options = listOf("SiO₂", "P₂O₃", "SO₃", "Cl₂O₇"),
            correctIndex = 3,
            explanation = "পর্যায়ের বাম থেকে ডানে অম্লত্ব বৃদ্ধি পায় এবং ক্লোরিনের সর্বোচ্চ জারণ স্তর (+7) থাকায় Cl₂O₇ সর্বাধিক শক্তিশালী অম্লীয় অক্সাইড।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t10_q19",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "অম্লত্বের ক্রমানুসারে সাজালে কোন ক্রমটি সঠিক?",
            options = listOf("P₂O₅ > SO₃ > Al₂O₃", "Al₂O₃ < P₂O₅ < SO₃", "SO₃ > Al₂O₃ > P₂O₅", "Al₂O₃ > P₂O₅ > SO₃"),
            correctIndex = 1,
            explanation = "একই পর্যায়ের বাম থেকে ডানে অম্লত্ব বৃদ্ধি পায়: Al₂O₃ (উভধর্মী) < P₂O₅ < SO₃।",
            reference = "লিংকন স্যার",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t10_q20",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "নিচের অক্সাইডগুলোর মধ্যে কোন জোড়াটি সবচেয়ে বেশি অম্লধর্মী?",
            options = listOf("N₂O ও Mn₂O₃", "N₂O₃ ও MnO₂", "N₂O₄ ও Mn₂O₇", "NO ও Mn₂O₃"),
            correctIndex = 2,
            explanation = "উচ্চ জারণ স্তরের অক্সাইডসমূহের অম্লীয় তীব্রতা সবচেয়ে বেশি (Mn এর জারণ মান +7)।",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t10_q21",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "FeO, NO, P₂O₅ & Al₂O₃ হচ্ছে যথাক্রমে-",
            options = listOf(
                "ক্ষারকীয়, অম্লীয়, নিরপেক্ষ এবং উভধর্মী অক্সাইড",
                "উভধর্মী, অম্লীয়, ক্ষারকীয় এবং নিরপেক্ষ অক্সাইড",
                "অম্লীয়, নিরপেক্ষ, উভধর্মী এবং ক্ষারকীয় অক্সাইড",
                "ক্ষারকীয়, নিরপেক্ষ, অম্লীয় এবং উভধর্মী অক্সাইড"
            ),
            correctIndex = 3,
            explanation = "FeO ক্ষারকীয়, NO নিরপেক্ষ (প্রশম), P₂O₅ অম্লীয় এবং Al₂O₃ উভধর্মী অক্সাইড।",
            reference = "কবীর স্যার",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t10_q22",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "Mn₂O₇, CrO, CrO₃, Cr₂O₃, V₂O₅ and V₂O₄ এই অক্সাইডগুলোর মধ্যে কোনগুলো উভধর্মী অক্সাইড?",
            options = listOf("Mn₂O₇, Cr₂O₃ and V₂O₅", "V₂O₅ and V₂O₄", "CrO₃, Cr₂O₃, V₂O₅ and V₂O₄", "Cr₂O₃ and V₂O₄"),
            correctIndex = 3,
            explanation = "Cr₂O₃ এবং V₂O₄ মধ্যম জারণ স্তরে অবস্থান করায় উভধর্মী চরিত্র প্রকাশ করে।",
            reference = "কবীর স্যার + গুহ স্যার",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t10_q23",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "B₂O₃ অধিক পরিমাণ পানির সাথে বিক্রিয়া করলে চূড়ান্ত উৎপাদটি হবে-",
            options = listOf("HBO₃", "H₂BO₃", "H₃BO₃", "HBO₂"),
            correctIndex = 2,
            explanation = "B₂O₃ + 3H₂O → 2H₃BO₃ (অর্থোবোরিক অ্যাসিড বা বোরিক অ্যাসিড)।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t10_q24",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "ঘন HCl এর সাথে কোন যৌগটি ক্লোরিন তৈরি করে?",
            options = listOf("Al₂O₃", "PbO₂", "CuO", "Fe₂O₃"),
            correctIndex = 1,
            explanation = "PbO₂ একটি শক্তিশালী জারক অক্সাইড, এটি গাঢ় HCl কে জারিত করে Cl₂ গ্যাস মুক্ত করে: PbO₂ + 4HCl → PbCl₂ + Cl₂ + 2H₂O।",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t10_q25",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "P ও S এর সর্বোচ্চ জারণ সংখ্যাবিশিষ্ট অক্সাইড দুটি পানির সাথে বিক্রিয়ায় এসিড উৎপন্ন করে কোনটি?",
            options = listOf("H₃PO₃ ও H₂SO₄", "H₃PO₄ ও H₂SO₃", "H₃PO₄ ও H₂SO₄", "H₃PO₂ ও H₂S"),
            correctIndex = 2,
            explanation = "ফসফরাসের সর্বোচ্চ জারণ স্তরের অক্সাইড P₄O₁₀ পানির সাথে বিক্রিয়ায় ফসফরিক অ্যাসিড (H₃PO₄) এবং সালফারের SO₃ সালফিউরিক অ্যাসিড (H₂SO₄) তৈরি করে।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t10_q26",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "নিচের এসিডগুলোর মধ্যে কোনটি ‘পাইরো’ এসিড?",
            options = listOf("HClO₄", "H₃PO₃", "H₂SO₄", "H₂S₂O₇"),
            correctIndex = 3,
            explanation = "H₂S₂O₇ (পাইরোসালফিউরিক অ্যাসিড বা ওলিয়াম) দুইটি H₂SO₄ থেকে ১ অণু পানি নিষ্কাশনে উৎপন্ন পাইরো অ্যাসিড।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t10_q27",
            typeId = 10,
            typeName = "অক্সাইড ও অ্যাসিডের অম্ল-ক্ষার ধর্ম",
            question = "নিম্নের এসিডগুলোর মধ্যে কোনটি ‘হাইপো’ এসিড?",
            options = listOf("H₃PO₃", "H₃PO₂", "H₃PO₄", "HPO₃"),
            correctIndex = 1,
            explanation = "H₃PO₂ হলো হাইপোফসফরাস অ্যাসিড (জারণ মান +1)।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.HARD
        ),

        // টাইপ ১১: পর্যায়বৃত্ত ধর্মের সাধারণ প্রবণতা এবং পরমাণু ও আয়নের আকার
        MCQQuestion(
            id = "t11_q1",
            typeId = 11,
            typeName = "পর্যায়বৃত্ত ধর্মের সাধারণ প্রবণতা এবং পরমাণু ও আয়নের আকার",
            question = "কোনটি পর্যায়বৃত্ত ধর্ম নয়?",
            options = listOf("পারমাণবিক ব্যাসার্ধ", "তড়িৎ ঋণাত্মকতা", "ইলেকট্রন আসক্তি", "গলনাঙ্ক"),
            correctIndex = 3,
            explanation = "গলনাঙ্ক ও স্ফুটনাঙ্ক সুনির্দিষ্ট নিয়মে ক্রমাগত পরিবর্তিত হয় না (কেলাস কাঠামোর ওপর নির্ভরশীল), তাই এটি নিখুঁত পর্যায়বৃত্ত ধর্ম নয়।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t11_q2",
            typeId = 11,
            typeName = "পর্যায়বৃত্ত ধর্মের সাধারণ প্রবণতা এবং পরমাণু ও আয়নের আকার",
            question = "পরমাণুতে একটি স্তরের ইলেকট্রন তার বহিঃস্তরের ইলেকট্রনের সাথে নিউক্লিয়াসের আকর্ষণকে কমিয়ে দেয় তাকে বলা হয়-",
            options = listOf("স্টেরিক বাধা", "শিল্ডিং প্রভাব", "জিম্যান প্রভাব", "স্টার্ক প্রভাব"),
            correctIndex = 1,
            explanation = "ভেতরের কক্ষপথের ইলেকট্রন মেঘ কর্তৃক বাইরের ইলেকট্রনের ওপর নিউক্লিয়াসের কার্যকর টান হ্রাস করার প্রক্রিয়াকে আবরণী প্রভাব বা শিল্ডিং ইফেক্ট বলে।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t11_q3",
            typeId = 11,
            typeName = "পর্যায়বৃত্ত ধর্মের সাধারণ প্রবণতা এবং পরমাণু ও আয়নের আকার",
            question = "পর্যায় সারণিতে একই পর্যায়ে বাম হতে ডান দিকের মৌলগুলোর ক্ষেত্রে কোন তথ্যটি সঠিক?",
            options = listOf("আয়নিকরণ শক্তি বৃদ্ধি পায়", "ইলেকট্রন আসক্তি হ্রাস পায়", "তড়িৎ ধনাত্মকতা অপরিবর্তিত থাকে", "পরমাণুর আকার বাড়তে থাকে"),
            correctIndex = 0,
            explanation = "বাম থেকে ডানে কার্যকর নিউক্লীয় চার্জ বাড়ায় পরমাণুর ব্যাসার্ধ কমে এবং আয়নীকরণ শক্তি বৃদ্ধি পায়।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t11_q4",
            typeId = 11,
            typeName = "পর্যায়বৃত্ত ধর্মের সাধারণ প্রবণতা এবং পরমাণু ও আয়নের আকার",
            question = "পর্যায় সারণির যেকোনো গ্রুপের উপর থেকে নিচের দিকে মৌলের-\n(i) অধাতব বৈশিষ্ট্য হ্রাস পায় (ii) ধাতুর সক্রিয়তা বৃদ্ধি পায় (iii) আয়নিকরণ শক্তি হ্রাস পায়\nনিচের কোনটি সঠিক?",
            options = listOf("i, ii", "ii, iii", "i, iii", "i, ii, iii"),
            correctIndex = 3,
            explanation = "গ্রুপে নিচে নামলে আকার বাড়ে, ফলে ইলেকট্রন ত্যাগ সহজ হয়ে ধাতব সক্রিয়তা বাড়ে, অধাতব ধর্ম ও আয়নীকরণ শক্তি হ্রাস পায়।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t11_q5",
            typeId = 11,
            typeName = "পর্যায়বৃত্ত ধর্মের সাধারণ প্রবণতা এবং পরমাণু ও আয়নের আকার",
            question = "কোন মৌলটির পারমাণবিক ব্যাসার্ধ সবচেয়ে বেশি?",
            options = listOf("Cs", "Rb", "Na", "K"),
            correctIndex = 0,
            explanation = "গ্রুপ ১-এর সবচেয়ে নিচে অবস্থিত সিজিয়ামের (Cs) কক্ষপথ সংখ্যা ৬টি হওয়ায় এর ব্যাসার্ধ প্রদত্ত মৌলগুলোর মধ্যে সর্বাধিক।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t11_q6",
            typeId = 11,
            typeName = "পর্যায়বৃত্ত ধর্মের সাধারণ প্রবণতা এবং পরমাণু ও আয়নের আকার",
            question = "সালফার মৌলের পারমাণবিক ব্যাসার্ধ কত?",
            options = listOf("104 pm", "110 pm", "117 pm", "125 pm"),
            correctIndex = 0,
            explanation = "সালফার (S) পরমাণুর সমযোজী পারমাণবিক ব্যাসার্ধ প্রায় 104 pm (বা 102-104 pm)।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t11_q7",
            typeId = 11,
            typeName = "পর্যায়বৃত্ত ধর্মের সাধারণ প্রবণতা এবং পরমাণু ও আয়নের আকার",
            question = "পরমাণুর আকার হ্রাসের বা বৃদ্ধির সঠিক ক্রম কোনটি?",
            options = listOf("Na < Mg < Al", "Na > Mg > Al", "Na > K > Cs", "Al > Mg > Na"),
            correctIndex = 1,
            explanation = "একই পর্যায়ের বাম থেকে ডানে প্রোটন বৃদ্ধির ফলে ইলেকট্রনের টান বাড়ে এবং পরমাণুর আকার হ্রাস পায়: Na > Mg > Al।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t11_q8",
            typeId = 11,
            typeName = "পর্যায়বৃত্ত ধর্মের সাধারণ প্রবণতা এবং পরমাণু ও আয়নের আকার",
            question = "মৌলগুলোর আয়তনের কোন ক্রমটি সঠিক?",
            options = listOf("Li < Na < K < Rb < Cs", "Na < K < Li < Cs < Rb", "Cs < Li < Na < K < Rb", "K < Na < Rb < Cs < Li"),
            correctIndex = 0,
            explanation = "গ্রুপ ১-এ উপর থেকে নিচে নামলে নতুন শক্তিস্তর যুক্ত হওয়ায় পারমাণবিক আয়তন বৃদ্ধি পায়: Li < Na < K < Rb < Cs।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t11_q9",
            typeId = 11,
            typeName = "পর্যায়বৃত্ত ধর্মের সাধারণ প্রবণতা এবং পরমাণু ও আয়নের আকার",
            question = "উল্লেখিত ইলেকট্রন বিন্যাস সম্পন্ন কোন মৌলটির ব্যাসার্ধ সবচেয়ে বেশি?",
            options = listOf("1s²2s¹", "1s²2s²", "1s²2s²2p¹", "1s²2s²2p³"),
            correctIndex = 0,
            explanation = "লিথিয়াম (1s² 2s¹) পর্যায় ২ এর সবচেয়ে বামে অবস্থিত, একই পর্যায়ের সবচেয়ে বামের মৌলের আকার সবচেয়ে বড়।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t11_q10",
            typeId = 11,
            typeName = "পর্যায়বৃত্ত ধর্মের সাধারণ প্রবণতা এবং পরমাণু ও আয়নের আকার",
            question = "নিচের আয়নগুলোর কোনটি ক্ষুদ্রতম?",
            options = listOf("Al³⁺", "Mg²⁺", "Na⁺", "K⁺"),
            correctIndex = 0,
            explanation = "আইসোইলেকট্রনিক ক্যাটায়নের মধ্যে অ্যালুমিনিয়ামে সর্বাধিক ১৩টি প্রোটন ১০টি ইলেকট্রনকে তীব্রভাবে টেনে রাখে, ফলে Al³⁺ ক্ষুদ্রতম।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t11_q11",
            typeId = 11,
            typeName = "পর্যায়বৃত্ত ধর্মের সাধারণ প্রবণতা এবং পরমাণু ও আয়নের আকার",
            question = "নিচের কোন আয়নের আয়নিক ব্যাসার্ধ সবচেয়ে ছোট?",
            options = listOf("Na⁺", "Mg²⁺", "Al³⁺", "Si⁴⁺"),
            correctIndex = 3,
            explanation = "Si⁴⁺ এর কার্যকর নিউক্লীয় চার্জ সর্বোচ্চ (+4 চার্জ ও ১৪টি প্রোটন), ফলে এর আকার ক্ষুদ্রতম।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t11_q12",
            typeId = 11,
            typeName = "পর্যায়বৃত্ত ধর্মের সাধারণ প্রবণতা এবং পরমাণু ও আয়নের আকার",
            question = "নিচের কোনটির ব্যাসার্ধ সবচেয়ে কম?",
            options = listOf("₉F⁻", "₁₀Ne", "₁₁Na⁺", "₁₂Mg²⁺"),
            correctIndex = 3,
            explanation = "সবগুলোতেই ১০টি ইলেকট্রন রয়েছে (আইসোইলেকট্রনিক)। Mg²⁺-এ সর্বাধিক ১২টি প্রোটন থাকায় এর ব্যাসার্ধ সবচেয়ে কম।",
            reference = "কবীর স্যার",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t11_q13",
            typeId = 11,
            typeName = "পর্যায়বৃত্ত ধর্মের সাধারণ প্রবণতা এবং পরমাণু ও আয়নের আকার",
            question = "ব্যাসার্ধের সঠিক ক্রম কোনটি?",
            options = listOf("Mg²⁺ < Na⁺ < Ne", "Mg²⁺ < Ne < Na⁺", "Na⁺ < Mg²⁺ < Ne", "Mg²⁺ > Na⁺ > Ne"),
            correctIndex = 0,
            explanation = "আইসোইলেকট্রনিক স্পেসিজে ধনাত্মক চার্জ বাড়লে আকার দ্রুত কমে: Mg²⁺ (১২ প্রোটন) < Na⁺ (১১ প্রোটন) < Ne (১০ প্রোটন)।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t11_q14",
            typeId = 11,
            typeName = "পর্যায়বৃত্ত ধর্মের সাধারণ প্রবণতা এবং পরমাণু ও আয়নের আকার",
            question = "আয়নিক ব্যাসার্ধের ক্ষেত্রে কোন ক্রমটি সঠিক?",
            options = listOf("N³⁻ > Na⁺ > O²⁻ > F⁻", "N³⁻ > O²⁻ > F⁻ > Na⁺", "Na⁺ > O²⁻ > N³⁻ > F⁻", "O²⁻ > F⁻ > Na⁺ > N³⁻"),
            correctIndex = 1,
            explanation = "আইসোইলেকট্রনিক আয়নের ক্ষেত্রে অ্যানায়নের ঋণাত্মক চার্জ বাড়লে ইলেকট্রন-ইলেকট্রন বিকর্ষণে আকার বাড়ে: N³⁻ > O²⁻ > F⁻ > Na⁺।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t11_q15",
            typeId = 11,
            typeName = "পর্যায়বৃত্ত ধর্মের সাধারণ প্রবণতা এবং পরমাণু ও আয়নের আকার",
            question = "কোন সেটের আয়নগুলো আইসোইলেকট্রনিক?",
            options = listOf("Mg²⁺, Al³⁺, Cl⁻, S²⁻", "K⁺, Ca²⁺, Sc³⁺, O²⁻", "Mg²⁺, K⁺, Cl⁻, Sc³⁺", "K⁺, Ca²⁺, Sc³⁺, Cl⁻"),
            correctIndex = 3,
            explanation = "K⁺ (18), Ca²⁺ (18), Sc³⁺ (18) এবং Cl⁻ (18) প্রত্যেকের মোট ইলেকট্রন সংখ্যা ১৮, তাই এরা আইসোইলেকট্রনিক।",
            reference = "কবীর স্যার",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t11_q16",
            typeId = 11,
            typeName = "পর্যায়বৃত্ত ধর্মের সাধারণ প্রবণতা এবং পরমাণু ও আয়নের আকার",
            question = "Sr, Tc, Zr এবং Rb পরমাণুর ব্যাসার্ধের ক্রম হলো-",
            options = listOf("Rb > Sr > Zr > Tc", "Tc > Sr > Rb > Zr", "Sr > Tc > Zr > Rb", "Zr > Tc > Rb > Sr"),
            correctIndex = 0,
            explanation = "৫ম পর্যায়ের মৌলগুলো বাম থেকে ডানে সাজালে Rb (গ্রুপ ১) > Sr (গ্রুপ ২) > Zr (গ্রুপ ৪) > Tc (গ্রুপ ৭)।",
            reference = "কবীর স্যার",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t11_q17",
            typeId = 11,
            typeName = "পর্যায়বৃত্ত ধর্মের সাধারণ প্রবণতা এবং পরমাণু ও আয়নের আকার",
            question = "Rb ও Cs পরমাণুদ্বয়ের আয়নিকরণ শক্তি যথাক্রমে 403 kJmol⁻¹ এবং 376 kJmol⁻¹। Rb এর তুলনায় Cs এর পারমাণবিক ব্যাস-",
            options = listOf("ছোট", "বড়", "সমান", "অতুলনীয়"),
            correctIndex = 1,
            explanation = "Cs গ্রুপ ১-এ Rb এর নিচে অবস্থিত হওয়ায় এর ব্যাস ও আকার Rb অপেক্ষা বড় এবং আয়নীকরণ শক্তি কম।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t11_q18",
            typeId = 11,
            typeName = "পর্যায়বৃত্ত ধর্মের সাধারণ প্রবণতা এবং পরমাণু ও আয়নের আকার",
            question = "A ও B পরমাণুর ব্যাসার্ধ যথাক্রমে 37pm ও 99pm হলে AB সমযোজী যৌগের বন্ধন দূরত্ব কত?",
            options = listOf("120 pm", "136 pm", "173 pm", "180 pm"),
            correctIndex = 1,
            explanation = "সমযোজী বন্ধন দূরত্ব d = r_A + r_B = 37 + 99 = 136 pm।",
            reference = "গুহ স্যার",
            difficulty = Difficulty.EASY
        ),

        // টাইপ ১২: আয়নীকরণ শক্তি (Ionization Energy)
        MCQQuestion(
            id = "t12_q1",
            typeId = 12,
            typeName = "আয়নীকরণ শক্তি (Ionization Energy)",
            question = "M + ΔH → M⁺ + e⁻ এখানে ΔH কী?",
            options = listOf("ইলেকট্রন আসক্তি", "আয়নিকরণ শক্তি", "তড়িৎ ঋণাত্মকতা", "তড়িৎ ধনাত্মকতা"),
            correctIndex = 1,
            explanation = "গ্যাসীয় অবস্থায় ১ মোল বিচ্ছিন্ন পরমাণু হতে ১ মোল ইলেকট্রন অপসারণে শোষিত এনথালপির পরিবর্তন ΔH হলো প্রথম আয়নীকরণ শক্তি।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t12_q2",
            typeId = 12,
            typeName = "আয়নীকরণ শক্তি (Ionization Energy)",
            question = "পর্যায় সারণির গ্রুপ II A এর উপর থেকে নিচের দিকে গেলে মৌলসমূহের আয়নিকরণ শক্তি ক্রম কি হয়?",
            options = listOf("বৃদ্ধি পায়", "হ্রাস পায়", "অপরিবর্তিত থাকে", "নির্ণয় করা যায় না"),
            correctIndex = 1,
            explanation = "গ্রুপে নিচে নামলে পারমাণবিক ব্যাসার্ধ বৃদ্ধি পায়, ফলে নিউক্লিয়াসের আকর্ষণ কমায় আয়নীকরণ শক্তি হ্রাস পায়।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t12_q3",
            typeId = 12,
            typeName = "আয়নীকরণ শক্তি (Ionization Energy)",
            question = "আয়নিকরণ শক্তি কোনটির উপর নির্ভর করে না?",
            options = listOf("পরমাণুর আকার", "পারমাণবিক সংখ্যা", "নিউক্লিয়াস ও ইলেকট্রনের মধ্যবর্তী আকর্ষণ", "মোট চার্জের পরিমাণ"),
            correctIndex = 1,
            explanation = "আয়নীকরণ শক্তি কার্যকর নিউক্লীয় চার্জ, পরমাণুর আকার ও ইলেকট্রন বিন্যাসের ওপর নির্ভর করে; নিছক পারমাণবিক সংখ্যার ওপর নয়।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t12_q4",
            typeId = 12,
            typeName = "আয়নীকরণ শক্তি (Ionization Energy)",
            question = "সর্বোচ্চ আয়নিকরণ বিভববিশিষ্ট নিষ্ক্রিয় গ্যাস মৌলটি হলো-",
            options = listOf("He", "Ne", "Ar", "Kr"),
            correctIndex = 0,
            explanation = "হিলিয়ামের (He) পারমাণবিক ব্যাসার্ধ সবচেয়ে ক্ষুদ্র এবং 1s² স্থিতিশীল পূর্ণ শেল থাকায় সমস্ত মৌলের মধ্যে এর ১ম আয়নীকরণ শক্তি সর্বোচ্চ (2372 kJ/mol)।",
            reference = "কবীর স্যার",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t12_q5",
            typeId = 12,
            typeName = "আয়নীকরণ শক্তি (Ionization Energy)",
            question = "কোন মৌলের পরমাণুর আয়নিকরণ শক্তি সবচেয়ে বেশি?",
            options = listOf("C", "B", "N", "O"),
            correctIndex = 2,
            explanation = "নাইট্রোজেনের (N, 2p³) অর্ধপূর্ণ p-উপস্তর অত্যন্ত স্থিতিশীল হওয়ায় এর প্রথম আয়নীকরণ শক্তি কার্বন ও অক্সিজেনের চেয়েও বেশি।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t12_q6",
            typeId = 12,
            typeName = "আয়নীকরণ শক্তি (Ionization Energy)",
            question = "₇N এর চেয়ে ₈O এর-\n(i) আকার ক্ষুদ্র (ii) আয়নিকরণ শক্তি কম (iii) পারমাণবিক ব্যাসার্ধ বেশি\nনিচের কোনটি সঠিক?",
            options = listOf("i, ii, iii", "ii, iii", "i, ii", "i, iii"),
            correctIndex = 2,
            explanation = "অক্সিজেনের প্রোটন বেশি হওয়ায় আকার ক্ষুদ্র (i) এবং N এর অর্ধপূর্ণ উপস্তরের স্থিতিশীলতার কারণে O এর আয়নীকরণ শক্তি কম (ii)।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t12_q7",
            typeId = 12,
            typeName = "আয়নীকরণ শক্তি (Ionization Energy)",
            question = "আয়নীকরণ শক্তির সঠিক ক্রম কোনটি?",
            options = listOf("Be < B < N < O", "B < Be < N < O", "Be < B < O < N", "B < Be < O < N"),
            correctIndex = 3,
            explanation = "পূর্ণ 2s² অরবিটালের কারণে Be > B এবং অর্ধপূর্ণ 2p³ অরবিটালের কারণে N > O, তাই সঠিক ক্রম: B < Be < O < N।",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t12_q8",
            typeId = 12,
            typeName = "আয়নীকরণ শক্তি (Ionization Energy)",
            question = "আয়নিকরণ শক্তির সঠিক ক্রম-",
            options = listOf("N > O > F > Ne", "Ne > F > N > O", "O > F > N > Ne", "Ne > F > O > N"),
            correctIndex = 1,
            explanation = "নিষ্ক্রিয় গ্যাস Ne সর্বোচ্চ, এরপর হ্যালোজেন F, এবং স্থিতিশীলতার কারণে N > O: Ne > F > N > O।",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t12_q9",
            typeId = 12,
            typeName = "আয়নীকরণ শক্তি (Ionization Energy)",
            question = "নিচে চারটি পরমাণুর ইলেকট্রন বিন্যাস দেওয়া আছে। কোন পরমাণুর প্রথম আয়নিকরণ শক্তি সবচেয়ে কম?",
            options = listOf("1s²2s¹", "1s²2s²2p²", "1s²2s²2p⁵", "1s²2s²2p⁶3s¹"),
            correctIndex = 3,
            explanation = "সোডিয়ামের (3s¹) যোজ্যতা ইলেকট্রনটি ৩য় শক্তিস্তরে এবং নিউক্লিয়াস থেকে সবচেয়ে দূরে থাকায় সহজেই অপসারিত হয়।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t12_q10",
            typeId = 12,
            typeName = "আয়নীকরণ শক্তি (Ionization Energy)",
            question = "নিম্নের কোন আয়নের ক্ষেত্রে দ্বিতীয় আয়নিকরণ শক্তি সর্বোচ্চ?",
            options = listOf("Na⁺", "Li⁺", "K⁺", "Rb⁺"),
            correctIndex = 1,
            explanation = "Li⁺ আয়ন থেকে ২য় ইলেকট্রন সরাতে অত্যন্ত স্থিতিশীল ও নিউক্লিয়াসের অতি নিকটবর্তী 1s² শেল থেকে সরাতে হয় (IE₂ প্রায় 7298 kJ/mol, যা সর্বোচ্চ)।",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t12_q11",
            typeId = 12,
            typeName = "আয়নীকরণ শক্তি (Ionization Energy)",
            question = "সমীকরণের মাধ্যমে চারটি এনথালপির পরিবর্তন দেখানো হলো- Na(g) → Na⁺(g) + e, ΔH = W; Na(g) → Na²⁺(g) + 2e, ΔH = X; সোডিয়াম পরমাণুর ২য় আয়নিকরণ বিভবের মান-",
            options = listOf("X", "X – W", "Y – W", "Z – W"),
            correctIndex = 1,
            explanation = "Na⁺(g) → Na²⁺(g) + e বিক্রিয়ার এনথালপি হলো ২য় আয়নীকরণ বিভব, যা সমীকরণ বিয়োগ করলে পাওয়া যায় (X - W)।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t12_q12",
            typeId = 12,
            typeName = "আয়নীকরণ শক্তি (Ionization Energy)",
            question = "Li এবং Ne এর মধ্যবর্তী একটি মৌলের ১ম সাতটি আয়নিকরণ শক্তিসমূহ হলো: 1310, 3390, 5320, 7450, 11000, 13300, 71000 kJ/mol। মৌলটির পরমাণুর যোজ্যতা শেলের ইলেকট্রন বিন্যাস কী?",
            options = listOf("2s²", "2s²2p¹", "2s²2p⁴", "2s²2p⁶"),
            correctIndex = 2,
            explanation = "৬ষ্ঠ ও ৭ম মানের মধ্যে বিশাল উল্লম্ফন (13300 থেকে 71000) নির্দেশ করে যে যোজ্যতা শেলে ৬টি ইলেকট্রন ছিল (2s² 2p⁴ - অক্সিজেন)।",
            difficulty = Difficulty.HARD
        ),

        // টাইপ ১৩: ইলেকট্রন আসক্তি ও তড়িৎ ঋণাত্মকতা
        MCQQuestion(
            id = "t13_q1",
            typeId = 13,
            typeName = "ইলেকট্রন আসক্তি ও তড়িৎ ঋণাত্মকতা",
            question = "গ্যাসীয় অবস্থায় এক মোল পরমাণুতে এক মোল ইলেকট্রন যোগ করলে যে শক্তির পরিবর্তন হয় তা হলো-",
            options = listOf("ইলেকট্রোনেগেটিভিটি", "২য় ইলেকট্রন আসক্তি", "১ম ইলেকট্রন আসক্তি", "১ম আয়নিকরণ শক্তি"),
            correctIndex = 2,
            explanation = "গ্যাসীয় ১ মোল নিরপেক্ষ পরমাণুতে ১ মোল ইলেকট্রন যুক্ত করে ১ মোল একক ঋণাত্মক আয়নে পরিণত করার এনথালপিকে ১ম ইলেকট্রন আসক্তি বলে।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t13_q2",
            typeId = 13,
            typeName = "ইলেকট্রন আসক্তি ও তড়িৎ ঋণাত্মকতা",
            question = "পর্যায় সারণির কোন গ্রুপের মৌলসমূহের ইলেকট্রন আসক্তি সর্বাপেক্ষা বেশি?",
            options = listOf("ক্ষারধাতু", "ক্ষারক", "হ্যালোজেন", "নিষ্ক্রিয় মৌল"),
            correctIndex = 2,
            explanation = "হ্যালোজেনগুলোর (গ্রুপ ১৭) মাত্র ১টি ইলেকট্রন গ্রহণ করলেই স্থিতিশীল অষ্টক লাভ করে, তাই এদের ইলেকট্রন আসক্তি সর্বাধিক।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t13_q3",
            typeId = 13,
            typeName = "ইলেকট্রন আসক্তি ও তড়িৎ ঋণাত্মকতা",
            question = "কোনটির ইলেকট্রন আসক্তি সবচেয়ে বেশি?",
            options = listOf("F", "Cl", "Br", "I"),
            correctIndex = 1,
            explanation = "ফ্লোরিনের আকার ক্ষুদ্র হওয়ায় 2p উপস্তরে তীব্র ইলেকট্রন-ইলেকট্রন বিকর্ষণ হয়। ফলে ক্লোরিনের (Cl) ইলেকট্রন আসক্তি (-349 kJ/mol) ফ্লোরিনের চেয়ে বেশি।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t13_q4",
            typeId = 13,
            typeName = "ইলেকট্রন আসক্তি ও তড়িৎ ঋণাত্মকতা",
            question = "সবচেয়ে বেশি তড়িৎ ধনাত্মক মৌল কোনটি?",
            options = listOf("Al", "K", "Mg", "Ca"),
            correctIndex = 1,
            explanation = "পটাশিয়াম (K) গ্রুপ ১ এর ৪র্থ পর্যায়ের মৌল হওয়ায় এর ইলেকট্রন ত্যাগের প্রবণতা তথা তড়িৎ ধনাত্মকতা সর্বাধিক।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t13_q5",
            typeId = 13,
            typeName = "ইলেকট্রন আসক্তি ও তড়িৎ ঋণাত্মকতা",
            question = "কোনটি তড়িৎ ঋণাত্মক মৌল নয়?",
            options = listOf("N", "S", "F", "Mo"),
            correctIndex = 3,
            explanation = "মলিবডেনাম (Mo) একটি অবস্থান্তর ধাতু, যা তড়িৎ-ধনাত্মক চরিত্র বিশিষ্ট।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t13_q6",
            typeId = 13,
            typeName = "ইলেকট্রন আসক্তি ও তড়িৎ ঋণাত্মকতা",
            question = "কোনটি হ্যালোজেনসমূহের তড়িৎ ঋণাত্মকতার ক্রম?",
            options = listOf("F > Cl > Br > I", "I > Br > Cl > F", "Br > Cl > F > I", "কোনোটিই নয়"),
            correctIndex = 0,
            explanation = "গ্রুপে উপর থেকে নিচে আকার বৃদ্ধির সাথে সাথে তড়িৎ ঋণাত্মকতা হ্রাস পায়: F (4.0) > Cl (3.0) > Br (2.8) > I (2.5)।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t13_q7",
            typeId = 13,
            typeName = "ইলেকট্রন আসক্তি ও তড়িৎ ঋণাত্মকতা",
            question = "C, O, N এবং F-এর তড়িৎ ঋণাত্মকতার সঠিক ক্রম কোনটি?",
            options = listOf("F > O > N > C", "N > F > O > C", "O > F > C > N", "F > N > O > C"),
            correctIndex = 0,
            explanation = "পল্লিং স্কেলে তড়িৎ ঋণাত্মকতা: F (4.0) > O (3.5) > N (3.0) > C (2.5)।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t13_q8",
            typeId = 13,
            typeName = "ইলেকট্রন আসক্তি ও তড়িৎ ঋণাত্মকতা",
            question = "C, O, Ne ও F এর তড়িৎ ঋণাত্মকতার সঠিক ক্রম কোনটি?",
            options = listOf("F > O > C > Ne", "Ne > F > O > C", "O > F > C > Ne", "F > C > O > Ne"),
            correctIndex = 0,
            explanation = "নিষ্ক্রিয় গ্যাস নিয়নের (Ne) সমযোজী বন্ধন গঠনের প্রবণতা নেই বলে এর তড়িৎ ঋণাত্মকতা শূন্য বিবেচনা করা হয়: F > O > C > Ne।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t13_q9",
            typeId = 13,
            typeName = "ইলেকট্রন আসক্তি ও তড়িৎ ঋণাত্মকতা",
            question = "কোনটি সর্বাধিক তড়িৎ ঋণাত্মকতা নির্দেশ করে?",
            options = listOf("1s²2s²3s¹", "1s²2s²2p⁴", "1s²2s²2p⁵", "1s²2s²2p⁶3s²3p⁵"),
            correctIndex = 2,
            explanation = "1s² 2s² 2p⁵ হলো ফ্লোরিন (F), যা সমস্ত পর্যায় সারণির সর্বাধিক তড়িৎ ঋণাত্মক মৌল (৪.০)।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t13_q10",
            typeId = 13,
            typeName = "ইলেকট্রন আসক্তি ও তড়িৎ ঋণাত্মকতা",
            question = "হ্যালোজেন সমূহের ইলেকট্রন আসক্তির মান টেবিলে দেখানো হলো: Cl (-361), Br (-340), I (-308), F (-347)। কোনটি সর্বাপেক্ষা তড়িৎ ঋণাত্মক মৌল?",
            options = listOf("Br", "F", "I", "Cl"),
            correctIndex = 1,
            explanation = "যদিও ক্লোরিনের ইলেকট্রন আসক্তি বেশি, তবে সমযোজী বন্ধনের ইলেকট্রন আকর্ষণের ক্ষমতা (তড়িৎ ঋণাত্মকতা) ফ্লোরিনেরই সর্বাধিক।",
            difficulty = Difficulty.MEDIUM
        ),

        // টাইপ ১৪: অবস্থান্তর মৌল ও d-ব্লক মৌলের সাধারণ বৈশিষ্ট্য
        MCQQuestion(
            id = "t14_q1",
            typeId = 14,
            typeName = "অবস্থান্তর মৌল ও d-ব্লক মৌলের সাধারণ বৈশিষ্ট্য",
            question = "অবস্থান্তর মৌলসমূহ........ ব্লকের মৌল।",
            options = listOf("s", "p", "d", "f"),
            correctIndex = 2,
            explanation = "যেসব d-ব্লক মৌলের সুস্থিত আয়নে d-অরবিটাল আংশিক পূর্ণ (d¹-d⁹) থাকে, তাদের অবস্থান্তর মৌল বলে।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t14_q2",
            typeId = 14,
            typeName = "অবস্থান্তর মৌল ও d-ব্লক মৌলের সাধারণ বৈশিষ্ট্য",
            question = "কোনটি অবস্থান্তর ধাতু?",
            options = listOf("Ba", "Ti", "Rn", "Pb"),
            correctIndex = 1,
            explanation = "টাইটানিয়াম (Ti, Z=22) এর Ti³⁺ আয়নে 3d¹ আংশিক পূর্ণ অরবিটাল থাকায় এটি অবস্থান্তর ধাতু।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t14_q3",
            typeId = 14,
            typeName = "অবস্থান্তর মৌল ও d-ব্লক মৌলের সাধারণ বৈশিষ্ট্য",
            question = "কোনটি অবস্থান্তর মৌল নয়?",
            options = listOf("Sb", "Cr", "Mn", "Ni"),
            correctIndex = 0,
            explanation = "অ্যান্টিমনি (Sb) গ্রুপ ১৫ এর p-ব্লক মৌল, অবস্থান্তর নয়।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t14_q4",
            typeId = 14,
            typeName = "অবস্থান্তর মৌল ও d-ব্লক মৌলের সাধারণ বৈশিষ্ট্য",
            question = "নিচের কোনগুলো অবস্থান্তর মৌল নয়?",
            options = listOf("Cr, Ni, V", "Ru, W, Ti, Fe", "Bi, Cd, Sn, Ga", "Mn, Mo, Co, Rh"),
            correctIndex = 2,
            explanation = "Bi, Sn, Ga হলো p-ব্লকের মৌল এবং Cd এর d-অরবিটাল পূর্ণ (d¹⁰) থাকায় এরা অবস্থান্তর মৌল নয়।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t14_q5",
            typeId = 14,
            typeName = "অবস্থান্তর মৌল ও d-ব্লক মৌলের সাধারণ বৈশিষ্ট্য",
            question = "Sc অবস্থান্তর মৌল নয়, কারণ এর সৃষ্ট আয়নের d অরবিটালগুলো_________।",
            options = listOf("পরিপূর্ণ", "অর্ধ পরিপূর্ণ", "আংশিক পরিপূর্ণ", "খালি"),
            correctIndex = 3,
            explanation = "স্ক্যান্ডিয়ামের একমাত্র সুস্থিত ক্যাটায়ন Sc³⁺ এর ইলেকট্রন বিন্যাসে 3d অরবিটাল সম্পূর্ণ ফাঁকা (3d⁰), তাই এটি অবস্থান্তর নয়।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t14_q6",
            typeId = 14,
            typeName = "অবস্থান্তর মৌল ও d-ব্লক মৌলের সাধারণ বৈশিষ্ট্য",
            question = "কোনটি অবস্থান্তর মৌলের বৈশিষ্ট্য নয়?",
            options = listOf("রঙিন যৌগ উৎপন্ন করে", "পরিবর্তনশীল যোজ্যতা বিদ্যমান", "d-ব্লক মৌল", "সন্নিবেশ বন্ধন তৈরি করে না"),
            correctIndex = 3,
            explanation = "অবস্থান্তর মৌলসমূহ ফাঁকা d-অরবিটাল থাকার কারণে প্রচুর পরিমাণে সন্নিবেশ বন্ধন তৈরি করে জটিল যৌগ গঠন করে; তাই (d) ভুল উক্তি।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t14_q7",
            typeId = 14,
            typeName = "অবস্থান্তর মৌল ও d-ব্লক মৌলের সাধারণ বৈশিষ্ট্য",
            question = "অবস্থান্তর মৌলের বৈশিষ্ট্য হলো:\n(i) জটিল যৌগ গঠন করে (ii) রঙিন যৌগ গঠন করে (iii) পরিবর্তনশীল যোজ্যতা থাকে\nনিচের কোনটি সঠিক?",
            options = listOf("i, ii", "i, iii", "ii, iii", "i, ii, iii"),
            correctIndex = 3,
            explanation = "অবস্থান্তর মৌল জটিল যৌগ, রঙিন যৌগ, পরিবর্তনশীল জারণ অবস্থা এবং প্রভাবন ধর্ম প্রদর্শন করে।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t14_q8",
            typeId = 14,
            typeName = "অবস্থান্তর মৌল ও d-ব্লক মৌলের সাধারণ বৈশিষ্ট্য",
            question = "নিচের কোন ইলেকট্রন বিন্যাসটি একটি অবস্থান্তর মৌলের?",
            options = listOf(
                "1s² 2s² 2p⁶ 3p⁶ 3d¹ 4s²",
                "1s² 2s² 2p⁶ 3s² 3p⁶ 3d⁶ 4s²",
                "1s² 2s² 2p⁶ 3p⁶ 3d¹⁰ 4s² 4p⁶",
                "1s² 2s² 2p⁶ 3s⁶ 3p⁶ 3d¹⁰ 4s² 4p¹"
            ),
            correctIndex = 1,
            explanation = "Fe (Z=26) এর বিন্যাস 1s² 2s² 2p⁶ 3s² 3p⁶ 3d⁶ 4s², যার Fe²⁺ (3d⁶) ও Fe³⁺ (3d⁵) আংশিক পূর্ণ অরবিটাল বিশিষ্ট খাঁটি অবস্থান্তর ধাতু।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t14_q9",
            typeId = 14,
            typeName = "অবস্থান্তর মৌল ও d-ব্লক মৌলের সাধারণ বৈশিষ্ট্য",
            question = "কোন অবস্থান্তর মৌল পরিবর্তনশীল জারণ অবস্থা প্রদর্শন করে না?",
            options = listOf("Cu", "Hg", "Ni", "Zn"),
            correctIndex = 3,
            explanation = "জিংক কেবল +2 জারণ অবস্থা প্রদর্শন করে এবং কোনো পরিবর্তনশীল জারণ মান দেখায় না।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t14_q10",
            typeId = 14,
            typeName = "অবস্থান্তর মৌল ও d-ব্লক মৌলের সাধারণ বৈশিষ্ট্য",
            question = "প্রথম ট্রানজিশন ধাতু সিরিজের একটি ধাতু হতে প্রাপ্ত একটি M³⁺ আয়নে পাঁচটি ইলেকট্রন 3d সাবশেলে অবস্থিত। M³⁺ আয়নটি কী হতে পারে?",
            options = listOf("Cr³⁺", "Mn³⁺", "Fe³⁺", "Sc³⁺"),
            correctIndex = 2,
            explanation = "Fe (26) থেকে ৩টি ইলেকট্রন হারালে Fe³⁺ এর বিন্যাস হয় [Ar] 3d⁵ (ঠিক ৫টি ইলেকট্রন)।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t14_q11",
            typeId = 14,
            typeName = "অবস্থান্তর মৌল ও d-ব্লক মৌলের সাধারণ বৈশিষ্ট্য",
            question = "একই উপশক্তিস্তরের যে সব অরবিটালের শক্তি ভিন্ন তাদেরকে কী বলা হয়?",
            options = listOf("Non – degenerate অরবিটাল", "degenerate অরবিটাল", "Equivalent অরবিটাল", "Base অরবিটাল"),
            correctIndex = 0,
            explanation = "সমশক্তিসম্পন্ন অরবিটালকে ডিজেনারেট অরবিটাল বলে; কিন্তু লিগ্যান্ডের প্রভাবে শক্তি বিভক্ত হয়ে ভিন্ন হলে তাকে নন-ডিজেনারেট অরবিটাল বলে।",
            reference = "কবীর স্যার",
            difficulty = Difficulty.MEDIUM
        )
    )
}
