package org.example.Lesson_6

const val LOW: Int = 1
const val HIGH: Int = 9
const val ATTEMPT: Int = 3

fun main() {

    var counter = ATTEMPT

    println("Вас приветствует окно входа.")

    while (counter > 0) {
        val number1: Int = (LOW..HIGH).random()
        val number2: Int = (LOW..HIGH).random()

        println("Для входа в приложение решите пример: $number1 + $number2 = ?")
        val userInputNumber = readln().toInt()
        counter--

        if (number1 + number2 == userInputNumber) {
            println("Добро пожаловать!")
            return
        } else if (counter == 0) {
            println("Доступ запрещён!")
        } else {
            println("Ответ неверный, попробуйте ещё раз. У вас осталось $counter попытки")
        }
    }
}