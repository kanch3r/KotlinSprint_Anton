package org.example.Lesson_16

class Warrior(
    val name: String,
    var health: Int,
    var strength: Int,
    var isHealing: Boolean = true
) {

    init {
        println("Создан персонаж: Имя: $name, Кол-во здоровья: $health, Сила удара: $strength.")
    }

    fun takeDamage() {
        if (health > 0) {
            health = health - strength
            if (health <= 0) lethalDamage() else println("$name получает урон $strength. Осталось $health здоровья.")
        } else {
            println("Персонаж уже мёртв.")
        }
    }

    fun restoreHealthPoints() {
        if (isHealing) {
            health = health + 10
            println("$name востановил здоровье на 10 до $health.")
        } else {
            println("Невозможность лечения. Персонаж мертв.")
        }
    }

    private fun lethalDamage() {
        health = 0
        strength = 0
        isHealing = false
        println("Нанесён смертельный удар. $name умер.")
    }
}

fun main() {
    val player1 = Warrior("Garry", 30, 12)
    player1.takeDamage()
    player1.takeDamage()
    player1.restoreHealthPoints()
    player1.takeDamage()
    player1.restoreHealthPoints()
    player1.takeDamage()
    player1.takeDamage()
}