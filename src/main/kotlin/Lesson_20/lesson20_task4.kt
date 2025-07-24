package org.example.Lesson_20

fun main() {
    val list: List<String> = listOf("1-odd", "2-even", "3-odd", "4-even", "5-odd", "6-even")

    list.mapIndexed { index, string ->
        if (index % 2 == 0) println("Нажат элемент $string")
    }
}

