package fr.hamtec.bob

sealed class SealedClass {

    class B(var bs: Int)
    class C(var cs: Int)

}

class testA() : SealedClass() {
    var a = C(5)

}