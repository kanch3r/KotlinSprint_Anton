package org.example.Lesson_17

class Package(id: Int, location: String) {
    val packageId = id
    var packageLocation = location
        set(value) {
            field = value
            countChangeLocation++
        }
    var countChangeLocation: Int = 0
}

fun main() {
    val mailPackage = Package(1, "Гонконг")

    println("Начальная точка посылки: ${mailPackage.packageLocation}")
    mailPackage.packageLocation = "Новосибирск"
    mailPackage.packageLocation = "Москва"
    mailPackage.packageLocation = "Санкт-Петербург"
    println("Финальная точка доставки: ${mailPackage.packageLocation}")
    println("Количество перемещений: ${mailPackage.countChangeLocation}")
}