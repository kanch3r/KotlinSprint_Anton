package org.example.Lesson_21

import java.io.File

fun File.writeWordToFile(word: String) {
    val currentText = if (this.exists()) this.readText() else ""
    this.writeText("${word.lowercase()} + ${currentText.lowercase()}")
}

fun main() {
    val newFile = File("Файл, куда будет записываться новое слово.txt")
    val newWord = "То самое новое слово, которое будет записываться"
    newFile.writeWordToFile(newWord)
}