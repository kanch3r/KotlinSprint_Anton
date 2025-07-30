package org.example.Lesson_21

enum class VowelLetters(val letters: List<Char>) {
    VOWEL(listOf('a', 'e', 'i', 'o', 'u'))
}

fun String.vowelCount() = this.count { it in VowelLetters.VOWEL.letters }

fun main() {
    val word = "hello"
    println(word.vowelCount())
}