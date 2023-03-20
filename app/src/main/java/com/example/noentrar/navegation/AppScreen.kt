package com.example.noentrar.navegation

sealed class AppScreen(val route: String){
    object SplasScreen: AppScreen("Splas_Screen")
    object MainScreen: AppScreen("Main_Screen")
}