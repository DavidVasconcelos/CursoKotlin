package classes

class Clientes2 {
    constructor(nome: String) {
        this.nome = nome
    }

    var nome: String // os atributos são construidos primeiro, por isso pode declarar depois
        get() = "Meu nome é ${field}" // o field é o atributo relacionado
        set(value) { // value é o parametro apssado em set
            field = value.takeIf { value.isNotEmpty() } ?: "Anônimo" //takeif coloca uma exepressão que se for falsa retorna um valor nulo
        }

}

fun main(args: Array<String>) {
    val c1 = Clientes2("")
    println(c1.nome)

    val c2 = Clientes2("Pedro")
    println(c2.nome)
}