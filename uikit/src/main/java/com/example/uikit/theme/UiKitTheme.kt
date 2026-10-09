package com.example.uikit.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf

private val LocalColors = staticCompositionLocalOf<UiKitColors> {
    error("Оберните экран в UiKitTheme { } ")
}

object UiKit {
    val colors: UiKitColors
        @Composable get() = LocalColors.current
}

@Composable
fun UiKitTheme(
    colors: UiKitColors = LightColors(),
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(LocalColors provides colors, content = content)
}