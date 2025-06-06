package org.example.Lesson_14

open class LinerShip(
    open val name: String = "Motherboard",
    open val speed: Int = 500,
    open val passengerCapacity: Int = 1000,
    open val icebreaker: Boolean = false,
)

class CargoShip(
    override val name: String,
    val cargoCapacity: Int = 1000,
) : LinerShip(
    name = name,
    speed = 100,
    passengerCapacity = 10,
)

class IcebreakerShip(
    override val name: String,
) : LinerShip(
    name = name,
    speed = 50,
    passengerCapacity = 10,
    icebreaker = true,
)

fun main() {
    val linerShip = LinerShip()
    val cargoShip = CargoShip("Heavy")
    val icebreakerShip = IcebreakerShip("Iceboat")
}