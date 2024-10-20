package trialTest

/*
    Пробное тестирование по Модулю 1
    Задание на расчет контрольной суммы
*/

// Функция для расчета контрольной суммы - проверки целостности
fun calcCheckSum(inputArray: MutableList<Int>) : Int {
    var sum = 0
    for (num in inputArray) {
        sum = (sum + num) * 113 % 10000007
    }
    return sum
}

fun main() {
    val arrayOfInts = mutableListOf<Int>()
    val numberOfElements = readln().toInt()
    readln().split(" ").let { arrayOfInts.addAll(it.map { it.toInt() }) }
    println(calcCheckSum(arrayOfInts))
}