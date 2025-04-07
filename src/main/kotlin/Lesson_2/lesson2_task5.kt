package org.example.Lesson_2

const val YEAR_RATE: Double = 16.7

fun main() {

    val deposit: Int = 70_000
    val rate: Double = YEAR_RATE / 100
    val years: Double = 20.0

    val result = deposit * Math.pow(1 + rate, years)

    println(String.format("%.3f", result))

}