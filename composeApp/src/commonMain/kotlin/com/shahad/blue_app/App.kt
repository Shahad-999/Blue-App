package com.shahad.blue_app

import MainApp
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview
import com.shahad.blue_app.ui.theme.SFTypography
import darkColors
import lightColors


@Composable
@Preview
fun App() {
    MaterialTheme(
        typography = SFTypography(),
        colors = if(isSystemInDarkTheme()) darkColors else lightColors,
    ) {
        MainApp()
    }
}

