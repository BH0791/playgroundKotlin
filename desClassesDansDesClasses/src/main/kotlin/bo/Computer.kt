package fr.hamtec.bo

class Computer(
    private var ramSize: Int,
    val hardDiskSize: Int,
    val graphicsCardName: String
) {
    fun getComputerInf(): Unit {
        MotherBoard("55", "Fantasssss").displayComputerInfo()
        println("==> $ramSize $hardDiskSize $graphicsCardName")
    }

    inner class MotherBoard(val name: String, val model: String) {
        fun displayComputerInfo(): Unit {
            ramSize = 2024
            println("Computer($ramSize, $hardDiskSize, $graphicsCardName, $name, $model)")
        }
    }

    inner class HardDisk(val sizeInGb: Int) {
        fun getInfo() = "Installed on ${this@Computer} with $sizeInGb GB"
    }
}

fun testInner(): Unit {
    val computer = Computer(128000, 4000, "RTX-4080")
    val computerInfo = computer.MotherBoard("GIGABYTE", "GX-299")

    computer.MotherBoard("ASUS", "GX-299")
    println(computer.HardDisk(1000).getInfo())
    computer.getComputerInf()

    computer.MotherBoard("ASUS", "GX-299").displayComputerInfo()
    computerInfo.displayComputerInfo()
}