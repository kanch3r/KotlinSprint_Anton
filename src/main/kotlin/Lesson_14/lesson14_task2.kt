package org.example.Lesson_14

open class LinerBoat(
    open val name: String = "Motherboard",
    open val speed: Int = 500,
    open val capacity: Int = 1000,
    open val icebreaker: Boolean = false,
) {
    open fun displayShipInfo() {
        println(
            "Имя корабля: $name," +
                    "Скорость корабля: $speed, " +
                    "Вместимость: $capacity, " +
                    "Ледокол?: ${if (icebreaker) "да" else "нет"}"
        )
    }

    open fun startLoad() {
        println("${name}: Выдвинуть горизонтальный трап со шкафута")
    }
}

class CargoBoat(
    override val name: String,
    override val speed: Int,
    override val capacity: Int,
) : LinerBoat() {

    override fun startLoad() {
        println("${name}: Активировать погрузочный кран")
    }

}

class IcebreakerBoat(
    override val name: String,
    override val speed: Int,
    override val capacity: Int,
    override val icebreaker: Boolean
) : LinerBoat() {

    override fun startLoad() {
        println("${name}: Открыть ворота со стороны кормы")
    }
}

fun main() {
    val linerShip = LinerBoat()
    val cargoShip = CargoBoat("Heavy", 300, 800)
    val icebreakerShip = IcebreakerBoat("Iceboat", 200, 500, true)

    linerShip.startLoad()
    cargoShip.startLoad()
    icebreakerShip.startLoad()
    println()
    linerShip.displayShipInfo()
    cargoShip.displayShipInfo()
    icebreakerShip.displayShipInfo()

}