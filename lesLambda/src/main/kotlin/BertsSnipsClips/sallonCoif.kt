package fr.hamtec.BertsSnipsClips

//++  La taxe est de 9 %, nous allons donc multiplier par 109 % pour obtenir le total TTC.
val taxMultiplier = 1.09

fun calculateTotalWithFiveDollarDiscount(initialPrice: Double): Double {
    val priceAfterDiscount = initialPrice - 5.0
    val total = priceAfterDiscount * taxMultiplier

    return total
}