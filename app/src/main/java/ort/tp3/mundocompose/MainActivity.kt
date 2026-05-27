package ort.tp3.mundocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import ort.tp3.mundocompose.ui.theme.HolaMundoComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HolaMundoComposeTheme {
                MainApp()
            }
        }
    }
}

@Composable
fun MainApp() {
    var currentScreen by remember { mutableStateOf("welcome") }

    when (currentScreen) {
        "welcome" -> WelcomeScreen(
            onLoginClick = { currentScreen = "login" },
            onRegisterClick = { currentScreen = "register" }
        )
        "login" -> LoginScreen(
            onBackClick = { currentScreen = "welcome" },
            onCreateAccountClick = { currentScreen = "register" }
        )
        "register" -> RegisterScreen(
            onBackClick = { currentScreen = "welcome" },
            onLoginClick = { currentScreen = "login" }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreviewMain() {
    HolaMundoComposeTheme {
        MainApp()
    }
}
