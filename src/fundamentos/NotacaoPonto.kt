package fundamentos

fun main(args: Array<String>) {
    val a: Int = 33.dec()
    var b: String = a.toString()

    println("Int: $a")
    println("Primeiro char da string b é: ${b.first()}") //chaves quando for expressão senão imprime "32.first()"
}