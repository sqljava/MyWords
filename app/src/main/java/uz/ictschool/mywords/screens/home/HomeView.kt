package uz.ictschool.mywords.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import uz.ictschool.mywords.localDatabse.entity.Word
import uz.ictschool.mywords.ui.theme.myGreen
import uz.sardor.noteapp.navigation.Screens

@Composable
fun HomeView(viewModel: HomeViewModel, navController: NavController){

    val allWords = viewModel.allWords.observeAsState().value!!

    viewModel.updateData()


    Box(modifier = Modifier.fillMaxSize()) {

        Column(modifier = Modifier.fillMaxSize()) {

            HomeTopBar()

            LazyColumn {
                items(allWords){word->
                    HomeWortItem(word)
                }
            }
        }

        Box(modifier = Modifier
            .align(Alignment.BottomEnd)
            .padding(20.dp)
            .size(50.dp)
            .clip(CircleShape)
            .background(myGreen).clickable {
                homeAddBtnClicked(navController)
            }
            .padding(10.dp),
            contentAlignment = Alignment.Center){

            Text(text = "+",
                fontSize = 25.sp,
                color = Color.White)
        }
    }




}

private fun homeAddBtnClicked(navController: NavController) {
    navController.navigate(Screens.AddScreen.route)
}

@Composable
private fun HomeTopBar(){

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(myGreen)
            .padding(10.dp)){

        Column(modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {

            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center) {

                Text(text = "Words",
                    color = Color.White)
            }
            OutlinedTextField(value = "", onValueChange = {},Modifier.background(Color.White))

        }

    }
}

@Composable
private fun HomeWortItem(word: Word){

    Row(modifier = Modifier.fillMaxWidth()) {

        Text(text = word.name)

    }
}

@Composable
@Preview(showBackground = true)
private fun homeTest(){
    HomeTopBar()
}

