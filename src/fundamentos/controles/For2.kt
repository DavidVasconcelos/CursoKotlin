package fundamentos.controles

fun main(args: Array<String>) {
    for(i in 10 downTo 1) {
        println("i = $i")
    }

    println()

    for(j in 1 exclusiveReversedRangeTo 10) {//não inclui o 1
        println("j = $j")
    }

}

infix fun Int.exclusiveReversedRangeTo(other: Int): IntProgression = IntRange(this + 1, other).reversed()