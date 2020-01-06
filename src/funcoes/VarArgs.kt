package funcoes

fun ordenar(vararg numeros: Int): IntArray {
    return numeros.sortedArray()
}

fun ordenar(vararg numeros: Int, segundoParametro: Int): IntArray { // o vararg não precisa ser o ultimo
    return numeros.sortedArray()
}


fun main(args: Array<String>) {
    for(n in ordenar(38, 3, 456, 8, 51, 1, 88, 73)) { // pode ser nenhum também
        print("$n ")
    }

    println()

    for(n in ordenar(38, 3, 456, 8, 51, 1, 88, 73, segundoParametro = 1)) { // tem que nomear o outro parametro antes de passar
        print("$n ")
    }
}

