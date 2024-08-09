package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ImageExample(modifier: Modifier = Modifier) {

    Image(
        modifier = modifier
            .fillMaxSize()
            .padding(100.dp),
        painter = painterResource(id = R.drawable.ic_logo),
        contentDescription = null
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewImageExample() {
    ImageExample()
}