package classes

val diretamenteNoArquivo = "Bom dia" //da para acessar diretamente sem uma instancia

fun topLevel() { //também da para acessar diretamente sem uma instancia
    val local = "Fulano!"
    println("$diretamenteNoArquivo $local")
}

class Coisa {
    var variavelDeEstancia: String = "Boa noite"

    companion object {
        @JvmStatic val constanteDeClasse = "Ciclano" //foorçar algo estatico, um objeto singleton associado
    }

    fun fazer() {
        val local: Int = 7 //repete o nome mas o escopo é diferente

        if (local > 3) {
            var variavelDeBloco = "Beltrano"
            println("$variavelDeEstancia, $constanteDeClasse, $local e $variavelDeBloco!")
        }
    }

}

fun main(args: Array<String>) {
    topLevel()
    Coisa().fazer()
    println(Coisa.constanteDeClasse)
}