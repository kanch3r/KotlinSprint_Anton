package org.example.Lesson_5

const val CONVERT_CM_TO_METERS: Int = 100
const val IMT_LOW: Double = 18.5
const val IMT_NORMAL: Double = 25.0
const val IMT_HIGH: Double = 30.0

fun main() {

    println("Добро пожаловать в калькулятор ИМТ!")
    println("Введите пожалуйста ваш вес в киллограмах:")
    val userInputWeightKg: Double = readln().toDouble()

    println("Введите пожалуйста ваш рост в сантимерах:")
    val userInputHeightM: Double = readln().toDouble() / CONVERT_CM_TO_METERS

    val calculatedImt: Double = userInputWeightKg / (userInputHeightM * userInputHeightM)

    val resultImt = when(calculatedImt) {
        in 0.0..IMT_LOW -> "Недостаточная масса тела"
        in IMT_LOW..IMT_NORMAL -> "Нормальная масса тела"
        in IMT_NORMAL..IMT_HIGH -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("Ваш ИМТ равен ${"%.2f".format(calculatedImt)}. У вас $resultImt")

}