package fr.hamtec.bimbo

enum class DogRace(val group: Int, val section: Int, val number: Int) {
    Golden_Retriever(8, 1, 111) {
        override fun lifeSpan(): IntRange {
            TODO("Not yet implemented")
        }
    },
    German_Shepherd(1, 1, 1666) {
        override fun lifeSpan(): IntRange = IntRange(10,12)
    },
    Poodle(9, 2, 72) {
        override fun lifeSpan(): IntRange {
            TODO("Not yet implemented")
        }
    },
    Shiba(5, 5, 257) {
        override fun lifeSpan(): IntRange {
            TODO("Not yet implemented")
        }
    },
    Beagle(6, 1, 161) {
        override fun lifeSpan(): IntRange {
            TODO("Not yet implemented")
        }
    };

    abstract fun lifeSpan(): IntRange


    override fun toString(): String {
        return "DogRace(group=$group, section=$section, number=$number)"
    }


}