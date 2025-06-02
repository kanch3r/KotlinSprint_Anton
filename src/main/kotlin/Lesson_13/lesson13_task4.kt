package org.example.Lesson_13

class ContactEmployee(val name: String, val number: Long?, val company: String? = null) {

    val listOfContacts: MutableList<ContactEmployee> = mutableListOf()

    fun addToList() = listOfContacts.add(ContactEmployee(name, number, company))

    fun printData() = println("Имя:$name \nНомер:$number \nКомпания:${company ?: "не указано"}")
}

fun main() {

    println("Введите имя контакта:")
    val contactName: String = readln()

    println("Введите номер контакта:")
    val contactNumber: Long? = readln().toLongOrNull() ?: return println("Невверный формат!")

    println("Введите организацию:")
    val contactCompany: String? = readln()

    val newUser = ContactEmployee(contactName, contactNumber, contactCompany)
    newUser.addToList()
    newUser.printData()

}