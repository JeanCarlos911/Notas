package model

import kotlin.random.Random

class VehicleGamaAlta: Vehicle() {
    override fun getRandomModel(): String {
        return when (Random.nextInt(5)) {
            0 -> "Mercedes-Benz Class E"
            1 -> "BMW Series 5"
            2 -> "Audi A6"
            3 -> "Skoda Superb"
            else -> "Hyundai Grandeur"
        }
    }

    override fun getGama(): String {
        return "alta"
    }
}