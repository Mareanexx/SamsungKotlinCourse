package practice1

/* 1.1. Практическая работа
    Задание 1
*/

// Определяет, помещается ли ковер в комнату
fun carpetFitsTheFloor(a: Float, b: Float, m: Float, n: Float) : String {
    if (a >= m && b >= n || a >= n && b >= m) {
        return "YES"
    }
    return "NO"
}

fun main() {
    // a и b - стороны комнаты, m и n - стороны ковра
    val (a, b, m, n) = readln().split(" ").map { it.toFloat() }
    println(carpetFitsTheFloor(a, b, m, n))
}

