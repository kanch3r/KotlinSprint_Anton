package org.example.Lesson_12

const val KELVINS_TO_CELSIUS: Int = 273

class WeatherNextShort(_dayTemp: Int, _nightTemp: Int, _isPrecipitation: Boolean) {

    val dayTemp = _dayTemp - KELVINS_TO_CELSIUS
    val nightTemp = _nightTemp - KELVINS_TO_CELSIUS
    val isPrecipitation = _isPrecipitation

    init {
        println(
            "Дневная температура: $dayTemp °C, " +
                    "\nНочная температура: $nightTemp °C," +
                    "\nОсадки: ${if (isPrecipitation) "Есть" else "Нет"}"
        )
    }
}

fun main() {

    val monday = WeatherNextShort(300, 280, false)
    val tuesday = WeatherNextShort(285, 275, true)

}