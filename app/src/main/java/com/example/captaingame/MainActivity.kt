package com.example.captaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.captaingame.ui.theme.CaptainGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaptainGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CaptainGame()
                }
            }
        }
    }

    @Composable
    fun CaptainGame() {
//        val treasuresFound = remember {
//            mutableStateOf(0)
//        }
        val treasuresFound by remember {
            mutableStateOf(0)
        }
        val direction = remember {
            mutableStateOf("North")
        }
        val stromOrTreasure = remember {
            mutableStateOf("")
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Tresures Found : ${treasuresFound}")
            Text(text = "Current Direction : ${direction.value}")
            Text(text = " ${stromOrTreasure.value}")
            Button(onClick = {
                direction.value = "East"
                if (Random.nextBoolean()){
                    treasuresFound.value+=1
                    stromOrTreasure.value = "WE FOUND TREASURE!!!"
                }else{
                    stromOrTreasure.value = "STROM AHED!!!"}
            }) {
                Text(text = "Sail East")
            }
            Button(onClick = {
                direction.value = "West"
                if (Random.nextBoolean()){
                    treasuresFound.value+=1
                    stromOrTreasure.value = "WE FOUND TREASURE!!!"
                }else{
                    stromOrTreasure.value = "STROM AHED!!!"}
            }) {
                Text(text = "Sail West")
            }
            Button(onClick = {
                direction.value = "North"
                if (Random.nextBoolean()){
                    treasuresFound.value+=1
                    stromOrTreasure.value = "WE FOUND TREASURE!!!"
                }else{
                    stromOrTreasure.value = "STROM AHED!!!"}
            }) {
                Text(text = "Sail North")
            }
            Button(onClick = {
                direction.value = "South"
                if (Random.nextBoolean()){
                    treasuresFound.value+=1
                    stromOrTreasure.value = "WE FOUND TREASURE!!!"
                }else{
                    stromOrTreasure.value = "STROM AHED!!!"}
            }) {
                Text(text = "Sail South")
            }
        }
        
    }
}


