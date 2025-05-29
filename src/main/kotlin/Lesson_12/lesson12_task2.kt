package org.example.Lesson_12

class WeatherNew(val dayTemp: Double, val nightTemp: Double, val isPrecipitation: Boolean) {

    fun printData() {
        println(
            "Дневная температура: $dayTemp, " +
                    "\nНочная температура: $nightTemp," +
                    "\nОсадки: ${if (isPrecipitation) "Есть" else "Нет"}"
        )
    }
}

fun main() {

    val monday = WeatherNew(15.0, 10.0, false)
    val tuesday = WeatherNew(12.0, 8.0, true)

    monday.printData()
    tuesday.printData()

}