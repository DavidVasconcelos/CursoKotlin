package lambdas

fun main(args: Array<String>) {
    val alunos = arrayListOf("Pedro", "Tiago", "Jonas")
    alunos.map { it.toUpperCase() }.apply { print(this) } // this é o array resultado do map, assim o apply que é outro lambda tem a referencia dele
}