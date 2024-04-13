package uz.ictschool.mywords.screens.edit

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.navigation.NavController
import uz.ictschool.mywords.localDatabse.entity.Word
import uz.sardor.noteapp.navigation.Screens

@Composable
fun AddView(viewModel: EditViewModel, navController: NavController){

    var wordName by remember {
        mutableStateOf("")
    }
    var wodrTranslation by remember {
        mutableStateOf("")
    }
    Column {
        TextField(value = wordName, onValueChange = {
            wordName = it
        })

        Button(onClick = {
            val word = Word(name = wordName, translation = "")
            viewModel.model.addWord(word)
            navController.navigate(Screens.HomeScreen.route)
        }) {
            Text(text = "add")
        }
    }


}