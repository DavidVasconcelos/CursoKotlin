package collections

fun main(args: Array<String>) {
    val alunos = arrayListOf("Amanda", "André", "Bernardo", "Carlos")

    for(aluno in alunos) {
        println(aluno)
    }

    for((indice, aluno) in alunos.withIndex()) { // usando o desctructor
        println("${indice + 1} - $aluno")
    }
}