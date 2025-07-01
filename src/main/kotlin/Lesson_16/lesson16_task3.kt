package org.example.Lesson_16

class User {
    val login: String = "Пользователь"
    private val password: String = "123456"

    fun checkPassword(userPassword: String): Boolean {
        return userPassword == password
    }
}

fun main() {

    val user = User()

    println("Ввведите логин:")
    val userInput = readln()

    if (userInput == user.login) {
        println("Ввведите пароль:")
        val userPasswordInput = readln()
        if (user.checkPassword(userPasswordInput)) {
            println("Добро пожаловать!")
        } else {
            println("Пароль неверный!")
        }
    } else {
        println("Пользователя с таким логином не существует!")
    }
}