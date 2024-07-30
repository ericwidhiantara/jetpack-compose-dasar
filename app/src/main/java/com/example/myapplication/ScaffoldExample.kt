package com.example.myapplication

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun ScaffoldExample(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Text(
                            text = "Coba Scaffold",
                            style = TextStyle(fontSize = 16.sp),
                            modifier = Modifier
                                .padding(8.dp)
                                .align(Alignment.Center),
                            textAlign = TextAlign.Center
                        )
                    }
                },
                colors = TopAppBarColors(
                    containerColor = Color.Blue,
                    scrolledContainerColor = Color.Green,
                    navigationIconContentColor = Color.Red,
                    titleContentColor = Color.White,
                    actionIconContentColor = Color.Yellow
                )
            )
        },
        content = { paddingValues ->
            ColumnExample(modifier.padding(paddingValues))
        },
        floatingActionButton = {
            Button(
                onClick = { /*ss*/ }) {
                Icon(Icons.Default.Add, contentDescription = null)
            }
        }

    )
}

@Preview(showBackground = true)
@Composable
fun PreviewScaffoldExample() {
    ScaffoldExample()
}