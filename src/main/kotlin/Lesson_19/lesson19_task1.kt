package org.example.Lesson_19

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun main() {

    val fishForAquarium = Fish.entries.joinToString { it.name }

    println("Доступные рыбки для добавления в аквариум: $fishForAquarium")

}