package com.example.taskcompleted

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskcompleted.ui.theme.TaskCompletedTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskCompletedTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CompletedTaskDraw(stringResource(R.string.completed), stringResource(R.string.nice))
                }
            }
        }
    }
}

@Composable
fun CompletedTaskDraw(principal: String, second: String) {
    val image = painterResource(id = R.drawable.ic_task_completed)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Text(
            text = principal,
            modifier = Modifier.padding(top = 25.dp, end = 8.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = second,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CompletedTaskDrawPreview() {
    TaskCompletedTheme {
        CompletedTaskDraw(stringResource(R.string.completed), stringResource(R.string.nice))
    }
}