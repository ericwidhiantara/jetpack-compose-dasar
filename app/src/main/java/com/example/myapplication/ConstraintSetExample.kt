package com.example.myapplication

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet

@Composable
fun ConstraintSetExample(modifier: Modifier = Modifier) {
    val constraints = ConstraintSet {
        val text1 = createRefFor("text1")
        val text2 = createRefFor("text2")

        constrain(text1) {
            top.linkTo(parent.top, margin = 16.dp)
            start.linkTo(parent.start, margin = 16.dp)
        }

        constrain(text2) {
            top.linkTo(text1.bottom, margin = 16.dp)
            start.linkTo(parent.start, margin = 16.dp)
        }
    }

    ConstraintLayout(constraintSet = constraints, modifier = modifier.fillMaxSize()) {
        Text("Hello, World", Modifier.layoutId("text1"))
        Text("Let's learn Jetpack Compose", Modifier.layoutId("text2"))
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewConstraintSetExample() {
    ConstraintSetExample()
}