package com.example.personalcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.personalcard.ui.theme.PersonalCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PersonalCardTheme(){
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PrincipalDraw ()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PrincipalDraw(){
    Column(Modifier.background(Color(0xFF073042))){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(painter = painterResource(id = R.drawable.android_logo), contentDescription = "img")
            Text(text = stringResource(R.string.name), fontSize = 48.sp, color = Color.White)
            Text(text = stringResource(R.string.title), color = Color(0xFF3ddc84))

            Column(
                modifier = Modifier.fillMaxWidth().wrapContentWidth()
            ){
                Row(modifier = Modifier.padding(top = 16.dp)){
                    Icon(Icons.Rounded.Call, contentDescription = "Telephone", tint = Color.White, modifier = Modifier.wrapContentWidth(align = Alignment.Start))
                    Text(text = "+34954407448", color = Color.White, modifier = Modifier.wrapContentWidth(align = Alignment.End))
                }
                Row(modifier = Modifier.padding(top = 16.dp)){
                    Icon(Icons.Rounded.Share, contentDescription = "Social media", tint = Color.White)
                    Text(text = "@JohnDoe", color = Color.White)
                }
                Row(modifier = Modifier.padding(top = 16.dp, bottom = 24.dp)){
                    Icon(Icons.Rounded.Email, contentDescription = "Email", tint = Color.White)
                    Text(text = "JohnDoe@mail.com", color = Color.White)
                }
            }
        }
    }
}