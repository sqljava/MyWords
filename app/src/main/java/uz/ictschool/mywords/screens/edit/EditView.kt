package uz.ictschool.mywords.screens.edit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.navigation.NavController

@Composable
fun EditView(viewModel: EditViewModel, navController: NavController){
    val currentWord = viewModel.wordOnEdit.observeAsState().value!!


}