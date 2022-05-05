package model

import kotlin.random.Random

class Sucursal (private val ID: Int) {
    private val vehicles = mutableListOf<Vehicle>()

    init {
        adquirirVehiculos()
    }

    private fun adquirirVehiculos() {
        val cantidadDeVehiculos = Random.nextInt(30, 100)

        for (i in 0 until cantidadDeVehiculos) {
            val newVehicle: Vehicle = when(Random.nextInt(3)) {
                0 -> VehicleGamaAlta()
                1 -> VehicleGamaMedia()
                else -> VehicleGamaBaja()
            }

            for(j in vehicles.indices) {
                if(vehicles[j].getModel() == newVehicle.getModel() && vehicles[j].getColor() == newVehicle.getColor()) {
                    vehicles[j].increaseStock()
                    return
                }
            }
            vehicles.add(newVehicle)
            vehicles.sortBy { it.getModel() }
        }
    }

    override fun toString(): String {
        var cadena = "- - - - - Sucursal $ID - - - - -\n"
        for (vehiculo in vehicles) {
            cadena += vehiculo.toString()
        }
        return cadena
    }

}