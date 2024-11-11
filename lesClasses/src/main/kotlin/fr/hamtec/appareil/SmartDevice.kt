package fr.hamtec.appareil

/**
 * ++ Appareil intelligent
 * ** l'API renvoie un code d'état de type Int pour indiquer l'état initial de l'appareil. L'API renvoie une valeur 0
 * ** si l'appareil est hors connexion et une valeur 1 s'il est en ligne. Pour toute autre valeur entière, l'état est
 * ** considéré comme inconnu.
 * @author hb
 */
open class SmartDevice constructor(     //++ constructeur facultatif
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
    open val deviceType = "unknown"

    //+ fonction membre ou méthode -- allumé
    open fun turnOn() {
        deviceStatus = "on"
    }

    //+ fonction membre ou méthode -- éteint
    open fun turnOff() {
        deviceStatus = "off"
    }
}