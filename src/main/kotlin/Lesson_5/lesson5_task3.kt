package org.example.Lesson_5

const val WIN_NUMBER_1: Int = 9
const val WIN_NUMBER_2: Int = 33


fun main() {

    println("Для победы в лотерее вам нужно угадать два разных числа от 0 до 42!")
    println("Введите первое любое число от 0 до 42:")
    val userNumber1: Int = readln().toInt()

    println("Введите второе любое число от 0 до 42:")
    val userNumber2: Int = readln().toInt()

    val result =
        if ((userNumber1 == WIN_NUMBER_1 && userNumber2 == WIN_NUMBER_2) || (userNumber1 == WIN_NUMBER_2 && userNumber2 == WIN_NUMBER_1)) {
            "Поздравляем! Вы выиграли главный приз!"
        } else if ((userNumber1 == WIN_NUMBER_1 && userNumber2 != WIN_NUMBER_2) || (userNumber1 == WIN_NUMBER_2 && userNumber2 != WIN_NUMBER_1) ||
            (userNumber2 == WIN_NUMBER_1 && userNumber1 != WIN_NUMBER_2) || (userNumber2 == WIN_NUMBER_2 && userNumber1 != WIN_NUMBER_1)
        ) {
            "Вы выиграли утешительный приз!"
        } else {
            "Неудача"
        }

    println(result)
    println("Для победы вам нужны были числа $WIN_NUMBER_1 и $WIN_NUMBER_2")

}