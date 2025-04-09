package org.example.Lesson_4

fun main() {

    val sunnyWeather: Boolean = true
    val openTent: Boolean = true
    val humidityNeeded: Int = 20
    val seasonNot: String = "winter"

    val todayWeather: Boolean = true
    val todayTent: Boolean = true
    val todayHumidity: Int = 20
    val todaySeason: String = "winter"

    val result: Boolean = ((sunnyWeather == todayWeather) && (openTent == todayTent) && (humidityNeeded == todayHumidity) &&
            (seasonNot != todaySeason))

    println("Благоприятные ли условия сейчас для роста бобовых? $result")

}