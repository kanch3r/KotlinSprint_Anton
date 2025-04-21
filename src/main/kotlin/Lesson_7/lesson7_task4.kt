package org.example.Lesson_7

const val END_OF_TIMER: Int = 1

fun main() {

    println("Установите таймер на желаемое кол-во секунд:")
    val userInputNumber = readln().toInt()

    for (i in userInputNumber downTo END_OF_TIMER){
        println(i)
        Thread.sleep(1000)
    }
    println("Время вышло!")
}