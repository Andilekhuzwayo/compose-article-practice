package com.example.composearticle

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {

            }
        }
    }
}

@Composable
fun ComposeArticle(heading: String,firstParagraph1: String,secondParagraph2: String,modifier: Modifier = Modifier) {

}

@Composable
fun ComposeArticleImage(heading: String,firstParagraph1: String,secondParagraph2: String,modifier: Modifier = Modifier){
    val article = painterResource(R.drawable.bg_compose_background)
    Box {
        Image(
            painter = article,
            contentDescription = null,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeArticlePreview() {
    ComposeArticleTheme {

    }
}