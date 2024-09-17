package fr.hamtec.divers

val message = fun() {
    println("Hello Lambda!")
}

var funMultiply = fun(a: Int, b: Int): Int { return a * b }

val sum: (Int, Int) -> Int = { a, b -> a + b }
val magnitude100String = { input : Int ->
    val magnitude = input * 100
    magnitude.toString()
}

fun carreNumber(): Unit {
    val square = { number: Int -> number * number }
    val nine = square(3)


    println(magnitude100String(5))
    println(nine)
}
val msg = { -> println("Hello Lambda!") }

val messu = fun(value: Int): Int {
    return value * 5
}

val greet: (String) -> String = fun(name: String): String {
    return "Hello, $name!"
}

val adi = fun(a: Int, b: Int): Int {
    return a + b
}

fun displayInfo(lambda: () -> Unit): Unit {
    lambda()
}