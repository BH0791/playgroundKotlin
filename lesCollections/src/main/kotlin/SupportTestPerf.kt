import java.util.*
import kotlin.system.measureTimeMillis

val mutableMutableListOf: MutableList<Int> = mutableListOf()
val mutablearrayListOf: MutableList<Int> = arrayListOf()
val mutableEmptyList: MutableList<Int> = LinkedList()
val mutableNumbers: MutableSet<Int> = mutableSetOf()

fun firstTest(): Unit {
    println("Start testing...")
    val mutableListTest = measureTimeMillis {
        for(i in 1..100_000_000) {
            mutableMutableListOf.add(i)
        }
    }
    val arrayListOfTest = measureTimeMillis {
        for(i in 1..100_000_000) {
            mutablearrayListOf.add(i)
        }
    }
    val LinkedListTest = measureTimeMillis {
        for(i in 1..100_000_000) {
            mutableEmptyList.add(i)
        }
    }
    //--
    val mutableListTestAdd = measureTimeMillis {
        mutableMutableListOf.add(50_000_000, 25)
    }
    val arrayListOfTestAdd = measureTimeMillis {
        mutablearrayListOf.add(50_000_000, 25)
    }
    val linkedListTestAdd = measureTimeMillis {
        mutableEmptyList.add(50_000_000, 25)
    }

    println("mutableListOf ==> init: $mutableListTest ms, add in the middle: $mutableListTestAdd ms")
    println("arrayListOfTest ==> init: $arrayListOfTest ms, add in the middle: $arrayListOfTestAdd ms")
    println("LinkedList ==> init: $LinkedListTest ms, add in the middle: $linkedListTestAdd ms")
}

fun secondTest(): Unit {


    val mutableListTest = measureTimeMillis {
        println("Start testing...")
        for(i in 1..100_000_000) {
            mutableMutableListOf.add(i)
        }
        mutableMutableListOf.add(50_000_000, 25)
    }
    val arrayListOfTest = measureTimeMillis {
        for(i in 1..100_000_000) {
            mutablearrayListOf.add(i)
        }
        mutablearrayListOf.add(50_000_000, 25)
    }
    val LinkedListTest = measureTimeMillis {
        for(i in 1..100_000_000) {
            mutableEmptyList.add(i)
        }
        mutableEmptyList.add(50_000_000, 25)
    }

    println("mutableListOf: $mutableListTest ms")
    println("arrayListOfTest: $arrayListOfTest ms")
    println("LinkedList: $LinkedListTest ms")
}