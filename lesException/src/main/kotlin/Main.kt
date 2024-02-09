package fr.hamtec

import java.io.IOException

fun main() {
    println("Hello les exceptions")

        try {

            val result = Integer.parseInt("2")
            println (result)

        } catch (exe: ArithmeticException) {
            println("Erreur! => ${exe.message}")
        }catch (exe: NumberFormatException){
            println("Erreur! => ${exe.message}")

        }
}