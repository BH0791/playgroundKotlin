fun PremiereList(): Unit {
    val list = listOf("Jean", "John", "Laurent", "Philipe")
    val numbers = listOf(1, 5, 7, 32, 0, 21, 1, 6, 10)
    val a1 = listOf('1', '2', '3')
    val a = listOf("Ram", "Shyam", "Raja", "Rani")
    val numero = list.size

    val num1 = numbers.get(0)
    println(num1)
    val num2 = numbers[7]
    println(num2)
    val index1 = numbers.indexOf(1)
    println("The first index of number is $index1")
    val index2 = numbers.lastIndexOf(1)
    println("The last index of number is $index2")
    val index3 = numbers.lastIndex
    println("The last index of the list is $index3")
}
