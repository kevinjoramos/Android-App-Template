package kevinjoramos.androidapptemplate.ui.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import kevinjoramos.androidapptemplate.ui.viewmodel.TemplateViewModel

@Composable
fun TemplateScreen(
    viewModel: TemplateViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    Text(text = "Hello World! ~Kevin")
}