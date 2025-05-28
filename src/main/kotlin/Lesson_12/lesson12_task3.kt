package org.example.Lesson_12

const val KELVIN_TO_CELSIUS: Int = 273

class WeatherNext(_dayTemp: Int, _nightTemp: Int, _isPrecipitation: Boolean) {

    val dayTemp = _dayTemp - KELVIN_TO_CELSIUS
    val nightTemp = _nightTemp - KELVIN_TO_CELSIUS
    val isPrecipitation = _isPrecipitation

    fun printData() {
        println(
            "Дневная температура: $dayTemp °C, " +
                    "\nНочная температура: $nightTemp °C," +
                    "\nОсадки: ${if (isPrecipitation) "Есть" else "Нет"}"
        )
    }
}

fun main() {

    val monday = WeatherNext(300, 280, false)
    val tuesday = WeatherNext(285, 275, true)

    monday.printData()
    tuesday.printData()

}