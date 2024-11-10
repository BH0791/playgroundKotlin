package fr.hamtec.appareil

class SmartTvDevice(
    deviceName: String,
    deviceCategory: String
): SmartDevice(
        name = deviceName,
        category = deviceCategory
) {
    var speakerVolume = 2
        set(value) {
            if(value in 0..100) {
                field = value
            }
        }
    var channelNumber = 1
        set(value) {
            if(value in 0..200) {
                field = value
            }
        }
    override val deviceType = "Smart TV"

    /**
     * augmente le volume et imprime une chaîne "Le volume du haut-parleur augmente jusqu'à $speakerVolume."
     */
    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Le volume du haut-parleur augmente jusqu'à $speakerVolume.")
    }

    /**
     * augmente le numéro de chaîne et imprime une chaîne "Le nombre de canaux est passé à $channelNumber." :
     */
    fun nextChannel() {
        channelNumber++
        println("Le nombre de canaux est passé à $channelNumber.")
    }
    override fun turnOn() {
        super.turnOn()
        println("$name est activé. Le volume du haut-parleur est réglé sur $speakerVolume et le numéro de canal est réglé sur $channelNumber."
        )
    }
    override fun turnOff() {
        super.turnOff()
        println("$name éteint")
    }
}