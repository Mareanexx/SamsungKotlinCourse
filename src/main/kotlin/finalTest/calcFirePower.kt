package finalTest

/*
    Контрольный тест по модулю 1.

    Задание на вычисление общей огневой мощности
    всех игровых сущностей
*/

internal abstract class Gameunit

interface HasWeapon {
    val quantity: Int
    val weaponPower: Int
    fun firePower() = quantity * weaponPower
}

internal class Doctor: Gameunit()

internal class Soldier(
    override val quantity: Int
) : Gameunit(), HasWeapon {
    override val weaponPower: Int = 10
}

internal class Tank(
    override val quantity: Int
) : Gameunit(), HasWeapon {
    override val weaponPower: Int = 20
}

fun main() {
    val units = arrayOf(Doctor(), Tank(3), Soldier(2))
    var totalpower = 0
    for (u in units) {
        totalpower += if (u is HasWeapon) u.firePower() else 0
    }
    println(totalpower)
}