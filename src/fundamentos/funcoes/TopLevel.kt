package fundamentos.funcoes

fun min(a: Int, b: Int) : Int = if(a < b) a else b //funcao top level pq não tem classe, só em após compilar gera a classe

fun main(args: Array<String>) {
    print("O menor valor ée ${min(3, 4)}")
}
