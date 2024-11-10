package fr.hamtec.appareil

open class SmartDevice constructor(
    val name: String,
    val category: String
) {
    constructor(
        name: String,
        category: String,
        statusCode: Int
    ): this(name, category) {
        deviceStatus = when(statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    var deviceStatus = "online"

    //+ fonction membre ou méthode -- allumé
    open fun turnOn() {
        println("Smart device is turned on.")
    }

    //+ fonction membre ou méthode -- éteint
    open fun turnOff() {
        println("Smart device is turned off.")
    }
}