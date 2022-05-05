package factoryMethod

import component.Brakes
import component.Engine
import component.Suspension
import factory.Car

class ConcreteClient(private val car: Car): AbstractClient() {

    private val engine: Engine
    private val suspension: Suspension
    private val brakes: Brakes

    init {
        engine = car.createEngine()
        suspension = car.createSuspension()
        brakes = car.createBrakes()
    }

    override fun run() {
        println("The car of model ${car.javaClass.toString().substring(14)} with the ${engine.javaClass.toString().substring(16)}, " +
                "${suspension.javaClass.toString().substring(16)} and ${brakes.javaClass.toString().substring(16)}" +
                " works correctly.")
    }

}