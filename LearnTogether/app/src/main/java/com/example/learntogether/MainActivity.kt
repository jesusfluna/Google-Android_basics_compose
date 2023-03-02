package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DrawResourceView(
                        stringResource(com.example.learntogether.R.string.title),
                        stringResource(com.example.learntogether.R.string.shortTxt),
                        stringResource(com.example.learntogether.R.string.longTxt)
                    )
                }
            }
        }
    }
}

@Composable
fun DrawResourceView(title: String, short:String, long: String){
    val image = painterResource(R.drawable.bg_compose_background)
    Box{
        Column{
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                contentScale = ContentScale.Crop
            )
            Column{
                Text(
                    text = title,
                    fontSize = 24.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(align = Alignment.Start)
                        .padding(start = 16.dp, top = 16.dp)
                )
                Text(
                    text = short,
                    fontSize = 18.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(align = Alignment.Start)
                        .padding(start = 16.dp, top = 16.dp)
                )
                Text(
                    text = long,
                    fontSize = 18.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(align = Alignment.Start)
                        .padding(start = 16.dp, top = 16.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DrawResourceViewPreview() {
    LearnTogetherTheme {
        DrawResourceView(
            stringResource(com.example.learntogether.R.string.title),
            stringResource(com.example.learntogether.R.string.shortTxt),
            stringResource(com.example.learntogether.R.string.longTxt)
        )
    }
}