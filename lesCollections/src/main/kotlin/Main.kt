package fr.hamtec

import java.util.*


fun main() {
    println("Hello collection!")
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

fun ListOfExemple() {
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem)

    for (index in solarSystem) {
        println(index)
    }
}

