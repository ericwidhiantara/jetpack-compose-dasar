package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BoxWithConstraintsExample(modifier: Modifier = Modifier) {
    BoxWithConstraints(
        modifier = modifier
            .background(Color.Blue)
            .padding(22.dp)

    ) {
        val constraints = constraints
        Text(
            text = "Max Width: ${constraints.maxWidth}",
            modifier = Modifier.align(Alignment.Center),
            style = MaterialTheme.typography.bodyMedium.copy(
                color = Color.White
            )

        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBoxWithConstraintsExample() {
    BoxWithConstraintsExample()
}