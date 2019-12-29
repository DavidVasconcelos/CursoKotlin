package fundamentos

fun main(args: Array<String>) {
    var a:Int? = null
    println(a?.inc())

    println("Hora do erro...")
    println(a!!.inc()) //!! força a chamada do metodo
}