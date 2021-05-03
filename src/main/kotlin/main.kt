fun main(args: Array<String>) {

    val xogador = Xogador(1, "Iker", "Casillas", 29, 1, "Portero")
    val adestrador = Adestrador(2, "Javier", "Torres", 40, "Entrenador")
    val xogador2 : Seleccion = Xogador(3, "Leo", "Messi", 33, 10, "Delantero")

    println(xogador)
    println(xogador2)
    println(adestrador)

    xogador.xogarPartido()
    adestrador.dirixirAdestramento()
}