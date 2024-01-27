package fr.hamtec

enum class Day {
    MONDAY(1, "Monday"),
    TUESDAY(2, "Tuesday"),
    WEDNESDAY(3, "Wednesday"),
    THURSDAY(4, "Thursday"),
    FRIDAY(5, "Friday"),
    SATURDAY(6, "Saturday"),
    SUNDAY(7, "Sunday"); // end of the constants

    // custom properties with default values
    var dayOfWeek: Int? = null
    var printableName: String? = null

    constructor()

    // custom constructors
    constructor(
        dayOfWeek: Int,
        printableName: String
    ) {
        this.dayOfWeek = dayOfWeek
        this.printableName = printableName
    }

    // custom method
    fun customToString(): String {
        return "[${dayOfWeek}] -> $printableName"
    }
}