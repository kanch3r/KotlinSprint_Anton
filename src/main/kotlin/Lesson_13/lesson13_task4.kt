package org.example.Lesson_13

class ContactEmployee(val name: String, val number: Long?, val company: String? = null) {

    fun printData() = println("Имя:$name \nНомер:$number \nКомпания:${company ?: "не указано"}")
}

fun main() {

    val userList: MutableList<ContactEmployee> = mutableListOf()

    println("Введите имя контакта:")
    val contactName: String = readln()

    println("Введите номер контакта:")
    val contactNumber: Long? = readln().toLongOrNull() ?: return println("Неверный формат!")

    println("Введите организацию:")
    val contactCompany: String? = readlnOrNull()?.ifEmpty { null }

    val newUser = ContactEmployee(contactName, contactNumber, contactCompany)

    userList.add(newUser)

    userList.forEach { it.printData() }

}