package com.example.uikit.common

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageShader
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.graphics.drawOutline

internal fun Modifier.noiseBackground(
    color: Color,
    shape: Shape,
    noise: Boolean,
    noiseAlpha: Float = 0.5f,
): Modifier = drawWithCache {
    val brush = ShaderBrush(
        ImageShader(NoiseTexture.bitmap, TileMode.Repeated, TileMode.Repeated)
    )
    val outline = shape.createOutline(size, layoutDirection, this)
    onDrawBehind {
        drawOutline(outline, color)
        if (noise) {
            drawOutline(outline, brush, alpha = noiseAlpha, blendMode = BlendMode.Overlay)
        }
    }
}