package org.example.Lesson_18

import kotlin.math.abs

class Screen() {

    fun draw(x: Int, y: Int) {
        println("Нарисована точка с координатами: [$x, $y]")
    }

    fun draw(x: Float, y: Float) {
        println("Нарисована точка с координатами: [$x, $y]")
    }

    fun draw(x: Int, y: Int, r: Int) {
        println("Нарисован круг с координатами: [$x, $y] и радиусом $r")
    }

    fun draw(x: Float, y: Float, r: Float) {
        println("Нарисован круг с координатами: [$x, $y] и радиусом $r")
    }

    fun draw(
        x1: Int, y1: Int,
        x2: Int, y2: Int,
    ) {
        when {
            x1 == x2 -> println(
                "Нарисован квадрат с координатами: [$x1, $y1] и [$x2, $y2] и длина грани ${abs(y1 - y2)}"
            )

            y1 == y2 -> println(
                "Нарисован квадрат с координатами: [$x1, $y1] и [$x2, $y2] и длина грани ${abs(x1 - x2)}"
            )

            else -> println("Нарисовать квадрат невозможно")
        }
    }

    fun draw(
        x1: Float, y1: Float,
        x2: Float, y2: Float,
    ) {
        when {
            x1 == x2 -> println(
                "Нарисован квадрат с координатами: [$x1, $y1] и [$x2, $y2] и длина грани ${abs(y1 - y2)}"
            )

            y1 == y2 -> println(
                "Нарисован квадрат с координатами: [$x1, $y1] и [$x2, $y2] и длина грани ${abs(x1 - x2)}"
            )

            else -> println("Нарисовать квадрат невозможно")
        }
    }
}

fun main() {
    val screen = Screen()

    screen.draw(3.4f, 3.4f)
    screen.draw(8, 3, 9)
    screen.draw(2, -3, 5, -3)
}