package fr.hamtec.appareil

class SmartDevice {

    val name = "Android TV"
    val category = "Entertainment"
    var deviceStatus = "online"

    var speakerVolume = 2
        get() = field
        set(value) {
            field = value
        }

    //+ fonction membre ou méthode -- allumé
    fun turnOn() {
        println("Smart device is turned on.")
    }

    //+ fonction membre ou méthode -- éteint
    fun turnOff() {
        println("Smart device is turned off.")
    }
}