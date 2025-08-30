package com.example.myapplication.compose

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme


@Composable
private fun TextExample(){
    Text(
        text = "안녕하세요",
        fontSize = 24.sp,
        color = Color.Blue,
        fontWeight = FontWeight.Bold
    )
}


@Preview
@Composable
private fun Preview(){
    MyApplicationTheme {
        TextExample()
    }
}