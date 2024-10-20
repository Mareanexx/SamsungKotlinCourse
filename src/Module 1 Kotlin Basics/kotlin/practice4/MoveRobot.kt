package practice4

/* 1.4. Практическая работа
    Задание 2
*/

fun moveRobot(r: Robot, toX: Int, toY: Int) {
    when { // изменить направление робота на нужное по X
        toX > r.x ->  { // если нужно идти направо
            while(r.direction != Direction.RIGHT) {
                if (r.direction == Direction.UP) r.turnRight() else r.turnLeft()
            }
        }
        toX < r.x -> { //если нужно идти налево
            while(r.direction != Direction.LEFT) {
                if (r.direction == Direction.UP) r.turnLeft() else r.turnRight()
            }
        }
        else -> {}
    }
    while(r.x != toX) { // робот идет до нужных координат по оси X
        r.stepForward()
    }

    when { // изменить направление робота на нужное по Y
        toY > r.y ->  { // если нужно идти вверх
            while(r.direction != Direction.UP) {
                if (r.direction == Direction.LEFT) r.turnRight() else r.turnLeft()
            }
        }
        toY < r.y -> { //если нужно идти вниз
            while(r.direction != Direction.DOWN) {
                if (r.direction == Direction.LEFT) r.turnLeft() else r.turnRight()
            }
        }
        else -> {}
    }
    while(r.y != toY) { // робот идет до нужных координат по оси Y
        r.stepForward()
    }
}

fun main() {
    // Тест №1 -- 3, 7
    val r = Robot(0, 1, Direction.UP)
    moveRobot(r, 0, -1)
    println("${r.x} ${r.y}")
}