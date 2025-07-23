package org.example.Lesson_19

enum class Bullet(val bulletName: String, val bulletDamage: Int) {
    BLUE("Blue bullets", 5),
    GREEN("Green bullets", 10),
    RED("Red bullets", 20),
    NULL("No ammo", 0)
}

class Tank(
    val name: String,
    var ammoName: String = Bullet.NULL.bulletName,
    var ammoDamage: Int = Bullet.NULL.bulletDamage,
) {

    fun takeBullet(bullet: Bullet) {
        ammoName = bullet.bulletName
        ammoDamage = bullet.bulletDamage
    }

    fun openFire() {
        if (ammoName != Bullet.NULL.bulletName && ammoDamage != Bullet.NULL.bulletDamage) {
            println("$name fire with $ammoName and deals $ammoDamage damage.")
        } else {
            println("$name out of ammo. Can't take a shot.")
        }
    }
}

fun main() {
    val tank1 = Tank("T-34")
    tank1.openFire()
    tank1.takeBullet(Bullet.BLUE)
    tank1.openFire()
    tank1.takeBullet(Bullet.GREEN)
    tank1.openFire()
    tank1.takeBullet(Bullet.RED)
    tank1.openFire()
}