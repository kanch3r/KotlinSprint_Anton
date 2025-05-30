package org.example.Lesson_13

class DirectoryThird(val name: String, val number: Long, val company: String? = null) {

    fun printData() {
        println("Имя:$name \nНомер:$number \nКомпания:${company ?: "не указано"}")
    }
}

fun main() {

    val userList = listOf(
        DirectoryThird("Garry", 123456789),
        DirectoryThird("Ron", 123456789, "Hogwarts"),
        DirectoryThird("Germiona", 123456789),
        DirectoryThird("Draco", 123456789, "Slytherin"),
        DirectoryThird("Sirius", 123456789, "null"),
    )

    userList.forEach { if (it.company != null) println(it.company)  }

}