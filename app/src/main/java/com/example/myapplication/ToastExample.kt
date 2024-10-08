package com.example.myapplication

import android.widget.Toast
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ToastExample(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val showToast = remember {
        mutableStateOf(false)
    }

    Button(
        modifier = modifier,

        onClick = {
            showToast.value = true
        }) {
        Text("Show Toast")
    }

    if (showToast.value) {
        Toast.makeText(context, "This is toast", Toast.LENGTH_LONG).show()
        showToast.value = false
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewToastExample() {
    ToastExample()
}