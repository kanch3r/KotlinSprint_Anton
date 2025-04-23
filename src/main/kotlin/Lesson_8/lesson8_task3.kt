package org.example.Lesson_8

fun main() {

    val ingredientsOlivier = arrayOf("картофель", "яйцо", "колбаса", "огурец", "горошек", "морковь", "майонез")

    println("Какой ингредиент вы хотите найти?")
    val userInputIngredient = readln()

    if (ingredientsOlivier.contains(userInputIngredient)) {
        println("Ингредиент $userInputIngredient есть в рецепте.")
    } else {
        println("Такого ингредиента в рецепте нет.")
    }

}