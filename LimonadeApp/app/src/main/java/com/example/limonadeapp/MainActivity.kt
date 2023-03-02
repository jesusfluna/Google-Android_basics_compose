package com.example.limonadeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.limonadeapp.ui.theme.LimonadeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LimonadeAppTheme {
                LemonadeStartPreview()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LemonadeStartPreview() {
    var result by remember { mutableStateOf(1) }

    val imageResource = when(result){
        1 -> R.drawable.lemon_tree
        2 -> R.drawable.lemon_squeeze
        3 -> R.drawable.lemon_drink
        else -> R.drawable.lemon_restart
    }

    val txtResource = when(result){
        1 -> R.string.lemonTree
        2 -> R.string.lemonSqueeze
        3 -> R.string.lemonDrink
        else -> R.string.lemonRestart
    }

    Column(
        modifier = Modifier.fillMaxSize().wrapContentSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Text(text = stringResource(txtResource), fontSize = 18.sp)
        Button(onClick = {
            println("Button Lemon tree pressed")
        }, modifier = Modifier.padding(top = 16.dp)){
            Image(painter = painterResource (imageResource), contentDescription = "Lemon img")
        }
    }

}