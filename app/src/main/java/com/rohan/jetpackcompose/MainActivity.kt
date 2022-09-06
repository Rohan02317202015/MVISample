package com.rohan.jetpackcompose

import android.os.Bundle
import android.os.Parcelable
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.parcelize.Parcelize

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /*HelloText(counter.value){
                counter.value++
            }*/
        }
    }
}
@Composable
fun HelloText2(){
    val counter  = rememberSaveable() {
        mutableStateOf(0)
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Give it a try!",
                modifier = Modifier.padding(bottom = 8.dp),
                style = MaterialTheme.typography.h5
            )
            Button(onClick = {
                counter.value++
                println("On Button Clicked  --> ${counter.value}")
            }) {
                Text(text = "Click Me: ${counter.value}")
            }
        }
    }
}
@Composable
fun HelloText(counter: Int,onCounterInc :()-> Unit){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Give it a try!",
                modifier = Modifier.padding(bottom = 8.dp),
                style = MaterialTheme.typography.h5
            )
            Button(onClick = {
                onCounterInc()
                println("On Button Clicked  --> ${counter}")
            }) {
                Text(text = "Click Me: ${counter}")
            }
        }
    }
}
@Composable
fun HelloWorld(){
    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxSize()
            .border(10.dp, Color.Green)
            .padding(50.dp)
            .border(8.dp, Color.Blue, RoundedCornerShape(10.dp))
            .padding(50.dp)
            .border(5.dp, Color.Magenta, RoundedCornerShape(10.dp))
            .padding(5.dp)
        ,
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(text = "Hello", modifier = Modifier.padding(top = 10.dp, start = 10.dp))
        Text(text = "World", modifier = Modifier.padding(top = 10.dp, start = 10.dp))
    }
}

@Composable
@Preview
fun DefaultPreview(){
    MaterialTheme {
        HelloWorld()
    }
}


@Parcelize
data class SavedData(var name: String) : Parcelable