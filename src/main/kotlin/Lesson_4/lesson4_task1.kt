package org.example.Lesson_4

const val TABLES: Int = 13

fun main() {

    val tablesReservedToday: Int = 13
    val tablesReservedTomorrow: Int = 9

    println("Доступность столиков на сегодня: ${tablesReservedToday != TABLES} " +
            "\nДоступность столиков на сегодня: ${tablesReservedTomorrow != TABLES}")

}