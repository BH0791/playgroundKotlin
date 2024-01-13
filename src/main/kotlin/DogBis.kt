package fr.hamtec

// ! Avec constructeur primaire
class DogBis(age: Int, var name: String, var race: String, var color: String, var size: Int, private var weight: Float, var position: Char = 't') {
    // ? Constructeur secondaire
    constructor(name: String): this(1, name,"inconnue", "inconnue", 0, 0f)

    var age: Int = if (age > 0) age else 0
        get() {
            return field
        }

        set(value: Int){
            if (value > 0){
                field = value
            }else{
                println("Impossible!")
            }
        }

    init {
        println("Fixer l'âge à la valeur : $age")
        this.age = age
        println("Fixer le nom à la valeur : $name")
        this.name = name
        println("Fixer la race à la valeur : $race")
        this.race = race
    }
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
        return "Dog(name='$name', race='$race', color='$color', size=$size, weight=$weight, position=$position, age=$age)"
    }

    //-mutateur - setter
    //-Dans Kotlin, une propriété ne nécessite pas de méthodes getter ou setter explicites


}