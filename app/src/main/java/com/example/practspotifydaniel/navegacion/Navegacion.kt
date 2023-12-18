package com.example.practspotifydaniel.navegacion

import androidx.compose.runtime.Composable
import com.example.practspotifydaniel.pantallas.PantallaReproductor
import com.example.practspotifydaniel.shared.Rutas
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun GrafoNavegacion(){

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Rutas.Reproductor.ruta){

        composable(Rutas.Reproductor.ruta){
            PantallaReproductor(navController = navController)
        }

    }

}