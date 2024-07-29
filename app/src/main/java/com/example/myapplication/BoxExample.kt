package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BoxExample(modifier: Modifier = Modifier) {
    //Box is like Stack in Flutter
    Box(
        modifier = modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center,
        propagateMinConstraints = false
    ) {
        Text(
            text = "Eric",
            modifier = Modifier
                .background(Color.Blue)
                .padding(18.dp)
        )
        Text(
            text = "Widhi",
            modifier = Modifier
                .background(Color.Red)
                .padding(5.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBoxExample() {
    BoxExample()
}