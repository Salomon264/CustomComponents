package com.example.uikit.common

import androidx.compose.ui.graphics.ImageBitmap
import android.graphics.Bitmap
import androidx.compose.ui.graphics.asImageBitmap
import kotlin.random.Random


internal object NoiseTexture {
    private const val SIZE = 2048

    val bitmap: ImageBitmap by lazy {
        val random = Random(42)
        val pixels = IntArray(SIZE * SIZE) {
            val v = random.nextInt(1024)
            android.graphics.Color.argb(255, v, v, v)
        }
        Bitmap.createBitmap(
            pixels,
            SIZE,
            SIZE,
            Bitmap.Config.ARGB_8888
        ).asImageBitmap()
    }
}