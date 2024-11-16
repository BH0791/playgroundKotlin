## Classes internes & imbriquées

| Caractéristique              | Classe imbriquée                         | Classe intérieur                        |
|------------------------------|------------------------------------------|-----------------------------------------|
| Accès à la classe extérieure | 	Non                                     | 	Oui                                    |
| Mot-clé utilisé              | 	Aucun mot-clé spécifique                | 	inner mot-clé                          |
| Cas d’utilisation            | 	Classes d’utilité, regroupement logique | 	Callbacks, logique étroitement couplée |
| Instanciation                | 	OuterClass.NestedClass()                | 	outerInstance.InnerClass()             |

## Classe scellée

En termes simples, comme leur nom l'indique, les classes scellées sont scellées ou fermées, ce qui les rend restreintes.
Lorsque vous déclarez une classe comme scellée, vous indiquez que toutes les sous-classes doivent être définies dans le
même fichier. Cela permet au compilateur de connaître toutes les sous-classes possibles au moment de la compilation, ce
qui est particulièrement utile pour la sécurité des types et les expressions when exhaustives.

Dans le développement UI, gérer différents états (comme le chargement, la réussite et l'erreur) est crucial. Les classes
scellées peuvent vous aider à représenter ces états clairement.

Les classes scellées peuvent également être utilisées pour représenter des structures de données complexes, telles
qu'une hiérarchie de différents types de comptes utilisateur.

