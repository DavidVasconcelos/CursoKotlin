package fundamentos.operadores

import java.util.*

fun main(args: Array<String>) {
    println("Banana" === "Banana")
    println(3 !== 2)
    println(3 < 2)
    println(3 > 2)
    println(3 <= 2)
    println(3 >= 2)

    val d1 = Date(0)
    val d2 = Date(0)
    val d3 = d1

    // Igualdade referencial
    println("Resultado com '===' ${d1 === d2}") // mesma referencia de memoria, porque eu criei com duas instancias
    println("Resultado com '===' ${d1 === d3}") // true porque eu passei a referencia

    // Igualdade estrutural
    println("Resultado com '==' ${d1 == d2}") // esse chama o equals do objeto
    println("Resultado com 'equals' ${d1.equals(d2)}") // pede para refatorar para ==

}