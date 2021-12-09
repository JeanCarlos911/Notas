package model

import kotlin.random.Random

class VehicleGamaBaja: Vehicle() {
    override fun getRandomModel(): String {
        return when (Random.nextInt(5)) {
            0 -> "Volkswagen Gol Trendline MT"
            1 -> "Chevrolet Beat LS"
            2 -> "Suzuki Celerio"
            3 -> "Fiat Mobi Easy Pop"
            else -> "Kia Picanto Emotion 1.0L"
        }
    }

    override fun getGama(): String {
        return "baja"
    }
}
