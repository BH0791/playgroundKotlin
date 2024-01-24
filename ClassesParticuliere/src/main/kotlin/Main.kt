package fr.hamtec

fun main() {
    println("\nEnumération")
    for (day in Day.values())
        println("[${day.ordinal}] -> ${day.name} (${day.dayOfWeek}^ day of the week)")
}