package org.example.Lesson_4

fun main() {

    val trainingDay: Int = 5

    val handDay: Boolean = trainingDay % 2 == 1
    val legDay: Boolean = trainingDay % 2 == 0
    val backDay: Boolean = trainingDay % 2 == 0
    val pressDay: Boolean = trainingDay % 2 == 1

    println("""
Упражения для рук:     $handDay
Упражнения для ног:    $legDay
Упражнения для спины:  $backDay
Упражнения для пресса: $pressDay
    """.trimMargin())

}