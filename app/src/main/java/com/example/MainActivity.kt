package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.outlined.EmojiEvents
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.School
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.ui.screens.HomeScreen
import com.example.ui.screens.LeaderboardScreen
import com.example.ui.screens.ProfileScreen
import com.example.ui.screens.QuizResultScreen
import com.example.ui.screens.QuizScreen
import com.example.ui.screens.WrittenStudyScreen
import com.example.ui.theme.ChemistryAppTheme
import com.example.ui.viewmodel.MainViewModel
import com.example.ui.viewmodel.ScreenDestination

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val mainViewModel: MainViewModel = viewModel()
            val userProfile by mainViewModel.userProfile.collectAsState()

            val isDarkTheme = when (userProfile.darkThemeSetting) {
                "DARK" -> true
                "LIGHT" -> false
                else -> isSystemInDarkTheme()
            }

            ChemistryAppTheme(darkTheme = isDarkTheme) {
                ChemistryMainApp(viewModel = mainViewModel)
            }
        }
    }
}

@Composable
fun ChemistryMainApp(
    viewModel: MainViewModel,
    modifier: Modifier = Modifier
) {
    val currentScreen by viewModel.currentScreen.collectAsState()

    // Determine bottom nav active tab
    val activeNavTab = when (currentScreen) {
        is ScreenDestination.Home, is ScreenDestination.Quiz, is ScreenDestination.WrittenStudy, is ScreenDestination.QuizResult -> 0
        is ScreenDestination.Leaderboard -> 1
        is ScreenDestination.Profile -> 2
    }

    // Hardware Back Handler
    BackHandler(enabled = currentScreen !is ScreenDestination.Home) {
        when (currentScreen) {
            is ScreenDestination.Quiz -> viewModel.finishQuiz()
            is ScreenDestination.WrittenStudy, is ScreenDestination.QuizResult, is ScreenDestination.Leaderboard, is ScreenDestination.Profile -> {
                viewModel.navigateTo(ScreenDestination.Home)
            }
            else -> {}
        }
    }

    val showBottomNav = currentScreen is ScreenDestination.Home ||
            currentScreen is ScreenDestination.Leaderboard ||
            currentScreen is ScreenDestination.Profile

    Scaffold(
        modifier = modifier
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.safeDrawing),
        bottomBar = {
            if (showBottomNav) {
                NavigationBar(
                    modifier = Modifier.testTag("main_bottom_nav"),
                    windowInsets = WindowInsets.navigationBars
                ) {
                    NavigationBarItem(
                        selected = activeNavTab == 0,
                        onClick = { viewModel.navigateTo(ScreenDestination.Home) },
                        icon = {
                            Icon(
                                if (activeNavTab == 0) Icons.Filled.School else Icons.Outlined.School,
                                contentDescription = "টপিক ও টাইপ"
                            )
                        },
                        label = { Text("অনুশীলন") },
                        modifier = Modifier.testTag("nav_item_home")
                    )

                    NavigationBarItem(
                        selected = activeNavTab == 1,
                        onClick = { viewModel.navigateTo(ScreenDestination.Leaderboard) },
                        icon = {
                            Icon(
                                if (activeNavTab == 1) Icons.Filled.EmojiEvents else Icons.Outlined.EmojiEvents,
                                contentDescription = "লিডারবোর্ড"
                            )
                        },
                        label = { Text("লিডারবোর্ড") },
                        modifier = Modifier.testTag("nav_item_leaderboard")
                    )

                    NavigationBarItem(
                        selected = activeNavTab == 2,
                        onClick = { viewModel.navigateTo(ScreenDestination.Profile) },
                        icon = {
                            Icon(
                                if (activeNavTab == 2) Icons.Filled.Person else Icons.Outlined.Person,
                                contentDescription = "প্রোফাইল"
                            )
                        },
                        label = { Text("প্রোফাইল") },
                        modifier = Modifier.testTag("nav_item_profile")
                    )
                }
            }
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            when (val dest = currentScreen) {
                is ScreenDestination.Home -> {
                    HomeScreen(
                        viewModel = viewModel,
                        onNavigateToType = { typeId, isWritten ->
                            if (isWritten) {
                                viewModel.navigateTo(ScreenDestination.WrittenStudy(typeId))
                            } else {
                                viewModel.startQuiz(typeId)
                            }
                        },
                        onNavigateToProfile = {
                            viewModel.navigateTo(ScreenDestination.Profile)
                        }
                    )
                }

                is ScreenDestination.Quiz -> {
                    QuizScreen(
                        viewModel = viewModel,
                        onBack = { viewModel.navigateTo(ScreenDestination.Home) }
                    )
                }

                is ScreenDestination.WrittenStudy -> {
                    WrittenStudyScreen(
                        typeId = dest.typeId,
                        viewModel = viewModel,
                        onBack = { viewModel.navigateTo(ScreenDestination.Home) }
                    )
                }

                is ScreenDestination.QuizResult -> {
                    QuizResultScreen(
                        result = dest.result,
                        onRetry = { viewModel.startQuiz(dest.result.typeId) },
                        onHome = { viewModel.navigateTo(ScreenDestination.Home) },
                        onLeaderboard = { viewModel.navigateTo(ScreenDestination.Leaderboard) }
                    )
                }

                is ScreenDestination.Leaderboard -> {
                    LeaderboardScreen(viewModel = viewModel)
                }

                is ScreenDestination.Profile -> {
                    ProfileScreen(
                        viewModel = viewModel,
                        onNavigateToType = { typeId, isWritten ->
                            if (isWritten) {
                                viewModel.navigateTo(ScreenDestination.WrittenStudy(typeId))
                            } else {
                                viewModel.startQuiz(typeId)
                            }
                        }
                    )
                }
            }
        }
    }
}
