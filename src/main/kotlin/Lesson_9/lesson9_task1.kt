package org.example.Lesson_9

fun main() {

    val ingredients = listOf("картофель", "яйцо", "колбаса", "огурец", "горошек", "морковь", "майонез")

    println("В рецепте есть следующие ингредиенты:")
    ingredients.forEach { println(it) }

}