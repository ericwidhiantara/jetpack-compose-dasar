package com.example.myapplication

import android.util.Log
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ButtonExample(modifier: Modifier = Modifier) {
    Button(
        onClick = {
            Log.d("Tag", "Clicked")
        },
        modifier = modifier
    ) {
        Text(
            text = "Click Me"
        )

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewButtonExample() {
    ButtonExample()
}