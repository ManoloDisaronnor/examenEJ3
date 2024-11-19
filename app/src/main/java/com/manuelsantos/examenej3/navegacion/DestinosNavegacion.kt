package com.manuelsantos.examenej3.navegacion

import kotlinx.serialization.Serializable

@Serializable
object Inicio

@Serializable
object Login

@Serializable
data class Detalle(val nombre: String)