package org.example.Lesson_22

data class Player(val name: String, val race: String, val profession: String)

fun main() {
    val player1 = Player("Арагорн", "Человек", "Воин")
    val (name, race, profession) = player1

    println(name)
    println(race)
    println(profession)
}