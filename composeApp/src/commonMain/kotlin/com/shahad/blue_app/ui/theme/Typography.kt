package com.shahad.blue_app.ui.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.Font
import blueapp.composeapp.generated.resources.Res
import blueapp.composeapp.generated.resources.*

@Composable
fun SFFontFamily() = FontFamily(
    Font(Res.font.sf_bold, weight = FontWeight.Bold),
    Font(Res.font.sf_regular, weight = FontWeight.Normal),
    Font(Res.font.sf_light, weight = FontWeight.Light),
    Font(Res.font.sf_meduim, weight = FontWeight.Medium),
    Font(Res.font.sf_semibold, weight = FontWeight.SemiBold),
)

@Composable
fun SFTypography(): Typography = Typography(
    defaultFontFamily = SFFontFamily(),
    h1 = Typography().h1.copy(
        fontFamily = SFFontFamily(),
        fontWeight = FontWeight.SemiBold,
        fontSize = androidx.compose.ui.unit.TextUnit.Unspecified,
        lineHeight = androidx.compose.ui.unit.TextUnit.Unspecified,
        letterSpacing = androidx.compose.ui.unit.TextUnit.Unspecified
    ),
    h2 = Typography().h2.copy(
        fontFamily = SFFontFamily(),
        fontWeight = FontWeight.SemiBold,
        fontSize = androidx.compose.ui.unit.TextUnit.Unspecified,
        lineHeight = androidx.compose.ui.unit.TextUnit.Unspecified,
        letterSpacing = androidx.compose.ui.unit.TextUnit.Unspecified
    ),
    h3 = Typography().h3.copy(
        fontFamily = SFFontFamily(),
        fontWeight = FontWeight.SemiBold,
        fontSize = androidx.compose.ui.unit.TextUnit.Unspecified,
        lineHeight = androidx.compose.ui.unit.TextUnit.Unspecified,
        letterSpacing = androidx.compose.ui.unit.TextUnit.Unspecified
    ),
    h4 = Typography().h4.copy(
        fontFamily = SFFontFamily(),
        fontWeight = FontWeight.SemiBold,
        fontSize = androidx.compose.ui.unit.TextUnit.Unspecified,
        lineHeight = androidx.compose.ui.unit.TextUnit.Unspecified,
        letterSpacing = androidx.compose.ui.unit.TextUnit.Unspecified
    ),
    h5 = Typography().h5.copy(
        fontFamily = SFFontFamily(),
        fontWeight = FontWeight.SemiBold,
        fontSize = androidx.compose.ui.unit.TextUnit.Unspecified,
        lineHeight = androidx.compose.ui.unit.TextUnit.Unspecified,
        letterSpacing = androidx.compose.ui.unit.TextUnit.Unspecified
    ),
    h6 = Typography().h6.copy(
        fontFamily = SFFontFamily(),
        fontWeight = FontWeight.SemiBold,
        fontSize = androidx.compose.ui.unit.TextUnit.Unspecified,
        lineHeight = androidx.compose.ui.unit.TextUnit.Unspecified,
        letterSpacing = androidx.compose.ui.unit.TextUnit.Unspecified
    ),
    subtitle1 = Typography().subtitle1.copy(
        fontFamily = SFFontFamily(),
        fontWeight = FontWeight.Normal,
        fontSize = androidx.compose.ui.unit.TextUnit.Unspecified,
        lineHeight = androidx.compose.ui.unit.TextUnit.Unspecified,
        letterSpacing = androidx.compose.ui.unit.TextUnit.Unspecified
    ),


)
