package lambdas

fun main(args: Array<String>) {
    println("Digite sua mensagem: ")

    val entrada = readLine() // pode retornar nulo
    val mensagem = entrada.takeIf { it?.trim() != "" } ?: "Sem mensagem"

    println(mensagem)
}