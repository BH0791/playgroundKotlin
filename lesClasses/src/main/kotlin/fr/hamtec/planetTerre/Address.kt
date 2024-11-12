package fr.hamtec.planetTerre

class Address {
    var name: String = "Holmes, Sherlock"
        get() = field
        private set(value) {
            field = value
        }
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"
}