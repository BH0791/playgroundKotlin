package fr.hamtec

fun main() {

//    fun operation(a:Int, oper:(Int)->Int){
//        println(oper(a))
//    }
//    operation(10, {x -> x*10})
//    operation(12, fun(x:Int): Int{return x*10})
//    println("Hello World!")
//    Student("David", "Miller", 24, "New York").let {
//        println(it)
//        it.moving("Chicago")
//        it.ageIncrease()
//        println(it)
//    }
//    val animal = Animal().let {
//        //The it is the object, which is Animal in this case
//        "The animal is from: ${it.origin}"
//    }
//    println()
//    letExample1()
//    println()
//    letExample()
    letExampleW()

}

private fun alsoExample2() {
    Animal().also { animal ->
        //output => Le nom de l'animal est Panda
        println("The name of the animal is ${animal.name}")
    }
}

private fun alsoExample() {
    val animal = Animal().also { animal ->
        println("The name of the animal is ${animal.name}")
        animal.name = "Tiger new name"
    }.run {
        "The new name of the animal is now $name"
    }

    println(animal)
}

private fun alsoExample1() {
    val animal = Animal().also { animal ->
        "# The name of the animal is ${animal.name}"
    }
    println("N'imprime pas la chaîne de caractères mais l'adresse de l'objet")
    println(animal)
}

private fun runExample() {
    print(
            Animal().run {
                //this is the object, which is Animal in this case
                name = "Great Dane"
                origin = "Denmark"
                "The animal is called $name and is from $origin"
            }
    )
}

private fun withExample() {
    val animal = with(Animal()) {
        "The name of the animal is $name and the origin is $origin"
    }

    println(animal)

}

private fun applyExample2() {
    val animal = Animal().apply {
        //this is the object, which is Animal in this case
        name = "Tiger" //Similar to this.name
        origin = "India" //Similar to this.origin
    }
    print("The new animal is a ${animal.name} and is from ${animal.origin}")
}

private fun applyExample1() {
    val animal = Animal().apply {
        //il s'agit de l'objet, qui est dans ce cas Animal
        name = "Tiger" //Similaire à this.name
        origin = "India" //Similaire à this.origin
    }
    print("The new animal is a ${animal.name} and is from ${animal.origin}")
}

private fun letExample1() {
    val animal = Animal().let {
        //The it is the object, which is Animal in this case
        it.origin = "Nigeria"
    }
    print(animal)
}

private fun letExample2() {
    val animal = Animal().let { animal ->
        //it has been renamed to animal for readability
        "The animal is from:: ${animal.origin}"
    }
    print(animal)
}

private fun letExample4() {
    val animal = Animal().let {
        //The it is the object, which is Animal in this case
        "The animal is from: ${it.origin}"
    }
    print(animal)
}
private fun letExampleW() {
    val animal = Animal().run{
        "${this.origin}"
    }
    print(animal)
}

private fun letExample3() {
    val animal = Animal().origin?.let { origin ->
        //The it is has now become the attribute origin
        "The animal is from: $origin"
    }
    print(animal)
}

class Animal() {
    var name = "Panda"
    var origin = "D'où que viennent les pandas"
    var colour = "Noir et blanc"
}

data class Student(
    var firstName: String,
    var lastName: String,
    var age: Int,
    var address: String
) {
    fun moving(newAddress: String) {
        address = newAddress
    }

    fun ageIncrease() {
        age++
    }
}