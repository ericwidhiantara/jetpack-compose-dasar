package com.example.myapplication

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LazyHorizontalGridExample(modifier: Modifier = Modifier) {
    LazyHorizontalGrid(
        rows = GridCells.Fixed(3),
        modifier = modifier,
    ) {
        items(100) { index ->
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(10.dp),
                colors = ButtonDefaults.buttonColors().copy(
                    Color.Blue
                ),
                contentPadding = PaddingValues(5.dp),
                shape = ButtonDefaults.outlinedShape
            ) {
                Text(
                    text = "Index $index",
                    modifier = Modifier
                        .padding(10.dp),

                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = Color.White
                    ),
                    textAlign = TextAlign.Center
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLazyHorizontalGridExample() {
    LazyHorizontalGridExample()
}