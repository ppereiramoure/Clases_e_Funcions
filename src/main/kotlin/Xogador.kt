class Xogador : Seleccion {

    var dorsal:Int=0
    var demarcacion:String="Xogador"

    /**
     * @param nome nombre
     * @param apelido apelido
     * @param id numero de identificacion
     * @param edade años
     * @param dorsal numero da camiseta
     * @param demarcacion posición jugador
     */

    constructor(id: Int, nome: String, apelido: String, edade: Int, dorsal: Int, demarcacion: String) : super(
        id,
        nome,
        apelido,
        edade
    ) {
        this.dorsal = dorsal
        this.demarcacion = demarcacion
    }


    fun xogarPartido():Unit{
        println("XOGA")
    }
    fun entrenar():Unit{
        println("ENTRENA")
    }

    /**
     * @param tiempoConcentracion Tempo da duración da concentración
     */
    override fun concentrarse(tiempoConcentracion: Int): String {
        return "Concentrase a seleccion durante $tiempoConcentracion minutos"
    }

    override fun viaxar(pais: String): String {
        return return  "Viaxan os xogadores da seleccion $pais"
    }

    override fun toString(): String {
        return super.toString()+", dorsal=$dorsal, demarcacion='$demarcacion'"
    }

}