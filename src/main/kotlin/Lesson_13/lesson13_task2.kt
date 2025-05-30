package org.example.Lesson_13

class DirectorySecond(val name: String, val number: Long, val company: String? = null) {

    fun printData() {
        println("Имя:$name \nНомер:$number \nКомпания:${company ?: "не указано"}")
    }
}

fun main() {

    val user1 = DirectorySecond("Garry", 123456789)
    val user2 = DirectorySecond("Ron", 123456789, "Hogwarts")
    val user3 = DirectorySecond("Germiona", 123456789)

    user1.printData()
    user2.printData()

}