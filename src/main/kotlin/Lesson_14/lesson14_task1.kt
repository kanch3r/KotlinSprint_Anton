package org.example.Lesson_14

open class LinerShip(
    val name: String,
    val speed: Int,
    val capacity: Int,
    val icebreaker: Boolean = false,
)

class CargoShip(
    name: String,
    speed: Int,
    capacity: Int,
) : LinerShip(name, speed, capacity)

class IcebreakerShip(
    name: String,
    speed: Int,
    capacity: Int,
) : LinerBoat(name, speed, capacity, icebreaker = true)

fun main() {
    val linerShip = LinerBoat("MotherBoard", 500, 1000)
    val cargoShip = CargoShip("Heavy", 300, 800)
    val icebreakerShip = IcebreakerShip("Iceboat", 200, 500)

}