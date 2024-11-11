package fr.hamtec.appareil

// La classe SmartHome HAS-A est un dispositif de télévision intelligente.
class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
) {
    //--allumer la télévision
    fun turnOnTv() {
        smartTvDevice.turnOn()
    }
    //--éteindre la télévision
    fun turnOffTv() {
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume() {
        smartTvDevice.increaseSpeakerVolume()
    }

    fun turnOnLight() {
        smartLightDevice.turnOn()
    }

    fun turnOffLight() {
        smartLightDevice.turnOff()
    }
    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }
    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }
}