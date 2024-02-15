| Fonction | Référence de l'objet   | Valeur de retour  | Est une fonction d'extension               |
|----------|------------------------|-------------------|--------------------------------------------|
| let      | it                     | lambda            | oui                                        |
| run      | this                   | lambda            | oui                                        |
| run      | -                      | lambda            | non : appelé sans l'objet context          |
| with     | this                   | lambda            | non : prend l'objet context comme argument |
| apply    | this                   | Objet de contexte | oui                                        |
| also     | it                     | Objet de contexte | oui                                        |

