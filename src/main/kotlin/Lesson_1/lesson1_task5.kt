package org.example.Lesson_1

fun main() {

    // 1 minute = 60 sec
    // 1 hour = 60 min
    // 1 hour = 3600 sec
    // Space time in seconds is 6480 sec (108 minutes * 60 seconds)

    val totalFlightSeconds: Int = 6480

    val spaceFlightHours: Int = totalFlightSeconds / 3600 // 1 hour
    val secondsRemain: Int = totalFlightSeconds % 3600 // 2880 seconds

    val spaceFlightMinutes: Int = secondsRemain / 60 // 48 minutes
    val minutesRemain: Int = secondsRemain % 60 // 0

    val spaceFlightSeconds: Int = minutesRemain // 0 seconds

    println(String.format("%02d:%02d:%02d", spaceFlightHours, spaceFlightMinutes, spaceFlightSeconds))

}