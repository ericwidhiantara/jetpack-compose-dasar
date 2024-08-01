package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LayoutExample(modifier: Modifier = Modifier) {
    Layout(
        content = {
            repeat(100) { index ->
                Text(
                    "Item $index",
                    modifier = modifier
                        .padding(8.dp)
                        .background(Color.Red)

                )

            }
        },
        modifier = modifier
    ) { measurables, constraints ->
        // Mengukur ukuran dari setiap child
        val placeables = measurables.map { measurable ->
            measurable.measure(constraints)
        }

        // Menghitung lebar dan tinggi layout berdasarkan child terbesar
        val layoutWidth = placeables.maxOfOrNull { it.width } ?: constraints.minWidth
        val layoutHeight = placeables.maxOfOrNull { it.height } ?: constraints.minHeight

        // Menentukan posisi untuk setiap child
        layout(layoutWidth, layoutHeight) {
            var yPosition = 0

            placeables.forEach { placeable ->
                placeable.placeRelative(x = 0, y = yPosition)
                yPosition += placeable.height
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLayoutExample(){
    LayoutExample()
}