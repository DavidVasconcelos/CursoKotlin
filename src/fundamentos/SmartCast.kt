package fundamentos

fun main(args: Array<String>) {
    souEsperto("Ola")
    souEsperto(9)
    souEsperto2("Opa")
    souEsperto2(7)
    souEsperto2(true)
}

fun souEsperto(x: Any) {
    if (x is String) { //aqui a conversão ocorre de modo implicito
        println(x.toUpperCase()) // como ja converteu ele terá os metodos de String
    } else if (x is Int) {
        println(x.plus(3)) // como ja converteu ele terá os metodos de Int
    }
}

fun souEsperto2(x: Any) {
    when (x) {
        is String -> println(x.toUpperCase())
        is Int -> println(x.plus(3))
        else -> println("Repense a sua vida!") // o else sempre fica por ultimo e substitui o switch sem a necessidade de break
    }
}