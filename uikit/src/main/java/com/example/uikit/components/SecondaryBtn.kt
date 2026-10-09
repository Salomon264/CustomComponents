package com.example.uikit.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uikit.common.flatButtonElevation
import com.example.uikit.theme.DefaultTypography
import com.example.uikit.theme.UiKit
import com.example.uikit.theme.UiKitTheme

@Composable
public fun SecondaryBtn(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {
    UiKitTheme {
        Button(
            onClick = onClick,
            enabled = enabled,
            elevation = flatButtonElevation(),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = UiKit.colors.primary
            ),
            modifier = modifier
                .height(48.dp)
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            border = BorderStroke(2.dp, UiKit.colors.primary)
        ) {
            Text(text, color = UiKit.colors.primary, style = DefaultTypography.bmedium)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun SecondaryBtn(){
    SecondaryBtn(
        text = "Secondary",
        onClick = {
            print("alknf")
        },
        modifier = Modifier,
        enabled = true
    )
}
