package org.example.Lesson_10

const val LENGTH_CRITERIA: Int = 4

fun checkLength(nameCheck: String, passCheck: String): Boolean {
    return (nameCheck.length >= LENGTH_CRITERIA) && (passCheck.length >= LENGTH_CRITERIA)
}

fun main() {

    println("Придумайте логин:")
    val userLogin = readln()

    println("Придумайте пароль:")
    val userPass = readln()

    if (checkLength(userLogin, userPass)) {
        println("Добро пожаловать!")
    } else {
        println("Логин и пароль недостаточно длинные.")
    }

}