package org.example.Lesson_14

open class LinerBoat(
    open val name: String = "Motherboard",
    open val speed: Int = 500,
    open val passengerCapacity: Int = 1000,
    open val icebreaker: Boolean = false,
) {
    open fun displayShipInfo() {
        println(
            "Имя корабля: $name, " +
                    "Скорость корабля: $speed, " +
                    "Пассажировместимость: $passengerCapacity, " +
                    "Ледокол?: ${if (icebreaker) "да" else "нет"}"
        )
    }

    open fun startLoad() {
        println("${name}: Выдвинуть горизонтальный трап со шкафута")
    }
}

class CargoBoat(
    override val name: String,
    val cargoCapacity: Int = 1000,
) : LinerBoat(
    name = name,
    speed = 100,
    passengerCapacity = 10,
) {
    override fun displayShipInfo() {
        println(
            "Имя корабля: $name, " +
                    "Скорость корабля: $speed, " +
                    "Пассажировместимость: $passengerCapacity, " +
                    "Грузовая вместимость: $cargoCapacity, " +
                    "Ледокол?: ${if (icebreaker) "да" else "нет"}"
        )
    }

    override fun startLoad() {
        println("${name}: Активировать погрузочный кран")
    }
}

class IcebreakerBoat(
    override val name: String,
) : LinerBoat(
    name = name,
    speed = 50,
    passengerCapacity = 10,
    icebreaker = true,
) {
    override fun startLoad() {
        println("${name}: Открыть ворота со стороны кормы")
    }
}

fun main() {
    val linerShip = LinerBoat()
    val cargoShip = CargoBoat("Heavy")
    val icebreakerShip = IcebreakerBoat("Iceboat")

    linerShip.startLoad()
    cargoShip.startLoad()
    icebreakerShip.startLoad()
    println()
    linerShip.displayShipInfo()
    cargoShip.displayShipInfo()
    icebreakerShip.displayShipInfo()

}