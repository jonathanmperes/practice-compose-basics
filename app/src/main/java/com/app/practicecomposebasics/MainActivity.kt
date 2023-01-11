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
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.resolveDefaults
import androidx.compose.ui.text.style.TextAlign.Companion.Justify
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
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(),
        )
        ShowTitle()
        ShowDescription()
        ShowText()
    }
}

@Composable
fun ShowTitle() {
    Text(
        text = stringResource(R.string.jetpack_title),
        fontSize = 24.sp,
        textAlign = Justify,
        modifier = Modifier
            .padding(all = 16.dp)
    )
}

@Composable
fun ShowDescription() {
    Text(
        text = stringResource(R.string.jetpack_description),
        textAlign = Justify,
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp)
    )
}

@Composable
fun ShowText() {
    Text(
        text = stringResource(R.string.jetpack_text),
        textAlign = Justify,
        modifier = Modifier
            .padding(all = 16.dp)
    )
}


@Preview(showBackground = true)
@Composable
fun ShowImagePreview() {
    PracticeComposeBasicsTheme {
        ShowContentWithImage()
    }
}