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
//-- L7.17__________Appel de calculateTotal() avec une variété de références de fonctions.
fun calculateTotal(): Unit {
    fun discountFiveDollars(price: Double): Double = price - 5.0
    fun discountTenPercent(price: Double): Double = price * 0.9
    fun noDiscount(price: Double): Double = price

    val withFiveDollarsOff = calculateTotal(20.0, ::discountFiveDollars) // $16.35
    val withTenPercentOff  = calculateTotal(20.0, ::discountTenPercent)  // $19.62
    val fullPrice          = calculateTotal(20.0, ::noDiscount)          // $21.80
    println("£$withFiveDollarsOff \n£$withTenPercentOff \n£$fullPrice")
}
//** Renvoi de fonctions à partir de fonctions

