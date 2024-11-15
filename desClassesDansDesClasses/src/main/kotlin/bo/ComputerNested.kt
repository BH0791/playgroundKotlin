package fr.hamtec.bo

class ComputerNested(
    var nameP: String,
    val graphicCard: GraphicCard,
    val hardDisk: HardDisk

) {


    //+ Classes imbriquées ( nested class )
    class GraphicCard(val name: String, val model: String) {
        fun displayComputer() {
            println("ComputerNested(graphicCard(name = $name, model $model) ")
        }
    }

    //+
    class HardDisk(val name: String, val size: Int)

    interface InnerInterface

}

//----------------------------------------------------------------
fun testComputerNested(): Unit {
    println("\nClasses imbriquées ( nested class )")
    val graphicCard = ComputerNested.GraphicCard("NVIDIA", "GTX")
    val hardDisk = ComputerNested.HardDisk("Toshiba", 1024)
    val computer2 = ComputerNested("Nested", graphicCard, hardDisk)

    graphicCard.displayComputer()
    println(computer2.toString())
}