package acuario

fun crearAcuario() {
    val tanqueAcuario = TanqueAcuario()

    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()

    tanqueAcuario.agregarPez(tiburon)
    tanqueAcuario.agregarPez(pezPayaso)

    tanqueAcuario.mostrarPeces()
}

fun main() {
    crearAcuario()
}
