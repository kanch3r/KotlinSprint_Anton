package org.example.Lesson_21

import java.io.File

fun File.writeWordToFile(word: String) = this.writeText(word.lowercase())

fun main() {
    val newFile = File("Файл, куда будет записываться новое слово.txt")
    val newWord = "То самое новое слово, которое будет записываться"
    newFile.writeWordToFile(newWord)
}