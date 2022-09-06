package com.rohan.jetpackcompose.ui.theme

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class TextSizes(
    val extraSmallTextSize: Dp = 8.dp,
    val smallTextSize: Dp = 12.dp,
    val mediumTextSize: Dp = 14.dp,
    val largeTextSize: Dp = 18.dp,
    val extraLargeTextSize: Dp = 21.dp
)

data class Paddings(
    val standardTextPadding: Dp = 20.dp,
    val smallTextPadding: Dp = 8.dp
)

val LocalTextSize = compositionLocalOf { TextSizes() }
val LocalPaddings = compositionLocalOf { Paddings() }