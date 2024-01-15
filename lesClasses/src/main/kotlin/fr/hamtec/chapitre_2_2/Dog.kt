package fr.hamtec.chapitre_2_2

/**
 *   Mammifère (canidé) carnivore aux multiples races, caractérisé par sa facilité à être domestiqué, par une course rapide, un excellent odorat et par son cri spécifique, l'aboiement.
 */
class Dog(var name: String, age: Int, var race: String, var color: String, var size: Int, var weight: Float, var position: Char = 't') {
    constructor(name: String): this(name, 0,"unknown", "unknown", 0, 0f )
    constructor(): this("unknown", 0, "unknown", "unknown", 0, 0f)
    var age = age
        get() = field * 7
        set(value){
            if ( value > 0){
                field = value
            }else{
                println("Valeur $value incorrect")
            }
        }

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
        return "Dog(\nname = $name \nrace = $race \ncolor=$color \nsize = $size \nweight = $weight \nposition = $position \nage = $age\n)"
    }
}