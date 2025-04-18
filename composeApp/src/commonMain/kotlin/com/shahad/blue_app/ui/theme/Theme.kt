import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import com.shahad.blue_app.ui.theme.black
import com.shahad.blue_app.ui.theme.grayDark
import com.shahad.blue_app.ui.theme.grayExtraLight
import com.shahad.blue_app.ui.theme.green
import com.shahad.blue_app.ui.theme.greenExtraLight
import com.shahad.blue_app.ui.theme.greenLight
import com.shahad.blue_app.ui.theme.purple
import com.shahad.blue_app.ui.theme.purpleExtraLight
import com.shahad.blue_app.ui.theme.purpleLight
import com.shahad.blue_app.ui.theme.red
import com.shahad.blue_app.ui.theme.redLight
import com.shahad.blue_app.ui.theme.white


val lightColors = lightColors(
    primary = purple,
    primaryVariant = purpleLight,
    secondary = green,
    secondaryVariant = greenLight,
    background = white,
    surface = grayExtraLight,
    error = red,
    onPrimary = white,
    onSecondary = black,
    onBackground = black,
    onSurface = black,
    onError = white
)

// Dark Theme.kt Colors
val darkColors = darkColors(
    primary = purpleLight,
    primaryVariant = purpleExtraLight,
    secondary = greenLight,
    secondaryVariant = greenExtraLight,
    background = black,
    surface = grayDark,
    error = redLight,
    onPrimary = black,
    onSecondary = white,
    onBackground = white,
    onSurface = white,
    onError = black
)