package com.mkrdeveloper.jetpackimageexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mkrdeveloper.jetpackimageexample.ui.theme.JetpackImageExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackImageExampleTheme {
                ImageExample()
            }
        }
    }
}

@Composable
fun ImageExample(){
    Column(Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Image(painter = painterResource(id = R.drawable.persepolis) ,
            contentDescription = "pic",
            Modifier
                .padding(10.dp)
                //.size(200.dp)
                .width(295.dp)
                .height(200.dp)
                .clip(RoundedCornerShape(16.dp))
                .border(2.dp, Color.Red, shape = RoundedCornerShape(16.dp)),
           // alignment = Alignment.TopCenter
        contentScale = ContentScale.FillWidth,
            //alpha = .2f
        )
        Image(painter = painterResource(id = R.drawable.persepolis) ,
            contentDescription = "pic",
            Modifier
                .padding(10.dp)
                //.size(200.dp)
                .width(295.dp)
                .height(200.dp)
                .clip(CutCornerShape(16.dp))
                .border(2.dp, Color.Red, shape = CutCornerShape(16.dp)),
            // alignment = Alignment.TopCenter
            contentScale = ContentScale.FillWidth,
            //alpha = .2f
        )
        Image(painter = painterResource(id = R.drawable.persepolis) ,
            contentDescription = "pic",
            Modifier
                .padding(10.dp)
                .size(250.dp)
                .clip(CircleShape)
                .border(2.dp, Color.Red, shape = CircleShape),
            // alignment = Alignment.TopCenter
            contentScale = ContentScale.Crop,
            //alpha = .2f
        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackImageExampleTheme {
        ImageExample()
    }
}