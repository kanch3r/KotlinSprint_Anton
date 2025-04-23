package org.example.Lesson_8

fun main() {

    println("Введите количество просмотров в день (повторить ввод 7 раз):")
    val viewsPerDay = IntArray(7) { readln().toInt() }

    println(viewsPerDay.sum())

}