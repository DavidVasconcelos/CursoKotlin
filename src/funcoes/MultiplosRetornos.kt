package funcoes

import java.util.*

data class Horario(val hora: Int, val minuto : Int, val segundo: Int) // tem que ser data class

fun agora(): Horario {
    val agora = Calendar.getInstance()

    with(agora) {
        return Horario(get(Calendar.HOUR), get(Calendar.MINUTE), get(Calendar.SECOND)) //get está associado ao agora
    }
}

fun main(args: Array<String>) {
    val (h, m, s) = agora()
    println("$h $m $s ")
}