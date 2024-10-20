package practice6

/* 1.6. Теоретический тест
    Задание 1
*/

// Функция-расширение для String, алгоритм Луна
fun String.isValidCCNumber() : Boolean {
    val listOfNumbers = this.filter { it -> it in '0'..'9'  }.map { it.toString().toInt() }.toMutableList()
    listOfNumbers.reverse()
    for (i in listOfNumbers.indices) {
        if (i % 2 != 0) {
            listOfNumbers[i] *= 2
            if (listOfNumbers[i] > 9) {
                listOfNumbers[i] = listOfNumbers[i].toString().toList().map { it.toString().toInt() }.sum()
            }
        }
    }
    return listOfNumbers.sum() % 10 == 0
}

// Функция для вывода валидности карты
fun printValidity(isValid: Boolean) {
    if (isValid)
        println("Number is valid")
    else println("Number is invalid")
}

fun main() {
    "4561 2612 1234 5467".isValidCCNumber().also { printValidity(it) }
    "79927398712".isValidCCNumber().also { printValidity(it) }
    "3561 2612 1234 5467".isValidCCNumber().also { printValidity(it) }
    "79927398713".isValidCCNumber().also { printValidity(it) }
}