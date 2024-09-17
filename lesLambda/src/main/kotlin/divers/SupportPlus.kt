package fr.hamtec.divers

//val greeting = {println("Hello Kotlin!")}

val gre: ()->Unit = {println("Hello Kotlin!")}

val gre1: (String) -> Unit = {name: String -> println("$name")}

val gre2: (String) -> Unit = fun(name: String) {
    println("$name")
}

val multiParameterLambda = { x: Int, y: Int, z: Int -> println(x + y + z) }

val multiParameterLambda2: (Int, Int, Int) -> Unit = { x, y, z -> println(x + y + z) }

val sumOfNumbers = { x: Int, y: Int ->
    val result = x + y
    println("$x + $y = $result")
}

fun demoGreeting(): Unit {
    {println("Hello Kotlin!")}()
    gre()
    performOperation(9, 10, { a, b -> a * b })
}

val subtract: (Int, Int) -> Int = { x, y -> x - y }

fun performOperation(x: Int, y: Int, operation: (Int, Int) -> Int) {
    val result = operation(x, y)
    println("$result nn")
}