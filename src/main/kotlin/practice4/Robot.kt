package practice4

/* 1.4. Практическая работа
    Задание 1
*/

data class Robot(var x: Int, var y: Int, var direction: Direction) {
    fun turnLeft() {
        direction = when (direction) {
            Direction.UP -> Direction.LEFT
            Direction.LEFT -> Direction.DOWN
            Direction.DOWN -> Direction.RIGHT
            Direction.RIGHT -> Direction.UP
        }
    }

    fun turnRight() {
        direction = when (direction) {
            Direction.UP -> Direction.RIGHT
            Direction.RIGHT -> Direction.DOWN
            Direction.DOWN -> Direction.LEFT
            Direction.LEFT -> Direction.UP
        }
    }

    // Функция для шага
    fun stepForward() {
        when (direction) {
            Direction.UP -> y += 1
            Direction.DOWN -> y -= 1
            Direction.RIGHT -> x += 1
            Direction.LEFT -> x -= 1
        }
    }

    override fun toString(): String {
        return "x: $x, y: $y, dir: $direction"
    }
}