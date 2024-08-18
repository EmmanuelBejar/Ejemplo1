package acuario

abstract class Pez {
    abstract val color: String
    abstract fun nadar()
}

interface AccionPez {
    fun comer()
}

class Tiburon : Pez(), AccionPez {
    override val color: String = "gris"

    override fun nadar() {
        println("El tiburón nada rápidamente.")
    }

    override fun comer() {
        println("cazar y comer peces")
    }
}

class PezPayaso : Pez(), AccionPez {
    override val color: String = "dorado"

    override fun nadar() {
        println("El pez payaso nada tranquilamente.")
    }

    override fun comer() {
        println("comer algas")
    }
}

class TanqueAcuario {
    private val peces: MutableList<Pez> = mutableListOf()

    fun agregarPez(pez: Pez) {
        peces.add(pez)
    }

    fun mostrarPeces() {
        for (pez in peces) {
            println("Pez de color: ${pez.color}")
            pez.nadar()
            if (pez is AccionPez) {
                pez.comer()
            }
            println()
        }
    }
}
