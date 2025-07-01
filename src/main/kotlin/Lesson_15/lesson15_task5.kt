package org.example.Lesson_15

class PassengerCar(
    override val name: String,
    override val passengerCapacity: Int,
    override var currentPassengers: Int = 0,
) : MovePassenger, MoveCar

class CargoCar(
    override val name: String,
    override val passengerCapacity: Int,
    override val cargoCapacity: Int,
    override var currentPassengers: Int = 0,
    override var currentCargo: Int = 0
) : MovePassenger, MoveCar, MoveCargo

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
            println("Добавлен пассажир в $name. Всего $currentPassengers пассажиров из $passengerCapacity.")
        } else {
            println("$name: достигнута максимальная вместимость")
        }
    }

    fun removePassenger() {
        if (currentPassengers > 0) {
            currentPassengers--
            println("Пассажир высажен из $name. Осталось $currentPassengers пассажиров из $passengerCapacity.")
        } else {
            println("$name пуст.")
        }
    }
}

interface MoveCargo {
    val name: String
    val cargoCapacity: Int
    var currentCargo: Int
    fun addCargo(cargoToBeAdd: Int) {
        if (currentCargo + cargoToBeAdd <= cargoCapacity) {
            currentCargo += cargoToBeAdd
            println("Загружено $cargoToBeAdd киллограмм в $name. Всего $currentCargo груза из $cargoCapacity.")
            if (currentCargo == cargoCapacity) println("$name загружен полностью.")
        } else {
            println("Невозможно добавить $cargoToBeAdd в $name. Свободного места ${cargoCapacity - currentCargo}.")
        }
    }

    fun removeCargo(cargoToBeRemove: Int) {
        if (currentCargo - cargoToBeRemove >= 0) {
            currentCargo -= cargoToBeRemove
            println("Выгружено $cargoToBeRemove килограмм. Осталось $currentCargo груза из $cargoCapacity.")
            if (currentCargo == 0) println("$name разгружен полностью.")
        } else {
            println("Невозможно выгрузить $cargoToBeRemove из $name. Всего $currentCargo груза осталось.")
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
    cargoCar.addPassenger()
    cargoCar.addCargo(500)
    cargoCar.addCargo(1500)
    println()
    passengerCarMain.startDrive()
    passengerCarAdditional.startDrive()
    cargoCar.startDrive()
    passengerCarMain.stopDrive()
    passengerCarAdditional.stopDrive()
    cargoCar.stopDrive()
    println()
    passengerCarMain.removePassenger()
    passengerCarMain.removePassenger()
    passengerCarMain.removePassenger()
    passengerCarAdditional.removePassenger()
    passengerCarAdditional.removePassenger()
    cargoCar.removePassenger()
    cargoCar.removeCargo(1500)
    cargoCar.removeCargo(500)

}