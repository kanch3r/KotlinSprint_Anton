package org.example.Lesson_14

import kotlin.math.PI

const val COLOR_BLACK = "Black"
const val COLOR_WHITE = "White"

abstract class Figure(open val color: String) {
    abstract fun calculateSquare(): Int
    abstract fun calculatePerimeter(): Int
}

class Circle(
    override val color: String,
    val radius: Int
) : Figure(color) {
    override fun calculateSquare(): Int = (PI * radius * radius).toInt()
    override fun calculatePerimeter(): Int = (2 * PI * radius).toInt()
}

class Rectangle(
    override val color: String,
    val height: Int,
    val width: Int
) : Figure(color) {
    override fun calculateSquare(): Int = height * width
    override fun calculatePerimeter(): Int = 2 * (height + width)
}

fun main() {

    val listOfFigures = listOf(
        Circle(COLOR_BLACK, 5),
        Circle(COLOR_WHITE, 4),
        Rectangle(COLOR_BLACK, 5, 6),
        Rectangle(COLOR_WHITE, 4, 6)
    )

    val totalSumOfPerimetersOfBlackFigures = listOfFigures
        .filter { it.color == "Black" }
        .sumOf { it.calculatePerimeter() }
    val totalSumOfSquaresOfWhiteFigures = listOfFigures
        .filter { it.color == "White" }
        .sumOf { it.calculateSquare() }

    println("Сумма периметров всех черных фигур: $totalSumOfPerimetersOfBlackFigures")
    println("Сумма площадей всех белых фигур: $totalSumOfSquaresOfWhiteFigures")

}