package classes

class Filme3(nome: String, anoLancamento: Int, genero: String ) {
    val nome: String
    val anoLancamento: Int
    val genero: String

    init { // bloco de inicialização, ele tem acesso as variaveis criadas na inicialização da classe
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main() {
    val filme = Filme3("Os Incriveis", 2004, "Ação")
    println("${filme.nome} foi lançado em ${filme.anoLancamento}")
}