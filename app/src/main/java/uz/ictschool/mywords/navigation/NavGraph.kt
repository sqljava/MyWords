package uz.sardor.noteapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import uz.ictschool.mywords.screens.edit.AddView
import uz.ictschool.mywords.screens.edit.EditViewModel
import uz.ictschool.mywords.screens.home.HomeView
import uz.ictschool.mywords.screens.home.HomeViewModel

@Composable
fun AppNavHost(
    navController: NavHostController,
) {
    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = Screens.HomeScreen.route
    ) {
        composable(Screens.HomeScreen.route) {
            val viewModel = HomeViewModel(context)
            HomeView(viewModel, navController)
        }
        
        composable(Screens.AddScreen.route){
            val viewModel = EditViewModel(context, 0)
            AddView(viewModel = viewModel, navController = navController)
        }

        composable(route = Screens.EditScreen.route,
            arguments = listOf(navArgument(PASS_WORD_ID){
                type = NavType.IntType
            })
        ){navBackStackEntry ->

            val id = navBackStackEntry.arguments?.getInt(PASS_WORD_ID)!!
            val viewModel = EditViewModel(context, id)
        }

    }
}