## SharedFlow

A est un flux chaud qui peut avoir plusieurs collecteurs. Il peut émettre des valeurs indépendamment des collecteurs, et plusieurs collecteurs peuvent collecter les mêmes valeurs à partir du flux.

Il est utile lorsque vous devez diffuser une valeur à plusieurs collecteurs ou lorsque vous souhaitez avoir plusieurs abonnés au même flux de données.

Il n’a pas de valeur initiale, et vous pouvez configurer son cache de relecture pour stocker un certain nombre de valeurs précédemment émises pour les nouveaux collecteurs.

Cas d’utilisation 1 de SharedFlow : Application de messagerie instantanée

Supposons que nous voulions créer une application de chat en temps réel à l’aide de SharedFlow et des meilleures pratiques. Nous en aurons un qui simule la réception de messages de chat, un qui gère le flux de messages et une activité Android pour afficher les messages.ChatRepositoryChatViewModel