package com.example.practspotifydaniel.shared

sealed class Rutas(val ruta: String){
    object Reproductor : Rutas("reproductor")
}
