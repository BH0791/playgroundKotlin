## Fonctions d’étendue

Les fonctions de portée créent une portée temporaire pour l’objet lorsque nous les appelons avec une expression lambda. Il existe 5 fonctions d’étendue dans Kotlin, à savoir also, let, apply, run et with.

Alors que toutes les fonctions de portée dans Kotlin remplissent la même fonction, ce qui est différent, c’est la façon dont l’objet à l’intérieur de ce bloc est disponible après l’exécution. En fonction de la valeur de retour et de la référence de l’objet, nous devons choisir l’une des cinq fonctions de portée.

| Fonction | Référence | Valeur de retour | Fonction d'extension |
|----------|-----------|------------------|----------------------|
| also     | it        | lambda           | oui                  |
| let      | this      | lambda           | oui                  |
| apply    | -         | lambda           | non                  |
| run      | this      | lambda           | non                  |
| run      | this      | Objet contextuel | oui                  |
| with     | it        | Objet contextuel | oui                  |

La fonction let vous permet d'effectuer une certaine opération sur un objet et de renvoyer une valeur si vous le souhaitez. Par défaut, la dernière instruction d'un bloc let est une instruction return s'il ne s'agit pas d'une affectation. Si vous ne renvoyez pas de valeur dans le bloc let, cela revient à appeler une fonction qui ne contient aucune valeur de retour.
Dans le cas de let, le contexte de l'objet est obtenu en l'utilisant. Si vous êtes familier avec les lambdas, vous pouvez le renommer comme vous le souhaitez pour plus de lisibilité, surtout si vous avez affaire à des blocs imbriqués.

Run est assez similaire à let dans le sens où vous pouvez renvoyer une valeur d'un type différent à partir du récepteur. Cependant, l'objet contextuel est ceci au lieu de cela. Exécuter est particulièrement utile si vous souhaitez initialiser un objet, puis calculer une valeur de retour. Avec et run sont similaires à l'utilisation du mot - clé this.
La aussi fonction de la portée présente des similitudes à laisser en ce que le contexte du récepteur est il tout en fournissant des chèques nuls ainsi. En outre, la valeur de retour est l'objet. Cela signifie que le code suivant n'imprimera pas réellement la valeur dans le bloc aussi

Certes, ils sont assez nombreux au début. En tant que tel, vous pouvez être confus quant à la façon dont vous choisissez la bonne fonction à utiliser. La plupart du temps, cela dépendra de vous. Cependant, si vous souhaitez obtenir une compréhension plus approfondie de la même chose, vous pouvez consulter la documentation officielle et ce tableau.