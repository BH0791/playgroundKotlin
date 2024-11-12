### Les Getter et Setter

````aiignore
var <propertyName>[: <PropertyType>] [= <property_initializer>]
    [<getter>]
    [<setter>]

````

Afin d’avoir accès au getter et au setter de notre propriété email , il a fallu dans un premier temps retirer le mot-clé
val devant son nom dans le constructeur de la classe : cela permet à Kotlin de le considérer comme un paramètre, et non
une propriété. Puis nous avons déclaré la propriété email dans le corps de notre classe User et initialisé celle-ci via
le paramètre du même nom situé dans le constructeur. Ensuite, nous avons utilisé les mots-clés get()  et set()  en
dessous de cette propriété afin de modifier le comportement de son getter et de son setter.
Le mot-clé field quant à lui fait référence à la propriété elle-même (sans passer par son getter ou setter, pour éviter
bien sûr de boucler à l'infini !) : on appelle d'ailleurs cela le "Backing Field".

````
class User(
    email: String,
    var password: String,
    var age: Int
) {
    var email: String = email
        get() {
            println("User is getting their email.");
            return field
        }
        set(value) {
            println("User is setting their email");
            field = value
        }
}

````

### Backing fields ==> Champs de sauvegarde

En Kotlin, un champ n'est utilisé qu'en tant que partie d'une propriété pour conserver sa valeur en mémoire. Les champs
ne peuvent pas être déclarés directement. Cependant, lorsqu'une propriété a besoin d'un champ d'appui, Kotlin le fournit
automatiquement. Ce champ d'appui peut être référencé dans les accesseurs à l'aide de l'identifiant du champ :

````
var counter = 0 // the initializer assigns the backing field directly
    set(value) {
        if (value >= 0)
            field = value
            // counter = value // ERROR StackOverflow: Using actual name 'counter' would make setter recursive
    }

````