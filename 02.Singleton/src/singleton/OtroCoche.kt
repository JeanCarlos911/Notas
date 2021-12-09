package singleton

object OtroCoche {

    fun getOwnerName(): String {
        return "Brandon Yesid Santoya Cabrera"
    }

}

class prueba {
    init {
        OtroCoche.getOwnerName()
    }
}