package fr.hamtec.geometrie

class Rectangle(
    val width: Int,
    val height: Int
) {
    val area: Int //++ est facultatif puisqu'il peut être déduit du type de retour de l'outil d'acquisition. val area get() = this.width * this.height
        get() = this.width * this.height //++ // Vous pouvez omettre le type de propriété s’il peut être déduit du getter :
}