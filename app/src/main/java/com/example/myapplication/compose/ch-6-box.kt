package com.example.myapplication.compose


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
private fun BoxExample(){
    Box(modifier = Modifier
        .size(150.dp)
        .background(Color.Black),
        contentAlignment = Alignment.BottomCenter
    ){
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = "중앙 텍스트",
            color = Color.White
        )
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null
        )
    }
}



@Preview()
@Composable
private fun Preview(){
    MyApplicationTheme {
        BoxExample()
    }
}