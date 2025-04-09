package org.example.Lesson_4

fun main() {

    val shipWithoutDamage: Boolean = true
    val crewMin: Int = 55
    val crewMax: Int = 70
    val provisionsMin: Int = 50
    val weatherGood: Boolean = true
    val crewRecommended: Int = 70

    println("Ваш корабль без повреждений? Ввведите true или false:")
    val shipDamage: Boolean = readln().toBoolean()

    println("Введите число человек экипажа:")
    val crew: Int = readln().toInt()

    println("Введите число ящиков провизии:")
    val provision: Int = readln().toInt()

    println("Благоприятная ли погода? Ввведите true или false:")
    val weather: Boolean = readln().toBoolean()

    val travelCheck = ((shipDamage == shipWithoutDamage) &&
            (crew in crewMin..crewMax) &&
            (provision > provisionsMin) &&
            (weather == weatherGood || weather != weatherGood)) ||
            ((shipDamage == shipWithoutDamage || shipDamage != shipWithoutDamage) &&
            (crew == crewRecommended) &&
            (provision >= provisionsMin) &&
            (weather == weatherGood))

    println("Готовность корабля к отплытию: $travelCheck")

}