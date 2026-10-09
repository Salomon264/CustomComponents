package com.example.uikit.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.example.uikit.theme.DefaultTypography
import com.example.uikit.theme.UiKit
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uikit.common.flatButtonElevation
import com.example.uikit.common.noiseBackground
import com.example.uikit.theme.UiKitTheme


@Composable
public fun PrimaryBtn(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
    ) {
    UiKitTheme {
        val shape = RoundedCornerShape(8.dp)
        Button(
            onClick = onClick,
            enabled = enabled,
            elevation = flatButtonElevation(),
            shape = shape,
            colors = ButtonDefaults.buttonColors(
                containerColor = UiKit.colors.primary,
                contentColor = UiKit.colors.white,

            ),
            modifier = modifier
                .fillMaxWidth()
                .height(48.dp)
                .padding(horizontal = 20.dp)
                .noiseBackground(color = UiKit.colors.primary, noise = !enabled, shape = shape)
        ) {
            Text(
                text,
                color = UiKit.colors.white,
                style = DefaultTypography.bmedium,
                fontWeight = FontWeight.SemiBold,
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun BtnPreview() {
    PrimaryBtn(
        text = "Primary",
        onClick = {print("alkfn")},
        enabled = true,

    )
}