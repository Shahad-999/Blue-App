import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.Login.route,
    ) {
        composable(Screen.Login.route) {
            LoginScreen(
                navToHome = {navController.navigate(Screen.Home.route)}
            )
        }
        composable(Screen.Home.route) {
            HomeScreen(
                navToLogin = {navController.navigate(Screen.Login.route) }
            )
        }

    }
}
