package fundamentos

fun main(args: Array<String>) {
    val notas = arrayOf(9.6, 3.8, 7.2, 5.5, 4.1)

    for (nota in notas) {
        imprimirConceito(nota.toInt())
    }
}

fun imprimirConceito(nota: Int) {
    when(nota as? Int){ // com o ? ele tenta fazer o cast e se não der retorna nulo sem lançar execption
        10, 9 -> println("A")
        8, 7 -> println("B")
        6, 5 -> println("C")
        4, 3 -> println("D")
        2, 1, 0 -> println("E")
        else -> println("Nota inválida")
    }
}
