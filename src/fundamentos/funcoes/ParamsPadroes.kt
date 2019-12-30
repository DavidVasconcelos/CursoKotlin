package fundamentos.funcoes

fun main(args: Array<String>) {
    println(potencia(2, 3))
    println(potencia(10))
    println(potencia(base = 10))
    println(potencia(expoente = 8))
}

fun potencia(base: Int = 2, expoente: Int = 1): Int {
    return Math.pow(base.toDouble(), expoente.toDouble()).toInt()
}