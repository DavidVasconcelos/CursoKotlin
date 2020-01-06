package classes

class Pessoa1(var nome: String) //aqui nome fica visivel e alteravel
class Pessoa2(val nome: String) //aqui nome fica visivel e inalteravel
class Pessoa3(nomeInicial: String) { //aqui nomeInicial é um atributo interno
    val nome: String = nomeInicial
}

fun main(args: Array<String>) {
    val p1 = Pessoa1(nome = "João")
    p1.nome = "Guilherme"
    println("${p1.nome} sabe programar")

    val p2 = Pessoa2("Maria")
    val p3 = Pessoa3(nomeInicial = "Pedro")

    println("${p2.nome} e ${p3.nome} são legais!")
}