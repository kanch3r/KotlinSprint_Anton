package org.example.Lesson_8

fun main() {

    println("Введите количество ингредиентов:")
    val qtyOfIngredients = readln().toInt()

    println("Введите ингредиенты по одному (через ввод):")
    val ingredients = Array<String>(qtyOfIngredients) { readln() }

    println(ingredients.joinToString())

}