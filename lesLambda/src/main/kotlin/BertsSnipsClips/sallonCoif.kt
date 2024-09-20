package fr.hamtec.BertsSnipsClips

//++  La taxe est de 9 %, nous allons donc multiplier par 109 % pour obtenir le total TTC.
val taxMultiplier = 1.09

//-- L7.1__________Une fonction simple pour calculer le coût total lors de l’utilisation d’un coupon.
fun calculateTotalWithFiveDollarDiscount(initialPrice: Double): Double {
    val priceAfterDiscount = initialPrice - 5.0
    val total = priceAfterDiscount * taxMultiplier

    return total
}

//-- L7.2__________Appel de la fonction à partir du Listing 7.1
fun calculeRem(): Unit {
    val total = calculateTotalWithFiveDollarDiscount(20.0)
    println("$%.2f".format(total))
}

//-- L7.3__________Une fonction pour un coupon de 5 $ et une pour un coupon de 10 %.
fun calculateTotalWithTenPercentDiscount(initialPrice: Double): Double {
    val priceAfterDiscount = initialPrice * 0.9
    val total = priceAfterDiscount * taxMultiplier

    return total
}

//-- L7.4__________Esquisse d’une fonction qui pourrait prendre une fonction comme argument. Cela ne compile pas réellement.
/*
fun calculateTotal(
    initialPrice: Double,
    /*applyDiscount: ???*/
): Double {
    val priceAfterDiscount = applyDiscount(initialPrice)
    val total = priceAfterDiscount * taxMultiplier

    return total
}
*/
//-- L7.5__________Une fonction simple pour retirer cinq dollars sur un prix.
//fun discountFiveDollars(price: Double): Double = price - 5.0
//-- L7.6__________Appel de la fonction à partir du listing 7.5.
// val discountedPrice = discountFiveDollars(20.0) // Result is 15.0
//-- L7.7__________référence de fonction
//val applyDiscount = ::discountFiveDollars
//-- L7.8__________Appel à applyDiscount(), qui exécutera le code de discountFiveDollars().
//val discountedPrice = applyDiscount(20.0) // Result is 15.0
//-- L7.9__________Exemples d’inférence de type.
val name = "Bert"    // name's type is String
val hasCoupon = true // hasCoupon's type is Boolean
val price = 12.50    // price's type is Double

//-- L7.10__________Écrire le type de applyDiscount explicitement plutôt que d’utiliser l’inférence de type.
//val applyDiscount: (Double) -> Double = ::discountDollars
//-- L7.11__________Illustre un type de fonction qui a plus d’un paramètre.
fun menuItemDescription(name: String, price: Double): String = "A $name costs $price before discounts and tax."
val describeMenuItem: (String, Double) -> String = ::menuItemDescription

//** Deux fonctions du même type
//-- L7.12__________Attribuer et réattribuer une valeur simple à une seule variable.
var couponCode = "FIVE_BUCKS"

//couponCode = "TAKE_10"
//-- L7.13__________ Assigner et réaffecter une fonction à une seule variable.
/*
fun discountFiveDollars(price: Double): Double = price - 5.0
fun discountTenPercent(price: Double): Double = price * 0.9
var applyDiscount = ::discountFiveDollars
applyDiscount = ::discountTenPercent
*/
//-- L7.14__________Attribuer des fonctions avec des noms d’arguments différents à la même variable.
/*
fun discountFiveDollars(initialPrice: Double): Double = initialPrice - 5.0
fun discountTenPercent(originalPrice: Double): Double = originalPrice * 0.9
var applyDiscount = ::discountFiveDollars
applyDiscount = ::discountTenPercent
 */
//-- L7.15__________Erreur : Type Mismatch (ne compile pas)
/*
fun menuItemDescription(name: String, price: Double): String = "A $name costs $price before discounts and tax."
fun sillyMenuItemDescription(price: Double, name: String): String = "You want a $name? It's gonna run you $price, not counting coupons, tax, and whatnot!"
var describeMenuItem = ::menuItemDescription
describeMenuItem = ::sillyMenuItemDescription
 */
//** Passage de fonctions à fonctions
//-- L7.16__________Une version de travail du code dans Listing 7.4.
/*
fun calculateTotal(
    initialPrice: Double,
    applyDiscount: (Double) -> Double
): Double {
    // Apply coupon discount
    val priceAfterDiscount = applyDiscount(initialPrice)
    // Apply tax
    val total = priceAfterDiscount * taxMultiplier
    return total
}
*/
//-- L7.17__________Appel de calculateTotal() avec une variété de références de fonctions.
/*
fun discountFiveDollars1(price: Double): Double = price - 5.0
fun discountTenPercent(price: Double): Double = price * 0.9
fun noDiscount(price: Double): Double = price
*/
/*fun calculateTotal(): Unit {
    val withFiveDollarsOff = calculateTotal(20.0, ::discountFiveDollars) // $16.35
    val withTenPercentOff = calculateTotal(20.0, ::discountTenPercent)  // $19.62
    val fullPrice = calculateTotal(20.0, ::noDiscount)          // $21.80
    println("£$withFiveDollarsOff \n£$withTenPercentOff \n£$fullPrice")
}
*/
//** Renvoi de fonctions à partir de fonctions
//-- L7.18__________Renvoi des références de fonction d’une fonction.
/*
fun discountForCouponCode(couponCode: String): (Double) ->
Double = when(couponCode) {
    "FIVE_BUCKS" -> ::discountFiveDollars
    "TAKE_10" -> ::discountTenPercent
    else -> ::noDiscount
}
*/
//-- L7.19__________Réécriture de la seconde moitié de Listing 7.17 pour utiliser discountForCouponCode().
//val withFiveDollarsOff = calculateTotal(20.0, discountForCouponCode("FIVE_BUCKS")) // $16.35
//val withTenPercentOff = calculateTotal(20.0, discountForCouponCode("TAKE_10"))    // $19.62
//val fullPrice = calculateTotal(20.0, discountForCouponCode("NONE"))       // $21.80
//** Introduction aux lambdas
//-- 7.20 - Code qui inclut des littéraux.
val string: String = "This is a string"
val integer: Int = 49
val boolean: Boolean = true
//-- 7.21 - Code des Listing 7.5 et 7.7 (avec quelques modifications de l’inférence de type).
//fun discountFiveDollars(price: Double) = price - 5.0
val applyDiscount1: (Double) -> Double = ::discountFiveDollars
//-- 7.22 - Code qui inclut un littéral de fonction au lieu d’une référence de fonction.
val applyDiscount2: (Double) -> Double = { price: Double -> price - 5.0 }
//** Fonctions traditionnelles vs Lambdas
//val applyDiscount: (Double) -> Double = fun(price: Double): Double { return price - 5.0 }
//-- 7.23 - Identique au Listing 7.22, mais en utilisant l'inférence de type sur le paramètre lambda.
//val applyDiscount: (Double) -> Double = { price -> price - 5.0 }
//** Le paramètre Implicit it
val applyDiscount: (Double) -> Double = { it - 5.0 }
//** Lambdas et fonctions d'ordre supérieur
//** Passage de lambdas en tant qu'arguments
//-- 7.25 - Code from Listing 7.16 and Listing 7.17.
/*
fun calculateTotal(
    initialPrice: Double,
    applyDiscount: (Double) -> Double
): Double {
    // Apply coupon discount
    val priceAfterDiscount = applyDiscount(initialPrice)
    // Apply tax
    val total = priceAfterDiscount * taxMultiplier

    return total
}
*/
fun discountFiveDollars(price: Double) = price - 5.0
fun discountTenPercent(price: Double): Double = price * 0.9
fun noDiscount(price: Double) = price
/*
val withFiveDollarsOff1 = calculateTotal(20.0, ::discountFiveDollars) // $16.35
val withTenPercentOff1  = calculateTotal(20.0, ::discountTenPercent)  // $19.62
val fullPrice1          = calculateTotal(20.0, ::noDiscount)          // $21.80
 */
//-- 7.26 - Remplacement des références de fonctions du Listing 7.25 par des lambdas.
/*
val withFiveDollarsOff2 = calculateTotal(20.0, { price -> price - 5.0 }) // $16.35
val withTenPercentOff2  = calculateTotal(20.0, { price -> price * 0.9 }) // $19.62
val fullPrice2          = calculateTotal(20.0, { price })                // $21.80
 */
//-- 7.27 - Placer un argument lambda en dehors des parenthèses.
/*
val withFiveDollarsOff3 = calculateTotal(20.0) { price -> price - 5.0 }
val withTenPercentOff  = calculateTotal(20.0) { price -> price * 0.9 }
val fullPrice          = calculateTotal(20.0) { price -> price }
 */
//-- 7.28 - Une fonction d'ordre supérieur avec un seul paramètre, qui est d'un type de fonction.
fun printSubtotal(applyDiscount: (Double) -> Double) {
    val result = applyDiscount(20.0)
    val formatted = "$%.2f".format(result)
    println("A $20.00 la coupe de cheveux vous coûtera $formatted avant la tax.")
}
//-- 7.29 - Appel de printSubtotal() sans parenthèses dans main.
//printSubtotal { price -> price - 5.0 }
//printSubtotal { price -> price * 0.9 }

//** Renvoi de lambdas en tant que résultats de fonction
//-- 7.30 - Renvoi des références de fonction d’une fonction. (Identique au Listing 7.18).
/*
fun discountForCouponCode(couponCode: String): (Double) -> Double = when (couponCode) {
    "FIVE_BUCKS" -> ::discountFiveDollars
    "TAKE_10"    -> ::discountTenPercent
    else         -> ::noDiscount
}
 */
//-- 7.31 - Retourner des lambdas à partir d’une fonction.
/*
fun discountForCouponCode(couponCode: String): (Double) -> Double = when (couponCode) {
    "FIVE_BUCKS" -> { price -> price - 5.0 }
    "TAKE_10"    -> { price -> price * 0.9 }
    else         -> { price -> price }
}
 */

//** Lambdas avec plusieurs instructions
//-- 7.32 - Une lambda qui a plusieurs lignes de code.
/*
val withFiveDollarsOff = calculateTotal(20.0) { price ->
    val result = price - 5.0
    println("Initial price: $price")
    println("Discounted price: $result")
    result
}
 */
//-- 7.33 - Tout mettre ensemble.
fun calculateTotal(
    initialPrice: Double,
    applyDiscount: (Double) -> Double
): Double {
    // Apply coupon discount
    val priceAfterDiscount = applyDiscount(initialPrice)
    // Apply tax
    val total = priceAfterDiscount * taxMultiplier

    return total
}
/*
fun discountForCouponCode(couponCode: String): (Double) -> Double = when (couponCode) {
    "FIVE_BUCKS" -> { price -> price - 5.0 }
    "TAKE_10"    -> { price -> price * 0.9 }
    else         -> { price -> price }
}
 */

val initialPrice = 20.0
val couponDiscount = discountForCouponCode("FIVE_BUCKS")
val total = calculateTotal(initialPrice, couponDiscount)
//-- 7.34 - Ajout de plus de codes promo.
/*
fun discountForCouponCode(couponCode: String): (Double) -> Double = when (couponCode) {
    "FIVE_BUCKS" -> { price -> price - 5.0 }
    "NINE_BUCKS" -> { price -> price - 9.0 }
    "TAKE_10"    -> { price -> price * 0.9 }
    "TAKE_15"    -> { price -> price * 0.85 }
    else         -> { price -> price }
}
 */
//-- 7.35 - Fonctions qui créent des fonctions.
fun dollarAmountDiscount(dollarsOff: Double): (Double) -> Double =
    { price -> price - dollarsOff }

fun percentageDiscount(percentageOff: Double): (Double) -> Double {
    val multiplier = 1.0 - percentageOff
    return { price -> price * multiplier }
}
//-- 7.36 - Une petite amélioration pour éviter un peu de code dupliqué.
fun discountForCouponCode(couponCode: String): (Double) -> Double = when (couponCode) {
    "FIVE_BUCKS" -> dollarAmountDiscount(5.0)
    "NINE_BUCKS" -> dollarAmountDiscount(9.0)
    "TAKE_10"    -> percentageDiscount(0.10)
    "TAKE_15"    -> percentageDiscount(0.15)
    else         -> { price -> price }
}