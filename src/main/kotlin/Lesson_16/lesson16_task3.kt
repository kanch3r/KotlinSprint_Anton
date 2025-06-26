package org.example.Lesson_16

class User {
    val login: String = "Пользователь"
    private val password: String = "123456"

    fun getPassword() = password
}

fun checkPassword(userPassword: String): Boolean {
    return userPassword == User().getPassword()
}

fun main() {

    val user = User()

    println("Ввведите логин:")
    val userInput = readln()

    if (userInput == user.login) {
        println("Ввведите пароль:")
        val userPassword = readln()
        if (checkPassword(userPassword)) {
            println("Добро пожаловать!")
        } else {
            println("Пароль неверный!")
        }
    } else {
        println("Пользователя с таким логином не существует!")
    }
}