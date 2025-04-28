package org.example.Lesson_10

const val LOWER_LIMIT: Int = 1
const val HIGHER_LIMIT: Int = 6

fun throwDice(): Int = (LOWER_LIMIT..HIGHER_LIMIT).random()

fun main() {

    val playerResult = throwDice()
    val machineResult = throwDice()

    println("Ход пользователя: Выпало число $playerResult.")
    println("Ход компьютера: Выпало число $machineResult.")

    when {
        playerResult > machineResult -> println("Победило человечество!")
        playerResult < machineResult -> println("Победила машина!")
        else -> println("Победила дружба!")
    }

}