package org.example.Lesson_17

class Ship(name: String) {
    var shipName: String = name
        set(value) {
            println("Невозможно сменить имя!")
        }
    var averageSpeed: Int = 50
    val domesticHarbor: String = "Санкт-Петербург"
}

fun main() {
    val ship1 = Ship("Смелый")
    println(ship1.shipName)
    ship1.shipName = "Храбрый"
    println(ship1.shipName)
}