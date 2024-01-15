package fr.hamtec.chapitre2_3

class Cat(age: Int, name: String, race: String, color: String, size: Int, weight: Float)
    : Animal(age, name, race, color, size, weight){
        fun meow(){
            println("Meow! Meow!")
        }



}