package fr.hamtec.bo

class ComputerNested(val graphicCard: GraphicCard, val hardDisk: HardDisk) {
    //+ Classes imbriquées ( nested class )
    class GraphicCard(val name: String, val model: String){
        fun displayComputer() {
            println("ComputerNested(graphicCard(name = $name, model $model) ")
        }
    }
    class HardDisk(val name: String, val size: Int)

    override fun toString(): String {
        return "ComputerNested(graphicCard=${graphicCard.name}, hardDisk=${hardDisk.name})"
    }


}