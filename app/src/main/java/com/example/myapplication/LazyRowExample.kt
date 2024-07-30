package com.example.myapplication

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LazyRowExample(modifier: Modifier = Modifier) {
    LazyRow(
        modifier = modifier,
        contentPadding = PaddingValues(16.dp)
    ) {
        items(10) { index ->

            Button(
                onClick = {
                    println("Hello")
                },
                modifier = Modifier
                    .padding(end = 10.dp),
                shape = ButtonDefaults.outlinedShape,
                colors = ButtonDefaults.elevatedButtonColors().copy(
                    containerColor = Color.Red
                ),
            ) {
                Text(
                    text = "index $index",

                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = Color.White,
                        fontSize = 16.sp
                    )
                )
            }
        }

    }
}

@Preview(showBackground = false)
@Composable
fun PreviewLazyRowExample() {
    LazyRowExample()
}