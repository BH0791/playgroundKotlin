package fr.hamtec

fun main() {
//    instructionMultiCatch()
//    instructionSimpleCatch()
//    captureException()
//    captureException()
    println(Dog("Joe").countNameChars())
    println(Dog("").countNameChars())
}

private fun countNameCharsV1(dog: Dog): Int {
    val name = dog.name ?: throw IllegalArgumentException("The name cannot be null_v1")
    return name.length
}

private fun countNameCharsV3(dog: Dog): Int {
    val name = dog.name ?: throw InvalidDogNameException("The name cannot be null_v3")
    return name.length
}

private fun countNameCharsV2(dog: Dog): Int =
    dog.name?.length ?: throw IllegalArgumentException("The name cannot be null_v2")

fun add(a: Int, b: Int): Int {
    if (a <= 0) {
        throw IllegalArgumentException("Message = a <= 0")
    } else if (b <= 0) {
        throw IllegalArgumentException("Message = b <= 0")
    }
    return a + b
}

fun addV2(a: Int, b: Int): Int {
    // ** https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/require.html
    require(a > 0) { "+++++ a <= 0 +++++" }
    require(b > 0) { "+++++ b <= 0 +++++" }
    return a + b
}

private fun captureException() {
    println("Lever une Exeption")
    val a: Int = -10
    val b: Int = -5
    println(addV2(a, b))
}

private fun instructionMultiCatch() {

    println("Hello les exceptions multi-catch avec when")
    try {
        val result = 12 / Integer.parseInt("A")
        println(result)
    } catch (exe: Exception) {
        when (exe) {
            is ArithmeticException -> println("${exe.message}")
            is NumberFormatException -> println("${exe.message}")
            exe -> println("Impossible")
        }
    } finally {
        println("Instructions")
    }
}

private fun instructionSimpleCatch() {
    println("Hello les exceptions muti-catch sans when")
    try {
        val result = Integer.parseInt("2")
        println(result)
    } catch (exe: ArithmeticException) {
        println("Erreur! => ${exe.message}")
    } catch (exe: NumberFormatException) {
        println("Erreur! => ${exe.message}")
    }
}

data class Dog(val name: String) {
    fun countNameChars(): Int {
        check(name.isNotEmpty()) { "The name cannot be empty" }
        return name.length
    }
    fun isNoEmpty(): Boolean {return true}
}

class InvalidDogNameException(message: String) : Exception(message)