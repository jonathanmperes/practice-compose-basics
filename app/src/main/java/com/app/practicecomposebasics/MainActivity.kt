package com.app.practicecomposebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.practicecomposebasics.ui.theme.PracticeComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticeComposeBasicsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ShowContentWithImage()
                }
            }
        }
    }
}

@Composable
fun ShowContentWithImage() {
    ContentWithImage(
        image = painterResource(id = R.drawable.bg_compose_background),
        title = stringResource(id = R.string.jetpack_title),
        description = stringResource(id = R.string.jetpack_description),
        text = stringResource(id = R.string.jetpack_text)
    )
}

@Composable
fun ContentWithImage(
    title: String,
    description: String,
    text: String,
    image: Painter,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Image(painter = image, contentDescription = null)
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = text,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ShowImagePreview() {
    PracticeComposeBasicsTheme {
        ShowContentWithImage()
    }
}