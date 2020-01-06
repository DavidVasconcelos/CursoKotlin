package classes

class Cliente {
    var nome: String = ""
}

fun main(args: Array<String>) {
    var cliente = Cliente() //Assim que instacia e o construtor é implicito
    cliente.nome = "João" //acessar uma propriedade
    println("O cliente é ${cliente.nome}")
}