package org.example.Lesson_19

enum class Bullet(val bulletName: String, val bulletDamage: Int) {
    BLUE("Blue bullets", 5),
    GREEN("Green bullets", 10),
    RED("Red bullets", 20),
}

class Tank(
    val name: String,
    var ammoName: Bullet? = null,
) {

    fun takeBullet(bullet: Bullet) {
        ammoName = bullet
    }

    fun openFire() {
        val currentAmmo = ammoName
        if (currentAmmo != null) {
            println("$name fire with ${currentAmmo.bulletName} and deals ${currentAmmo.bulletDamage} damage.")
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