package org.example.Lesson_14

open class LinerBoat(
    val name: String,
    val speed: Int,
    val capacity: Int,
    val icebreaker: Boolean = false,
) {
    open fun startLoad() {
        println("${name}: Выдвинуть горизонтальный трап со шкафута")
    }
}

class CargoBoat(
    name: String,
    speed: Int,
    capacity: Int,
) : LinerBoat(name, speed, capacity) {

    override fun startLoad() {
        println("${name}: Активировать погрузочный кран")
    }

}

class IcebreakerBoat(
    name: String,
    speed: Int,
    capacity: Int,
) : LinerBoat(name, speed, capacity, icebreaker = true) {

    override fun startLoad() {
        println("${name}: Открыть ворота со стороны кормы")
    }
}

fun main() {
    val linerShip = LinerBoat("MotherBoard", 500, 1000)
    val cargoShip = CargoBoat("Heavy", 300, 800)
    val icebreakerShip = IcebreakerBoat("Iceboat", 200, 500)

    linerShip.startLoad()
    cargoShip.startLoad()
    icebreakerShip.startLoad()

}