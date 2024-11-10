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
    
    override val deviceType = "Smart Light"

    /**
     * augmente la luminosité de l'éclairage et imprime une chaîne "Luminosité augmentée à $brightnessLevel." :
     */
    fun increaseBrightness() {
        brightnessLevel++
        println("Luminosité augmentée à $brightnessLevel.")
    }
    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name allumée. Le niveau de luminosité est $brightnessLevel.")
    }
    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("Smart Light désactivé")
    }
}