package org.example.Lesson_21

val vowelLetters: List<Char> = listOf('a', 'e', 'i', 'o', 'u')

fun String.vowelCount() = this.lowercase().count { it in vowelLetters }

fun main() {
    val word = "hello"
    println(word.vowelCount())
}
