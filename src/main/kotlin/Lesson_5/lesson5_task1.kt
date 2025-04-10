package org.example.Lesson_5

const val MIN_RANGE: Int = 1
const val MAX_RANGE: Int = 10

fun main() {

    val number1: Int = (MIN_RANGE..MAX_RANGE).random()
    val number2: Int = (MIN_RANGE..MAX_RANGE).random()

    println("Для входа в приложение решите пример: $number1 + $number2 = ?")
    val userInputNumber = readln().toInt()

    val result = if (number1 + number2 == userInputNumber) {
        "Добро пожаловать!"
    } else {
        "Доступ запрещён."
    }

    println(result)

}