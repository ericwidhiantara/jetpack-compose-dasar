package com.example.myapplication

import android.util.Log
import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ClickableTextExample(modifier: Modifier = Modifier, text: String = "") {
    ClickableText(text = AnnotatedString(text), modifier = modifier) { value ->
        // Handle click event
        Log.d("lol", "Clickable text clicked! index value $value")
    }


}

@Preview(showBackground = true)
@Composable
fun PreviewClickableTextExample() {
    ClickableTextExample(text = "Hello, World!")
}