package fr.hamtec.appareil

fun lanceAppareil(){
    val smartTvDevice = SmartDevice()
    println("Device name is: ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
    println(smartTvDevice)
}