package fr.hamtec.bob

/**
 * Explication : La InnerClass est déclarée avec le mot-clé inner, ce qui signifie qu'elle peut accéder
 * aux membres de la classe externe. Pour créer une instance de la InnerClass, il faut d'abord une
 * instance de la OuterClass. La innerMethod() de la InnerClass accède à la outerProperty de la OuterClass.
 */
class OuterClass {
    private val outerProperty = "Outer Property"

    inner class InnerClass {
        fun innerMethod() = "Accessing: $outerProperty from Inner Class"
    }
}

fun testOuterClass() {
    val outerInstance = OuterClass()        //- instance de OuterClass
    val innerInstance = outerInstance.InnerClass()

    println(innerInstance.innerMethod())
}