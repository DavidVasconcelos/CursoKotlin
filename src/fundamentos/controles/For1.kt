package fundamentos.controles

fun main() {
    for (i in 1..10) {
        println(i)
    }

    for (i in 1 until 10) { //não inclui o 10
        print(i)
    }

    println()

    for(j in 1 exclusiveRangeTo 10) {//não inclui o 1 e o 10
        println("j = $j")
    }
}

infix fun Int.exclusiveRangeTo(other: Int): IntRange = IntRange(this + 1, other - 1)