package org.example.Lesson_15

abstract class WeatherStationStats (open val stationId: String) {
    abstract fun printDataFromStation()
}

class Temperature(
    override val stationId: String,
    val temperatureSensor: Int,
) : WeatherStationStats(stationId) {
    override fun printDataFromStation() {
        println("Температура на станиции $stationId: $temperatureSensor °C")
    }
}

class PrecipitationAmount(
    override val stationId: String,
    val precipitationVolume: Int? = null,
    val precipitationType: String? = null,
) : WeatherStationStats(stationId) {
    override fun printDataFromStation() {
        println("Количество осадков на станиции $stationId: ${precipitationVolume ?: 0} мм, " +
                "тип: ${precipitationType ?: "без осадков"}")
    }
}

class WhetherServer() {
    fun sendDataToServer(data: WeatherStationStats) {
        data.printDataFromStation()
    }
}

fun main() {

    val weatherServer = WhetherServer()
    val tempDataFromStation1 = Temperature("Союз №1", 15)
    val precipDataFromStation1 = PrecipitationAmount("Союз №1", 20, "Дождь")
    val tempDataFromStation2 = Temperature("Союз №4", 29)
    val precipDataFromStation2 = PrecipitationAmount("Союз №4")

    weatherServer.sendDataToServer(tempDataFromStation1)
    weatherServer.sendDataToServer(precipDataFromStation1)
    weatherServer.sendDataToServer(tempDataFromStation2)
    weatherServer.sendDataToServer(precipDataFromStation2)

}
