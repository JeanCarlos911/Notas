package factory

import component.Brakes
import component.Engine
import component.Suspension

abstract class Car {
    abstract fun createEngine(): Engine
    abstract fun createSuspension(): Suspension
    abstract fun createBrakes(): Brakes
}