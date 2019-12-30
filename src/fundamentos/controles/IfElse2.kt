package fundamentos.controles

fun main(args: Array<String>) {
    val num1: Int = 2
    val num2: Int = 3

    val maiorValor =  if (num1 > num2) {
        println("processando...")
        num1 //esse é o retorno
    } else {
        println("processando...")
        num2 //esse é o retorno
    }

    println("O maior valor é $maiorValor.")

    val menorValor = if(num1 < num2) num1 else num2 //em uma linha só

    println("O menor valor é $menorValor.")
}