class Adestrador : Seleccion {

    var idFederacion:String="0a"

    constructor(id: Int, nome: String, apelido: String, edade: Int, idFederacion: String) : super(
        id,
        nome,
        apelido,
        edade
    ) {
        this.idFederacion = idFederacion
    }
    fun dirixirPartido():Unit{
        println("MANDA")
    }
    fun dirixirAdestramento():Unit{
        println("MANDA2")
    }
    override fun concentrarse(tiempoConcentracion: Int): String {
        return "Concentrase a seleccion durante $tiempoConcentracion minutos"
    }
    override fun viaxar(pais: String): String {
        return  "Viaxan os xogadores da seleccion $pais"
    }
    override fun toString(): String {
        return super.toString()+", idFederacion='$idFederacion'"
    }
}