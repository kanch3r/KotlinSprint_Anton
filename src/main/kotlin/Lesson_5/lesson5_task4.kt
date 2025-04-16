package org.example.Lesson_5

const val USER_NAME: String = "Zaphod"
const val USER_PASSWORD: String = "PanGalactic"

fun main() {

    println("Введите ваше имя пользователя:")
    val userInputName: String = readln()

    if (userInputName == USER_NAME) {
        println("Введите ваш пароль:")
        val userInputPassword: String = readln()

        if (userInputPassword == USER_PASSWORD) {
            println("Пользователь $USER_NAME, вам разрешено выходить на борт корабля \"Heart of Gold\"!")
        }

    } else {
        println("Пользователь $userInputName отсутвует в списке. Желаете зарегистрироваться?")
    }

}