package com.example.myapplication

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.IconToggleButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun IconToggleButtonExample(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
    ) {
        IconToggleButton(checked = false, onCheckedChange = {}) {
            Icon(Icons.Default.Favorite, contentDescription = null)
        }
        IconToggleButton(checked = true, onCheckedChange = {}) {
            Icon(Icons.Default.Favorite, contentDescription = null)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewIconToggleButtonExample() {
    IconToggleButtonExample()
}