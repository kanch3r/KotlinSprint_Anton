package org.example.Lesson_6

const val LOW_RANGE: Int = 1
const val HIGH_RANGE: Int = 9
const val ATTEMPTS: Int = 5

fun main() {

    println("Угадай число от $LOW_RANGE до $HIGH_RANGE. У тебя $ATTEMPTS попыток")
    val number = (LOW_RANGE..HIGH_RANGE).random()

    var counter = ATTEMPTS

    while (counter > 0) {
        val userInputDigit = readln().toInt()
        counter--

        if (userInputDigit == number) {
            println("Угадал! Это была великолепная игра!")
            return
        } else if (counter > 0) {
            println("У тебя осталось ${counter} попытки.")
        }
    }

    println("Попытки закончились, спасибо за игру! Было загадано число $number.")

}