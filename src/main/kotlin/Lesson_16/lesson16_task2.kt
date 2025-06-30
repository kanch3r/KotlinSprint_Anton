package org.example.Lesson_16

class Circle(val radius: Int) {
    private val pi: Double = 3.14

    fun calculateSquare() = (pi * radius * radius).toInt()
    fun calculatePerimeter() = (2 * pi * radius).toInt()

}

fun main() {

    val circle = Circle(4)
    println("Площадь фигруры: ${circle.calculateSquare()}")
    println("Окружность фигруры: ${circle.calculatePerimeter()}")

}