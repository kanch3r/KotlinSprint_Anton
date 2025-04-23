package org.example.Lesson_8

fun main() {

    val olivierRecipe = arrayOf("картофель", "яйцо", "колбаса", "огурец", "горошек", "морковь", "майонез")
    println("Ингредиенты салата оливье: ${olivierRecipe.joinToString()}.")

    println("Какой ингредиент вы хотите заменить?")
    val userInputIngredient = readln()

    if (olivierRecipe.contains(userInputIngredient)) {
        println("Что хотите добавить?")
        val userInputNewIngredient = readln()

        olivierRecipe[olivierRecipe.indexOf(userInputIngredient)] = userInputNewIngredient
        println("Готово! Вы сохранили следущий список: ${olivierRecipe.joinToString()}.")

    } else {
        println("Такого ингредиента в рецепте нет.")
    }

}