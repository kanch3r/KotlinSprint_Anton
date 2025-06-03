package org.example.Lesson_13

class ContactColleague(val name: String, val number: Long, val company: String? = null)

fun main() {

    val userList = listOf(
        ContactColleague("Garry", 123456789),
        ContactColleague("Ron", 123456789, "Hogwarts"),
        ContactColleague("Germiona", 123456789, "Hogwarts"),
        ContactColleague("Draco", 123456789, "Slytherin"),
        ContactColleague("Sirius", 123456789, "null"),
    )

    val uniqueCompany = userList.mapNotNull { it.company }.toSet()
    println(uniqueCompany.joinToString())

}