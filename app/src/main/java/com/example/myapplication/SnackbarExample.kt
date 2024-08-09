package com.example.myapplication

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SnackbarExample(modifier: Modifier = Modifier) {
    val snackbarHostState = remember { SnackbarHostState() }
    val showSnackbar = remember {
        mutableStateOf(false)
    }

    Scaffold(
        modifier = modifier,
        snackbarHost = { SnackbarHost(snackbarHostState) },
    ) { innerPadding ->
        Button(
            modifier = modifier.padding(innerPadding),
            onClick = {
                showSnackbar.value = true
            }) {
            Text("Show Snackbar")
        }

        if (showSnackbar.value) {
            Snackbar(
                action = {
                    Button(onClick = {
                        showSnackbar.value = false
                    }) {
                        Text("Close")
                    }
                },
            ) {
                Text("Hello from Snackbar")
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewSnackbarExample() {
    SnackbarExample()
}