## Les intefaces

Les interfaces peuvent contenir des déclarations de méthodes abstraites, ainsi que des implémentations de méthodes. Ce qui les différencie des classes abstraites, c'est que les interfaces ne peuvent pas stocker d'état. Elles peuvent avoir des propriétés, mais celles-ci doivent être abstraites ou fournir des implémentations d'accesseurs.

```
interface Domestic{
    fun lick()
    fun snuggle()
}
```