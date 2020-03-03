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

    val reduceTotal = materialEscolar.map { it.preco }.reduce {

            acumulador, valor ->
        println("Accumulador -> $acumulador e o valor -> $valor")
        totalizar(acumulador, valor)
    }

    println("Com reduce o total é R$ $reduceTotal.")

    val fold = 10.0

    println("Com fold em $fold")

    val foldTotal = materialEscolar.map { it.preco }.fold(fold) {

            acumulador, valor ->
        println("Accumulador -> $acumulador e o valor -> $valor")
        totalizar(acumulador, valor)
    }

    println("O fold o total é R$ $foldTotal.")
}