package org.example.Lesson_7

const val START_PROGRESSION_FROM: Int = 0

fun main() {

    println("Введите любое число:")
    val userInputNumber = readln().toInt()
    var result: String = ""

    for (i in START_PROGRESSION_FROM..userInputNumber step 2) {
        result += i
        print(i)
    }

}