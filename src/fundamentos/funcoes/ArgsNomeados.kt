package fundamentos.funcoes


fun relacaoDeTrabalho(chefe: String, funcionario: String): String {
    return "$funcionario é subordinado à $chefe"
}

fun main(args: Array<String>) {
    println(relacaoDeTrabalho(funcionario = "João", chefe = "José"))
}