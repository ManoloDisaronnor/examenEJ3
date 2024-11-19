package com.manuelsantos.examenej3.ui.screens.pantallaLoginScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manuelsantos.examenej3.R
import com.manuelsantos.examenej3.scaffold.MyTopBar

@Composable
fun PantallaLoginScreen(navigateToDetalle: (String) -> Unit, navigateToBack: () -> Unit) {
    Scaffold(
        topBar = { MyTopBar { navigateToBack() } }
    ) { innerPadding ->
        var nombre by remember { mutableStateOf("") }
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(stringResource(id = R.string.Login), style = MaterialTheme.typography.titleLarge, fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.padding(vertical = 16.dp))
            TextField(
                value = nombre,
                onValueChange = { nombre = it },
                placeholder = { stringResource(id = R.string.placeHolderNombre) }
            )
            Spacer(modifier = Modifier.padding(vertical = 8.dp))
            Button(
                onClick = { navigateToDetalle(nombre) }
            ) {
                Text(stringResource(id = R.string.BotonLogin))
            }
        }
    }
}