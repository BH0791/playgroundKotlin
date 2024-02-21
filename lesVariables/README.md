## Utilisation de la méthode String.format de Java

La méthode String.format de Java est pratique pour formater une entrée à l’aide de la chaîne de format printf. Nous pouvons facilement créer une méthode dans Kotlin qui invoque la méthode Java pour convertir un nombre double Kotlin en une chaîne de caractères :

fun usingJavaStringFormat(input: Double, scale: Int) = String.format("%.${scale}f", input)

printf "%.*f\n" 0 3.1415926<br>
3

printf "%.*f\n" 2 3.1415926<br>
3.14

printf "%.*f\n" 4 3.1415926<br>
3.1416