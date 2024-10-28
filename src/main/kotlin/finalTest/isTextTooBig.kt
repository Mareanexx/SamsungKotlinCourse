package finalTest

/*
    Контрольный тест по модулю 1.

    Задание на расчет содержит ли текст слишком много букв
*/

internal abstract class Text {
    internal abstract fun letters(): Int
    internal fun isTextTooBig() = letters() >= 100500
}

private class Book(
    val numberOfPages : Int
): Text() {
    override fun letters(): Int = numberOfPages * 1000
}

fun main() {
    println(Book(1001).isTextTooBig())
    println(Book(1).isTextTooBig())
}