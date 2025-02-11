import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MaterialsPage(onTopicSelected: (String) -> Unit) {
    val topics = listOf("Math", "Science", "History", "Literature")

    Scaffold {
        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "Select a Topic",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            topics.forEach { topic ->
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .clickable { onTopicSelected(topic) },
                    color = Color(0xFF03DAC5)
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Text(text = topic, fontSize = 18.sp, color = Color.White)
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewMaterialsPage() {
    MaterialsPage(onTopicSelected = {})
}
