package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DropdownExample(modifier: Modifier = Modifier) {
    val cars = listOf("Ferrari", "Lamborghini", "Aston Martin", "Pagani", "Bugatti", "Ford")

    val expanded = remember {
        mutableStateOf(false)
    }
    val selectedCar = remember {
        mutableStateOf("Ferarri")
    }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { expanded.value = true }) {
            Text("Select Car")
        }
        DropdownMenu(expanded = expanded.value, onDismissRequest = { expanded.value = false }) {
            cars.forEachIndexed { index, option ->
                DropdownMenuItem(
                    text = { Text(option) },
                    onClick = {
                        selectedCar.value = cars[index]
                        expanded.value = false
                    }
                )
            }
        }
        Text(text = "Selected Car => ${selectedCar.value}")
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewDropdownExample() {
    DropdownExample()
}