package model

import kotlin.random.Random

class Concesionario (private val ID: Int) {
    private val sucursales = mutableListOf<Sucursal>()

    init {
        adquirirSucursales()
    }

    private fun adquirirSucursales() {
        val cantidadDeSucursales = Random.nextInt(1, 10)
        for (i in 0 until cantidadDeSucursales) {
            sucursales.add(Sucursal(i+1))
        }
    }

    override fun toString(): String {
        var cadena = "- - - - - - - - Concesionario $ID - - - - - - - -\n"
        for (sucursal in sucursales) {
            cadena += sucursal.toString()
        }
        return cadena
    }
}