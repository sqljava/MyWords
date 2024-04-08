package uz.sardor.noteapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavHost(
    navController: NavHostController,
) {
//    NavHost(
//        navController = navController,
//        startDestination = Screens.MainScreen.route
//    ) {
//        val mvm  = MainViewModel(MainModel(toDoDao))
//        composable(Screens.MainScreen.route) {
//            MainScreen(navController, mvm)
//        }
//
//        val addViewModel = AddViewModel(AddModel(toDoDao))
//        composable(Screens.AddScreen.route) {
//            AddScreen(navController, addViewModel)
//        }
//    }
}