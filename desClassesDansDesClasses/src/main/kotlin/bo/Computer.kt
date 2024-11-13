package fr.hamtec.bo

class Computer(
    var ramSize: Int,
    val hardDiskSize: Int,
    val graphicsCardName: String
) {
    inner class MotherBoard(val name: String, val model: String) {
        fun displayComputerInfo(): Unit {
            println("Computer($ramSize, $hardDiskSize, $graphicsCardName, $name, $model)")
        }
    }
}

fun testInner(): Unit {
    val computer = Computer(128000, 4000, "RTX-4080")
    val computerInfo = computer.MotherBoard("GIGABYTE", "GX-299")

    computer.MotherBoard("ASUS", "GX-299")

    computer.MotherBoard("ASUS", "GX-299").displayComputerInfo()
    computerInfo.displayComputerInfo()
}