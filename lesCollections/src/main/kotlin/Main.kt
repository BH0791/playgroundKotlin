package fr.hamtec

import java.util.*


fun main() {
    println("Hello collection!")
    tableauArrayList()


}
fun tableauTreeSetJava(){
    println()
    var al = TreeSet<String?>()
    al.add("Ravi");
    al.add("Vijay");
    al.add("Ravi");
    al.add("Ajay");
    var itr: Iterator<String?> = al.iterator()
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
}
fun tableauArrayList(){

    var arrayList = ArrayList<String>()

    arrayList.add("Mercury")
    arrayList.add("Venus")

    println("===> ArrayList <===")
    for (index in arrayList){
        println(index)
    }

    arrayList.add(1, "Mars")
    println("Arraylist après l'insertion ---->")
    for (index in arrayList)
        println(index)

    var arraylist1=ArrayList<String>()
    //Ajout de tous les éléments de la liste de arrayList à arrayList1
    println("Elements dans arraylist1 -->")
    arraylist1.addAll(arrayList)
    for(i in arraylist1)
        println(i)
}
fun tableauListOf(){
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem)

    for (index in solarSystem){
        println(index)
    }
}