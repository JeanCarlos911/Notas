package factoryMethod

import factory.Car

class ConcreteCreator: AbstractCreator() {
    override fun factoryMethod(car: Car): AbstractClient {
        return ConcreteClient(car)
    }
}