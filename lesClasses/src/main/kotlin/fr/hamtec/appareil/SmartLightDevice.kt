package fr.hamtec.appareil

class SmartLightDevice(
    deviceName: String,
    deviceCategory: String
):
    SmartDevice(
            name = deviceName,
            category = deviceCategory
    ) {

    var brightnessLevel = 0
        set(value) {
            if(value in 0..100) {
                field = value
            }
        }

    /**
     * augmente la luminosité de l'éclairage et imprime une chaîne "Luminosité augmentée à $brightnessLevel." :
     */
    fun increaseBrightness() {
        brightnessLevel++
        println("Luminosité augmentée à $brightnessLevel.")
    }
    override fun turnOn() {
        deviceStatus = "on"
        brightnessLevel = 2
        println("$name allumée. Le niveau de luminosité est $brightnessLevel.")
    }
    override fun turnOff() {
        deviceStatus = "off"
        brightnessLevel = 0
        println("Smart Light désactivé")
    }
}