package fr.hamtec.chapitre_2_2

class Dog {
    //-- Arguments
    var name = ""
    var age = 0
        get() = field
        set(value) {
            if (value > 0){
                field = value
            }
        }
    var race = ""
    var color = ""
    var weight = 0f
    var position = 't'

    //-- Méthodes

    fun isSitting(): Boolean = position == 's'
    fun islaying(): Boolean = position == 'l'
    fun isStanding(): Boolean = position == 't'

    fun eat(foodWeight: Int){
        weight += (foodWeight / 1000f)
    }
    fun run(distance: Int){
        weight -= (distance / 1000f) / 1000
    }

    override fun toString(): String {
        return "Dog(" +
                "\n\tname = $name " +
                "\n\tage = $age " +
                "\n\trace = $race _ " +
                "\n\tcolor = $color _ " +
                "\n\tweight = $weight " +
                "\n\tposition = $position" +
                "\n)"
    }

}