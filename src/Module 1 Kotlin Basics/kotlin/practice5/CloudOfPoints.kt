package practice5

internal class CloudOfPoints(val points: ArrayList<Point>) : Movable {
    override fun move(dx: Int, dy: Int) {
        for (point in points) {
            point.move(dx, dy)
        }
    }
}