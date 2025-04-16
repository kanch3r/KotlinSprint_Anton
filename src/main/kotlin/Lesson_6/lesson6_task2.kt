package org.example.Lesson_6

const val CONVERT_SEC_TO_MILLISEC: Long = 1000

fun main() {

    println("Установите таймер в секундах:")
    val userTimerSeconds = readln().toInt()
    val milliseconds = userTimerSeconds * CONVERT_SEC_TO_MILLISEC
    Thread.sleep(milliseconds)

    println("Прошло $userTimerSeconds секунд")

}