package kevinjoramos.androidapptemplate.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SplashScreen() {
    Box(
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hello!",
            fontSize = 128.sp,
            fontWeight = FontWeight.Bold
        )
    }
}