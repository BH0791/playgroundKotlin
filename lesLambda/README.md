### Syntaxe
- fun Nom ( Params ) = ...
- Nom fun ( Params ) {...}
- fun Nom ( Params ): Type {...}
- fun < Type Argument > Name ( Params ): Type {...}
- inline fun Name ( Params ): tapez {...}
- { ArgName : ArgType -> ...}
- { ArgName -> ...}
- { ArgNames -> ...}
- {( ArgName : ArgType ): Type -> ...}

### Fonctions Lambda
Les fonctions Lambda sont des fonctions anonymes qui sont généralement créées lors d'un appel de fonction pour agir en tant que paramètre de fonction. Ils sont déclarés par des expressions environnantes avec {accolades} - si des arguments sont nécessaires, ils sont mis avant une flèche -> .<br>
La dernière instruction dans une fonction lambda est automatiquement la valeur de retour.<br>
Si la fonction lambda ne nécessite qu'un seul argument, la liste des arguments peut être omise et l'argument unique peut être utilisé it place.<br>
Nous pouvons référencer une fonction sans l'appeler en préfixant le nom de la fonction avec :: . Cela peut ensuite être passé à une fonction qui accepte une autre fonction en tant que paramètre.