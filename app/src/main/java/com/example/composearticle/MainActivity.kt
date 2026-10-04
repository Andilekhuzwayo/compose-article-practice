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
import androidx.compose.foundation.layout.fillMaxWidth
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
                ComposeArticleImage(heading = stringResource(R.string.article_heading),
                    firstParagraph1 = stringResource(R.string.paragraph_one),
                    secondParagraph2 = stringResource(R.string.paragraph_2))
            }
            }
        }
    }

@Composable
fun ComposeArticleText(heading: String, firstParagraph1: String, secondParagraph2: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier.padding(16.dp)
    ) {
        // heading text compose and layout of how the text looks
        Text(
            text = heading,
            fontSize = 20.sp
        )
        // paragraphs layout
        Text(
            text = firstParagraph1,
            textAlign = TextAlign.Justify
        )
        Text(
            text = secondParagraph2,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun ComposeArticleImage(heading: String, firstParagraph1: String, secondParagraph2: String, modifier: Modifier = Modifier){
    val article = painterResource(R.drawable.bg_compose_background)
    Column(modifier = modifier) {
        Image(
            painter = article,
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()
        )
        ComposeArticleText(heading = heading,
            firstParagraph1 = firstParagraph1,
            secondParagraph2 = secondParagraph2)
    }
}

// preview of the app
@Preview(showBackground = true)
@Composable
fun ComposeArticlePreview() {
    ComposeArticleTheme {
        ComposeArticleImage(heading = stringResource(R.string.article_heading),
            firstParagraph1 = stringResource(R.string.paragraph_one),
            secondParagraph2 = stringResource(R.string.paragraph_2))
    }
}