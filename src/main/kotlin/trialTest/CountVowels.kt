package trialTest

/*
    Пробное тестирование по Модулю 1
    Задание на подсчет количество гласных букв в строке
*/

fun String.countVowels() : Int {
    var counter = 0
    for (symbol in this) {
        if (symbol in listOf('a', 'u', 'o', 'i', 'e'))
            counter++
    }
    return counter
}

fun main() {
    "I'm here to see you".countVowels().let { println("Number of vowels = $it") }
    "Welcome  to Neverland! Be our guest.".countVowels().let { println("Number of vowels = $it") }
}