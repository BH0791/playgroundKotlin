package fr.hamtec.appareil

// La classe SmartHome HAS-A est un dispositif de télévision intelligente.
class SmartHome(
    val smartTvDevice: SmartTvDevice,       //--Dispositif de télévision intelligente
    val smartLightDevice: SmartLightDevice  //--Dispositif lumineux intelligent
) {
    //--allumer la télévision
    fun turnOnTv() {
        smartTvDevice.turnOn()
    }
    //--éteindre la télévision
    fun turnOffTv() {
        smartTvDevice.turnOff()
    }
    //--Augmenter le volume de la télévision
    fun increaseTvVolume() {
        smartTvDevice.increaseSpeakerVolume()
    }
    //--Changer de chaîne Tv à la suivante
    fun changeTvChannelToNext() {
        smartTvDevice.nextChannel()
    }
    //--Allumer la lumière
    fun turnOnLight() {
        smartLightDevice.turnOn()
    }
    //--éteindre la lumière
    fun turnOffLight() {
        smartLightDevice.turnOff()
    }
    //--augmenterLa luminosité
    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }
    //--désactiver tous les appareils
    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }
}