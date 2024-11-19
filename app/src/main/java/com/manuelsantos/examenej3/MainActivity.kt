package com.manuelsantos.examenej3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.manuelsantos.examenej3.navegacion.Navegacion
import com.manuelsantos.examenej3.ui.theme.ExamenEJ3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExamenEJ3Theme {
                Navegacion()
            }
        }
    }
}
