package finalTest

/*
    Контрольный тест по модулю 1.

    Задание на поворот точки на 90 градусов
*/

interface Rotatable {
    fun rotate()
}

internal class Point(var x: Int, var y: Int) : Rotatable {
    override fun rotate() {
        val newX = y
        val newY = -x
        x = newX
        y = newY
    }
}

fun main() {
    val p = Point(1, 1)
    val p2 = Point(2, 1)

    p.rotate(); println("${p.x} ${p.y}") // (1, -1)
    p2.rotate(); println("${p2.x} ${p2.y}") // (1, -2)
    p2.rotate(); println("${p2.x} ${p2.y}") // (-2, -1)
    p2.rotate(); println("${p2.x} ${p2.y}") // (-1, 2)
    p2.rotate(); println("${p2.x} ${p2.y}") // (2, 1)
}
