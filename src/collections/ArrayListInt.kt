package collections

fun main(args: Array<String>) {

    val pares = arrayListOf(2, 4, 6)
    val impares = intArrayOf(1, 3, 5) // array ja tipado em int

    for (n in impares.union(pares).sorted()) { // junção das listas e ordenação
        print("$n ")
    }
}