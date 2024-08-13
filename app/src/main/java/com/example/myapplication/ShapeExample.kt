package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ShapeExample(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Box(
            modifier = modifier.background(Color.Blue)
        ) {
            Text(text = "Shape", color = Color.White, modifier = Modifier.padding(16.dp))

        }
        Spacer(modifier = Modifier.padding(8.dp))
        Box(
            modifier = modifier.background(Color.Blue, CircleShape)
        ) {
            Text(text = "Circle Shape", color = Color.White, modifier = Modifier.padding(16.dp))

        }

        Spacer(modifier = Modifier.padding(8.dp))
        Box(
            modifier = modifier.background(Color.Blue, RoundedCornerShape(10.dp))
        ) {
            Text(
                text = "Rounded Corner Shape",
                color = Color.White,
                modifier = Modifier.padding(16.dp)
            )

        }

        Spacer(modifier = Modifier.padding(8.dp))
        Box(
            modifier = modifier.background(Color.Blue, CutCornerShape(10.dp))
        ) {
            Text(text = "Cut Corner Shape", color = Color.White, modifier = Modifier.padding(16.dp))

        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewShapeExample() {
    ShapeExample()
}