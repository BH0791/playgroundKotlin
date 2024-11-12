package fr.hamtec.planetTerre

class User(
    email: String,
    var password: String,
    var age: Int
) {
    var email: String = email
        get() {
            println("User is getting their email.");
            return field
        }
        set(value) {
            println("User is setting their email");
            field = value
        }
}