package com.manuelsantos.examenej3.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.manuelsantos.examenej3.ui.screens.pantallaDetalleScreen.PantallaDetalleScreen
import com.manuelsantos.examenej3.ui.screens.pantallaInicioScreen.PantallaInicioScreen
import com.manuelsantos.examenej3.ui.screens.pantallaLoginScreen.PantallaLoginScreen

@Composable
fun Navegacion() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Inicio) {
        composable<Inicio> {
            PantallaInicioScreen { navController.navigate(Login) }
        }
        composable<Login> {
            PantallaLoginScreen({nombre -> navController.navigate(Detalle(nombre))} , {navController.popBackStack()})
        }
        composable<Detalle> { backStackEntry ->
            val entry = backStackEntry.toRoute<Detalle>()
            val nombreUsuario = entry.nombre
            PantallaDetalleScreen(nombreUsuario, {navController.navigate(Inicio)}, {navController.popBackStack()})
        }
    }
}