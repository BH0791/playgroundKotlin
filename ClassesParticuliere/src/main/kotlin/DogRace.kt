package fr.hamtec

enum class DogRace(val group: Int, val section: Int, val number: Int) {

    Golden_Retriver(8,1,111) {
        override fun lifeSpan(): IntRange = IntRange(10,12)

    },
    German_Shepherd(1,1,166) {
        override fun lifeSpan(): IntRange {
            TODO("Not yet implemented")
        }
    },
    Poodle(9,2,172) {
        override fun lifeSpan(): IntRange {
            TODO("Not yet implemented")
        }
    },
    Shiba(5,5,257) {
        override fun lifeSpan(): IntRange {
            TODO("Not yet implemented")
        }
    },
    Beagle(6,1,161) {
        override fun lifeSpan(): IntRange {
            TODO("Not yet implemented")
        }
    };

    abstract fun lifeSpan(): IntRange

}