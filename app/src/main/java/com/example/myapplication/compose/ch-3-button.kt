package com.example.myapplication.compose


import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
private fun ButtonExample(){
    Button(
        onClick = { println("버튼 클릭") },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Magenta,
            contentColor = Color.Black
        ),
            shape = RoundedCornerShape(0.dp)
    ){
        Text(text = "눌러보세요")
    }



}


@Preview()
@Composable
private fun Preview(){
    MyApplicationTheme {
        ButtonExample()
    }
}