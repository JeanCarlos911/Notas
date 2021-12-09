package control

import model.Concesionario
import view.View
import kotlin.random.Random

class Control {
    private val concesionarios = mutableListOf<Concesionario>()
    private val view = View()

    init {
        adquirirConcesionarios()
        for (concesionario in concesionarios) {
            view.mostrarInformacion(concesionario.toString())
        }
    }

    private fun adquirirConcesionarios() {
        val cantidadDeConcesionarios = Random.nextInt(1, 5)

        for (i in 0 until cantidadDeConcesionarios) {
            concesionarios.add(Concesionario(i+1))
        }
    }
}