package andres.rangel.note_item

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb

data class Note(
    val title: String = "No title",
    val content: String = "No content",
    val color: Int = Color.White.toArgb()
)