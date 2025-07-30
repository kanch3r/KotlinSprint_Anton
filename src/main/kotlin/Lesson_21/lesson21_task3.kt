package org.example.Lesson_21

class Gamer(val gamerName: String) {
    val maxHealthPoints: Int = 100
    var currentHealthPoints: Int = maxHealthPoints
}

fun Gamer.isHealthy(): Boolean = currentHealthPoints == maxHealthPoints

fun main() {
    val gamer = Gamer("Gamer")
    println(gamer.isHealthy())
}