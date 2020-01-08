package collections

fun Any.print() = println(this)

fun main(args: Array<String>) {
    val conjunto = hashSetOf(3, 'a', "texto", true, 3.14) // aspas simples é caracter

    // conjunto.get(1)

    conjunto.add(3).print()
    conjunto.add(10).print()

    conjunto.size.print() // 6 pq o 3 repete

    conjunto.remove("a").print() // false
    conjunto.remove('a').print() // true

    conjunto.contains('a').print()
    conjunto.contains("Texto").print()
    conjunto.contains("texto").print()

    val nums = setOf(1, 2, 3) // somente leitura
    // nums.add(4)

    (conjunto + nums).print() // soma os conjuntos
    (conjunto - nums).print() // tira de conjunto os nums

    conjunto.intersect(nums).print() // não muda o conjunto, cria uma nova referencia
    conjunto.retainAll(nums) // muda o conjunto, altera o valor da referencia
    conjunto.print()

    conjunto.clear()
    conjunto.isEmpty().print()
}