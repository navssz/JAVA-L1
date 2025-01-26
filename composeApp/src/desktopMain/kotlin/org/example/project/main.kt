import androidx.compose.runtime.Composable
import androidx.compose.ui.window.singleWindowApplication

fun main() = singleWindowApplication(title = "Your App Name") {
    AppContent()
}

@Composable
fun AppContent() {
    AppNavigation() // This calls your shared navigation Composable
}
