package org.example.Lesson_5

fun main() {

    println("Для входа в приложение решите пример: 2 + 3 = ?")
    val userInput = readln().toInt()

    val result = if (userInput == 5) {
        "Добро пожаловать!"
    } else {
        "Доступ запрещён."
    }

    println(result)

}