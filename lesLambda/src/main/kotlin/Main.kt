package fr.hamtec
fun main() {
    //* Entrée

    println("++++Le type Nullable++++")
    var dogi: Dog? = null
    var dog: Dog

    if (true/*condition*/) {
        dogi = Dog("Doggo")
    }
    println(dogi)
}

fun exoLambda() {
    val hello = { println("Hello") }
    hello()
    println()
    displayTexInLamda() { hello() }
    println()
    doOperation(5, 5, lambda = { a, b -> a * b })
    println()

    val phrase = { name: String, age: Int ->
        println("Hello")
        println("Je m'appelle $name et j'ai $age ans")
        println("A plus")
    }
    phrase("Jeo", 22)
    println()

    val add = { a: Int, b: Int ->
        println("Adding $a and $b")
        a + b
    }
    println(add(3, 2))
}

inline fun displayTexInLamda(lambda: () -> Unit) {
    lambda()
    println("Après la Lambda")
}

inline fun doOperation(a: Int, b: Int, lambda: (Int, Int) -> Int) {
    println("Avant la lambda ==> doOperation")
    val result = lambda(a, b)
    println("Result: $result")
}

private fun heart() {
    println("***+***+*** Hello Lambda! ***+***+***")
}