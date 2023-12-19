package com.example.practspotifydaniel.pantallas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowLeft
import androidx.compose.material.icons.filled.ArrowRight
import androidx.compose.material.icons.filled.Loop
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Repeat
import androidx.compose.material.icons.filled.Shuffle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Shapes
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.practspotifydaniel.R
import com.example.practspotifydaniel.shared.ReproductorViewModel


@Composable
fun PantallaReproductor(viewModelScaffold: ReproductorViewModel) {

    Column(
        modifier = Modifier.padding(0.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Now Playing"
        )
        Text(
            "cancion - autor"
        )
        Image(painterResource(id = R.drawable.miley), contentDescription = "",
            Modifier
                .fillMaxWidth()
                .height(200.dp))

        Box(modifier = Modifier.padding(16.dp)) {
            SliderFuncion()
        }


        Row(
            modifier = Modifier.padding(32.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

        }
        Row(

        ) {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent, contentColor = Color.Black)
            ) {
                Icon(imageVector = Icons.Default.Shuffle, contentDescription = "")

            }
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent, contentColor = Color.Black)
            ) {
                Icon(imageVector = Icons.Default.ArrowLeft, contentDescription = "")
            }
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(contentColor = Color.Black),
                shape = CircleShape
            ) {
                Icon(imageVector = Icons.Default.PlayArrow, contentDescription = "")
            }
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent, contentColor = Color.Black)
            ) {
                Icon(imageVector = Icons.Default.ArrowRight, contentDescription = "")
            }
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent, contentColor = Color.Black)
            ) {
                Icon(imageVector = Icons.Default.Repeat, contentDescription = "")
            }
        }

    }
}

@Composable
fun SliderFuncion() {
    var sliderPosition by remember {
        mutableFloatStateOf(0f)
    }

    Column {
        Slider(
            value = sliderPosition,
            onValueChange = { sliderPosition = it }
        )
        Text(text = sliderPosition.toString())
    }
}