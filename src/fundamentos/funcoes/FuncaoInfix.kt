package fundamentos.funcoes

class Produto(val nome: String, val preco: Double)

infix fun Produto.maisCaroQue(produto: Produto) : Boolean = this.preco > produto.preco



fun main(args: Array<String>) {
    val p1 = Produto("Ipad", 2349.00)
    val p2 = Produto(preco = 3.49, nome = "Borracha")

    println(p1 maisCaroQue p2) // infix vai no meio dos operandos, ++a prefixada e a++ posfixada
    println(p2.maisCaroQue(p1)) // forma tradicional
}