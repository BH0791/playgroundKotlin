package fr.hamtec.geometrie

class Point(
    var x: Int,
    var y: Int
) {
    fun deplacement(dx: Int, dy: Int): Unit {
        x += dx
        y += dy
    }

    fun affiche(): Unit {
        println("Point(x=$x, y=$y)")
    }

    override fun toString(): String {
        return "Point(x=$x, y=$y)"
    }
}