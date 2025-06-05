package org.example.Lesson_14

open class LinerShip(
    open val name: String = "MotherBoard",
    open val speed: Int = 500,
    open val capacity: Int = 1000,
    open val icebreaker: Boolean = false,
)

class CargoShip(
    override val name: String,
    override val speed: Int,
    override val capacity: Int,
) : LinerShip()

class IcebreakerShip(
    override val name: String,
    override val speed: Int,
    override val capacity: Int,
    override val icebreaker: Boolean
) : LinerShip()

fun main() {
    val linerShip = LinerShip()
    val cargoShip = CargoShip("Heavy", 300, 800)
    val icebreakerShip = IcebreakerShip("Iceboat", 200, 500, true)

}