package org.example.Lesson_13

class ContactStudent(val name: String, val number: Long, val company: String? = null) {

    fun printData() {
        println("Имя:$name \nНомер:$number \nКомпания:${company ?: "не указано"}")
    }
}

fun main() {

    val user1 = ContactStudent("Garry", 123456789)
    val user2 = ContactStudent("Ron", 123456789, "Hogwarts")

    user1.printData()
    user2.printData()

}