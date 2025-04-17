package org.example.Lesson_7

const val LOW_GAP: Int = 1000
const val HIGH_GAP: Int = 9999

fun main() {

    var authorization = false

    while (!authorization) {

        val authCode = (LOW_GAP..HIGH_GAP).random()
        println("Ваш код авторизации $authCode")

        println("Введите код, чтобы авторизоваться:")
        val userInputAuthCode = readln().toInt()

        if (userInputAuthCode == authCode) {
            println("Добро пожаловать!")
            authorization = true
        } else {
            println("Код неверный! Получите новый.")
        }
    }
}