package org.example.Lesson_21

fun List<Int>.evenNumbersSum() = this.filter { it % 2 ==0 }.sum()

fun main() {
    val list = listOf(2, 6, 9, 7, 2)
    println(list.evenNumbersSum())
}