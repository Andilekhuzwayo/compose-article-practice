package com.example.composearticle

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
                ComposeArticleImage()
            }
        }
    }
}

@Composable
fun ComposeArticleText(heading: String,firstParagraph1: String,secondParagraph2: String,modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(16.dp)
    ) {
        // heading text compose and layout of how thw text looks
        Text(
            text = heading,
            fontSize = 30.sp
        )
        Text(
            text = firstParagraph1
            ,textAlign = TextAlign.Center
        )
        Text(
            text = secondParagraph2
        )
    }
}

@Composable
fun ComposeArticleImage(modifier: Modifier = Modifier){
    val article = painterResource(R.drawable.bg_compose_background)
        Image(
            painter = article,
            contentDescription = null,
        )
}

@Preview(showBackground = true)
@Composable
fun ComposeArticlePreview() {
    ComposeArticleTheme {

        ComposeArticleText(heading = stringResource(R.string.article_heading),
            firstParagraph1 = stringResource(R.string.paragraph_one),
            secondParagraph2 = stringResource(R.string.paragraph_2))
    }
}