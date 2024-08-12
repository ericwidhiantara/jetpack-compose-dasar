package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SliderExample(modifier: Modifier = Modifier) {
    val value = remember {
        mutableFloatStateOf(0f)
    }
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Slider(value = value.floatValue, onValueChange = {
            value.floatValue = it
        })
        Text(text = "Geser untuk mengubah value")

        if (value.floatValue != 0f) {
            Text(text = "Value => ${value.floatValue}")

        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSliderExample() {
    SliderExample()
}