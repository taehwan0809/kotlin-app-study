package com.example.myapplication.compose

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.R
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                ImageView()
            }
        }
    }
}

@Composable
fun TextView(){
    Text(
        text = "안녕하세요 안드로이드",
        color = Color.Red
    )
}

@Composable
fun ButtonView(){
    Button(
        onClick = {
        },

        content = {
            Text(text = "버튼입니다")
        }

    )
}

@Composable
fun ImageView() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = null
    )
}

@Composable
fun ColumnView(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ){
        ImageView()
        TextView()
        ButtonView()
    }
}

@Composable
fun RowView(){
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Bottom

    ){
        ButtonView()
        TextView()
        ImageView()
    }
}

@Composable
fun BoxView(){
    Box(
        contentAlignment = Alignment.TopEnd
    ){
        TextView()
        ImageView()
        ButtonView()
    }
}



@Preview(showBackground = true)
@Composable
fun Preview12() {
    MyApplicationTheme {
        TextView()

    }
}
@Preview(showBackground = true)
@Composable
fun Preview2(){
    MyApplicationTheme {
        ImageView()
    }
}
@Preview(showBackground = true)
@Composable
fun Preview3(){
    MyApplicationTheme {
        ButtonView()
    }
}


@Preview(showBackground = true)
@Composable
fun Preview4(){
    MyApplicationTheme {
        ColumnView()
    }
}

@Preview(showBackground = true)
@Composable
fun Preview5(){
    MyApplicationTheme {
        RowView()
    }
}

@Preview(showBackground = true)
@Composable
fun Preview6(){
    MyApplicationTheme {
        BoxView()
    }
}

