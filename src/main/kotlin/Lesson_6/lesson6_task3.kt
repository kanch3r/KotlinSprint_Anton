package org.example.Lesson_6


fun main() {

    println("Установите таймер в секундах:")
    val userTimer = readln().toInt()
    var counter = userTimer

    while (counter > 0) {
        println("Осталось секунд: ${counter--}")
        Thread.sleep(1000)
    }
    println("Время вышло")

}