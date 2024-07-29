package com.example.myapplication

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextExample(modifier: Modifier = Modifier, text: String = "") {
    val annotated = buildAnnotatedString {
        withStyle(MaterialTheme.typography.bodyMedium.toSpanStyle()) {
            append("Komang, ")
        }
        append("Eric ")
        withStyle(
            MaterialTheme.typography.bodyMedium.toSpanStyle().copy(fontWeight = FontWeight.Bold)
        ) {
            append("Widhi ")
        }
        withStyle(MaterialTheme.typography.bodyMedium.toSpanStyle()) {
            append("Antara")
        }
    }



    Text(
        text = "$annotated $text",
        modifier = modifier
            .background(Color.Green, shape = RoundedCornerShape(12.dp))
            .padding(16.dp)
            .clickable { Log.d("lol", "clicked") },
        color = Color.Blue,
        fontSize = 24.sp,
        fontStyle = MaterialTheme.typography.bodyMedium.fontStyle,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Monospace,
        letterSpacing = 0.5.sp,
        textDecoration = TextDecoration.LineThrough,
        textAlign = TextAlign.Center,
        lineHeight = 32.sp,
        overflow = TextOverflow.Ellipsis,
        softWrap = true,
        maxLines = 2,
        minLines = 1,
        onTextLayout = { value ->
            println("TextLayout: $value")
        },

        style = MaterialTheme.typography.bodyMedium.copy(
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewTextExample() {
    TextExample(text = "Hello, World!")
}