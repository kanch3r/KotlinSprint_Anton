package org.example.Lesson_8

fun main() {

    val olivierRecipe = arrayOf("картофель", "яйцо", "колбаса", "огурец", "горошек", "морковь", "майонез")
    println("Ингредиенты салата оливье: ${olivierRecipe.joinToString()}.")

    println("Какой ингредиент вы хотите заменить?")
    val userInputIngredient = readln()

    val ingredientIndex = olivierRecipe.indexOf(userInputIngredient)

    if (ingredientIndex != -1) {
        println("Что хотите добавить?")
        val userInputNewIngredient = readln()

        olivierRecipe[ingredientIndex] = userInputNewIngredient
        println("Готово! Вы сохранили следущий список: ${olivierRecipe.joinToString()}.")
    } else {
        println("Такого ингредиента в рецепте нет.")
    }

}