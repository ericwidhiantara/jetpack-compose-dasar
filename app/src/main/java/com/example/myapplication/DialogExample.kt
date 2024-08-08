package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog

@Composable
fun DialogExample(modifier: Modifier = Modifier) {
    val showDialog = remember {
        mutableStateOf(false)
    }

    Button(
        modifier = modifier,
        onClick = { showDialog.value = true }) {
        Text(text = "Show Dialog")
    }

    if (showDialog.value) {
        Dialog(
            onDismissRequest = { showDialog.value = false },

            ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.Red),
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        "Custom Dialog",
                        color = Color.White,
                        modifier = Modifier.padding(8.dp)
                    )
                    Button(onClick = {
                        showDialog.value = false
                    }) {
                        Text("Close Dialog")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDialogExample() {
    DialogExample()
}