package com.example.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = ChemTealPrimaryDark,
    onPrimary = ChemTealOnPrimaryDark,
    primaryContainer = ChemTealContainerDark,
    onPrimaryContainer = ChemTealOnContainerDark,
    secondary = ChemIndigoSecondaryDark,
    tertiary = ChemAmberTertiaryDark,
    background = ChemDarkBackground,
    surface = ChemDarkSurface,
    surfaceVariant = ChemDarkSurfaceVariant,
    onBackground = ChemDarkOnBackground,
    onSurface = ChemDarkOnSurface,
    onSurfaceVariant = ChemDarkOnSurface
)

private val LightColorScheme = lightColorScheme(
    primary = ChemTealPrimaryLight,
    onPrimary = ChemTealOnPrimaryLight,
    primaryContainer = ChemTealContainerLight,
    onPrimaryContainer = ChemTealOnContainerLight,
    secondary = ChemIndigoSecondaryLight,
    tertiary = ChemAmberTertiaryLight,
    background = ChemLightBackground,
    surface = ChemLightSurface,
    surfaceVariant = ChemLightSurfaceVariant,
    onBackground = ChemLightOnBackground,
    onSurface = ChemLightOnSurface,
    onSurfaceVariant = ChemLightOnSurface
)

@Composable
fun ChemistryAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false, // Default to our custom polished chemistry palette
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
