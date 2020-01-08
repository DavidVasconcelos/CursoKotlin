package collections

fun main(args: Array<String>) {
    val map = hashMapOf(1 to "Gui", 2 to "Rebeca", 3 to "Cibalena") // to faz a associação chave valor

    for ((id, nome) in map) {
        println("$id) $nome")
    }
}