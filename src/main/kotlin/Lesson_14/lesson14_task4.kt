package org.example.Lesson_14

abstract class CelestialBody(
    open val name: String,
    open val size: Int,
    open val hasLanded: Boolean,
)

class Planet(
    override val name: String,
    override val size: Int,
    override val hasLanded: Boolean = false,
    val listOfSatellites: List<Satellite> = emptyList(),
) : CelestialBody(name, size, hasLanded)

class Satellite(
    override val name: String,
    override val size: Int,
    override val hasLanded: Boolean = false,
) : CelestialBody(name, size, hasLanded)

fun main() {

    val satellite1 = Satellite("Фобос", 15)
    val satellite2 = Satellite("Деймос", 5)
    val planet1 = Planet("Марс", 100, true, listOf(satellite1, satellite2))

    println("Название планеты: ${planet1.name}")
    println("Спутники планеты: ${planet1.listOfSatellites.joinToString { it.name }}")

}