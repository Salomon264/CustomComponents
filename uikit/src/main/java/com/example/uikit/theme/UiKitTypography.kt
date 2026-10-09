package com.example.uikit.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Immutable
data class UiKitTypography(
    val h1: TextStyle,
    val subh: TextStyle,
    val bmedium: TextStyle,
    val bsmall: TextStyle,
    val flabel: TextStyle
)

internal val DefaultTypography = UiKitTypography(
    h1 = TextStyle(fontFamily = Manrope, fontSize = 24.sp, fontWeight = FontWeight.Bold),
    subh = TextStyle(fontFamily = Manrope, fontSize = 18.sp, fontWeight = FontWeight.SemiBold),
    bmedium = TextStyle(fontFamily = Manrope, fontSize = 16.sp, fontWeight = FontWeight.Normal),
    bsmall = TextStyle(fontFamily = Manrope, fontSize = 14.sp, fontWeight = FontWeight.Normal),
    flabel = TextStyle(fontFamily = Manrope, fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
)

