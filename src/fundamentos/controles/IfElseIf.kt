package fundamentos.controles

fun main(args: Array<String>) {
    val nota: Double = 9.3
    // Usando operador range
    if (nota in 9..10) { //ele trunca para converter para Int
        println("Fantástico")
    } else if (nota in 7..8) {
        println("Parabéns")
    } else if (nota in 4..6) {
        println("Tem como recuperar")
    } else if (nota in 0..3) {
        println("Te vejo no próximo semestre")
    } else {
        println("Nota inválida")
    }

    println(5 in 7..4) //false sempre do menor para o maior
    println(5 in 7 downTo 4) //aqui ele faz o descending
}