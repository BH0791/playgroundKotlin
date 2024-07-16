package fr.hamtec.exoFilm

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf

// Zack Snyder's Justice League
val henryCavill = Actor(Id(1), FirstName("Henry"), LastName("Cavill"))
val galGadot: Actor = Actor(Id(1), FirstName("Gal"), LastName("Gadot"))
val ezraMiller: Actor = Actor(Id(2), FirstName("Ezra"), LastName("Miller"))
val rayFisher: Actor = Actor(Id(3), FirstName("Ray"), LastName("Fisher"))
val benAffleck: Actor = Actor(Id(4), FirstName("Ben"), LastName("Affleck"))
val jasonMomoa: Actor = Actor(Id(5), FirstName("Jason"), LastName("Momoa"))
// The Avengers
val robertDowneyJr: Actor = Actor(Id(6), FirstName("Robert"), LastName("Downey Jr."))
val chrisEvans: Actor = Actor(Id(7), FirstName("Chris"), LastName("Evans"))
val markRuffalo: Actor = Actor(Id(8), FirstName("Mark"), LastName("Ruffalo"))
val chrisHemsworth: Actor = Actor(Id(9), FirstName("Chris"), LastName("Hemsworth"))
val scarlettJohansson: Actor = Actor(Id(10), FirstName("Scarlett"), LastName("Johansson"))
val jeremyRenner: Actor = Actor(Id(11), FirstName("Jeremy"), LastName("Renner"))

// Spider-Man
val tomHolland: Actor = Actor(Id(12), FirstName("Tom"), LastName("Holland"))
val tobeyMaguire: Actor = Actor(Id(13), FirstName("Tobey"), LastName("Maguire"))
val andrewGarfield: Actor = Actor(Id(14), FirstName("Andrew"), LastName("Garfield"))

val zackSnyderJusticeLeague: Flow<Actor> =
    flowOf(
            henryCavill,
            galGadot,
            ezraMiller,
            benAffleck,
            jasonMomoa
    )

val avengers: Flow<Actor> =
    listOf(
            robertDowneyJr,
            chrisEvans,
            markRuffalo,
            chrisHemsworth,
            scarlettJohansson,
            jeremyRenner,
    ).asFlow()

val theMostRecentSpiderManFun: () -> Actor = { tomHolland }

val theMostRecentSpiderMan: Flow<Actor> = theMostRecentSpiderManFun.asFlow()

val spiderMen: Flow<Actor> = flow {
    emit(tobeyMaguire)
    emit(andrewGarfield)
    emit(tomHolland)
}
val infiniteJLFlowActors: Flow<Actor> = flow {
    while (true) {
        emit(henryCavill)
        emit(galGadot)
        emit(ezraMiller)
        emit(jasonMomoa)
    }
}