package finalTest

/*
    Контрольный тест по модулю 1.

    Задание на дополнение IntArray функцией-расширением,
    которая проверяет, есть ли в массиве элементы = 0
*/

fun IntArray.haveZeros() : Boolean = this.any { it == 0 }

fun main() {
    val arr1 = intArrayOf(1,2,3)
    val arr2 = intArrayOf(0,1,2,3)
    val arr3 = intArrayOf(0,0,0)

    println(arr1.haveZeros())
    println(arr2.haveZeros())
    println(arr3.haveZeros())
}