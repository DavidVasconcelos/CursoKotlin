package fundamentos.funcoes

fun <E> List<E>.secondOrNull(): E? = if(this.size >= 2) this.get(1) else null

fun main(args: Array<String>) {
    var list = listOf("João", "Maria", "Pedro")
    print(list.secondOrNull())
}