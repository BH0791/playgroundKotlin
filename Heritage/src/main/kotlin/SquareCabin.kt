package fr.hamtec

import kotlin.math.sqrt

class SquareCabin(
    residents: Int,
    val radius: Double
): Dwelling(residents) {
    override val buildingMaterial = "Wood"
    override val capacity = 6
    override fun floorArea(): Double {
        return radius * radius
    }
    fun calculateMaxCarpetLength(): Double {
        return sqrt(2.0) * radius
    }
}