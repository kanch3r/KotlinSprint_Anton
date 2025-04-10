package org.example.Lesson_5

const val CONVERT_CM_TO_METERS: Int = 100
const val IMT_LOW: Double = 18.5
const val IMT_NORMAL: Double = 25.0
const val IMT_HIGH: Double = 30.0

fun main() {

    println("Добро пожаловать в калькулятор ИМТ!")
    println("Введите пожалуйста ваш вес в киллограмах:")
    val userInput1: String = readln()

    println("Введите пожалуйста ваш рост в сантимерах:")
    val userInput2: String = readln()

    val userWeightKg: Double = userInput1.toDouble()
    val userHeightM: Double = userInput2.toDouble() / CONVERT_CM_TO_METERS

    val calculatedImt: Double = userWeightKg / (userHeightM * userHeightM)

    val resultImt = when {
        calculatedImt < IMT_LOW -> "Недостаточная масса тела"
        calculatedImt >= IMT_LOW && calculatedImt < IMT_NORMAL -> "Нормальная масса тела"
        calculatedImt >= IMT_NORMAL && calculatedImt < IMT_HIGH -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("Ваш ИМТ равен ${"%.2f".format(calculatedImt)}. У вас $resultImt")

}