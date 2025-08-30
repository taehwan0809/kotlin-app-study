package com.example.myapplication.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
private fun ImageExample(){
    Image(
        modifier = Modifier.size(200.dp),
        painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = "앱 아이콘",

    )
}


@Preview(showBackground = true, backgroundColor =  0xFF00FF00)
@Composable
private fun Preview(){
    MyApplicationTheme {
        ImageExample()
    }
}