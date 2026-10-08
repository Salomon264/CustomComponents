package com.example.uikit.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import com.example.uikit.R

@Immutable
data class UiKitColors(
    val primary: Color,
    val secondary: Color,
    val tertial: Color,
    val error: Color,
    val white: Color,
    val black: Color,
    val grey: Color,
    val darkenWhite: Color
)

@Composable
internal fun LightColors() = UiKitColors (
    primary = colorResource(R.color.uikit_primary),
    secondary = colorResource(R.color.uikit_secondary),
    tertial = colorResource(R.color.uikit_tertiary),
    error = colorResource(R.color.uikit_error),
    white = colorResource(R.color.uikit_white),
    black = colorResource(R.color.uikit_black),
    grey = colorResource(R.color.uikit_grey),
    darkenWhite = colorResource(R.color.uikit_darkenwhite)
)

