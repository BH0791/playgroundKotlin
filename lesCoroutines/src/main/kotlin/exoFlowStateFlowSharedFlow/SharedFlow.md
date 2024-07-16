## SharedFlow

A est un flux chaud qui peut avoir plusieurs collecteurs. Il peut émettre des valeurs indépendamment des collecteurs, et plusieurs collecteurs peuvent collecter les mêmes valeurs à partir du flux.

Il est utile lorsque vous devez diffuser une valeur à plusieurs collecteurs ou lorsque vous souhaitez avoir plusieurs abonnés au même flux de données.

Il n’a pas de valeur initiale, et vous pouvez configurer son cache de relecture pour stocker un certain nombre de valeurs précédemment émises pour les nouveaux collecteurs.