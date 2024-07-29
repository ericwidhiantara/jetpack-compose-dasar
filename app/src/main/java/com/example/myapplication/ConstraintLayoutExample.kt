package com.example.myapplication

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun ConstraintLayoutExample(modifier: Modifier = Modifier) {
    ConstraintLayout(
    ) {
        // Create references for the composables to constrain
        val (button, text) = createRefs()
        Text(text = "New")

        Button(
            onClick = { /* Do something */ },
            // Assign reference "button" to the Button composable
            // and constrain it to the top of the ConstraintLayout
            modifier = modifier.constrainAs(button) {
                top.linkTo(parent.top, margin = 16.dp)
            }
        ) {
            Text("Button")
        }

        // Assign reference "text" to the Text composable
        // and constrain it to the bottom of the Button composable
        Text(
            "Text",
            modifier.constrainAs(text) {
                top.linkTo(button.bottom, margin = 16.dp)
            }
        )

        Text(text = "Old")
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewConstraintLayoutExample() {
    ConstraintLayoutExample()
}