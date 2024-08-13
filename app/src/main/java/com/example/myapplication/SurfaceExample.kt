package com.example.myapplication

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SurfaceExample(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.padding(16.dp),
        color = MaterialTheme.colorScheme.primary,
        shape = RoundedCornerShape(8.dp),
    ) {
        Text(
            text = "Ini adalah surface",
            modifier = Modifier.padding(16.dp),
            color = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSurfaceExample() {
    SurfaceExample()
}