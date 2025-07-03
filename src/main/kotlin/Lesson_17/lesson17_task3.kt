package org.example.Lesson_17

class Folder {
    val name: String = "Top Secret"
        get() {
            return if (isSecret) {
                "Скрытая папка"
            } else {
                field
            }
        }
    val numberOfFiles: Int = 50
        get() {
            return if (isSecret) {
                0
            } else {
                field
            }
        }
    private val isSecret: Boolean = true
}

fun main() {
    val folder = Folder()
    println("Имя папки: ${folder.name}")
    println("Кол-во файлов: ${folder.numberOfFiles}")
}