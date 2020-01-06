package classes

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val polegadas: Int)

fun main(args: Array<String>) {
    val g1 = Geladeira("Brastemp", 320)
    val g2 = Geladeira("Brastemp", 320)

    println(g1==g2)

    val tv1 = Televisao("Samsung", 32)
    val tv2 = Televisao("Samsung", 32)

    println(tv1==tv2) //true pq o data class implementa  equals pelos atributos
    println(tv1===tv2) //não são a mesma referencia em memória
    println(tv1.toString()) //tb implementado
    println(tv1.copy(polegadas = 42))  //cria uma copia, e tb dá para mudar somente um atributo

    // Destructuring em data class
    val (marca, pol) = tv1 //somente o data class faz isso
    println("$marca $pol")
}