package fr.hamtec

val message = fun() {
    println("Hello Lambda!")
}

var funMultiply = fun(a: Int, b: Int): Int { return a * b }

val sum: (Int, Int) -> Int = { a, b -> a + b }

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