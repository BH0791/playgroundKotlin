1. Le modèle DDD complet (code)

    - Hero.kt

2. Ce qui est DDD là‑dedans (en ultra‑court)

    - Aggregate Root : Hero
    - Aggregate interne : Inventory
    - Value Objects : HeroId, Inventory.Item
    - Domain Events : Hero.DomainEvent.* (sealed)
    - Méthodes métier : pick(), drop() → seules portes d’entrée
    - Factory : Hero.create() → invariants à la création
    - Encapsulation : Inventory et sa liste sont totalement cachés

Tu retrouves :

    - classes imbriquées
    - data classes
    - sealed classes
    - méthodes‑portail
    - invariants protégés