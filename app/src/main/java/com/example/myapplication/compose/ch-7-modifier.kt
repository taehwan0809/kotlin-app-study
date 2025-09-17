package com.example.myapplication.compose


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
private fun ModifierExample(){
   Box(
       modifier = Modifier.fillMaxSize()) {
       Box(
           modifier =  Modifier

           .fillMaxSize()
           .height(60.dp)
           .clip(RoundedCornerShape(0.dp))
           .background(Color.Black)
           .clickable { },
       )

   }



}



@Preview(showBackground = true)
@Composable
private fun Preview(){
    MyApplicationTheme {
        ModifierExample()
    }
}