package org.example.Lesson_5

const val CURRENT_YEAR: Int = 2025
const val AGE_OF_MAJORITY: Int = 18


fun main() {

    val userBirthYear: Int = readln().toInt()
    val userAge: Int = CURRENT_YEAR - userBirthYear

    val result = if (userAge >= AGE_OF_MAJORITY) {
        "Показать экран со скрытым контентом"
    } else {
        "Вернуться на главный экран"
    }

    println(result)

}