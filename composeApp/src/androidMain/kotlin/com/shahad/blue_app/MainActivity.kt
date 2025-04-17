package com.shahad.blue_app

import LoginScreen

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable

import androidx.compose.ui.tooling.preview.Devices.PIXEL_2
import androidx.compose.ui.tooling.preview.Devices.PIXEL_FOLD
import androidx.compose.ui.tooling.preview.Devices.PIXEL_TABLET
import androidx.compose.ui.tooling.preview.Preview

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
    LoginScreen(
        navToHome = {}
    )
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
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Preview(
    name = "Phone - Light",
    device =PIXEL_2,
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Preview(
    name = "Phone - Landscape - Dark",
    device =PIXEL_2,
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Preview(
    name = "Phone - Landscape - Light",
    device = PIXEL_2,
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO
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
