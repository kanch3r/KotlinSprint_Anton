package org.example.Lesson_12

class Weather() {
    var dayTemp: Double = 0.0
    var nightTemp: Double = 0.0
    var isPrecipitation: Boolean = false

    fun printData() {
        println(
            "Дневная температура: $dayTemp, " +
                    "\nНочная температура: $nightTemp," +
                    "\nОсадки: ${if (isPrecipitation) "есть" else "нет"}"
        )
    }
}

fun main() {

    val monday = Weather()
    val tuesday = Weather()
    monday.dayTemp = 25.0
    monday.nightTemp = 5.0
    monday.isPrecipitation = false
    tuesday.dayTemp = 18.0
    tuesday.nightTemp = 4.0
    tuesday.isPrecipitation = true

    monday.printData()
    tuesday.printData()

}