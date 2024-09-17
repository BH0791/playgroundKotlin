package fr.hamtec

import fr.hamtec.BertsSnipsClips.calculateTotalWithFiveDollarDiscount

fun main() {
    val total = calculateTotalWithFiveDollarDiscount(20.0)
    println("$%.2f".format(total))
}

