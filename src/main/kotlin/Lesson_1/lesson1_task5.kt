package org.example.Lesson_1

const val MINUTE = 60
const val HOUR = 60

fun main() {

    val totalFlightSeconds: Int = 6480

    val spaceFlightHours: Int = totalFlightSeconds / (MINUTE * HOUR)
    val secondsRemain: Int = totalFlightSeconds % (MINUTE * HOUR)

    val spaceFlightMinutes: Int = secondsRemain / MINUTE
    val minutesRemain: Int = secondsRemain % MINUTE

    val spaceFlightSeconds: Int = minutesRemain

    println(String.format("%02d:%02d:%02d", spaceFlightHours, spaceFlightMinutes, spaceFlightSeconds))

}