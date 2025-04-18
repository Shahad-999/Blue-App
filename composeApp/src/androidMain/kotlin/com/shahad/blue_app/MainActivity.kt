package com.shahad.blue_app

import LoginScreen

import android.content.res.Configuration
import android.content.res.Resources.Theme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

import androidx.compose.ui.tooling.preview.Devices.PIXEL_2
import androidx.compose.ui.tooling.preview.Devices.PIXEL_FOLD
import androidx.compose.ui.tooling.preview.Devices.PIXEL_TABLET
import androidx.compose.ui.tooling.preview.Preview
import com.shahad.blue_app.ui.theme.SFTypography
import darkColors
import lightColors

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}

@Composable

@PreviewLightAndDarkOnlyMobileDevicesScreenSizes()
fun AppAndroidPreview() {
    MaterialTheme(
//        typography = SFTypography(),
        colors = if (isSystemInDarkTheme()) darkColors else lightColors,
    ) {
        LoginScreen(
            navToHome = {}
        )
    }
}



@Retention(AnnotationRetention.BINARY)
@Target(
    AnnotationTarget.ANNOTATION_CLASS,
    AnnotationTarget.FUNCTION
)
@Preview(
    name = "Phone - Dark",
    device = PIXEL_2,
    showSystemUi = true,
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Preview(
    name = "Phone - Light",
    device =PIXEL_2,
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    showBackground = true,
)
@Preview(
    name = "Phone - Landscape - Dark",
    device =PIXEL_2,
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
)
@Preview(
    name = "Phone - Landscape - Light",
    device = PIXEL_2,
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    showBackground = true,
)
@Preview(
    name = "Unfolded Foldable - Dark",
    device = PIXEL_FOLD,
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Preview(
    name = "Unfolded Foldable - Light",
    device =PIXEL_FOLD,
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Preview(
    name = "Tablet - Dark",
    device = PIXEL_TABLET,
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Preview(
    name = "Tablet - Light",
    device = PIXEL_TABLET,
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
annotation class PreviewLightAndDarkOnlyMobileDevicesScreenSizes
