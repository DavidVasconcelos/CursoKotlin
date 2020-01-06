package lambdas

fun main(args: Array<String>) {
    val soma = { x: Int, y: Int ->
        "Ola" // exemplo
        1 + 3 // exemplo
        x + y // o retorno é implicito da ultima linha de execução
    }
    println(soma(4,6))
}