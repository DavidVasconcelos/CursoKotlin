package Reflection

data class ExampleDataClass(
  val name: String, var enabled: Boolean) {

  var testeString: String = ""

  fun testeReflectString() : String {
    return "String"
  }
}

fun main() {

  println("***********Construtors***********")
  ExampleDataClass::class.java.declaredConstructors.forEach(::println)

  println()
  println("***********Methods***********")
  ExampleDataClass::class.java.declaredMethods.forEach(::println)

  println()
  println("***********Fields***********")
  ExampleDataClass::class.java.declaredFields.forEach(::println)
}