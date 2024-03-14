package fr.hamtec

fun main() {

    letExemple7()


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
        //Le "it" est l'objet, qui est ici l'animal.
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

private fun letExemple6() {

    fun add(a: Int, b: Int): Int = a + b

    println("Exemple-6")
    add(5, 20).let {
        if(it > 10) {
            println("Sup a 10 ==> $it")
        } else {
            println("Inf a 0 ==> $it")
        }
    }
}

private fun letExemple7() {
    println(
            "Vous pouvez également l’utiliser pour introduire des variables locales avec une portée limitée afin de " +
                    "\nfaciliter la lecture de votre code. Pour définir une nouvelle variable pour l’objet de contexte, indiquez " +
                    "\nson nom en tant qu’argument lambda afin qu’il puisse être utilisé à la place de la variable par défaut"
    )
    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first().let { firstItem ->
        println("Le premier élément de la liste est '$firstItem'")
        if(firstItem.length >= 5) firstItem else "!" + firstItem + "!"
    }.uppercase()
    println("Premier point après modifications: '$modifiedFirstItem'")
}

private fun letExemple8() {
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    numbers.map { it.length }.filter { it > 3 }.let(::println)
}

private fun letExemple9() {
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val resultList = numbers.map { it.length }.filter { it > 3 }
    println(resultList)
}

private fun letExemple5() {
    println("Exemple-5")
    val str: String? = "Hello"
    val length = str?.let {
        println("let() appelé sur $it")
        it.length
    }
}

private fun letExampleW() {
    val animal = Animal().run {
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