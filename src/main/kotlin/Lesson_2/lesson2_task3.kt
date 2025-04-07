package org.example.Lesson_2

const val MINUTES = 60

fun main() {

    val departureHour: Int = 9
    val departureMinute: Int = 39
    val totalTravelTimeMinutes: Int = 457

    val travelTimeHours: Int = totalTravelTimeMinutes / MINUTES
    val travelTimeMinutes: Int = totalTravelTimeMinutes % MINUTES

    val arrivalHour: Int = departureHour + travelTimeHours + ((departureMinute + travelTimeMinutes) / MINUTES)
    val arrivalMinute: Int = (departureMinute + travelTimeMinutes) % MINUTES

    println(arrivalHour)
    println(arrivalMinute)

}