package practice2

/* 1.2. ������������ ������
    ������� 1
*/

val AVAILABLE_VOWELS : CharArray = charArrayOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

// ������� ���������� ������� ���������� ���� � ������
fun countVowels(inputStr: String) : Int {
    var sum : Int = 0
    for (symbol in inputStr) {
        sum += if (symbol in AVAILABLE_VOWELS) 1 else 0
    }
    return sum
}

fun main() {
    // ���� "jingle bells" -- ��������� 3
    // ���� "tzxncmppqh123" -- ��������� 0
    val inputStr = readlnOrNull()
    if (inputStr != null) {
        println(countVowels(inputStr))
    }
}