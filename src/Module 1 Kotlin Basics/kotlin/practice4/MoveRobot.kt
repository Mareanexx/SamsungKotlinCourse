package practice4

/* 1.4. ������������ ������
    ������� 2
*/

fun moveRobot(r: Robot, toX: Int, toY: Int) {
    when { // �������� ����������� ������ �� ������ �� X
        toX > r.x ->  { // ���� ����� ���� �������
            while(r.direction != Direction.RIGHT) {
                if (r.direction == Direction.UP) r.turnRight() else r.turnLeft()
            }
        }
        toX < r.x -> { //���� ����� ���� ������
            while(r.direction != Direction.LEFT) {
                if (r.direction == Direction.UP) r.turnLeft() else r.turnRight()
            }
        }
        else -> {}
    }
    while(r.x != toX) { // ����� ���� �� ������ ��������� �� ��� X
        r.stepForward()
    }

    when { // �������� ����������� ������ �� ������ �� Y
        toY > r.y ->  { // ���� ����� ���� �����
            while(r.direction != Direction.UP) {
                if (r.direction == Direction.LEFT) r.turnRight() else r.turnLeft()
            }
        }
        toY < r.y -> { //���� ����� ���� ����
            while(r.direction != Direction.DOWN) {
                if (r.direction == Direction.LEFT) r.turnLeft() else r.turnRight()
            }
        }
        else -> {}
    }
    while(r.y != toY) { // ����� ���� �� ������ ��������� �� ��� Y
        r.stepForward()
    }
}

fun main() {
    // ���� �1 -- 3, 7
    val r = Robot(0, 1, Direction.UP)
    moveRobot(r, 0, -1)
    println("${r.x} ${r.y}")
}