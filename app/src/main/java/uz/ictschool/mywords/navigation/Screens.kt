package uz.sardor.noteapp.navigation

import androidx.compose.material3.Text

const val PASS_WORD_ID = "pass_word_id"

sealed class Screens (val route: String) {
    object HomeScreen: Screens("home_screen")

    object AddScreen: Screens("add_screen")

    object EditScreen: Screens("edit_screen/{$PASS_WORD_ID}"){
        fun passId(id: Int): String{
            return this.route.replace(
                oldValue = "{$PASS_WORD_ID}",
                newValue = id.toString()

            )
        }
    }



}