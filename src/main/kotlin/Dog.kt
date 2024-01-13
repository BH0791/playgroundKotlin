package fr.hamtec

class Dog {
    //? Attributs
    var name = ""
    var age = 0
        get() {
            return field * 7
        }
        set( value ){
            if( value > 0 ){
                field = value
            }else{
                println("Vas-te faire...!")
            }
        }
    var race = ""
    var color = ""
    var size = 0
    var weight = 0f
    var position = 't'

    //* Méthode setAge()
//    fun setAge(newAge: Int){
//        if ( newAge > 0 ){
//            age = newAge
//        }else{
//            println("Impossible!")
//        }
//    }
    //? Méthodes
    private fun back(): Unit{
        println("Woof! Woof!")
    }
    fun isSitting(): Boolean = position == 's'
    fun isLaying(): Boolean = position == 'l'
    fun isStanding(): Boolean = position == 't'
    fun eat(foodWeight: Int){
        back()
        weight += (foodWeight / 1000f)

    }
    fun run(distance: Int){
        weight -= (distance / 1000f) / 1000
    }

    override fun toString() : String {
        return "Dog(name='$name', race='$race', color='$color', size=$size, weight=$weight, position=$position, age=$age)"
    }
}