package org.example.Lesson_17

class Package() {
    val id: Int = 1
    var location: String = "Гонконг"
        set(value) {
            field = value
            countChangeLocation++
        }
    var countChangeLocation: Int = 0
}

fun main() {
    val mailPackage = Package()

    println("Начальная точка посылки: ${mailPackage.location}")
    mailPackage.location = "Новосибирск"
    mailPackage.location = "Москва"
    mailPackage.location = "Санкт-Петербург"
    println("Финальная точка доставки: ${mailPackage.location}")
    println("Количество перемещений: ${mailPackage.countChangeLocation}")
}