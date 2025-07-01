package org.example.Lesson_17

class Folder {
    val name: String = "Top Secret"
        get() {
            if (isSecret) {
                println("Скрытая папка. Кол-во файлов: 0")
            } else {
                println("Имя папки:$field, Кол-во файлов: $numberOfFiles")
            }
            return field
        }
    private val numberOfFiles: Int = 50
    private val isSecret: Boolean = true
}

fun main() {

    val folder = Folder()
    folder.name
}