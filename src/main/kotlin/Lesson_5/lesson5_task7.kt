package org.example.Lesson_5

const val DELIMITER_FOR_FUEL_CONSUMPTION: Double = 100.0

fun main() {

    println("Добро пожаловать в калькулятор топлива!")
    println("Введите растояние поездки в киллометрах:")
    val inputUserDistanceKm: Double = readln().toDouble()

    println("Введите расход топлива на 100 км (в литрах):")
    val inputUserFuelConsumptions: Double = readln().toDouble()

    println("Введите цену за литр топлива:")
    val inputUserFuelPriceForOneL: Double = readln().toDouble()

    val totalFuelNeeded: Double = (inputUserDistanceKm * inputUserFuelConsumptions) / DELIMITER_FOR_FUEL_CONSUMPTION
    val totalPriceForFuel: Double = totalFuelNeeded * inputUserFuelPriceForOneL

    println("Общее количество необходимого топлива: ${"%.2f".format(totalFuelNeeded)}")
    println("Итоговая стоимость топлива ${"%.2f".format(totalPriceForFuel)}")

}