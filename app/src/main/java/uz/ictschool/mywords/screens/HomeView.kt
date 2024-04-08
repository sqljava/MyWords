package uz.ictschool.mywords.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.ictschool.mywords.ui.theme.myGreen

@Composable
fun HomeView(){

    Column(modifier = Modifier.fillMaxSize()) {

        HomeTopBar()




    }


}

@Composable
fun HomeTopBar(){

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
fun HomeWortItem(){

    Row(modifier = Modifier.fillMaxWidth()) {

        Text(text = "jgdvkjs")

    }
}

@Composable
@Preview(showBackground = true)
fun homeTest(){
    HomeTopBar()
}

