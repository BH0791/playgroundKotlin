package fr.hamtec

import java.io.IOException

fun main() {
    instructionMultiCatch()
    instructionSimpleCatch()
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