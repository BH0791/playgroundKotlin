## Les énumération

En programmation, il est parfois nécessaire qu'un type n'ait que certaines valeurs. Pour ce faire, le concept d'énumération a été introduit. Une énumération est une liste nommée de constantes.
En Kotlin, comme dans de nombreux autres langages de programmation, une énumération a son propre type spécialisé, indiquant que quelque chose a un certain nombre de valeurs possibles. Contrairement aux énumérations Java, les énumérations Kotlin sont des classes.

Quelques points importants sur les classes d'enum en Kotlin -

Les constantes d'énumération ne sont pas de simples collections de constantes - elles ont des propriétés, des méthodes, etc.
Chacune des constantes enum agit comme une instance distincte de la classe et est séparée par des virgules.
Les enums améliorent la lisibilité de votre code en attribuant des noms prédéfinis aux constantes.
Une instance de classe enum ne peut pas être créée à l'aide de constructeurs.
Aujourd'hui, les constantes Enum ne sont pas de simples collections de constantes : elles peuvent avoir des propriétés, implémenter des interfaces et bien plus encore.
