package fr.hamtec

class RoundTower(
    residents: Int,
    val floors: Int = 2
): RoundHut(residents) {
    override val buildingMaterial = "Stone"
    override val capacity = 4 * floors
}