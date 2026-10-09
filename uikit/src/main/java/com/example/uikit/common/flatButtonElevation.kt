package com.example.uikit.common

import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
internal fun flatButtonElevation() = ButtonDefaults.buttonElevation(
    defaultElevation = 0.dp,
    pressedElevation = 0.dp,
    focusedElevation = 0.dp,
    hoveredElevation = 0.dp,
    disabledElevation = 0.dp,
)