package com.example.myapplication

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AlertDialogExample(modifier: Modifier = Modifier) {
    val showDialog = remember {
        mutableStateOf(false)
    }

    Button(
        modifier = modifier,
        onClick = { showDialog.value = true }) {
        Text(text = "Show Alert Dialog")
    }

    if (showDialog.value) {
        AlertDialog(
            onDismissRequest = { showDialog.value = false },
            confirmButton = {
                Button(onClick = { showDialog.value = false }) {
                    Text("Confirm")
                }
            },
            dismissButton = {
                Button(onClick = { showDialog.value = false }) {
                    Text("Dismiss")
                }
            },
            text = { Text("This is a dialog text") },
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAlertDialogExample() {
    AlertDialogExample()
}