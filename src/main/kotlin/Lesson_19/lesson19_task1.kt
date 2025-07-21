package org.example.Lesson_19

enum class Fish(val nameFish: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}

fun main() {

    val fishForAquarium = Fish.entries.joinToString { it.nameFish }

    println("Доступные рыбки для добавления в аквариум: $fishForAquarium")
}