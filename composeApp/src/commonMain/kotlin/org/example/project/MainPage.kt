import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun MainPage(onNavigateToMaterials: () -> Unit, onNavigateToQuizzes: () -> Unit) {
    Scaffold {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Materials Button
            IconButtonSection("Materials", onNavigateToMaterials)

            Spacer(modifier = Modifier.height(32.dp))

            // Quizzes Button
            IconButtonSection("Quizzes", onNavigateToQuizzes)
        }
    }
}

@Composable
fun IconButtonSection(label: String, onClick: () -> Unit) {
    Surface(
        modifier = Modifier
            .size(120.dp)
            .clickable(onClick = onClick),
        shape = CircleShape,
        color = Color(0xFF6200EE)
    ) {
        Box(contentAlignment = Alignment.Center) {
            Text(
                text = label,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }
}

@Preview
@Composable
fun PreviewMainPage() {
    MainPage(
        onNavigateToMaterials = {},
        onNavigateToQuizzes = {}
    )
}
