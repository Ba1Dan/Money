package com.example.ds.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun MoneyMaterialTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
//    val colors = if (darkTheme) {
//        DarkThemeColors
//    } else {
//        LightThemeColors
//    }

    CompositionLocalProvider(
        LocalMoneyTypography provides MoneyMaterialTheme.typography,
    ) {
        MaterialTheme(
            content = content
        )
    }
}


object MoneyMaterialTheme {
    val typography: MoneyTypography
        @Composable
        get() = LocalMoneyTypography.current
}