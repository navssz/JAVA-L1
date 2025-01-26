import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun QuizzesPage(onLevelSelected: (Int) -> Unit) {
    Scaffold {
        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "Choose a Level",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            for (level in 1..5) {
                Button(
                    onClick = { onLevelSelected(level) },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Level $level")
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewQuizzesPage() {
    QuizzesPage(onLevelSelected = {})
}
