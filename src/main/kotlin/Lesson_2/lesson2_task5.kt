package org.example.Lesson_2
import kotlin.math.pow

const val YEAR_RATE_PERCENTAGE: Double = 16.7
const val CONVERT_PERCENTAGE_TO_DECIMAL: Int = 100
const val SAVE_BASE_LINE: Int = 1

fun main() {

    val deposit: Int = 70_000
    val rate: Double = YEAR_RATE_PERCENTAGE / CONVERT_PERCENTAGE_TO_DECIMAL
    val years: Double = 20.0

    val result = deposit * (SAVE_BASE_LINE + rate).pow(years)

    println(String.format("%.3f", result))

}