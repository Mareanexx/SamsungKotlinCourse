package practice5

/* 1.5. Практическая работа
    Задание 1
*/

fun main() {
    val arrayOfPoints = ArrayList<Point>().apply {
        add(Point(10, 9))
        add(Point(1, 2))
        add(Point(3, 4))
        add(Point(-23, -2))
    }
    val cloud = CloudOfPoints(arrayOfPoints)
}