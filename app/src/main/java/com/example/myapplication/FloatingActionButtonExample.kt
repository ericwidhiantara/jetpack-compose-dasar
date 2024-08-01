package com.example.myapplication

import android.util.Log
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FloatingActionButtonExample(modifier: Modifier = Modifier) {

    FloatingActionButton(
        onClick = {
            Log.d("Tag", "Clicked")
        },
        modifier = modifier
    ) {
        Icon(
            imageVector = Icons.Default.Favorite,
            contentDescription = "Favorite"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewFloatingActionButtonExample() {
    FloatingActionButtonExample()
}