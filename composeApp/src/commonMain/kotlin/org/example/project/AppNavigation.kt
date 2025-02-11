import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController



@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "main") {
        composable("main") {
            MainPage(
                onNavigateToMaterials = { navController.navigate("materials") },
                onNavigateToQuizzes = { navController.navigate("quizzes") }
            )
        }
        composable("materials") {
            MaterialsPage { topic ->
                navController.navigate("materialDetail/$topic")
            }
        }
        composable("quizzes") {
            QuizzesPage { level ->
                // Handle level selection logic here
            }
        }
        composable("materialDetail/{topic}") { backStackEntry ->
            val topic = backStackEntry.arguments?.getString("topic") ?: "Unknown"
            val content = "This is the content for $topic." // Replace with DB query
            MaterialDetailPage(topic = topic, content = content)
        }
    }
}
