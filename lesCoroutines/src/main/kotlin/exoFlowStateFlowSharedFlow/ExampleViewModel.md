## ExampleViewModel

Exposez une version en lecture seule de votre flux muable pour empêcher les modifications externes. Cela peut être réalisé en utilisant l’interface pour et l’interface pour .SharedFlowMutable, SharedFlowState et FlowMutableStateFlow

## Meilleures pratiques

Choisissez le bon flux :
À utiliser lorsque vous devez diffuser des valeurs à plusieurs collecteurs ou lorsque vous souhaitez avoir plusieurs abonnés au même flux de données.SharedFlow
À utiliser lorsque vous devez gérer et partager une source unique de vérité pour un état et mettre automatiquement à jour tous les collecteurs avec l’état le plus récent.

## Gérez correctement les ressources

Lorsque vous utilisez un ou , assurez-vous de gérer correctement les ressources en annulant les coroutines ou les collecteurs lorsqu’ils ne sont plus nécessaires.