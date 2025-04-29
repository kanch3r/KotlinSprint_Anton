package org.example.Lesson_10

const val LOW_LIMIT: Int = 1
const val HIGH_LIMIT: Int = 6

fun throwDices(): Int = (LOW_LIMIT..HIGH_LIMIT).random()

fun round(player: Int, machine: Int): String {
    return when {
        player > machine -> "Победило человечество!"
        player < machine -> "Победила машина!"
        else -> "Победила дружба!"
    }
}

fun main() {

    var gameRepeat = true
    var userWinCounter = 0

    while (gameRepeat) {

        val playerResult = throwDices()
        val machineResult = throwDices()

        println("Ход пользователя: Выпало число $playerResult.")
        println("Ход компьютера: Выпало число $machineResult.")

        println(round(playerResult, machineResult))

        if (round(playerResult, machineResult).equals("Победило человечество!")) userWinCounter++

        println("Хотите сыграть ещё раз?")
        val userAnswer = readln().lowercase()

        if (userAnswer.equals("да")) {
            continue
        } else {
            gameRepeat = false
        }
    }

    println("Количество ваших выиграных партий: $userWinCounter")

}