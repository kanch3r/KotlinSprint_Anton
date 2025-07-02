package org.example.Lesson_17

class User(login: String, password: String) {
    var userLogin = login
        set(value) {
            println("Имя пользователя изменено на $value")
            field = value
        }
    var userPassword = password
        get() = field.map { "*" }.joinToString("")
        set(value) {
            println("Вы не можете изменить пароль!")
        }
}

fun main() {

    val user1 = User("Garry", "123456")
    println(user1.userLogin)
    println(user1.userPassword)
    user1.userPassword = "qwerty"
    user1.userLogin = "Ron"
    println(user1.userLogin)
}