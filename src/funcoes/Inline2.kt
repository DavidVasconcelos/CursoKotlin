package funcoes

inline fun <T> executarComLog(nomeFuncao: String , funcao: () -> T): T {
    println("Entrando no método $nomeFuncao...")
    try {
        return funcao()
    } finally {
        println("Método $nomeFuncao finalizado...")
    }
}

fun somar2(a: Int, b: Int): Int { // não pode duas funcões top level com mesmo nome no mesmo pacote
    return a + b
}

fun main(args: Array<String>) {
    val resultado = executarComLog("somar") {
        somar2(4,5)
        //1 + 2  dentro de uma função lambda implicitamente a ultima sentença de código irá retornar o valor
        //"Teste" retorna teste porque é o que retorna aqui e é o que retornará no corpo da executarComLog
    }

    println(resultado)

    val resultado2 = executarComLog("somar", {
        1 + 2
    })

    println(resultado2)
}

