package com.example.data.repository

import com.example.data.model.Difficulty
import com.example.data.model.MCQQuestion

object ChemistryDatasetPart3 {
    val questions: List<MCQQuestion> = listOf(
        // টাইপ ১৫: চৌম্বক ধর্ম ও অযুগ্ম ইলেকট্রন নির্ণয়
        MCQQuestion(
            id = "t15_q1",
            typeId = 15,
            typeName = "চৌম্বক ধর্ম ও অযুগ্ম ইলেকট্রন নির্ণয়",
            question = "কোনটি ফেরোম্যাগনেটিক ধাতু?",
            options = listOf("Ni", "Ag", "Au", "Cu"),
            correctIndex = 0,
            explanation = "আয়রন (Fe), কোবাল্ট (Co) এবং নিকেল (Ni) তীব্রভাবে চুম্বক দ্বারা আকৃষ্ট হয় বলে এরা ফেরোম্যাগনেটিক ধাতু।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t15_q2",
            typeId = 15,
            typeName = "চৌম্বক ধর্ম ও অযুগ্ম ইলেকট্রন নির্ণয়",
            question = "Cr পরমাণুতে কয়টি অযুগ্ম ইলেকট্রন থাকে?",
            options = listOf("5", "4", "6", "3"),
            correctIndex = 2,
            explanation = "ক্রোমিয়ামের ব্যতিক্রমী ইলেকট্রন বিন্যাস [Ar] 3d⁵ 4s¹। এখানে 3d-তে ৫টি এবং 4s-এ ১টি মিলিয়ে মোট ৬টি অযুগ্ম ইলেকট্রন উপস্থিত।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t15_q3",
            typeId = 15,
            typeName = "চৌম্বক ধর্ম ও অযুগ্ম ইলেকট্রন নির্ণয়",
            question = "নিচের কোনটি ডায়াম্যাগনেটিক?",
            options = listOf("Ti(3d²)", "Fe(3d⁶)", "Zn(3d¹⁰)", "Ni(3d⁸)"),
            correctIndex = 2,
            explanation = "জিংক (Zn) পরমাণু ও Zn²⁺ আয়নের 3d¹⁰ উপস্তর সম্পূর্ণ পূর্ণ থাকায় কোনো অযুগ্ম ইলেকট্রন থাকে না, তাই এটি ডায়াম্যাগনেটিক।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t15_q4",
            typeId = 15,
            typeName = "চৌম্বক ধর্ম ও অযুগ্ম ইলেকট্রন নির্ণয়",
            question = "কোনটি প্যারাম্যাগনেটিক?",
            options = listOf("CH₄", "CO", "O₂", "N₂"),
            correctIndex = 2,
            explanation = "আণবিক অরবিটাল তত্ত্ব (MOT) অনুযায়ী O₂ অণুর π*2px ও π*2py দুটি অ্যান্টিবন্ডিং অরবিটালে ২টি বিজোড় ইলেকট্রন থাকায় এটি প্যারাম্যাগনেটিক।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t15_q5",
            typeId = 15,
            typeName = "চৌম্বক ধর্ম ও অযুগ্ম ইলেকট্রন নির্ণয়",
            question = "কোনটিতে একটি অযুগ্ম ইলেকট্রন বর্তমান?",
            options = listOf("CO", "NO", "CN⁻", "CO₂"),
            correctIndex = 1,
            explanation = "নাইট্রিক অক্সাইড (NO) অণুতে মোট ইলেকট্রন সংখ্যা ১৫ (বিজোড় সংখ্যা), ফলে এতে একটি অযুগ্ম ইলেকট্রন থাকে।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t15_q6",
            typeId = 15,
            typeName = "চৌম্বক ধর্ম ও অযুগ্ম ইলেকট্রন নির্ণয়",
            question = "কোনটি প্যারাম্যাগনেটিক নয়?",
            options = listOf("As⁺", "Be⁻", "Ne²⁺", "Cl⁻"),
            correctIndex = 3,
            explanation = "ক্লোরাইড আয়নের (Cl⁻) ১৮টি ইলেকট্রন সম্পূর্ণ জোড়বদ্ধ (আর্গনের কাঠামো), তাই এটি ডায়াম্যাগনেটিক (প্যারাম্যাগনেটিক নয়)।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t15_q7",
            typeId = 15,
            typeName = "চৌম্বক ধর্ম ও অযুগ্ম ইলেকট্রন নির্ণয়",
            question = "[Fe(CN)₆]³⁻ এর ম্যাগনেটিক মোমেন্ট কত?",
            options = listOf("1.732 B.M.", "2.828 B.M.", "3.873 B.M.", "4.700 B.M."),
            correctIndex = 0,
            explanation = "Fe³⁺ (d⁵) আয়নের সাথে CN⁻ তীব্র লিগ্যান্ড হওয়ায় ইলেকট্রন জোড়বদ্ধ হয় এবং ১টি মাত্র অযুগ্ম ইলেকট্রন থাকে (n=1)। μ = √(1×3) = 1.732 B.M.।",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t15_q8",
            typeId = 15,
            typeName = "চৌম্বক ধর্ম ও অযুগ্ম ইলেকট্রন নির্ণয়",
            question = "কোন জটিল আয়নটির ম্যাগনেটিক মোমেন্টের মান শূন্য?",
            options = listOf("[NiCl₄]²⁻", "[Fe(CN)₆]³⁻", "[Cr(NH₃)₆]³⁺", "[Co(NH₃)₆]³⁺"),
            correctIndex = 3,
            explanation = "[Co(NH₃)₆]³⁺ আয়নে Co³⁺ (d⁶) শক্তিশালী NH₃ লিগ্যান্ডের প্রভাবে নিম্ন-স্পিন d²sp³ গঠন করে এবং সব ৬টি ইলেকট্রন t₂g-তে জোড়বদ্ধ হয় (n=0, μ=0)।",
            reference = "গুহ স্যার",
            difficulty = Difficulty.HARD
        ),

        // টাইপ ১৬: রঙিন যৌগ ও আয়নের বর্ণ
        MCQQuestion(
            id = "t16_q1",
            typeId = 16,
            typeName = "রঙিন যৌগ ও আয়নের বর্ণ",
            question = "নিম্নের কোনটির জলীয় দ্রবণ রঙিন?",
            options = listOf("CuSO₄", "MgSO₄", "ZnSO₄", "Na₂SO₄"),
            correctIndex = 0,
            explanation = "Cu²⁺ (3d⁹) আয়নে আংশিক পূর্ণ d-অরবিটাল থাকায় d-d ইলেকট্রন স্থানান্তরের মাধ্যমে লাল আলো শোষণ করে এবং এর পরিপূরক নীল দ্রবণ উৎপন্ন করে।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t16_q2",
            typeId = 16,
            typeName = "রঙিন যৌগ ও আয়নের বর্ণ",
            question = "কোনটি রঙিন যৌগ?",
            options = listOf("NiSO₄", "Al₂(SO₄)₃", "ZnSO₄", "Sc₂(SO₄)₃"),
            correctIndex = 0,
            explanation = "নিকেল সালফেট (NiSO₄) সবুজ বর্ণের রঙিন যৌগ গঠন করে, বাকিগুলোর ক্যাটায়নে d⁰ বা d¹⁰ বিন্যাস থাকায় বর্ণহীন।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t16_q3",
            typeId = 16,
            typeName = "রঙিন যৌগ ও আয়নের বর্ণ",
            question = "নিচের কোন আয়নটি রঙিন যৌগ গঠন করে?",
            options = listOf("Sc³⁺", "Mg²⁺", "Zn²⁺", "Ni²⁺"),
            correctIndex = 3,
            explanation = "Ni²⁺ এর 3d⁸ বিন্যাসে আংশিক পূর্ণ d-অরবিটাল ও অযুগ্ম ইলেকট্রন থাকায় এটি রঙিন যৌগ গঠন করে।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t16_q4",
            typeId = 16,
            typeName = "রঙিন যৌগ ও আয়নের বর্ণ",
            question = "নিচের কোন আয়ন বর্ণহীন দ্রবণ দেয়?",
            options = listOf("Ni²⁺", "Fe³⁺", "Cu²⁺", "Cu⁺"),
            correctIndex = 3,
            explanation = "Cu⁺ (কিউপ্রাস) আয়নের ইলেকট্রন বিন্যাস 3d¹⁰ (সম্পূর্ণ পূর্ণ), ফলে এতে কোনো d-d স্থানান্তর ঘটে না এবং দ্রবণ সম্পূর্ণ বর্ণহীন হয়।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t16_q5",
            typeId = 16,
            typeName = "রঙিন যৌগ ও আয়নের বর্ণ",
            question = "[Cu(NH₃)₄]²⁺ এর রং-",
            options = listOf("সবুজ", "নীল", "গোলাপি", "হলুদ"),
            correctIndex = 1,
            explanation = "টেট্রাঅ্যামিন কপার(II) আয়ন একটি বৈশিষ্ট্যপূর্ণ গাঢ় রাজকীয় নীল (Deep Royal Blue) বর্ণ প্রদর্শন করে।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t16_q6",
            typeId = 16,
            typeName = "রঙিন যৌগ ও আয়নের বর্ণ",
            question = "ডাইক্রোমেট আয়ন (Cr₂O₇²⁻) এর বর্ণ কীরূপ?",
            options = listOf("কমলা", "সবুজ", "নীল", "হলুদ"),
            correctIndex = 0,
            explanation = "Cr₂O₇²⁻ আয়ন তীব্র কমলা বর্ণের হয় (চার্জ স্থানান্তর স্পেকট্রামের কারণে)।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t16_q7",
            typeId = 16,
            typeName = "রঙিন যৌগ ও আয়নের বর্ণ",
            question = "দুইটি মৌলের ইলেকট্রন বিন্যাস যথাক্রমে [Ar]3d⁶4s² (Fe) এবং [Ar]3d¹4s² (Sc)। এদের ক্যাটায়ন জটিল যৌগ গঠন করলে কোন তথ্যটি সঠিক?",
            options = listOf("উভয়ই রঙিন", "উভয়ই বর্ণহীন", "Fe জটিল রঙিন কিন্তু Sc জটিল বর্ণহীন", "Sc জটিল রঙিন কিন্তু Fe জটিল বর্ণহীন"),
            correctIndex = 2,
            explanation = "Fe ক্যাটায়ন d-d ট্রানজিশনের কারণে রঙিন যৌগ দেয়, কিন্তু Sc³⁺ এ 3d⁰ শূন্য অরবিটাল থাকায় এর গঠিত যৌগ সম্পূর্ণ বর্ণহীন হয়।",
            difficulty = Difficulty.HARD
        ),

        // টাইপ ১৭: জটিল যৌগ, লিগ্যান্ড, সন্নিবেশ সংখ্যা ও সংকরায়ন
        MCQQuestion(
            id = "t17_q1",
            typeId = 17,
            typeName = "জটিল যৌগ, লিগ্যান্ড, সন্নিবেশ সংখ্যা ও সংকরায়ন",
            question = "কোনটি strong ligand?",
            options = listOf("CO", "F⁻", "I⁻", "H₂O"),
            correctIndex = 0,
            explanation = "স্পেকট্রোকেমিক্যাল সিরিজ অনুযায়ী কার্বন মনোক্সাইড (CO) সবচেয়ে শক্তিশালী ফিল্ড লিগ্যান্ড।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t17_q2",
            typeId = 17,
            typeName = "জটিল যৌগ, লিগ্যান্ড, সন্নিবেশ সংখ্যা ও সংকরায়ন",
            question = "কোনটি বাইডেন্টেট (bidentate) লিগ্যান্ড হিসেবে আচরণ করবে?",
            options = listOf("কার্বনেট", "সালফেট", "অক্সালেট", "থায়োসায়ানেট"),
            correctIndex = 2,
            explanation = "অক্সালেট আয়ন (C₂O₄²⁻) তার দুটি অক্সিজেন পরমাণুর মাধ্যমে একই সাথে দুটি নিঃসঙ্গ জোড় দান করে দ্বিদন্তী বা বাইডেন্টেট লিগ্যান্ড হিসেবে কাজ করে।",
            reference = "কবীর স্যার",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t17_q3",
            typeId = 17,
            typeName = "জটিল যৌগ, লিগ্যান্ড, সন্নিবেশ সংখ্যা ও সংকরায়ন",
            question = "একটি Mg²⁺ আয়নের সাথে অষ্টতলকীয় জটিল যৌগ গঠনে কতটি EDTA অণু প্রয়োজন?",
            options = listOf("4", "6", "2", "1"),
            correctIndex = 3,
            explanation = "EDTA একটি ষড়দন্তী (হেক্সাডেন্টেট) লিগ্যান্ড, তাই মাত্র ১টি EDTA অণুই ৬টি সন্নিবেশ বন্ধন তৈরি করে অষ্টতলকীয় জটিল চিলেট যৌগ তৈরি করতে পারে।",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t17_q4",
            typeId = 17,
            typeName = "জটিল যৌগ, লিগ্যান্ড, সন্নিবেশ সংখ্যা ও সংকরায়ন",
            question = "CuSO₄ এর জলীয় দ্রবণে অতিরিক্ত NH₄OH যোগ করলে কোনটি উৎপন্ন হয়?",
            options = listOf("Cu(NH₃)₄SO₄", "CuO", "Cu(NH₃)₂SO₄", "Cu₂(SO₄)₂"),
            correctIndex = 0,
            explanation = "CuSO₄ এর সাথে অতিরিক্ত অ্যামোনিয়া বিক্রিয়া করে সুপরিচিত শোয়াইৎজারের বিকারক [Cu(NH₃)₄]SO₄ গঠন করে।",
            reference = "CU'25-26",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t17_q5",
            typeId = 17,
            typeName = "জটিল যৌগ, লিগ্যান্ড, সন্নিবেশ সংখ্যা ও সংকরায়ন",
            question = "ডাই পটাশিয়াম সোডিয়াম কোবাল্ট (III) নাইট্রাইটের সংকেত কোনটি?",
            options = listOf("K₂Na[Co(NO₃)₆]", "K₂Na[Co(NO₃)₄]", "K₂Na[Co(NO₂)₄(H₂O)₂]", "K₂Na[Co(NO₂)₆]"),
            correctIndex = 3,
            explanation = "ফিশার লবণ বা পটাশিয়াম সোডিয়াম কোবাল্টিনাইট্রিটের সংকেত K₂Na[Co(NO₂)₆]।",
            reference = "গুহ স্যার",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t17_q6",
            typeId = 17,
            typeName = "জটিল যৌগ, লিগ্যান্ড, সন্নিবেশ সংখ্যা ও সংকরায়ন",
            question = "4 সন্নিবেশ সংখ্যাবিশিষ্ট জটিল যৌগটি হলো-",
            options = listOf("K₄[Fe(CN)₆]", "[Co(NH₃)₆]Cl₃", "[Fe(H₂O)₆]Cl₃", "[Cu(NH₃)₄]Cl₂"),
            correctIndex = 3,
            explanation = "[Cu(NH₃)₄]Cl₂ যৌগে কপারের সাথে ৪টি অ্যামিন একদন্তী লিগ্যান্ড যুক্ত থাকায় এর সন্নিবেশ সংখ্যা ৪।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t17_q7",
            typeId = 17,
            typeName = "জটিল যৌগ, লিগ্যান্ড, সন্নিবেশ সংখ্যা ও সংকরায়ন",
            question = "[Co(NH₃)₄(H₂O)₂]Cl₃ জটিল যৌগটিতে অবস্থান্তর ধাতুটির সন্নিবেশ সংখ্যাটি কত?",
            options = listOf("3", "4", "6", "2"),
            correctIndex = 2,
            explanation = "৪টি NH₃ এবং ২টি H₂O মিলে মোট ৪+২ = ৬টি একদন্তী লিগ্যান্ড যুক্ত থাকায় কোবাল্টের সন্নিবেশ সংখ্যা ৬।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t17_q8",
            typeId = 17,
            typeName = "জটিল যৌগ, লিগ্যান্ড, সন্নিবেশ সংখ্যা ও সংকরায়ন",
            question = "Cu(en)₂²⁺ আয়নে কপারের সন্নিবেশ সংখ্যা কত? [en = ইথিলিন ডাইঅ্যামিন]",
            options = listOf("1", "2", "4", "6"),
            correctIndex = 2,
            explanation = "ইথিলিন ডাইঅ্যামিন দ্বিদন্তী লিগ্যান্ড হওয়ায় ২টি en অণু মিলে ২ × ২ = ৪টি সন্নিবেশ বন্ধন তৈরি করে, তাই সন্নিবেশ সংখ্যা ৪।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t17_q9",
            typeId = 17,
            typeName = "জটিল যৌগ, লিগ্যান্ড, সন্নিবেশ সংখ্যা ও সংকরায়ন",
            question = "[Fe(CN)₆]⁴⁻ আয়নে কেন্দ্রীয় পরমাণুর জারণ সংখ্যা ও সন্নিবেশ সংখ্যা হলো-",
            options = listOf("+4, 6", "+2, -6", "+2, 6", "-2, -6"),
            correctIndex = 2,
            explanation = "Fe + 6(-1) = -4 ⇒ Fe = +2 (জারণ সংখ্যা) এবং লিগ্যান্ড সংখ্যা ৬ হওয়ায় সন্নিবেশ সংখ্যা ৬।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t17_q10",
            typeId = 17,
            typeName = "জটিল যৌগ, লিগ্যান্ড, সন্নিবেশ সংখ্যা ও সংকরায়ন",
            question = "কোন জটিল যৌগের মধ্যে কেন্দ্রীয় ধাতব মৌলটি শূন্য জারণ অবস্থা প্রদর্শন করেছে?",
            options = listOf("Na[Co(CO)₄]", "[Pt(NH₃)₂Cl₂]", "Fe(CO)₅", "[Co(NH₃)₆]Cl₃"),
            correctIndex = 2,
            explanation = "আয়ন পেন্টাকার্বনিল Fe(CO)₅-এ CO একটি প্রশম লিগ্যান্ড (চার্জ 0), তাই আয়রনের জারণ মান ঠিক ০।",
            reference = "কবীর স্যার",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t17_q11",
            typeId = 17,
            typeName = "জটিল যৌগ, লিগ্যান্ড, সন্নিবেশ সংখ্যা ও সংকরায়ন",
            question = "[Fe(CN)₆]⁴⁻ আয়নের কেন্দ্রীয় পরমাণুতে কি ধরনের সংকরায়ণ ঘটে?",
            options = listOf("d²sp³", "d¹sp³", "d³sp³", "sp³d²"),
            correctIndex = 0,
            explanation = "CN⁻ শক্তিশালী লিগ্যান্ড হওয়ায় ভেতরের দুটি 3d অরবিটালের ইলেকট্রন জোড়বদ্ধ করে ফাঁকা 3d² 4s 4p³ সংকর অরবিটাল ব্যবহার করে d²sp³ অভ্যন্তরীণ সংকরায়ন ঘটায়।",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t17_q12",
            typeId = 17,
            typeName = "জটিল যৌগ, লিগ্যান্ড, সন্নিবেশ সংখ্যা ও সংকরায়ন",
            question = "[Ni(CO)₄] জটিল যৌগে কোন ধরনের সংকরণ ঘটে?",
            options = listOf("d²sp³", "dsp²", "sp²d", "sp³"),
            correctIndex = 3,
            explanation = "CO এর প্রভাবে Ni এর 4s² ইলেকট্রনদ্বয় 3d-তে প্রবেশ করে 3d¹⁰ পূর্ণ করে, ফলে 4s ও 4p অরবিটাল ব্যবহার করে sp³ চতুস্তলকীয় সংকরায়ন ঘটে।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t17_q13",
            typeId = 17,
            typeName = "জটিল যৌগ, লিগ্যান্ড, সন্নিবেশ সংখ্যা ও সংকরায়ন",
            question = "d²sp³ সংকরায়নে কোন দুটি d-অরবিটাল অংশগ্রহণ করে?",
            options = listOf("dxy, dyz", "dxy, dxz", "dx²-y², dz²", "dxy, dx²-y²"),
            correctIndex = 2,
            explanation = "অষ্টতলকীয় জ্যামিতিতে অক্ষ বরাবর অবস্থিত দুটি অরবিটাল dx²-y² এবং dz² সংকরায়নে অংশগ্রহণ করে।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t17_q14",
            typeId = 17,
            typeName = "জটিল যৌগ, লিগ্যান্ড, সন্নিবেশ সংখ্যা ও সংকরায়ন",
            question = "[Fe(CN)₆]⁴⁻ → [Fe(CN)₆]³⁻ + 1e⁻ বিক্রিয়াটি সম্পন্ন হলে, কোন ধর্মের পরিবর্তন হয়?",
            options = listOf("Fe এর d অরবিটালের সংকরণ", "জ্যামিতিক গঠন", "চৌম্বক ধর্ম", "ঘনত্ব"),
            correctIndex = 2,
            explanation = "Fe(II) থেকে Fe(III) এ জারিত হওয়ায় অযুগ্ম ইলেকট্রন ০ থেকে ১-এ পরিবর্তিত হয়, ফলে ডায়াম্যাগনেটিক থেকে প্যারাম্যাগনেটিকে রূপান্তর ঘটে।",
            difficulty = Difficulty.HARD
        ),

        // টাইপ ১৮: রাসায়নিক বন্ধনের প্রকারভেদ ও অষ্টক নিয়ম
        MCQQuestion(
            id = "t18_q1",
            typeId = 18,
            typeName = "রাসায়নিক বন্ধনের প্রকারভেদ ও অষ্টক নিয়ম",
            question = "কোন ধরনের বন্ধন এর শক্তি মাত্রা বেশি?",
            options = listOf("আয়নিক", "সমযোজী", "ধাতব", "হাইড্রোজেন"),
            correctIndex = 0,
            explanation = "আয়নিক বন্ধনে বিপরীত চার্জযুক্ত ক্যাটায়ন ও অ্যানায়নের মাঝে শক্তিশালী স্থির-বৈদ্যুতিক কুলম্বীয় আকর্ষণ বল কাজ করায় এর ল্যাটিস বা বন্ধন শক্তি সর্বাধিক।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t18_q2",
            typeId = 18,
            typeName = "রাসায়নিক বন্ধনের প্রকারভেদ ও অষ্টক নিয়ম",
            question = "KCl যৌগটিতে K ও Cl এর মধ্যে বিদ্যমান বন্ধনটির নাম কী?",
            options = listOf("সমযোজী বন্ধন", "সন্নিবেশ বন্ধন", "আয়নিক বন্ধন", "ধাতব বন্ধন"),
            correctIndex = 2,
            explanation = "ধাতু (K) কর্তৃক ইলেকট্রন বর্জন এবং অধাতু (Cl) কর্তৃক ইলেকট্রন গ্রহণের মাধ্যমে KCl-এ আয়নিক বন্ধন গঠিত হয়।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t18_q3",
            typeId = 18,
            typeName = "রাসায়নিক বন্ধনের প্রকারভেদ ও অষ্টক নিয়ম",
            question = "নিম্নের কোন যৌগে আয়নিক বন্ধন আছে?",
            options = listOf("CH₄", "CaCl₂", "HI", "H₂"),
            correctIndex = 1,
            explanation = "ক্যালসিয়াম ক্লোরাইড (CaCl₂) ধাতু ও অধাতুর মধ্যে গঠিত আয়নিক যৌগ।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t18_q4",
            typeId = 18,
            typeName = "রাসায়নিক বন্ধনের প্রকারভেদ ও অষ্টক নিয়ম",
            question = "কোন যৌগটি আয়নিক হাইড্রাইড?",
            options = listOf("H₂O", "H₂S", "NaH", "HI"),
            correctIndex = 2,
            explanation = "সোডিয়াম হাইড্রাইড (Na⁺H⁻) একটি স্পষ্ট আয়নিক হাইড্রাইড।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t18_q5",
            typeId = 18,
            typeName = "রাসায়নিক বন্ধনের প্রকারভেদ ও অষ্টক নিয়ম",
            question = "সবচেয়ে শক্তিশালী ধাতব বন্ধন কোনটিতে পাওয়া যায়?",
            options = listOf("Na", "Mg", "Al", "K"),
            correctIndex = 2,
            explanation = "অ্যালুমিনিয়ামের পরমাণু প্রতি ৩টি সঞ্চারণশীল যোজ্যতা ইলেকট্রন এবং ক্ষুদ্র পারমাণবিক আকার থাকায় এর ধাতব বন্ধন অত্যন্ত সুদৃঢ়।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t18_q6",
            typeId = 18,
            typeName = "রাসায়নিক বন্ধনের প্রকারভেদ ও অষ্টক নিয়ম",
            question = "NaCl এর গঠনে প্রতিটি Na⁺ আয়ন কতটি Cl⁻ আয়ন দ্বারা পরিবেষ্টিত থাকে?",
            options = listOf("4 টি", "6 টি", "8 টি", "10 টি"),
            correctIndex = 1,
            explanation = "NaCl এর কেলাস কাঠামোতে প্রতিটি Na⁺ আয়ন চারপাশ থেকে ৬টি Cl⁻ আয়ন দ্বারা এবং প্রতিটি Cl⁻ আয়ন ৬টি Na⁺ আয়ন দ্বারা পরিবেষ্টিত থাকে (সমন্বয় সংখ্যা ৬:৬)।",
            reference = "কবীর স্যার",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t18_q7",
            typeId = 18,
            typeName = "রাসায়নিক বন্ধনের প্রকারভেদ ও অষ্টক নিয়ম",
            question = "অষ্টক অপূর্ণ যৌগ কোনটি?",
            options = listOf("NH₃", "BF₃", "H₂O", "NaCl"),
            correctIndex = 1,
            explanation = "BF₃ অণুতে বোরনের যোজ্যতা স্তরে ৩ জোড়া বা মাত্র ৬টি ইলেকট্রন থাকে, তাই এটি অষ্টক অপূর্ণ যৌগ।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t18_q8",
            typeId = 18,
            typeName = "রাসায়নিক বন্ধনের প্রকারভেদ ও অষ্টক নিয়ম",
            question = "অষ্টক সম্প্রসারণ এর উদাহরণ কোনটি?",
            options = listOf("BeCl₂", "PCl₅", "BCl₃", "Cl₂"),
            correctIndex = 1,
            explanation = "PCl₅ যৌগে ফসফরাস কেন্দ্রীয় পরমাণুর চারপাশে ৫ জোড়া বা ১০টি ইলেকট্রন থাকায় এটি অষ্টক সম্প্রসারণের উদাহরণ।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t18_q9",
            typeId = 18,
            typeName = "রাসায়নিক বন্ধনের প্রকারভেদ ও অষ্টক নিয়ম",
            question = "কোন মূলক জোড়াটি অষ্টক তত্ত্ব একেবারেই মেনে চলেনা?",
            options = listOf("NH₄⁺, ICl₄⁻", "BF₄⁻, ICl₄⁻", "ICl₂⁻, NH₄⁺", "ICl₂⁻, ICl₄⁻"),
            correctIndex = 3,
            explanation = "ICl₂⁻ (১০ ইলেকট্রন) এবং ICl₄⁻ (১২ ইলেকট্রন) উভয়ই অষ্টক সম্প্রসারিত ব্যতিক্রমী কাঠামো।",
            reference = "গুহ স্যার",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t18_q10",
            typeId = 18,
            typeName = "রাসায়নিক বন্ধনের প্রকারভেদ ও অষ্টক নিয়ম",
            question = "কোন অণুতে সন্নিবেশ সমযোজী বন্ধন গঠনের শর্ত-",
            options = listOf(
                "দুটি পরমাণুর মধ্যে ইলেকট্রনের সম্পূর্ণ স্থানান্তর ঘটবে",
                "ইলেকট্রন গ্রহীতা পরমাণু বা আয়নের ফাঁকা অরবিটাল প্রয়োজন",
                "ইলেকট্রন গ্রহীতাকে অবশ্যই ধনাত্মক আয়ন হতে হবে",
                "সন্নিবেশ সমযোজী বন্ধন গঠনে সর্বদা ধনাত্মক আয়ন সৃষ্টি হয়"
            ),
            correctIndex = 1,
            explanation = "সন্নিবেশ বন্ধন গঠনের মূল শর্ত হলো এক পরমাণুর মুক্তজোড় ইলেকট্রন থাকতে হবে এবং অপর পরমাণু বা আয়নের তা গ্রহণের উপযুক্ত ফাঁকা অরবিটাল থাকতে হবে।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t18_q11",
            typeId = 18,
            typeName = "রাসায়নিক বন্ধনের প্রকারভেদ ও অষ্টক নিয়ম",
            question = "কোন যৌগটি সন্নিবেশ বন্ধন গঠন করে না?",
            options = listOf("H₂O", "CCl₄", "NH₃", "BCl₃"),
            correctIndex = 1,
            explanation = "CCl₄ এর সব ইলেকট্রন জোড় সমযোজী বন্ধনে আবদ্ধ এবং এতে কোনো মুক্তজোড় বা ফাঁকা d-অরবিটাল নেই, তাই এটি সন্নিবেশ বন্ধন করে না।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t18_q12",
            typeId = 18,
            typeName = "রাসায়নিক বন্ধনের প্রকারভেদ ও অষ্টক নিয়ম",
            question = "হাইড্রোনিয়াম আয়নে (H₃O⁺) কোন কোন বন্ধন বিদ্যমান?",
            options = listOf("আয়নিক ও সমযোজী বন্ধন", "সমযোজী ও সন্নিবেশ বন্ধন", "আয়নিক ও সন্নিবেশ বন্ধন", "আয়নিক ও H-বন্ধন"),
            correctIndex = 1,
            explanation = "H₂O অণুতে দুটি সমযোজী O-H বন্ধন এবং H⁺ এর সাথে পানির একটি নিঃসঙ্গ জোড় দান করে ১টি সন্নিবেশ বন্ধন গঠিত হয়।",
            reference = "কবীর স্যার",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t18_q13",
            typeId = 18,
            typeName = "রাসায়নিক বন্ধনের প্রকারভেদ ও অষ্টক নিয়ম",
            question = "Al₂Cl₆ অণুতে সমযোজী ও সন্নিবেশ সমযোজী বন্ধনের সংখ্যা যথাক্রমে কতটি?",
            options = listOf("6, 2", "6, 1", "8, 0", "7, 0"),
            correctIndex = 0,
            explanation = "অ্যালুমিনিয়াম ক্লোরাইডের ডাইমার Al₂Cl₆-এ ৬টি সাধারণ সমযোজী Al-Cl বন্ধন এবং ২টি ক্লোরিন পরমাণু সেতু হিসেবে ২টি সন্নিবেশ সমযোজী বন্ধন দেয় (মোট ৬ ও ২)।",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t18_q14",
            typeId = 18,
            typeName = "রাসায়নিক বন্ধনের প্রকারভেদ ও অষ্টক নিয়ম",
            question = "NH₄Cl যৌগের মধ্যে কত ধরনের বন্ধনের (Bonds) উপস্থিতি আছে?",
            options = listOf("2", "3", "4", "5"),
            correctIndex = 1,
            explanation = "NH₄Cl-এ তিন প্রকারের বন্ধন বিদ্যমান: (১) N ও H এর মধ্যে সমযোজী, (২) NH₃ ও H⁺ এর মাঝে সন্নিবেশ সমযোজী, এবং (৩) NH₄⁺ ও Cl⁻ এর মাঝে আয়নিক বন্ধন।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t18_q15",
            typeId = 18,
            typeName = "রাসায়নিক বন্ধনের প্রকারভেদ ও অষ্টক নিয়ম",
            question = "কোন যৌগে আয়নিক, সমযোজী এবং সন্নিবেশ বন্ধন বিদ্যমান?",
            options = listOf("KBF₄", "NH₄Cl", "CuSO₄.5H₂O", "সবগুলোতে"),
            correctIndex = 3,
            explanation = "KBF₄, NH₄Cl এবং CuSO₄·5H₂O প্রতিটি যৌগেই আয়নিক, সমযোজী ও সন্নিবেশ বন্ধনের সমাবেশ রয়েছে।",
            difficulty = Difficulty.HARD
        ),

        // টাইপ ১৯: সিগমা (σ) ও পাই (π) বন্ধন এবং বন্ধন ক্রম (Bond Order)
        MCQQuestion(
            id = "t19_q1",
            typeId = 19,
            typeName = "সিগমা (σ) ও পাই (π) বন্ধন এবং বন্ধন ক্রম",
            question = "সিগমা ও পাই বন্ধন মূলত কি ধরনের বন্ধন?",
            options = listOf("সমযোজী বন্ধন", "আয়নিক বন্ধন", "অধাতব বন্ধন", "হাইড্রোজেন বন্ধন"),
            correctIndex = 0,
            explanation = "সিগমা ও পাই বন্ধন অরবিটালের অধিক্রমণ দ্বারা গঠিত সমযোজী বন্ধনের দুটি রূপভেদ।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t19_q2",
            typeId = 19,
            typeName = "সিগমা (σ) ও পাই (π) বন্ধন এবং বন্ধন ক্রম",
            question = "কোন অরবিটালটি কখনো π বন্ধনে অংশগ্রহণ করে না?",
            options = listOf("s", "p", "d", "f"),
            correctIndex = 0,
            explanation = "s-অরবিটাল সম্পূর্ণ সুষম গোলকাকার হওয়ায় এর কোনো দিকনির্দেশক লোব নেই, ফলে এটি কখনোই পার্শ্বীয় অধিক্রমণ বা পাই বন্ধন করতে পারে না।",
            reference = "কবীর স্যার",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t19_q3",
            typeId = 19,
            typeName = "সিগমা (σ) ও পাই (π) বন্ধন এবং বন্ধন ক্রম",
            question = "কোন ধরনের অরবিটাল অধিক্রমণের ফলে সিগমা (σ) ও পাই (π) – দুই ধরনের বন্ধন গঠন হতে পারে?",
            options = listOf("s - s", "sp - s", "p - p", "sp² - s"),
            correctIndex = 2,
            explanation = "দুটি p-অরবিটাল মুখোমুখি অধিক্রমণ করলে সিগমা এবং সমান্তরাল বা পার্শ্বীয় অধিক্রমণ করলে পাই বন্ধন গঠিত হয়।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t19_q4",
            typeId = 19,
            typeName = "সিগমা (σ) ও পাই (π) বন্ধন এবং বন্ধন ক্রম",
            question = "নিচের কোনটি অসম্ভব?",
            options = listOf("sp³ - s সিগমা বন্ধন", "p - p পাই বন্ধন", "sp - sp পাই বন্ধন", "sp³ - sp³ সিগমা বন্ধন"),
            correctIndex = 2,
            explanation = "সংকরিত অরবিটাল কেবল অক্ষ বরাবর মুখোমুখি অধিক্রমণ করে সিগমা বন্ধন তৈরি করে; সংকরিত অরবিটাল কখনো পাই বন্ধন গঠন করতে পারে না।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t19_q5",
            typeId = 19,
            typeName = "সিগমা (σ) ও পাই (π) বন্ধন এবং বন্ধন ক্রম",
            question = "CH₃CN অণুতে যথাক্রমে সিগমা (σ) ও পাই (π) বন্ধন সংখ্যা কত?",
            options = listOf("5 ও 2", "4 ও 3", "5 ও 3", "4 ও 2"),
            correctIndex = 0,
            explanation = "H₃C-C≡N এ C-H সিগমা ৩টি, C-C সিগমা ১টি, C≡N ত্রিবন্ধনে ১টি সিগমা ও ২টি পাই; সর্বমোট ৫টি সিগমা ও ২টি পাই বন্ধন।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t19_q6",
            typeId = 19,
            typeName = "সিগমা (σ) ও পাই (π) বন্ধন এবং বন্ধন ক্রম",
            question = "CH₂ = CH – CH₂CHO যৌগটিতে যথাক্রমে σ এবং π বন্ধনের সংখ্যা হলো-",
            options = listOf("9, 2", "8, 4", "10, 1", "10, 2"),
            correctIndex = 0,
            explanation = "সিগমা বন্ধন: C=C তে ১টি, C-C তে ২টি, C-H ৫টি, C=O তে ১টি = ৯টি সিগমা। পাই বন্ধন: C=C তে ১টি ও C=O তে ১টি = ২টি পাই বন্ধন।",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t19_q7",
            typeId = 19,
            typeName = "সিগমা (σ) ও পাই (π) বন্ধন এবং বন্ধন ক্রম",
            question = "1-বিউটিন-3-আইন (CH₂=CH-C≡CH) এ σ এবং π বন্ধনের সংখ্যা যথাক্রমে-",
            options = listOf("5 ও 5", "7 ও 3", "8 ও 2", "6 ও 4"),
            correctIndex = 1,
            explanation = "সিগমা বন্ধন: C-C তে ৩টি + C-H ৪টি = ৭টি সিগমা। পাই বন্ধন: দ্বিবন্ধনে ১টি + ত্রিবন্ধনে ২টি = ৩টি পাই বন্ধন (৭ ও ৩)।",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t19_q8",
            typeId = 19,
            typeName = "সিগমা (σ) ও পাই (π) বন্ধন এবং বন্ধন ক্রম",
            question = "নিচের কোনটির বন্ধনক্রম শূন্য?",
            options = listOf("He₂", "F₂", "N₂", "HF"),
            correctIndex = 0,
            explanation = "He₂ অণুতে বন্ডিং ইলেকট্রন ২টি ও অ্যান্টিবন্ডিং ইলেকট্রন ২টি হওয়ায় বন্ধন ক্রম = (2 - 2)/2 = 0, তাই He₂ গঠিত হয় না।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t19_q9",
            typeId = 19,
            typeName = "সিগমা (σ) ও পাই (π) বন্ধন এবং বন্ধন ক্রম",
            question = "আণবিক অরবিটাল তত্ত্বানুসারে O₂²⁺ আয়নটির বন্ধন ক্রম-",
            options = listOf("1.5", "2.0", "2.5", "3.0"),
            correctIndex = 3,
            explanation = "O₂²⁺ আয়নের মোট ইলেকট্রন সংখ্যা ১৬ - ২ = ১৪টি (N₂ এর আইসোইলেকট্রনিক)। এর বন্ড অর্ডার (১০ - ৪)/২ = ৩.০।",
            difficulty = Difficulty.HARD
        ),

        // টাইপ ২০: অরবিটালের সংকরায়ন (Hybridization) নির্ণয়
        MCQQuestion(
            id = "t20_q1",
            typeId = 20,
            typeName = "অরবিটালের সংকরায়ন (Hybridization) নির্ণয়",
            question = "sp³ হাইব্রিডাইজেশনে কয়টি sp³ হাইব্রিড অরবিটাল তৈরি হয়?",
            options = listOf("2", "3", "4", "5"),
            correctIndex = 2,
            explanation = "একটি s এবং তিনটি p অরবিটাল পরস্পর মিশ্রিত হয়ে ঠিক ৪টি সমতুল্য sp³ সংকর অরবিটাল সৃষ্টি করে।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t20_q2",
            typeId = 20,
            typeName = "অরবিটালের সংকরায়ন (Hybridization) নির্ণয়",
            question = "গ্রাফাইটে কোন ধরনের সংকরণ বিদ্যমান?",
            options = listOf("sp³", "sp²", "sp", "sp²d"),
            correctIndex = 1,
            explanation = "গ্রাফাইটের প্রতিটি কার্বন পরমাণু সমতলে অপর তিনটি কার্বনের সাথে যুক্ত হয়ে sp² সংকরায়নের মাধ্যমে ষড়ভুজাকার স্তর গঠন করে।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t20_q3",
            typeId = 20,
            typeName = "অরবিটালের সংকরায়ন (Hybridization) নির্ণয়",
            question = "BCl₃ অণুতে B পরমাণুর সংকরায়ন অবস্থা কী?",
            options = listOf("sp²", "sp³d", "sp³d²", "sp³"),
            correctIndex = 0,
            explanation = "বোরনের ৩টি যোজ্যতা ইলেকট্রন ৩টি ক্লোরিনের সাথে ৩টি সিগমা বন্ধন তৈরি করে (স্টেরিক সংখ্যা ৩), ফলে sp² সংকরণ ঘটে।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t20_q4",
            typeId = 20,
            typeName = "অরবিটালের সংকরায়ন (Hybridization) নির্ণয়",
            question = "H₂O অণুতে O-পরমাণুটি কোন ধরনের সংকরায়িত?",
            options = listOf("sp", "sp²", "sp³", "sp⁴"),
            correctIndex = 2,
            explanation = "পানির অক্সিজেনে ২টি বন্ধনজোড় এবং ২টি নিঃসঙ্গ ইলেকট্রন জোড় (মোট ৪ জোড়া) থাকায় এটি sp³ সংকরিত।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t20_q5",
            typeId = 20,
            typeName = "অরবিটালের সংকরায়ন (Hybridization) নির্ণয়",
            question = "PCl₃ অণুর ফসফরাসে কোন সংকর অরবিটাল বিদ্যমান?",
            options = listOf("dsp³", "sp³", "dsp²", "d²sp"),
            correctIndex = 1,
            explanation = "ফসফরাস ট্রাইক্লোরাইডে ৩টি সিগমা বন্ধন এবং ১ জোড়া নিঃসঙ্গ ইলেকট্রন থাকায় মোট ৪টি স্টেরিক সংখ্যা অর্থাৎ sp³ সংকরায়ন ঘটে।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t20_q6",
            typeId = 20,
            typeName = "অরবিটালের সংকরায়ন (Hybridization) নির্ণয়",
            question = "NH₄⁺ ও PH₄⁺ আয়নের সংকরায়ন কোনটি?",
            options = listOf("sp", "sp²", "sp³", "sp³d"),
            correctIndex = 2,
            explanation = "উভয় ক্যাটায়নেই কেন্দ্রীয় পরমাণুতে ৪টি সিগমা বন্ধন ও ০টি লোন পেয়ার রয়েছে, ফলে উভয়েই চতুস্তলকীয় sp³ সংকরিত।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t20_q7",
            typeId = 20,
            typeName = "অরবিটালের সংকরায়ন (Hybridization) নির্ণয়",
            question = "PCl₅ এ P এর সংকরায়ন কীরূপ?",
            options = listOf("sp³", "sp³d", "sp³d²", "sp³d³"),
            correctIndex = 1,
            explanation = "ফসফরাস পেন্টাক্লোরাইডে ৫টি সিগমা বন্ধন তৈরি করতে ১টি s, ৩টি p এবং ১টি d অরবিটাল মিলে sp³d সংকরায়ন ঘটায়।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t20_q8",
            typeId = 20,
            typeName = "অরবিটালের সংকরায়ন (Hybridization) নির্ণয়",
            question = "sp³d সংকরিত যৌগ নিচের কোনটি?",
            options = listOf("SF₄", "PCl₅", "ClF₃", "সবগুলো"),
            correctIndex = 3,
            explanation = "SF₄ (৪ বন্ধন + ১ লোন পেয়ার = ৫), PCl₅ (৫ বন্ধন = ৫), ClF₃ (৩ বন্ধন + ২ লোন পেয়ার = ৫) প্রত্যেকেই sp³d সংকরিত।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t20_q9",
            typeId = 20,
            typeName = "অরবিটালের সংকরায়ন (Hybridization) নির্ণয়",
            question = "H₂SO₄ এর কেন্দ্রীয় পরমাণুর কোন প্রকারের সংকরণ ঘটে?",
            options = listOf("sp²", "sp³", "sp³d", "sp³d²"),
            correctIndex = 1,
            explanation = "সালফিউরিক অ্যাসিডে কেন্দ্রীয় সালফারের সাথে ৪টি অক্সিজেন পরমাণু ৪টি সিগমা বন্ধনে যুক্ত থাকায় এটি sp³ সংকরিত।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t20_q10",
            typeId = 20,
            typeName = "অরবিটালের সংকরায়ন (Hybridization) নির্ণয়",
            question = "XeF₄ এর সংকরায়ন হল-",
            options = listOf("sp³", "sp³d¹", "sp³d²", "dsp²"),
            correctIndex = 2,
            explanation = "XeF₄ এ জেননের চারপাশে ৪টি বন্ধনজোড় এবং ২টি নিঃসঙ্গ জোড় মিলিয়ে মোট ৬ জোড়া ইলেকট্রন, যা sp³d² সংকরায়ন প্রদর্শন করে।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t20_q11",
            typeId = 20,
            typeName = "অরবিটালের সংকরায়ন (Hybridization) নির্ণয়",
            question = "HCHO অণুতে কার্বনের হাইব্রিডাইজেশন হল-",
            options = listOf("sp", "sp²", "sp³", "কোনোটিই নয়"),
            correctIndex = 1,
            explanation = "ফরমালডিহাইডে কার্বন ২টি একক C-H বন্ধন এবং ১টি দ্বিবন্ধন C=O দ্বারা ৩টি সিগমা বন্ধন গঠন করায় sp² সংকরিত।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t20_q12",
            typeId = 20,
            typeName = "অরবিটালের সংকরায়ন (Hybridization) নির্ণয়",
            question = "CH₂ = CH₂ এর কার্বন পরমাণুর sp² সংকরিত এবং অসংকরিত অরবিটালদ্বয়ের মধ্যবর্তী কোণের মান কত ডিগ্রি?",
            options = listOf("90", "120", "109.5", "180"),
            correctIndex = 0,
            explanation = "sp² সংকরিত অরবিটালগুলো একই সমতলে থাকে এবং অসংকরিত 2pz অরবিটালটি ঐ সমতলের সাথে ৯০° কোণে লম্বভাবে অবস্থান করে।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t20_q13",
            typeId = 20,
            typeName = "অরবিটালের সংকরায়ন (Hybridization) নির্ণয়",
            question = "নিচের যৌগগুলির মধ্যে কোনটিতে sp ও sp³ সংকরিত C পরমাণু রয়েছে?",
            options = listOf("CH₃C ≡ CH", "CH₂ = C = CH₂", "CH₃ - CH₂ - CH₃", "CH₂ = CH₂"),
            correctIndex = 0,
            explanation = "প্রোপাইনে (CH₃-C≡CH) মিথাইল কার্বনটি sp³ এবং ত্রিবন্ধনযুক্ত কার্বন দুটি sp সংকরিত।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t20_q14",
            typeId = 20,
            typeName = "অরবিটালের সংকরায়ন (Hybridization) নির্ণয়",
            question = "NO₂⁺, NO₂⁻ ও NH₄⁺ এর মধ্যে N-পরমাণুতে সংকর অবস্থা যথাক্রমে-",
            options = listOf("sp, sp² ও sp³", "sp, sp³ ও sp²", "sp², sp ও sp³", "sp², sp³ ও sp"),
            correctIndex = 0,
            explanation = "NO₂⁺ সরলরৈখিক হওয়ায় sp, NO₂⁻ কৌণিক (১ লোন পেয়ার + ২ সিগমা) হওয়ায় sp² এবং NH₄⁺ চতুস্তলকীয় হওয়ায় sp³।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.HARD
        ),

        // টাইপ ২১: অণুর জ্যামিতিক আকৃতি ও মুক্তজোড় ইলেকট্রন (VSEPR তত্ত্ব)
        MCQQuestion(
            id = "t21_q1",
            typeId = 21,
            typeName = "অণুর জ্যামিতিক আকৃতি ও মুক্তজোড় ইলেকট্রন",
            question = "sp² হাইব্রিডাইজেশনের মাধ্যমে গঠিত যৌগের আদর্শ আকৃতি কোনটি?",
            options = listOf("সরলরৈখিক", "ত্রিকোণাকার", "চতুস্তলকীয়", "ত্রিকোণাকার দ্বি-পিরামিডীয়"),
            correctIndex = 1,
            explanation = "sp² সংকরণে তিনটি সংকর অরবিটাল পরস্পরের সাথে ১২০° কোণে অবস্থান করে সমতলীয় ত্রিকোণাকার জ্যামিতি গঠন করে।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t21_q2",
            typeId = 21,
            typeName = "অণুর জ্যামিতিক আকৃতি ও মুক্তজোড় ইলেকট্রন",
            question = "নিম্নের কোন অণুটি সরলরৈখিক?",
            options = listOf("CO₂", "SO₂", "H₂O", "CH₂O"),
            correctIndex = 0,
            explanation = "CO₂ অণুতে কার্বনে কোনো মুক্তজোড় ইলেকট্রন নেই (sp সংকরণ), ফলে এটি ১৮০° কোণে সরলরৈখিক।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t21_q3",
            typeId = 21,
            typeName = "অণুর জ্যামিতিক আকৃতি ও মুক্তজোড় ইলেকট্রন",
            question = "কোন যৌগটি সরলরৈখিক নয়?",
            options = listOf("CO₂", "BeCl₂", "O₂", "H₂S"),
            correctIndex = 3,
            explanation = "H₂S অণুতে সালফারে দুটি নিঃসঙ্গ ইলেকট্রন জোড় থাকায় এটি বাঁকা বা কৌণিক (Bent/V-shape), সরলরৈখিক নয়।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t21_q4",
            typeId = 21,
            typeName = "অণুর জ্যামিতিক আকৃতি ও মুক্তজোড় ইলেকট্রন",
            question = "কোন অণুটির জ্যামিতিক আকৃতি সমতলীয় ত্রিকোণাকার?",
            options = listOf("CCl₄", "PH₃", "PCl₃", "BF₃"),
            correctIndex = 3,
            explanation = "BF₃ এ বোরনের কোনো লোন পেয়ার নেই এবং sp² সংকরণের কারণে এর আকৃতি সমতলীয় ত্রিকোণাকার।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t21_q5",
            typeId = 21,
            typeName = "অণুর জ্যামিতিক আকৃতি ও মুক্তজোড় ইলেকট্রন",
            question = "NH₃ অণুর আকৃতি কী?",
            options = listOf("টেট্রাহেড্রাল", "ট্রাইগোনাল প্ল্যানার", "ট্রাইগোনাল পিরামিডাল", "বাইপিরামিডাল"),
            correctIndex = 2,
            explanation = "NH₃ অণুতে ১ জোড়া নিঃসঙ্গ ইলেকট্রন ৩টি বন্ধনজোড়কে নিচের দিকে ঠেলে দেয়, ফলে এর আকৃতি ত্রিকোণাকার পিরামিডীয় হয়।",
            difficulty = Difficulty.EASY
        ),
        MCQQuestion(
            id = "t21_q6",
            typeId = 21,
            typeName = "অণুর জ্যামিতিক আকৃতি ও মুক্তজোড় ইলেকট্রন",
            question = "কোন যৌগের গঠন চতুস্তলকীয় নয়?",
            options = listOf("CCl₄", "NH₄⁺", "BH₄⁻", "SF₄"),
            correctIndex = 3,
            explanation = "SF₄ অণুতে ১টি মুক্তজোড় ইলেকট্রন থাকায় এর আকৃতি সী-স (See-saw) বা বিকৃত চতুস্তলকীয়, নিয়মিত চতুস্তলকীয় নয়।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t21_q7",
            typeId = 21,
            typeName = "অণুর জ্যামিতিক আকৃতি ও মুক্তজোড় ইলেকট্রন",
            question = "PF₅ এর জ্যামিতিক গঠন কোনটি?",
            options = listOf("ত্রিকোণাকার দ্বিপিরামিডীয়", "পঞ্চকোণীয় দ্বিপিরামিডীয়", "অষ্টতলকীয়", "ত্রিকোণাকার সমতলীয়"),
            correctIndex = 0,
            explanation = "PF₅ অণুর sp³d সংকরণের কারণে এর জ্যামিতিক গঠন ত্রিকোণাকার দ্বিপিরামিডীয় (Trigonal Bipyramidal)।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t21_q8",
            typeId = 21,
            typeName = "অণুর জ্যামিতিক আকৃতি ও মুক্তজোড় ইলেকট্রন",
            question = "কোন সেটের সবগুলো অণু ও মূলকের গঠন সরলরৈখিক?",
            options = listOf("CO₂, SO₂, NO₂⁻, N₃⁻", "CO₂, NO₂⁺, N₂F₂, NO₂", "CO₂, NO₂⁺, N₂F₂, C₂H₂", "CO₂, NO₂⁺, N₃⁻, C₂H₂"),
            correctIndex = 3,
            explanation = "CO₂ (O=C=O), NO₂⁺ (O=N⁺=O), N₃⁻ (N⁻=N⁺=N⁻) এবং C₂H₂ (H-C≡C-H) প্রত্যেকেরই sp সংকরণ এবং কেন্দ্রীয় পরমাণু লোন-পেয়ারহীন হওয়ায় সবাই সরলরৈখিক।",
            reference = "লিংকন স্যার",
            difficulty = Difficulty.HARD
        ),
        MCQQuestion(
            id = "t21_q9",
            typeId = 21,
            typeName = "অণুর জ্যামিতিক আকৃতি ও মুক্তজোড় ইলেকট্রন",
            question = "ক্লোরেট (ClO₃⁻) আয়নের লুইস কাঠামোর ক্লোরিন পরমাণুতে কত জোড়া নিঃসঙ্গ ইলেকট্রন যুগল রয়েছে?",
            options = listOf("0", "1", "2", "3"),
            correctIndex = 1,
            explanation = "ক্লোরিনের যোজ্যতা ইলেকট্রন ৭ + ১(চার্জ) = ৮। ৩টি অক্সিজেনের সাথে বন্ধন গঠনের পর ক্লোরিনে ঠিক ১ জোড়া (২টি) নিঃসঙ্গ ইলেকট্রন থাকে।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t21_q10",
            typeId = 21,
            typeName = "অণুর জ্যামিতিক আকৃতি ও মুক্তজোড় ইলেকট্রন",
            question = "XeF₆ যৌগে কতটি মুক্তজোড় ইলেকট্রন রয়েছে?",
            options = listOf("2", "3", "1", "0"),
            correctIndex = 2,
            explanation = "জেননের যোজ্যতা ইলেকট্রন ৮টি, ৬টি ফ্লোরিনের সাথে ৬টি বন্ধন গঠনের পর কেন্দ্রীয় জেনন পরমাণুতে ঠিক ১ জোড়া মুক্তজোড় ইলেকট্রন থাকে।",
            difficulty = Difficulty.MEDIUM
        ),
        MCQQuestion(
            id = "t21_q11",
            typeId = 21,
            typeName = "অণুর জ্যামিতিক আকৃতি ও মুক্তজোড় ইলেকট্রন",
            question = "নিচের কোনটির কেন্দ্রীয় পরমাণু সর্বাধিক সংখ্যক নিঃসঙ্গ ইলেকট্রন জোড় ধারণ করে?",
            options = listOf("ClO₃⁻", "H₂S", "XeF₄", "I₃⁻"),
            correctIndex = 3,
            explanation = "ট্রাইআয়োডাইড আয়নে (I₃⁻) কেন্দ্রীয় আয়োডিন পরমাণু ৩ জোড়া নিঃসঙ্গ ইলেকট্রন ধারণ করে যা প্রদত্ত অন্য সকলের চেয়ে বেশি।",
            reference = "হাজারী স্যার",
            difficulty = Difficulty.HARD
        )
    )
}
