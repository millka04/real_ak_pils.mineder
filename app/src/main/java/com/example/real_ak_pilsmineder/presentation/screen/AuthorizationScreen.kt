package com.example.real_ak_pilsmineder.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.real_ak_pilsmineder.presentation.navigation.Screen

@Composable
fun AuthorizationScreen(navController: NavController) {
    var nameInput by remember { mutableStateOf("") }
    var passwordInput by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier
                .padding(),
            text = "Добро пожаловать!"
            )
        Spacer(modifier = Modifier.height(12.dp))
        TextField(
            modifier = Modifier
                .padding(),
            onValueChange = {
                nameInput = it
            },
            value = nameInput,
            label = { Text("Имя") }
        )
        Spacer(modifier = Modifier.height(12.dp))
        TextField(
            modifier = Modifier
                .padding(),
            onValueChange = {
                passwordInput = it
            },
            value = passwordInput,
            label = { Text("Пароль") }
        )
        Spacer(modifier = Modifier.height(3.dp))
        Button(onClick = {navController.navigate(Screen.Main.route)}) {
            Text("Войти")
        }
    }
}