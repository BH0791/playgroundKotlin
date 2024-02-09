package fr.hamtec

fun main() {
//    instructionMultiCatch()
//    instructionSimpleCatch()
    captureException()
}

fun add(a: Int, b: Int): Int {
    if (a <= 0){
        throw IllegalArgumentException("Message = a <= 0")
    }else if(b <= 0){
        throw IllegalArgumentException("Message = b <= 0")
    }
        return a + b
}

private fun captureException() {
    println("Lever une Exeption")
    val a: Int = 10
    val b: Int = -5
    println(add(a, b))
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