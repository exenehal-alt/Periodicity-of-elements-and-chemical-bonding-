package com.example.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.BarChart
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.TableChart
import androidx.compose.material3.Badge
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.model.QuestionTypeInfo
import com.example.data.model.UserProfile
import com.example.data.repository.ChemistryQuestionsData

enum class ChartViewFilter(val labelBn: String) {
    ALL("সকল ২৮টি টাইপ"),
    STAR_ONLY("⭐ স্টার মার্ক টপিক (৭টি)"),
    CLUSTER_1("ক্লাস্টার ১ (১-১০)"),
    CLUSTER_2("ক্লাস্টার ২ (১১-২০)"),
    CLUSTER_3("ক্লাস্টার ৩ (২১-২৮)")
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun RechartsStyleVisualizer(
    userProfile: UserProfile,
    getTypeStats: (Int) -> Pair<Int, Int>, // returns Pair(solvedCount, correctCount)
    onNavigateToType: (Int, Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedFilter by remember { mutableStateOf(ChartViewFilter.ALL) }
    var selectedTopicForTooltip by remember { mutableStateOf<QuestionTypeInfo?>(null) }
    var searchQuery by remember { mutableStateOf("") }
    var tableFilter by remember { mutableStateOf(ChartViewFilter.ALL) }
    var activeTab by remember { mutableStateOf(0) } // 0 = Chart & Analytics, 1 = 28 Topics Table

    val allTopics = ChemistryQuestionsData.typeInfoList
    val starTopics = remember(allTopics) { allTopics.filter { it.starMark != null } }

    val filteredChartTopics = remember(selectedFilter, allTopics) {
        when (selectedFilter) {
            ChartViewFilter.ALL -> allTopics
            ChartViewFilter.STAR_ONLY -> allTopics.filter { it.starMark != null }
            ChartViewFilter.CLUSTER_1 -> allTopics.filter { it.cluster == 1 }
            ChartViewFilter.CLUSTER_2 -> allTopics.filter { it.cluster == 2 }
            ChartViewFilter.CLUSTER_3 -> allTopics.filter { it.cluster == 3 }
        }
    }

    val totalQuestionsInSyllabus = remember(allTopics) { allTopics.sumOf { it.totalQuestions } }
    val solvedQuestionsTotal = remember(userProfile, allTopics) {
        allTopics.sumOf { topic ->
            val (solved, _) = getTypeStats(topic.id)
            solved.coerceAtMost(topic.totalQuestions)
        }
    }
    val overallPercentage = if (totalQuestionsInSyllabus > 0) {
        ((solvedQuestionsTotal.toDouble() / totalQuestionsInSyllabus) * 100).toInt()
    } else 0

    Column(
        modifier = modifier
            .fillMaxWidth()
            .testTag("recharts_visualizer_root"),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Main Visualizer Header Card (Recharts Style Container)
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surface
            ),
            border = CardDefaults.outlinedCardBorder()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                // Title & Mode Selector
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Surface(
                            shape = CircleShape,
                            color = MaterialTheme.colorScheme.primaryContainer,
                            modifier = Modifier.size(36.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Default.BarChart,
                                    contentDescription = null,
                                    tint = MaterialTheme.colorScheme.primary,
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Text(
                                text = "শিখন অগ্রগতি ও পারফরম্যান্স ভিজ্যুয়ালাইজার",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "২৮টি রাসায়নিক বন্ধন ও পর্যায় সারণি টাইপ বিশ্লেষণ",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(14.dp))

                // Quick KPI Cards Row
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    KpiStatBadge(
                        title = "মোট প্রশ্ন",
                        value = "${totalQuestionsInSyllabus}টি",
                        subtext = "২৮টি টাইপে",
                        color = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.weight(1f)
                    )
                    KpiStatBadge(
                        title = "সম্পন্ন",
                        value = "${solvedQuestionsTotal}টি",
                        subtext = "${overallPercentage}% কভার",
                        color = Color(0xFF10B981),
                        modifier = Modifier.weight(1f)
                    )
                    KpiStatBadge(
                        title = "⭐ স্টার টপিক",
                        value = "${starTopics.size}টি",
                        subtext = "১২৫টি গুরুত্বপূর্ণ প্রশ্ন",
                        color = Color(0xFFF59E0B),
                        modifier = Modifier.weight(1f)
                    )
                }

                Spacer(modifier = Modifier.height(14.dp))

                // Progress Bar with Recharts-like gradient
                Column(modifier = Modifier.fillMaxWidth()) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "সামগ্রিক সিলেবাস আয়ত্তকরণ",
                            style = MaterialTheme.typography.labelMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Text(
                            text = "$overallPercentage%",
                            style = MaterialTheme.typography.labelLarge,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.primary
                        )
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    LinearProgressIndicator(
                        progress = { overallPercentage / 100f },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(8.dp)
                            .clip(RoundedCornerShape(4.dp)),
                        color = MaterialTheme.colorScheme.primary,
                        trackColor = MaterialTheme.colorScheme.surfaceVariant
                    )
                }

                Spacer(modifier = Modifier.height(14.dp))

                // Tab Switcher between Chart and Table
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f))
                        .padding(4.dp)
                ) {
                    val tabs = listOf("📊 চার্ট ও গ্রাফ ভিউ", "📋 সম্পূর্ণ ২৮টি টাইপ ছক")
                    tabs.forEachIndexed { index, label ->
                        val isSelected = activeTab == index
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(8.dp))
                                .background(if (isSelected) MaterialTheme.colorScheme.surface else Color.Transparent)
                                .clickable { activeTab = index }
                                .padding(vertical = 8.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = label,
                                style = MaterialTheme.typography.labelMedium,
                                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                color = if (isSelected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                }
            }
        }

        // TAB 0: CHART & ANALYTICS VIEW
        if (activeTab == 0) {
            // Interactive Bar Chart Card
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surface
                ),
                border = CardDefaults.outlinedCardBorder()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "টপিকভিত্তিক প্রশ্নের বণ্টন ও সমাধান অগ্রগতি",
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "বার-এ ট্যাপ করে তথ্য দেখুন",
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    // Recharts Legend
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .size(10.dp)
                                    .clip(RoundedCornerShape(2.dp))
                                    .background(MaterialTheme.colorScheme.surfaceVariant)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("মোট প্রশ্ন", style = MaterialTheme.typography.labelSmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                        }
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .size(10.dp)
                                    .clip(RoundedCornerShape(2.dp))
                                    .background(MaterialTheme.colorScheme.primary)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("সম্পন্ন প্রশ্ন", style = MaterialTheme.typography.labelSmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                        }
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text("⭐", fontSize = 10.sp)
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("স্টার টপিক", style = MaterialTheme.typography.labelSmall, color = Color(0xFFF59E0B))
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    // Filter Chips Row
                    LazyRowFilterChips(
                        selectedFilter = selectedFilter,
                        onFilterSelected = { selectedFilter = it }
                    )

                    Spacer(modifier = Modifier.height(14.dp))

                    // Horizontal Scrollable Bar Chart Canvas / Layout
                    InteractiveRechartsBarCanvas(
                        topics = filteredChartTopics,
                        selectedTopic = selectedTopicForTooltip,
                        getTypeStats = getTypeStats,
                        onSelectTopic = { selectedTopicForTooltip = it }
                    )

                    // Recharts Hover / Selected Tooltip Card
                    AnimatedVisibility(
                        visible = selectedTopicForTooltip != null,
                        enter = fadeIn(),
                        exit = fadeOut()
                    ) {
                        selectedTopicForTooltip?.let { topic ->
                            val (solved, correct) = getTypeStats(topic.id)
                            val accuracy = if (solved > 0) ((correct.toDouble() / solved) * 100).toInt() else 0
                            val pct = ((solved.toDouble() / topic.totalQuestions) * 100).toInt().coerceAtMost(100)

                            RechartsInteractiveTooltip(
                                topic = topic,
                                solved = solved,
                                accuracy = accuracy,
                                completionPercent = pct,
                                onClose = { selectedTopicForTooltip = null },
                                onPractice = { onNavigateToType(topic.id, topic.isWritten) }
                            )
                        }
                    }
                }
            }

            // Cluster Performance Breakdown Cards
            Text(
                text = "ক্লাস্টারভিত্তিক পারফরম্যান্স বিশ্লেষণ",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )

            ClusterBreakdownCard(
                clusterNumber = 1,
                clusterTitle = "ক্লাস্টার ১: পর্যায় সারণি, মৌল ও সাধারণ রসায়ন",
                typesRange = "টাইপ ১ থেকে ১০ (১০টি টাইপ)",
                topics = allTopics.filter { it.cluster == 1 },
                getTypeStats = getTypeStats,
                accentColor = Color(0xFF3B82F6),
                onSelectCluster = { selectedFilter = ChartViewFilter.CLUSTER_1 }
            )

            ClusterBreakdownCard(
                clusterNumber = 2,
                clusterTitle = "ক্লাস্টার ২: পর্যায়বৃত্ত ধর্ম, d-ব্লক ও সাধারণ বন্ধন",
                typesRange = "টাইপ ১১ থেকে ২০ (১০টি টাইপ)",
                topics = allTopics.filter { it.cluster == 2 },
                getTypeStats = getTypeStats,
                accentColor = Color(0xFF8B5CF6),
                starHighlight = "১টি সর্বাধিক গুরুত্বপূর্ণ টপিক (সংকরায়ন)",
                onSelectCluster = { selectedFilter = ChartViewFilter.CLUSTER_2 }
            )

            ClusterBreakdownCard(
                clusterNumber = 3,
                clusterTitle = "ক্লাস্টার ৩: আণবিক গঠন, সংকরায়ন, বিশেষ বল ও লিখিত",
                typesRange = "টাইপ ২১ থেকে ২৮ (৮টি টাইপ)",
                topics = allTopics.filter { it.cluster == 3 },
                getTypeStats = getTypeStats,
                accentColor = Color(0xFFEC4899),
                starHighlight = "৬টি অত্যন্ত/সর্বাধিক গুরুত্বপূর্ণ টপিক",
                onSelectCluster = { selectedFilter = ChartViewFilter.CLUSTER_3 }
            )

            // ⭐ 7 Super-Star Topics Spotlight Card
            StarTopicsSpotlightCard(
                starTopics = starTopics,
                getTypeStats = getTypeStats,
                onNavigateToType = onNavigateToType
            )
        }

        // TAB 1: 28 TOPICS COMPREHENSIVE TABLE
        if (activeTab == 1) {
            FullTopicsTableSection(
                allTopics = allTopics,
                searchQuery = searchQuery,
                onSearchChange = { searchQuery = it },
                tableFilter = tableFilter,
                onFilterChange = { tableFilter = it },
                getTypeStats = getTypeStats,
                onNavigateToType = onNavigateToType
            )
        }
    }
}

@Composable
private fun LazyRowFilterChips(
    selectedFilter: ChartViewFilter,
    onFilterSelected: (ChartViewFilter) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        ChartViewFilter.entries.forEach { filter ->
            val isSelected = selectedFilter == filter
            FilterChip(
                selected = isSelected,
                onClick = { onFilterSelected(filter) },
                label = {
                    Text(
                        text = filter.labelBn,
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal
                    )
                },
                colors = FilterChipDefaults.filterChipColors(
                    selectedContainerColor = MaterialTheme.colorScheme.primaryContainer,
                    selectedLabelColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            )
        }
    }
}

@Composable
private fun InteractiveRechartsBarCanvas(
    topics: List<QuestionTypeInfo>,
    selectedTopic: QuestionTypeInfo?,
    getTypeStats: (Int) -> Pair<Int, Int>,
    onSelectTopic: (QuestionTypeInfo) -> Unit
) {
    val maxQuestions = remember(topics) { (topics.maxOfOrNull { it.totalQuestions } ?: 30).coerceAtLeast(30) }
    val chartHeight = 160.dp

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.25f))
            .padding(12.dp)
    ) {
        // Cartesian Background Grid Lines
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(chartHeight),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            listOf(maxQuestions, (maxQuestions * 0.66).toInt(), (maxQuestions * 0.33).toInt(), 0).forEach { value ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "$value",
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.outline.copy(alpha = 0.6f),
                        fontSize = 9.sp,
                        modifier = Modifier.width(20.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(1.dp)
                            .background(MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f))
                    )
                }
            }
        }

        // Scrollable Bars
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 24.dp)
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.Bottom
        ) {
            topics.forEach { topic ->
                val (solved, _) = getTypeStats(topic.id)
                val isSelected = selectedTopic?.id == topic.id
                val hasStar = topic.starMark != null

                val totalRatio = topic.totalQuestions.toFloat() / maxQuestions
                val solvedRatio = (solved.toFloat() / maxQuestions).coerceAtMost(totalRatio)

                val barTotalHeight = (chartHeight.value * 0.8f * totalRatio).dp.coerceAtLeast(14.dp)
                val barSolvedHeight = (chartHeight.value * 0.8f * solvedRatio).dp.coerceAtLeast(if (solved > 0) 6.dp else 0.dp)

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .clickable { onSelectTopic(topic) }
                        .padding(horizontal = 2.dp)
                ) {
                    // Star indicator if marked
                    if (hasStar) {
                        Text(
                            text = "⭐",
                            fontSize = 11.sp,
                            modifier = Modifier.padding(bottom = 2.dp)
                        )
                    } else {
                        Spacer(modifier = Modifier.height(16.dp))
                    }

                    // Stacked Bar Container
                    Box(
                        modifier = Modifier
                            .width(22.dp)
                            .height(barTotalHeight)
                            .clip(RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp))
                            .background(
                                if (isSelected) MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
                                else MaterialTheme.colorScheme.surfaceVariant
                            )
                            .border(
                                width = if (isSelected) 2.dp else 0.dp,
                                color = if (isSelected) MaterialTheme.colorScheme.primary else Color.Transparent,
                                shape = RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp)
                            ),
                        contentAlignment = Alignment.BottomCenter
                    ) {
                        // Solved inner bar
                        if (solved > 0) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(barSolvedHeight)
                                    .clip(RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp))
                                    .background(
                                        Brush.verticalGradient(
                                            colors = listOf(
                                                MaterialTheme.colorScheme.primary,
                                                MaterialTheme.colorScheme.tertiary
                                            )
                                        )
                                    )
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(6.dp))

                    // Topic Label
                    Text(
                        text = "T${topic.id}",
                        style = MaterialTheme.typography.labelSmall,
                        fontSize = 10.sp,
                        fontWeight = if (isSelected || hasStar) FontWeight.Bold else FontWeight.Normal,
                        color = if (isSelected) MaterialTheme.colorScheme.primary
                        else if (hasStar) Color(0xFFD97706)
                        else MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
    }
}

@Composable
private fun RechartsInteractiveTooltip(
    topic: QuestionTypeInfo,
    solved: Int,
    accuracy: Int,
    completionPercent: Int,
    onClose: () -> Unit,
    onPractice: () -> Unit
) {
    ElevatedCard(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.elevatedCardColors(
            containerColor = MaterialTheme.colorScheme.surface
        )
    ) {
        Column(modifier = Modifier.padding(14.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = "টাইপ ${topic.id}: ${topic.title}",
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis
                        )
                    }

                    topic.starMark?.let { star ->
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = star,
                            style = MaterialTheme.typography.labelSmall,
                            color = Color(0xFFD97706),
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                IconButton(
                    onClick = onClose,
                    modifier = Modifier.size(24.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "বন্ধ করুন",
                        tint = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.size(16.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Recharts Metric Badges
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.5f),
                    modifier = Modifier.weight(1f)
                ) {
                    Column(modifier = Modifier.padding(8.dp)) {
                        Text("মোট প্রশ্ন", style = MaterialTheme.typography.labelSmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                        Text("${topic.totalQuestions}টি", style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.Bold)
                    }
                }

                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.5f),
                    modifier = Modifier.weight(1f)
                ) {
                    Column(modifier = Modifier.padding(8.dp)) {
                        Text("সমাধানকৃত", style = MaterialTheme.typography.labelSmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                        Text("$solved টি ($completionPercent%)", style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.Bold)
                    }
                }

                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = Color(0xFF10B981).copy(alpha = 0.15f),
                    modifier = Modifier.weight(1f)
                ) {
                    Column(modifier = Modifier.padding(8.dp)) {
                        Text("নির্ভুলতা", style = MaterialTheme.typography.labelSmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                        Text(if (solved > 0) "$accuracy%" else "০%", style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.Bold, color = Color(0xFF047857))
                    }
                }
            }

            if (topic.sessions.isNotEmpty()) {
                Spacer(modifier = Modifier.height(8.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "বিশ্ববিদ্যালয় ও সেশন: ",
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Text(
                        text = topic.sessions,
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSurface,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = onPractice,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(10.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = null,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = if (topic.isWritten) "লিখিত অনুশীলন শুরু করুন" else "এই টাইপের কুইজ শুরু করুন"
                )
            }
        }
    }
}

@Composable
private fun ClusterBreakdownCard(
    clusterNumber: Int,
    clusterTitle: String,
    typesRange: String,
    topics: List<QuestionTypeInfo>,
    getTypeStats: (Int) -> Pair<Int, Int>,
    accentColor: Color,
    starHighlight: String? = null,
    onSelectCluster: () -> Unit
) {
    val totalQuestions = topics.sumOf { it.totalQuestions }
    val solvedQuestions = topics.sumOf { getTypeStats(it.id).first.coerceAtMost(it.totalQuestions) }
    val percentage = if (totalQuestions > 0) ((solvedQuestions.toDouble() / totalQuestions) * 100).toInt() else 0

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        border = CardDefaults.outlinedCardBorder()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = clusterTitle,
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold,
                        color = accentColor
                    )
                    Text(
                        text = typesRange,
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }

                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = accentColor.copy(alpha = 0.12f)
                ) {
                    Text(
                        text = "$percentage% সম্পন্ন",
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.Bold,
                        color = accentColor,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }

            starHighlight?.let { starText ->
                Spacer(modifier = Modifier.height(6.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("⭐", fontSize = 12.sp)
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = starText,
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFD97706)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            LinearProgressIndicator(
                progress = { percentage / 100f },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(6.dp)
                    .clip(RoundedCornerShape(3.dp)),
                color = accentColor,
                trackColor = MaterialTheme.colorScheme.surfaceVariant
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "প্রশ্ন প্রগ্রেস: $solvedQuestions / $totalQuestions টি",
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                Text(
                    text = "চার্টে ফিল্টার করুন →",
                    style = MaterialTheme.typography.labelSmall,
                    color = accentColor,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.clickable { onSelectCluster() }
                )
            }
        }
    }
}

@Composable
private fun StarTopicsSpotlightCard(
    starTopics: List<QuestionTypeInfo>,
    getTypeStats: (Int) -> Pair<Int, Int>,
    onNavigateToType: (Int, Boolean) -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFFFFBEB) // Warm golden background
        ),
        border = BorderStroke(
            1.dp,
            Brush.horizontalGradient(
                listOf(Color(0xFFF59E0B), Color(0xFFD97706))
            )
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("⭐", fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(8.dp))
                    Column {
                        Text(
                            text = "সর্বাধিক গুরুত্বপূর্ণ স্টার মার্ক টপিকসমূহ",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF92400E)
                        )
                        Text(
                            text = "ভর্তি পরীক্ষার জন্য ১০০% আবশ্যিক ৭টি হাই-ইল্ড টপিক",
                            style = MaterialTheme.typography.labelSmall,
                            color = Color(0xFFB45309)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            starTopics.forEach { topic ->
                val (solved, _) = getTypeStats(topic.id)
                val isDone = solved >= topic.totalQuestions

                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .clickable { onNavigateToType(topic.id, topic.isWritten) },
                    color = Color.White.copy(alpha = 0.85f),
                    shape = RoundedCornerShape(12.dp),
                    border = CardDefaults.outlinedCardBorder()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(modifier = Modifier.weight(1f)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = "টাইপ ${topic.id}: ${topic.title}",
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFF1E293B)
                                )
                            }
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(
                                text = "${topic.starMark} • ${topic.totalQuestions}টি প্রশ্ন",
                                style = MaterialTheme.typography.labelSmall,
                                color = Color(0xFFD97706),
                                fontWeight = FontWeight.SemiBold
                            )
                            if (topic.sessions.isNotEmpty()) {
                                Text(
                                    text = topic.sessions,
                                    style = MaterialTheme.typography.labelSmall,
                                    color = Color(0xFF64748B),
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                            }
                        }

                        Spacer(modifier = Modifier.width(8.dp))

                        if (isDone) {
                            Icon(
                                imageVector = Icons.Default.CheckCircle,
                                contentDescription = "সম্পন্ন",
                                tint = Color(0xFF10B981),
                                modifier = Modifier.size(24.dp)
                            )
                        } else {
                            Surface(
                                shape = RoundedCornerShape(8.dp),
                                color = Color(0xFFF59E0B).copy(alpha = 0.15f)
                            ) {
                                Text(
                                    text = "$solved/${topic.totalQuestions}",
                                    style = MaterialTheme.typography.labelSmall,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFFB45309),
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun FullTopicsTableSection(
    allTopics: List<QuestionTypeInfo>,
    searchQuery: String,
    onSearchChange: (String) -> Unit,
    tableFilter: ChartViewFilter,
    onFilterChange: (ChartViewFilter) -> Unit,
    getTypeStats: (Int) -> Pair<Int, Int>,
    onNavigateToType: (Int, Boolean) -> Unit
) {
    val filteredList = remember(allTopics, searchQuery, tableFilter) {
        allTopics.filter { topic ->
            val matchesFilter = when (tableFilter) {
                ChartViewFilter.ALL -> true
                ChartViewFilter.STAR_ONLY -> topic.starMark != null
                ChartViewFilter.CLUSTER_1 -> topic.cluster == 1
                ChartViewFilter.CLUSTER_2 -> topic.cluster == 2
                ChartViewFilter.CLUSTER_3 -> topic.cluster == 3
            }
            val matchesSearch = searchQuery.isBlank() ||
                topic.title.contains(searchQuery, ignoreCase = true) ||
                topic.subtitle.contains(searchQuery, ignoreCase = true) ||
                topic.sessions.contains(searchQuery, ignoreCase = true) ||
                "টাইপ ${topic.id}".contains(searchQuery, ignoreCase = true)

            matchesFilter && matchesSearch
        }
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .testTag("full_topics_table_section"),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        // Table Title & Search
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            border = CardDefaults.outlinedCardBorder()
        ) {
            Column(modifier = Modifier.padding(14.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.TableChart,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "২৮টি টাইপের সুনির্দিষ্ট ছক ও তালিকা",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

                OutlinedTextField(
                    value = searchQuery,
                    onValueChange = onSearchChange,
                    modifier = Modifier
                        .fillMaxWidth()
                        .testTag("topics_table_search"),
                    placeholder = { Text("টপিক বা বিশ্ববিদ্যালয়ের নাম লিখে খুঁজুন (e.g. BUET, সংকরায়ন)...") },
                    leadingIcon = {
                        Icon(Icons.Default.Search, contentDescription = null, tint = MaterialTheme.colorScheme.onSurfaceVariant)
                    },
                    trailingIcon = {
                        if (searchQuery.isNotEmpty()) {
                            IconButton(onClick = { onSearchChange("") }) {
                                Icon(Icons.Default.Close, contentDescription = "Clear")
                            }
                        }
                    },
                    singleLine = true,
                    shape = RoundedCornerShape(12.dp)
                )

                Spacer(modifier = Modifier.height(10.dp))

                LazyRowFilterChips(
                    selectedFilter = tableFilter,
                    onFilterSelected = onFilterChange
                )
            }
        }

        // Table Header
        Surface(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            color = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.5f)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "ক্রম",
                    style = MaterialTheme.typography.labelSmall,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.width(36.dp)
                )
                Text(
                    text = "টাইপের নাম ও তথ্য",
                    style = MaterialTheme.typography.labelSmall,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(1f)
                )
                Text(
                    text = "প্রশ্ন",
                    style = MaterialTheme.typography.labelSmall,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.width(44.dp)
                )
                Text(
                    text = "অ্যাকশন",
                    style = MaterialTheme.typography.labelSmall,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.End,
                    modifier = Modifier.width(60.dp)
                )
            }
        }

        // Table Rows
        if (filteredList.isEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(32.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "কোনো টপিক পাওয়া যায়নি",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        } else {
            filteredList.forEachIndexed { index, topic ->
                TopicTableRowItem(
                    topic = topic,
                    getTypeStats = getTypeStats,
                    onPractice = { onNavigateToType(topic.id, topic.isWritten) }
                )
            }
        }
    }
}

@Composable
private fun TopicTableRowItem(
    topic: QuestionTypeInfo,
    getTypeStats: (Int) -> Pair<Int, Int>,
    onPractice: () -> Unit
) {
    val (solved, correct) = getTypeStats(topic.id)
    val hasStar = topic.starMark != null

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onPractice() }
            .testTag("topic_row_${topic.id}"),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (hasStar) Color(0xFFFFFBEB) else MaterialTheme.colorScheme.surface
        ),
        border = if (hasStar) {
            BorderStroke(1.dp, Brush.horizontalGradient(listOf(Color(0xFFF59E0B), Color(0xFFD97706))))
        } else {
            CardDefaults.outlinedCardBorder()
        }
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // ক্রম
                Surface(
                    shape = CircleShape,
                    color = if (hasStar) Color(0xFFF59E0B) else MaterialTheme.colorScheme.primaryContainer,
                    modifier = Modifier.size(28.dp)
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Text(
                            text = "${topic.id}",
                            style = MaterialTheme.typography.labelSmall,
                            fontWeight = FontWeight.Bold,
                            color = if (hasStar) Color.White else MaterialTheme.colorScheme.onPrimaryContainer
                        )
                    }
                }

                Spacer(modifier = Modifier.width(10.dp))

                // টাইপের নাম & স্টার মার্ক
                Column(modifier = Modifier.weight(1f)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = topic.title,
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        if (topic.isWritten) {
                            Spacer(modifier = Modifier.width(4.dp))
                            Surface(
                                shape = RoundedCornerShape(4.dp),
                                color = MaterialTheme.colorScheme.tertiaryContainer
                            ) {
                                Text(
                                    text = "লিখিত",
                                    style = MaterialTheme.typography.labelSmall,
                                    fontSize = 9.sp,
                                    modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp)
                                )
                            }
                        }
                    }

                    topic.starMark?.let { star ->
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = star,
                            style = MaterialTheme.typography.labelSmall,
                            color = Color(0xFFD97706),
                            fontWeight = FontWeight.Bold
                        )
                    }

                    if (topic.sessions.isNotEmpty()) {
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "🏛️ ${topic.sessions}",
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontSize = 11.sp,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                // প্রশ্নের সংখ্যা
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.width(48.dp)
                ) {
                    Text(
                        text = "${topic.totalQuestions}টি",
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = if (solved > 0) "($solved সলভ)" else "(০ সলভ)",
                        style = MaterialTheme.typography.labelSmall,
                        fontSize = 9.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }

                Spacer(modifier = Modifier.width(8.dp))

                // Action Arrow
                IconButton(
                    onClick = onPractice,
                    modifier = Modifier.size(32.dp)
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                        contentDescription = "অনুশীলন",
                        tint = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.size(18.dp)
                    )
                }
            }
        }
    }
}

@Composable
private fun KpiStatBadge(
    title: String,
    value: String,
    subtext: String,
    color: Color,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(12.dp),
        color = color.copy(alpha = 0.12f)
    ) {
        Column(
            modifier = Modifier.padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = value,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = color
            )
            Text(
                text = subtext,
                style = MaterialTheme.typography.labelSmall,
                fontSize = 9.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}
