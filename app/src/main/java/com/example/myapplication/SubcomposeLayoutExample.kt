package com.example.myapplication

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SubComposeLayoutExample(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    SubcomposeLayout(modifier) { constraints ->
        // Memanggil fungsi subcompose untuk mengukur komponen-komponen anak
        val placeables = subcompose(slotId = "content") {
            content()
        }.map { measurable ->
            measurable.measure(constraints)
        }

        // Menghitung ukuran layout berdasarkan ukuran komponen-komponen anak
        val width = placeables.maxOfOrNull { it.width } ?: constraints.minWidth
        val height = placeables.maxOfOrNull { it.height } ?: constraints.minHeight

        // Mengembalikan hasil pengukuran layout
        layout(width, height) {
            // Menempatkan komponen-komponen anak sesuai dengan posisi masing-masing
            var xPosition = 0
            val yPosition = 0
            placeables.forEach { placeable ->
                placeable.place(x = xPosition, y = yPosition)
                xPosition += placeable.width
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewSubComposeLayoutExample() {
    SubComposeLayoutExample(){
        repeat(10){
            index ->
            Text("Item $index", modifier = Modifier.padding(8.dp))
        }
    }
}