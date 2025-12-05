package com.appweek13b

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            LazyColumn(
                modifier = Modifier
                    .background(color = Color.Cyan)
                    .fillMaxWidth()
            ) {
                items(90) { index ->
                    Text(text = "코틀린 ${index + 1}")
                }
            }
        }

//        setContent {
//            val scrollState = remeberScrollState
//            Column(){
//                modifier = Modifier
//                    .background(color = Color.Blue)
//                    .fillMaxWidth()
//                for(i in 1..90){
//                    Text("코틀린 $i")
//                }
//            }
//        }
    }
}

