package com.example.myapplication

import android.util.Log
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun IconButtonExample(modifier: Modifier = Modifier) {
    val isFavorite = remember {
        mutableStateOf(false)
    }
    IconButton(
        onClick = {
            Log.d("Tag", "Clicked")
            isFavorite.value = !isFavorite.value
        },
        modifier = modifier
    ) {
        if (isFavorite.value) {
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "Favorite"
            )
        } else {
            Icon(
                imageVector = Icons.Default.FavoriteBorder,
                contentDescription = "Favorite"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewIconButtonExample() {
    IconButtonExample()
}