package com.example.noentrar.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.noentrar.MainScreen
import com.example.noentrar.SplashScreen

@Composable
fun AppNavegation() {


    val navController = rememberNavController()
    NavHost(navController = navController,
            startDestination = AppScreen.SplasScreen.route){
        composable(AppScreen.SplasScreen.route){
            SplashScreen(navController)
        }
        composable(AppScreen.MainScreen.route){
            MainScreen()
        }
    }

}