package org.example.Lesson_7

const val START_PROGRESSION_FROM: Int = 0
const val CHECK_FOR_EVEN: Int = 2

fun main() {

    println("Введите любое число:")
    val userInputNumber = readln().toInt()
    var result: String = ""

    for (i in START_PROGRESSION_FROM..userInputNumber) {
        if (i % CHECK_FOR_EVEN == 0) {
            result += i
        }
    }
    println(result)
}