package org.example.Lesson_19

class SpaceShip(name: String, type: String) {

    fun takeOff() {}
    fun landing() {
        //TODO реализовать класс приземления
    }
    fun shooting() {
        TODO("не задано действие стрельбы/при стрельбе")
    }

}

fun main() {
    val spaceShip = SpaceShip("Космический корабль", "гражданский")

    spaceShip.shooting()
}