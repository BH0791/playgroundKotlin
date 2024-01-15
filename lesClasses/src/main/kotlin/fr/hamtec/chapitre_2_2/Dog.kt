package fr.hamtec.chapitre_2_2

/**
 *
 */
class Dog {
    var name = "-"
    var age = 0
        get() = field * 7
        set(value){
            if ( value > 0){
                field = value
            }else{
                println("Valeur $value incorrect")
            }
        }
    var race: String = "-"   //! Ecriture pas simplifier
    var color = "-"
    var size = 0
    var weight = 0f
    var position = 't'

    /**
     * Faire aboyer le chien
     */
     fun bark(): Unit{
        // bark = aboiement
        println("Woof! Woof! $age")
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
        //+ On convertit la distance en kilomètres puis on décide que pour 1 km le chien perd 1 g
        weight -= (distance / 1000f) / 100
    }
    override fun toString(): String {
        return "Dog(\nname = $name \nrace = $race \ncolor=$color \nsize=$size \nweight = $weight \nposition = $position \nage = $age\n)"
    }
}