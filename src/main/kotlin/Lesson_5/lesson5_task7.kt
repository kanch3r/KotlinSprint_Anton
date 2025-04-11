package org.example.Lesson_5

const val DELIMITER_FOR_FUEL_CONSUMPTION: Double = 100.0

fun main() {

    println("Добро пожаловать в калькулятор топлива!")
    println("Введите растояние поездки в киллометрах:")
    val inputUser1: String = readln()

    println("Введите расход топлива на 100 км (в литрах):")
    val inputUser2: String = readln()

    println("Введите цену за литр топлива:")
    val inputUser3: String = readln()

    val distance: Double = inputUser1.toDouble()
    val fuelConsumptions: Double = inputUser2.toDouble()
    val fuelPriceForOneL: Double = inputUser3.toDouble()

    val totalFuelNeeded: Double = (distance * fuelConsumptions) / DELIMITER_FOR_FUEL_CONSUMPTION
    val totalPriceForFuel: Double = totalFuelNeeded * fuelPriceForOneL

    println("Общее количество необходимого топлива: $totalFuelNeeded")
    println("Итоговая стоимость топлива ${"%.2f".format(totalPriceForFuel)}")

}