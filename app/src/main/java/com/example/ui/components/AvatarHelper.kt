package com.example.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material.icons.filled.Science
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class AvatarOption(
    val id: String,
    val nameBn: String,
    val icon: ImageVector,
    val bgColor: Color
)

object AvatarHelper {
    val options: List<AvatarOption> = listOf(
        AvatarOption("atom", "পরমাণু", Icons.Default.Science, Color(0xFF0F766E)),
        AvatarOption("flask", "ফ্লাস্ক", Icons.Default.Science, Color(0xFF0284C7)),
        AvatarOption("scientist", "বিজ্ঞানী", Icons.Default.Psychology, Color(0xFF7C3AED)),
        AvatarOption("molecule", "অণু", Icons.Default.AutoAwesome, Color(0xFF059669)),
        AvatarOption("trophy", "বিজয়ী", Icons.Default.EmojiEvents, Color(0xFFD97706)),
        AvatarOption("fire", "অগ্নি", Icons.Default.LocalFireDepartment, Color(0xFFDC2626)),
        AvatarOption("star", "নক্ষত্র", Icons.Default.Star, Color(0xFFEAB308))
    )

    fun getOption(id: String): AvatarOption {
        return options.find { it.id == id } ?: options.first()
    }
}

@Composable
fun UserAvatarView(
    avatarId: String,
    size: Dp = 48.dp,
    modifier: Modifier = Modifier
) {
    val option = AvatarHelper.getOption(avatarId)
    Box(
        modifier = modifier
            .size(size)
            .clip(CircleShape)
            .background(option.bgColor),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = option.icon,
            contentDescription = option.nameBn,
            tint = Color.White,
            modifier = Modifier.size(size * 0.58f)
        )
    }
}
