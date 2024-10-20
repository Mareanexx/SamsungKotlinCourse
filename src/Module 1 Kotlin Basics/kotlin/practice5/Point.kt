package practice5

internal class Point(var x: Int, var y: Int) : Movable {
    override fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
    }
}