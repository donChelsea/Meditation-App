package com.example.meditationapp

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

data class Feature(
    val title: String,
    val imageVector: ImageVector,
    val lightColor: Color,
    val mediumColor: Color,
    val darkColor: Color
)
