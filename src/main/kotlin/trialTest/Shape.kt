package trialTest

import kotlin.math.PI

/*
    Пробное тестирование по Модулю 1
    Задание на общую площадь трех фигур
*/

abstract class Shape : Comparable<Shape>{
    abstract fun area(): Double
    override fun compareTo(other: Shape) = this.area().compareTo(other.area())
}

class Square(val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return PI * radius * radius
    }
}

class Rectangle(val length: Double, val width: Double) : Shape() {
    override fun area(): Double {
        return length * width
    }
}

fun calculateAllAreas(arrayShapes: MutableList<Shape>) : Double {
    var sum = 0.0
    for (shape in arrayShapes) {
        sum += shape.area()
    }
    return sum
}

fun main() {
    // 3
    // R 10 20
    // C 4
    // S 6
    val arrayShapes = mutableListOf<Shape>()
    val n = readln().toInt() // количество строк
    for (i in 1..n) {
        val tempStr = readln().split(" ")
        when(tempStr[0]) {
            "R" -> arrayShapes.add(Rectangle(tempStr[1].toDouble(), tempStr[2].toDouble()))
            "S" -> arrayShapes.add(Square(tempStr[1].toDouble()))
            "C" -> arrayShapes.add(Circle(tempStr[1].toDouble()))
        }
    }
    println(String.format("%.2f", calculateAllAreas(arrayShapes)))
}