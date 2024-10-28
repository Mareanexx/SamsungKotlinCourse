package finalTest

/*
    Контрольный тест по модулю 1.

    Задание на расчет контрольного разряда номера
    почтового отправления
*/

fun control(number: Int) : Int {
    val multipliers = intArrayOf(8, 6, 4, 2, 3, 5, 9, 7)

    val listNumbers = number.toString().map { it.toString().toInt() }.toMutableList()
    var sumOfNumbers = 0

    for (i in listNumbers.indices) {
        sumOfNumbers += listNumbers[i] * multipliers[i]
    }

    val resultDel = sumOfNumbers % 11
    val controlDigit = 11 - resultDel

    return controlDigit
}

fun main() {
    val number = readln().toInt()
    println(control(number))
}