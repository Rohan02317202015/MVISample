package com.rohan.jetpackcompose.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyCustomBox(){
    Box(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier
            .background(Color.Blue)
            .verticalScroll(rememberScrollState())
            .widthIn(0.dp,200.dp)
        ) {
            Text(text = "I Love Compose",
                fontSize = 72.sp
            )
        }
    }

}
@Preview(showBackground = true)
@Composable
fun preview(){
    MyCustomBox()
}