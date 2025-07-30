package org.example.Lesson_21

fun Map<String, Int>.maxCategory() = this.maxBy { it.value }.key

fun main() {

    val characteristics: Map<String, Int> = mapOf(
        "Strength" to 3,
        "Dexterity" to 5,
        "Wisdom" to 4,
        "Charisma" to 5,
    )

    println(characteristics.maxCategory())
}