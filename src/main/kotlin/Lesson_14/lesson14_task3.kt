package org.example.Lesson_14

import kotlin.math.PI

abstract class Figure(val color: String) {
    abstract fun calculateSquare(): Int
    abstract fun calculatePerimeter(): Int
}

class Circle(
    color: String,
    val radius: Int
) : Figure(color) {
    override fun calculateSquare(): Int = (PI * radius * radius).toInt()
    override fun calculatePerimeter(): Int = (2 * PI * radius).toInt()
}

class Rectangle(
    color: String,
    val height: Int,
    val width: Int
) : Figure(color) {
    override fun calculateSquare(): Int = height * width
    override fun calculatePerimeter(): Int = 2 * (height + width)
}

fun main() {

    val listOfFigures: MutableList<Figure> = mutableListOf()

    val circle1 = Circle("Белый", 5)
    val circle2 = Circle("Белый", 4)
    val rectangle1 = Rectangle("Черный", 5, 6)
    val rectangle2 = Rectangle("Черный", 4, 6)

    listOfFigures.addAll(listOf(circle1, circle2, rectangle1, rectangle2))

    val totalSumOfPerimetersOfBlackFigures = listOfFigures
        .filter { it.color == "Черный" }
        .sumOf { it.calculatePerimeter() }
    val totalSumOfSquaresOfWhiteFigures = listOfFigures
        .filter { it.color == "Белый" }
        .sumOf { it.calculateSquare() }

    println("Сумма периметров всех черных фигур: $totalSumOfPerimetersOfBlackFigures")
    println("Сумма площадей всех белых фигур: $totalSumOfSquaresOfWhiteFigures")

}