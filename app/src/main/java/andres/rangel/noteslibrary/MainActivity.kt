package andres.rangel.noteslibrary

import andres.rangel.noteslibrary.ui.theme.NotesLibraryTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotesLibraryTheme {

            }
        }
    }
}