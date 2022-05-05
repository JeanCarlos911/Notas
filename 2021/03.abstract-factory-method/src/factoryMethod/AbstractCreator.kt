package factoryMethod

import factory.Car

abstract class AbstractCreator {
    abstract fun factoryMethod(car: Car): AbstractClient

    fun build(car: Car): AbstractClient {
        return factoryMethod(car)
    }
}