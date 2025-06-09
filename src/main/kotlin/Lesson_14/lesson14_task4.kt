package org.example.Lesson_14

open class CelestialBody(
    open val name: String,
    open val size: Int,
    open val isPossibleForLanding: Boolean,
)

class Planet(
    override val name: String,
    override val size: Int,
    override val isPossibleForLanding: Boolean = false,
    val satellites: List<Satellite> = emptyList(),
) : CelestialBody(name, size, isPossibleForLanding) {

    fun printInfo() {
        println("Название планеты: $name. \nСпутники: ${satellites.joinToString { it.name }}")
    }
}

class Satellite(
    override val name: String,
    override val size: Int,
    override val isPossibleForLanding: Boolean = false,
) : CelestialBody(name, size, isPossibleForLanding)

fun main() {

    val satellite1 = Satellite("Фобос", 15)
    val satellite2 = Satellite("Деймос", 5)
    val planet1 = Planet("Марс", 100, true, listOf(satellite1, satellite2))

    planet1.printInfo()
}