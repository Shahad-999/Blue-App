package com.shahad.blue_app

import MainApp
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview
import ui.theme.SFTypography


@Composable
@Preview
fun App() {
    MaterialTheme(
        typography = SFTypography()
    ) {
        MainApp()
    }
}

