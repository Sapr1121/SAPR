package com.example.noentrar

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.noentrar.navegation.AppScreen
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController){
    LaunchedEffect(key1 = true){
        delay(5000)
        navController.popBackStack()
        navController.navigate(AppScreen.MainScreen.route)
    }

    splash()
}

@Composable
fun splash(){
    Column(
        Modifier.fillMaxSize().background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = painterResource(id = R.mipmap.ic_launcher_foreground),
            contentDescription = "Logo sebastian",
            Modifier.size(150.dp, 150.dp)
        )

    }

    Image(
        painter = painterResource(id = R.drawable.imagen1),
        contentDescription = "Mancha de pintura1",
        Modifier.offset(x=1.dp,y=20.dp).size(150.dp, 150.dp)
    )


}


@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){
    splash()
}