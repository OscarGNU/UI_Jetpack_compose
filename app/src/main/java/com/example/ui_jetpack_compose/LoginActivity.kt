package com.example.ui_jetpack_compose

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}

@Composable
@Preview
fun LoginScreen(){

    val scrillState = rememberScrollState()
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(scrillState)
    ){
            Image(
                painter = painterResource(R.drawable.top_2),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )

        Text(
            text = "UiLover",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.orange),
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center

        )

        Text(
            text = "Star Your Activity with us.",
            fontSize = 18.sp,
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Text(
            text = "Please Login",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 32.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Entre Your Email") },
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 12.dp)
                .fillMaxSize(),
            shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Entre Your Password") },
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 12.dp)
                .fillMaxSize(),
            shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
            Text(
                text = "Don´t Remember Password? Recovery it",
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(top = 16.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center
            )

        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 32.dp)
                .fillMaxWidth()
        ){
            Divider(modifier = Modifier.weight(1f), color = Color.Gray)

            Text(
                text = "or Login with",
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(horizontal = 24.dp)
            )
            Divider(modifier = Modifier.weight(1f), color = Color.Gray)
        }

        Button(
            onClick = {},
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 16.dp)
                .fillMaxSize()
                .height(50.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.blue))
        ) {
            Text(
                text="Login",
                fontSize = 24.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }

        Text(
            text = "Don´t have an account?",
            fontSize = 14.sp,
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Text(
            text = "Signup",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.blue),
            modifier = Modifier
                .padding(top = 14.dp, bottom = 16.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center
        )



    }
}