package org.example.Lesson_12

import kotlin.random.Random

const val TEMPERATURE_RANGE_LOW: Int = 2
const val TEMPERATURE_RANGE_HIGH: Int = 40
const val DAYS_IN_A_MONTH: Int = 30

class WeatherNextShorty(_dayTemp: Int, _nightTemp: Int, _isPrecipitation: Boolean) {

    val dayTemp = _dayTemp
    val nightTemp = _nightTemp
    val isPrecipitation = _isPrecipitation

    fun printData() {
        println("Day temp: $dayTemp, Night temp: $nightTemp, Precipitation: $isPrecipitation.")
    }

}

fun main() {

    val month: MutableList<WeatherNextShorty> = mutableListOf()

    repeat(DAYS_IN_A_MONTH) {
        month.add(WeatherNextShorty(
            (TEMPERATURE_RANGE_LOW..TEMPERATURE_RANGE_HIGH).random(),
            (TEMPERATURE_RANGE_LOW..TEMPERATURE_RANGE_HIGH).random(),
            Random.nextBoolean()))
    }

    val avrgDayTemp = month.map { it.dayTemp }.average()
    val avrgNightTemp = month.map { it.nightTemp }.average()


    month.forEach { it.printData() }
    println("Средняя температура днём: ${"%.1f".format(avrgDayTemp)}°C")
    println("Средняя температура ночью: ${"%.1f".format(avrgNightTemp)}°C")
    println("Количество дней с осадками: ${month.count { it.isPrecipitation == true}}")

}