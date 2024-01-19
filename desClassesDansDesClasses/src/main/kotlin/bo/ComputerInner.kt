package fr.hamtec.bo

class ComputerInner(
    val ramSize: Int, val hardDiskSize: Int, val graphicCardName: String
) {
    //+ Classe interne ( inner class)
    inner class MotherBoard(val name: String, val model: String) {
        fun displayComputer() {
            println("Computer(ramSize = $ramSize, hardDiskSize = $hardDiskSize, graphicCardName = $graphicCardName, motherBoard = $name, model = $model)")
        }
    }
    //+ Classes imbriquées ( nested class )
    class GraphicCard(val name: String, val model: String)
    class HardDisk(val name: String, val size: Int)

}