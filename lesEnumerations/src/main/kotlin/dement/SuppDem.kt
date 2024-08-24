package fr.hamtec.dement


enum class FirstCardType {
    SILVER, GOLD, PLATINUM
}

enum class SecondCardType(val color: String) {
    SILVER("gray"),
    GOLD("yellow"),
    PLATINUM("black")
}

enum class thirdCardType {
    SILVER {
        override fun calculateCashbackPercent() = 0.25f
    },
    GOLD {
        override fun calculateCashbackPercent() = 0.5f
    },
    PLATINUM {
        override fun calculateCashbackPercent() = 0.75f
    };

    abstract fun calculateCashbackPercent(): Float
}

interface ICardLimit {
    fun getCreditLimit(): Int
}

enum class CardType : ICardLimit {
    SILVER {
        override fun getCreditLimit() = 100000
    },
    GOLD {
        override fun getCreditLimit() = 200000
    },
    PLATINUM {
        override fun getCreditLimit() = 300000
    }
}