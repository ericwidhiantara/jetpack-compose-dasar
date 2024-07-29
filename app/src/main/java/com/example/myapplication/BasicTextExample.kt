package com.example.myapplication

import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun BasicTextExample(modifier: Modifier = Modifier) {
    BasicText(
        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus et sem in lacus cursus cursus. Aliquam consequat, urna nec finibus pharetra, felis erat sollicitudin libero, tristique venenatis elit magna at diam. Mauris venenatis ipsum quis feugiat hendrerit. Nullam venenatis feugiat nibh, eu fermentum justo efficitur quis. Etiam iaculis non eros quis dictum. Aenean consequat ligula ut diam ultricies, a lobortis augue vulputate. Praesent sapien augue, auctor eu scelerisque at, pulvinar nec tellus. Integer interdum arcu eget metus scelerisque scelerisque. Cras et neque dolor. In a turpis vitae dui gravida mattis. Nunc feugiat non velit et imperdiet. Ut sit amet euismod ante, sit amet viverra enim. Nunc ut laoreet tortor. Morbi luctus elementum turpis, sit amet lacinia augue sollicitudin vel.",
        style = MaterialTheme.typography.bodyMedium.copy(
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        ),
        color = { Color.Blue },
//        softWrap = true,
//        maxLines = 2,
//        overflow = TextOverflow.Ellipsis,

        modifier = modifier

    )
}

@Preview(showBackground = true)
@Composable
fun PreviewBasicTextExample() {
    BasicTextExample()
}