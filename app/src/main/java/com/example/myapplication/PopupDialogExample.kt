package com.example.myapplication

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup

@Composable
fun PopupDialogExample(modifier: Modifier = Modifier) {

    val showPopup = remember {
        mutableStateOf(false)
    }

    Button(
        modifier = modifier,
        onClick = {
            showPopup.value = true
        }
    ) {
        Text(text = "Show Pop up")
    }

    if (showPopup.value) {
        Popup(
            alignment = Alignment.BottomEnd,
            onDismissRequest = { showPopup.value = false }) {
            Text("Ini adalah Popup", Modifier.padding(16.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPopupDialogExample() {
    PopupDialogExample()
}