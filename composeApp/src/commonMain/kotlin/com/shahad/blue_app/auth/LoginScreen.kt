import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.Typography
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle


@Composable
fun LoginScreen(
    navToHome: () -> Unit,
) {

    Column(
        modifier = Modifier.fillMaxSize().background(color = MaterialTheme.colors.background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Welcome to the Login Screen", style = MaterialTheme.typography.subtitle1,
            color = MaterialTheme.colors.onBackground,)
        Button(onClick = navToHome) {
            Text("Login")
        }
    }

}

