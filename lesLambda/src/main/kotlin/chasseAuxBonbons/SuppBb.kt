package fr.hamtec.chasseAuxBonbons

fun lanceSupp(): Unit {
    val trickFunction: () -> Unit = trick
    trick()
    trickFunction()
    treat()
}

fun lanceFunType(): Unit {
    val treatFunction: () -> Unit = trickOrTreat(false)
    val trickFunction = trickOrTreat(true)

    treatFunction()
    trickFunction()
}

fun lanceFunTypeSecond(): Unit {
    val coins: (Int) -> String = {quantity ->
        "$quantity quarters"
    }
    val cupcake: (Int) -> String = { "Have a cupcake!" }

    val treatFunction = trickOrTreat(false, coins)
    val trickFunction = trickOrTreat(true, null)
    treatFunction()
    trickFunction()
}
fun trickOrTreat(isTrick: Boolean): () -> Unit {
    if(isTrick) {
        return trick
    } else {
        return treat
    }
}

fun trickOrTreat(
    isTrick: Boolean,
    extraTreat: ((Int) -> String)?
): () -> Unit {
    if(isTrick) {
        return trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat
    }
}

val trick = {
    println("No treats!")
}
val treat: () -> Unit = {
    println("Have a treat")
}