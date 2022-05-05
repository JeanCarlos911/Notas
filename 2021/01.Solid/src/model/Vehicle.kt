package model

import kotlin.random.Random

abstract class Vehicle {

    private var stock = 1

    private val model = this.getRandomModel()

    private val color: String = when (Random.nextInt(5)) {
        0 -> "blanco"
        1 -> "azul"
        2 -> "negro"
        3 -> "rojo"
        else -> "dorado"
    }

    fun getModel(): String {
        return model
    }

    fun getColor(): String {
        return color
    }

    fun getStock(): Int {
        return stock
    }

    fun increaseStock() {
        stock+= 1
    }

    abstract fun getRandomModel(): String

    abstract fun getGama(): String

    override fun toString(): String {
        return "Model: ${getModel()}\n" +
                "\tColor: ${getColor()}\n" +
                "\tGama: ${getGama()}\n" +
                "\tStock: ${getStock()}\n"
    }
}
