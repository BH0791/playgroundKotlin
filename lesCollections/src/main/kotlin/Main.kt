package fr.hamtec

import java.util.*
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.nanoseconds


fun main() {
    println("Hello collection!")
    listofDemo()
}
fun listofDemo() {

    val valeurs = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14)


    valeurs.forEach { print("$it ") }
}
fun VectorExample() {

    //Create a vector
    var vec = Vector<String?>()
    //Adding elements using add() method of List
    vec.add("Tiger");
    vec.add("Lion");
    vec.add("Dog");
    vec.add("Elephant");
    //Adding elements using addElement() method of Vector
    vec.addElement("Rat");
    vec.addElement("Cat");
    vec.addElement("Deer");

    System.out.println("Elements are: " + vec);
}

fun LinkedListExemple() {
    val al2 = LinkedList<String>()
    al2.add("James");//adding object in linkedlist
    al2.add("Serena");
    al2.add("Swati");
    al2.add("Junaid");
    System.out.println("linkedlist: " + al2);
}

fun TreeSetExemple() {
    println()
    var al = TreeSet<String?>()
    al.add("Ravi");
    al.add("Vijay");
    al.add("Ravi");
    al.add("Ajay");
    var itr: Iterator<String?> = al.iterator()
    while (itr.hasNext()) {
        System.out.println(itr.next());
    }
}

fun ArrayListExemple() {

    var arrayList = ArrayList<String>()

    arrayList.add("Mercury")
    arrayList.add("Venus")

    println("===> ArrayList <===")
    for (index in arrayList) {
        println(index)
    }

    arrayList.add(1, "Mars")
    println("Arraylist après l'insertion ---->")
    for (index in arrayList)
        println(index)

    var arraylist1 = ArrayList<String>()
    //Ajout de tous les éléments de la liste de arrayList à arrayList1
    println("Elements dans arraylist1 -->")
    arraylist1.addAll(arrayList)
    for (i in arraylist1)
        println(i)
}

fun ListOfBoucles() {
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println("\nSimple liste les élément")
    println(solarSystem)
    println("Boucle for()")
    for (index in solarSystem) {
        print(index + " ")
    }
    println("\nforEach()")
    solarSystem.forEach {
        print(it + " ")
    }
    println("\nIterator")
    val numbersIterator = solarSystem.iterator()
    while (numbersIterator.hasNext()) {
        print(numbersIterator.next() + " ")
    }
}

fun testBoucles() {
    val doubled = List(10, { it })  // or MutableList if you want to change its content later
    println(doubled)
}

fun controle() {
    val names = mutableListOf<Int>()
    for (i in 1..10) {
        names.add(i)
    }
    names.add(5, 50)
    println("Aff : $names")
}
fun testmutableListOf() {
    val names = mutableListOf<Int>()

    val begin = System.nanoTime()
    for (i in 1..100_000_000) {
        names.add(i)
    }
    val end = System.nanoTime()

    val begin2 = System.nanoTime()
    //names.add(500_000, 5)
    val end2 = System.nanoTime()




    println("Boucles de 1 à 1 millions")
    println("Nanosecondes : ${end-begin}ns")
    val  result = end - begin
    val negativeNanosecond: Duration = result.nanoseconds
    print("Millisecondes : ")
    println(negativeNanosecond)

    println()
    val result2 = end2 - begin2
    println("Nanosecondes : ${end2-begin2}ns")
    val negativeNanosecond2: Duration = result2.nanoseconds
    print(negativeNanosecond2)
}

