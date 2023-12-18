package com.example.practspotifydaniel.pantallas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.practspotifydaniel.R
import com.example.practspotifydaniel.shared.Rutas


@Composable
fun PantallaReproductor() {

    Column(
        modifier = Modifier.padding(32.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Now Playing"
        )
        Text(
            "Angels like you - Miley Cyrus"
        )
        painterResource(id = R.drawable.miley)
        SliderFuncion()
        Row(
            modifier = Modifier.padding(32.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

        }
        Row(

        ) {
            Button(onClick = { /*TODO*/ }) {

            }
            Button(onClick = { /*TODO*/ }) {

            }
            Button(onClick = { /*TODO*/ }) {

            }
            Button(onClick = { /*TODO*/ }) {

            }
            Button(onClick = { /*TODO*/ }) {

            }
        }

    }
}

@Composable
fun SliderFuncion() {
    var sliderPosition by remember { mutableFloatStateOf(0f) }

    Column {
        Slider(
            value = sliderPosition,
            onValueChange = { sliderPosition = it }
        )
        Text(text = sliderPosition.toString())
    }
}