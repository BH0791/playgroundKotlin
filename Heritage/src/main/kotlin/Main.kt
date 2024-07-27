package fr.hamtec

fun main() {
    val squareCabin = SquareCabin(6, 50.0)
    val roundHut = RoundHut(4, 10.0)
    val roundTower = RoundTower(4, 15.5)

    with(squareCabin) {
        println("\nSquare Cabin\n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
        println("Floor area: %.2f".format(floorArea()))
        getRoom()
        println("Carpet size:%.2f" .format(calculateMaxCarpetLength()))

    }
    with(roundHut) {
        println("\nRound Hut\n=========")
        println("Material: ${buildingMaterial}")
        println("Capacity: ${capacity}")
        println("Has room? ${hasRoom()}")
        println("Floor area: %.2f".format(floorArea()))
        getRoom()
        println("Carpet size:%.2f" .format(calculateMaxCarpetLength()))
    }
    with(roundTower) {
        println("\nRound Tower\n==========")
        println("Material: ${buildingMaterial}")
        println("Capacity: ${capacity}")
        println("Has room? ${hasRoom()}")
        println("Floor area: %.2f".format(floorArea()))
        getRoom()
        println("Carpet size:%.2f" .format(calculateMaxCarpetLength()))
    }
}