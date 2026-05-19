package com.example.real_ak_pilsmineder

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.real_ak_pilsmineder.presentation.navigation.PilsNavHost
import com.example.real_ak_pilsmineder.presentation.screen.MainScreen
import com.example.real_ak_pilsmineder.presentation.theme.Real_Ak_pilsminederTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Real_Ak_pilsminederTheme {
              //  Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    //AuthorizationScreen()
                //    MainScreen(modifier = Modifier.padding(innerPadding))
                //}

                Surface(modifier = Modifier.fillMaxSize()) {
                    PilsNavHost()
                }
            }
        }
    }
}