package org.example.Lesson_16

class Dice {
    private val resultOfDice = (1..6).random()

    fun getDiceResult() = resultOfDice
}

fun main() {

    val dice = Dice()
    println(dice.getDiceResult())

}