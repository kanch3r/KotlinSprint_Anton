package org.example.Lesson_15

abstract class Car: MoveCar {
    abstract override val name: String
    abstract val passengerCapacity: Int
}

class PassengerCar(
    override val name: String,
    override val passengerCapacity: Int,
    override var currentPassengers: Int = 0,
) : Car(), MovePassenger

class CargoCar(
    override val name: String,
    override val passengerCapacity: Int,
    override val cargoCapacity: Int,
    override var currentPassengers: Int = 1,
    override var currentCargo: Int = 0
) : Car(), MovePassenger, MoveCargo

interface MoveCar {
    val name: String
    fun startDrive() {
        println("$name начал движение.")
    }

    fun stopDrive() {
        println("$name закончил движение.")
    }
}

interface MovePassenger {
    val name: String
    val passengerCapacity: Int
    var currentPassengers: Int
    fun addPassenger() {
        if (currentPassengers < passengerCapacity) {
            currentPassengers++
            println("Добавлен пассажир в $name. Всего $currentPassengers пассажиров.")
        } else {
            println("$name: достигнута максимальная вместимость")
        }
    }

    fun removePassenger() {
        if (currentPassengers > 0) {
            currentPassengers--
            println("Пассажир высажен. Осталось $currentPassengers пассажиров.")
        } else {
            println("$name пуст.")
        }
    }
}

interface MoveCargo {
    val name: String
    val cargoCapacity: Int
    var currentCargo: Int
    fun addCargo() {
        if (currentCargo < cargoCapacity) {
            currentCargo += 1000
            println("Загружено 1000 киллограм в $name. Всего $currentCargo груза.")
        } else {
            println("$name уже заполнен грузом.")
        }
    }

    fun removeCargo() {
        if (currentCargo > 0) {
            currentCargo -= 1000
            println("Выгружено 1000 килограмм. Осталось $currentCargo груза.")
        } else {
            println("$name: весь груз выгружен.")
        }
    }
}

fun main() {

    val passengerCarMain = PassengerCar("Легковой автомобиль #1", 3)
    val passengerCarAdditional = PassengerCar("Легковой автомобиль #2", 3)
    val cargoCar = CargoCar("Грузовой автомобиль", 1, 2000)

    passengerCarMain.addPassenger()
    passengerCarMain.addPassenger()
    passengerCarMain.addPassenger()
    passengerCarAdditional.addPassenger()
    passengerCarAdditional.addPassenger()
    passengerCarAdditional.addPassenger()
    cargoCar.addCargo()
    cargoCar.addCargo()

    passengerCarMain.startDrive()
    passengerCarAdditional.startDrive()
    cargoCar.startDrive()
    passengerCarMain.stopDrive()
    passengerCarAdditional.stopDrive()
    cargoCar.stopDrive()

    passengerCarMain.removePassenger()
    passengerCarMain.removePassenger()
    passengerCarMain.removePassenger()
    passengerCarAdditional.removePassenger()
    passengerCarAdditional.removePassenger()
    passengerCarAdditional.removePassenger()
    cargoCar.removeCargo()
    cargoCar.removeCargo()

}