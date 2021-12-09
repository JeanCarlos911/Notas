package model

import kotlin.random.Random

class VehicleGamaMedia: Vehicle() {
    override fun getRandomModel(): String {
        return when (Random.nextInt(5)) {
            0 -> "Chevrolet Joy"
            1 -> "Chevrolet Beat"
            2 -> "Chevrolet Spark GT 2021"
            3 -> "Fiat Mobi"
            else -> "Kia Picanto"
        }
    }

    override fun getGama(): String {
        return "media"
    }
}
