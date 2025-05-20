package org.example.Lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

fun main() {

    val userGarry = User(1, "Garry", "12345", "GP@hogwarts.com",)
    val userRon = User(2, "Ron", "qwerty", "RW@hogwarts.com",)

    println(userGarry.id)
    println(userGarry.login)
    println(userGarry.password)
    println(userGarry.email)

    println()

    println(userRon.id)
    println(userRon.login)
    println(userRon.password)
    println(userRon.email)

}
