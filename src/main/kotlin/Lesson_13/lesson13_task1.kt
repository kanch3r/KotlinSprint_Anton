package org.example.Lesson_13

class Directory(val name: String, val number: Long, val company: String? = null)

fun main() {

    val user1 = Directory("Garry", 123456789)
    val user2 = Directory("Ron", 123456789, "Hogwarts")
    val user3 = Directory("Germiona", 123456789)

    println(user1.name)
    println(user2.company)
    println(user3.company)

}
