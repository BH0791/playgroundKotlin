package fr.hamtec

class Dog {
    var name = ""
    var age: Int = 0
        get() {
            return field
        }

        set(value: Int){
            if (value > 0){
                field = value + 100
            }else{
                println("Impossible!!!!!!!!!!!!!!!")
            }
        }
    var race = ""
    var color = ""
    var size = 0
    var weight = 0f
    var position = 't'

    private fun bark(): Unit{
        // bark = aboiement
        println("Woof! Woof!")
    }
    fun isSitting(): Boolean =  position == 's'
    fun isLaying(): Boolean = position == 'l'
    fun isStanding(): Boolean = position == 't'
    fun eat (foodWeight: Int){
        //-On convertit les grammes en kilogramme et on additionne
        weight += (foodWeight / 1000f)
        bark()
    }
    fun run(distance: Int){
        //-On convertit la distance en kilomètres puis on décide que pour 1 km le chien perd 1 g
        weight -= (distance / 1000f) / 100
    }

    override fun toString(): String {
        return "Dog(name='$name', age=$age, race='$race', color='$color', size=$size, weight=$weight, position=$position)"
    }
    //-mutateur - setter
    //-Dans Kotlin, une propriété ne nécessite pas de méthodes getter ou setter explicites


}