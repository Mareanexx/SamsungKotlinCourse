package practice1

import java.util.Scanner

/* 1.1. Практическая работа
    Задание 2
*/

// Считает число нуклеотидов каждого типа в строке
fun countDNAnucleotides(str: String) : String {
    val mapLettersAndCount : MutableMap<Char, Int> = mutableMapOf(
        'A' to 0, 'T' to 0, 'G' to 0, 'C' to 0
    )
    for (elem in str) {
        if (elem in mapLettersAndCount.keys)
            mapLettersAndCount[elem] = mapLettersAndCount[elem]!! + 1
    }
    return mapLettersAndCount.values.joinToString(separator = " ")
}

fun main() {
    // Ввод ATGCCTCTCTC -- Результат 1 4 1 5
    val scanner = Scanner(System.`in`)
    val inputStr = scanner.nextLine()
    println(countDNAnucleotides(inputStr))
}