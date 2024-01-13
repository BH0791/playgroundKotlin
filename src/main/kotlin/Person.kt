package fr.hamtec

class Person(val name: String, age: Int) {

    var age: Int = age
        set(age){
            if (age > 0){
                field = age
            }else{
                println("Impossible!")
            }
        }
        get() {
            return field
        }


    override fun toString(): String {
        return "|-Person(\n" +
                "| \tname='" + name + "', \n" +
                "| \tage=" + age + "\n" +
                "|-)"
    }

}