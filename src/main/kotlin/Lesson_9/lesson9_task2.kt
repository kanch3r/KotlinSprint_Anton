package org.example.Lesson_9

fun main() {

    val baseIngredients = mutableListOf("хлеб", "масло", "сыр")

    println("В рецепте есть базовые ингредиенты: ${baseIngredients.joinToString()}.")

    println("Желаете добавить что-то ещё?")
    val userAnswer = readln()

    if (userAnswer.lowercase().equals("да")) {
        println("Какой ингредиент вы хотите добавить?")
        baseIngredients.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты: ${baseIngredients.joinToString()}.")
    }

}