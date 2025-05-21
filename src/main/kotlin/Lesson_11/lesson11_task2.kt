package org.example.Lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null,
) {

    fun displayUserInfo() {
        println("User ID: $id")
        println("User Login: $login")
        println("User Password: $password")
        println("User Email: $email")
        println("User Bio: $bio")
    }

    fun updateBio() {
        println("Введите новый текст о себе:")
        bio = readln()
    }

    fun changePassword() {
        println("Для смены пароля введите ваш текущий пароль:")
        val userInput = readln()
        if (password.equals(userInput)) {
            println("Придумайте новый пароль:")
            password = readln()
            println("Вы установили новый пароль!")
        } else {
            println("Ваши пароли не совпадают!")
        }
    }

}

fun main() {

    val userGarry = User2(1, "Garry", "12345", "GP@hogwarts.com", "The boy who lived!",)
    val userRon = User2(2, "Ron", "qwerty", "RW@hogwarts.com",)

    userGarry.displayUserInfo()
    userGarry.updateBio()
    userGarry.changePassword()
    userGarry.displayUserInfo()

}