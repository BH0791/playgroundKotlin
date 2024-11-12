package fr.hamtec.planetTerre

class User(
    email: String,
    var password: String,
    var age: Int
) {
    constructor(email: String) : this(email, "XXXX", 0)

    var email: String = email
        get() {
            println("get() -L'utilisateur reçoit son courriell: ${field}.")
            return field
        }
        set(value) {
            println("set() -L'utilisateur configure son e-mail")
            field = value
        }
}