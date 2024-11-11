package fr.hamtec.chatETchien

class Dog constructor(
    var name: String,
    var age: Int,
    var race: String,
    var color: String,
    var size: Int,
    var weight: Float,
    var position: Char = 't'
) {
    constructor(name: String): this(name, 0, "unknown", "unknown", 0, 0f, 't')

}