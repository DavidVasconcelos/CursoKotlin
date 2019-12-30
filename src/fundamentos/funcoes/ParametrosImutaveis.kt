package fundamentos.funcoes

fun incremento(num: Int) { //
    //num++ // Erro! Todos os parametros são constantes, você não consegue alterar a refênrencia deles
}

fun main(args: Array<String>) {
    incremento(3)
}