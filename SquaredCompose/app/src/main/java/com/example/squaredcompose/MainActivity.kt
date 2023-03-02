package com.example.squaredcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.squaredcompose.ui.theme.SquaredComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SquaredComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    AllCompDraw()
                }
            }
        }
    }
}

@Composable
fun ComposableDraw(title: String, txt: String, bg: Color, modifier: Modifier ){

    Column(modifier = modifier
        .fillMaxSize()
        .background(bg)
        .padding(bottom = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(text = txt,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun AllCompDraw() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.weight(1f)) {
            ComposableDraw(
                title = stringResource(R.string.TextC),
                txt = stringResource(R.string.TextT),
                bg = Color.Green,
                modifier = Modifier.weight(1f)
            )
            ComposableDraw(
                title = stringResource(R.string.ImageC),
                txt = stringResource(R.string.ImageT),
                bg = Color.Yellow,
                modifier = Modifier.weight(1f)
            )
        }
        Row(modifier = Modifier.weight(1f)) {
            ComposableDraw(
                title = stringResource(R.string.RowC),
                txt = stringResource(R.string.RowT),
                bg = Color.Cyan,
                modifier = Modifier.weight(1f)
            )
            ComposableDraw(
                title = stringResource(R.string.ColumnC),
                txt = stringResource(R.string.ColumnT),
                bg = Color.LightGray,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AllCompDrawPreview() {
    SquaredComposeTheme {
        AllCompDraw()
    }
}