package org.example.Lesson_18

open class Package {
    open fun calculateArea() {}
}

class RectangleBox(private val length: Int, private val width: Int, private val height: Int) : Package() {
    override fun calculateArea() {
        println("Площадь прямоугольной коробки: ${2 * (length * width + length * height + height * width)}.")
    }
}

class CubeBox(private val length: Int) : Package() {
    override fun calculateArea() {
        println("Площадь кубической коробки: ${(length * length) * 6}.")
    }
}

fun main() {
    val package1 = RectangleBox(6, 4, 3)
    val package2 = CubeBox(5)

    val packagesList = listOf<Package>(package1, package2)

    packagesList.forEach { it.calculateArea() }
}