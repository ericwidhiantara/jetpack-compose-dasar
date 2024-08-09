package com.example.myapplication

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun IconExample(modifier: Modifier = Modifier) {
    Icon(
        Icons.Default.Star,
        contentDescription = null,
        modifier = modifier
            .fillMaxSize()
            .size(200.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewIconExample() {
    IconExample()
}