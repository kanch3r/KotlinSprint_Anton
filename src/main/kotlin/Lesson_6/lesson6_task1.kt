package org.example.Lesson_6


fun main() {

    var authorization: Boolean = false

    println("Вас приветствует окно регистрации нового пользователя")
    println("Придумайте имя пользователя:")
    val registrationName: String = readln()

    println("Придумайте числовой пароль:")
    val registrationPassword: Int = readln().toInt()

    println("Теперь вы можете войти в приложение.")

    while (!authorization) {
        println("Введите ваше имя пользователя:")
        val inputUserName: String = readln()

        println("Введите ваш пароль:")
        val inputUserPassword: Int = readln().toInt()

        if (registrationName == inputUserName && registrationPassword == inputUserPassword) {
            authorization = true
            println("Авторизация прошла успешно!")
        } else {
            println("Неверные логин и пароль. Введите данные заново.")
            continue
        }
    }
}