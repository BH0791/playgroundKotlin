package fr.hamtec

import java.io.IOException

fun main() {
    println("Hello les exceptions")

        try {
            val result = 12/Integer.parseInt("A")
            println (result)
        } catch (exe: Exception) {
            when(exe){
                is ArithmeticException -> println("${exe.message}")
                is NumberFormatException -> println("${exe.message}")
                exe -> println("Impossible")
            }
        }
}