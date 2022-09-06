package com.rohan.jetpackcompose.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun AdaptiveRowItem(){
    Box(
        modifier = Modifier
            .background(color = Color.Magenta)
            .padding(5.dp)
    ){
        Row (
            modifier = Modifier
                .border(width = 1.dp, color = Color.LightGray)
                .fillMaxWidth()
        ){
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(50.dp)
                    .background(color = Color.Green)
            )
            Spacer(modifier = Modifier.width(12.dp))
            BoxWithConstraints(
                modifier = Modifier
                    .weight(1.5f)
                    .height(50.dp)
                    .background(color = Color.Blue)
                    .padding(vertical = 5.dp)
                ,
                contentAlignment = Alignment.BottomStart
            ){
                MyBoxWithConstraint()
            }
        }
    }
}
@Composable
fun BoxWithConstraintsScope.MyBoxWithConstraint(){
    val totalBadges = 8
    val badgeSize = 24.dp
    val paddings = 12.dp
    val numberOfBadgesToShow :Int = maxWidth.div(badgeSize + paddings).toInt().minus(1)
    val remainingBadges = totalBadges - numberOfBadgesToShow
    Row(
        horizontalArrangement = Arrangement.spacedBy(space = paddings),
        verticalAlignment = Alignment.CenterVertically
    ) {
        for (i in 1..numberOfBadgesToShow){
            Box (
                modifier = Modifier
                    .size(badgeSize)
                    .background(color = Color.Green)
            )
        }
        if(remainingBadges > 0){
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .size(badgeSize)
                    .background(color = Color.LightGray),
                contentAlignment = Alignment.Center
            ){
                Text(text = "+$remainingBadges")
            }
        }
    }
}
@Preview(widthDp = 400, heightDp = 800)
@Composable
fun previewBox(){
    AdaptiveRowItem()
}