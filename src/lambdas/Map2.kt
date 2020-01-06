package lambdas

class Produto(val nome: String, val preco: Double)

val materialEscolar = listOf(
    Produto("Fichário escolar", 21.90),
    Produto("Lápis de cor", 11.90),
    Produto("Borracha bicolor", 0.70),
    Produto("Apontador com depósito", 1.80)
)

fun main(args: Array<String>) {
    val totalizar = { total: Double, atual: Double -> total + atual }
    var precoTotal = materialEscolar.map { it.preco }.reduce(totalizar) // o primeiro parametro é o acumulador e o segundo elemento é o valor que está sendo iterado

    println("O preço médio é R$ ${precoTotal / materialEscolar.size}.")
}