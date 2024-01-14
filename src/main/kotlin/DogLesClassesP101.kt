package fr.hamtec

//+ Class avec un constructeur primaire et le mots clé constructor qui est facultatife
class DogLesClassesP101 constructor(
    var name : String,
    age : Int,
    var race : String,
    var color : String,
    var size : Int,
    private var weight : Float,
    var position : Char = 't'
) {
    //+ Constructeur secondaire
    constructor(name : String) : this("unknown", 1, "unknown", "unknown", 0, 0f, 't') {
    }
    //? Attributs
    //! Pas d'initialisation dans le constructeur pour avoir un contrôle sur age, ici getters/setters
    var age = age
        get() {
            return field * 7
        }
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("Vas-te faire...! Pas de changement avec la valeur: $value")
            }
        }

    //    var name = name
//    var race = race
//    var color = color
//    var size = size
//    var weight = weight
//    var position = position
    init {
        println("Attention l'age ne peut-être négative à la construction il est a $age an(s) ==>> " + this.age + " ans.")
        this.age = age
    }

    //* Méthode setAge()
//    fun setAge(newAge: Int){
//        if ( newAge > 0 ){
//            age = newAge
//        }else{
//            println("Impossible!")
//        }
//    }
    //? Méthodes
    private fun back() : Unit {
        println("Woof! Woof!")
    }

    fun isSitting() : Boolean = position == 's'
    fun isLaying() : Boolean = position == 'l'
    fun isStanding() : Boolean = position == 't'
    fun eat(foodWeight : Int) {
        back()
        weight += (foodWeight / 1000f)

    }

    fun run(distance : Int) {
        weight -= (distance / 1000f) / 1000
    }

    override fun toString() : String {
        return "Dog(name='$name', race='$race', color='$color', size=$size, weight=$weight, position=$position, age=$age)"
    }
}