package org.example.Lesson_9

fun main() {

    println("Введите пять желаемых ингредиентов (через запятую):")
    val userIngredients = readln().split(", ")

    println(userIngredients.sorted())

}