package com.example.practspotifydaniel.navegacion

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.practspotifydaniel.pantallas.PantallaReproductor
import com.example.practspotifydaniel.shared.Rutas
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.practspotifydaniel.shared.ReproductorViewModel

@Composable
fun GrafoNavegacion(){

    val navController = rememberNavController()

    val viewModelScaffold : ReproductorViewModel = viewModel()

    NavHost(navController = navController, startDestination = Rutas.Reproductor.ruta){

        composable(Rutas.Reproductor.ruta){
            PantallaReproductor(viewModelScaffold)
        }

    }

}