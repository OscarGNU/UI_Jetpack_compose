package com.example.ui_jetpack_compose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            IntroLayout()
        }
    }
}

@Composable
@Preview
fun IntroLayout(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(R.color.orange)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Image(
            painter = painterResource(id = R.drawable.top_1),
            contentDescription = "",
            modifier = Modifier
                .wrapContentSize()
                .align(Alignment.Start)

        )
            Column (horizontalAlignment = Alignment.CenterHorizontally){

                Text(
                    text = "UiLover",
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White

                )

                Text(
                    text = "A vision for ther future with our channerl",
                    modifier = Modifier.padding(top = 16.dp),
                    color = Color.White
                )
            }

        Image(
            painter = painterResource(id = R.drawable.bottom_1),
            contentDescription = "",
            modifier = Modifier
                .wrapContentSize()
                .align(Alignment.Start)
        )
        
    }
}

