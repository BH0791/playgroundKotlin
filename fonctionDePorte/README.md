## Fonction de portée

| Fonction | Référence de l'objet   | Valeur de retour  | Est une fonction d'extension               |
|----------|------------------------|-------------------|--------------------------------------------|
| let      | it                     | lambda            | oui                                        |
| run      | this                   | lambda            | oui                                        |
| run      | -                      | lambda            | non : appelé sans l'objet context          |
| with     | this                   | lambda            | non : prend l'objet context comme argument |
| apply    | this                   | Objet de contexte | oui                                        |
| also     | it                     | Objet de contexte | oui                                        |

Voici un petit guide pour choisir les fonctions de l’oscilloscope en fonction de l’objectif visé :

- Exécution d’une lambda sur des objets non nullables : let
- Introduction d’une expression en tant que variable dans la portée locale : let
- Configuration de l’objet : apply
- Configuration de l’objet et calcul du résultat : run
- Instructions en cours d’exécution où une expression est requise : non-extension run
- Effets supplémentaires : also
- La fonction de regroupement fait appel à un objet : with