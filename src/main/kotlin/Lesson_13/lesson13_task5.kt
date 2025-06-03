package org.example.Lesson_13

class ContactFolks(val name: String, val number: Long?, val company: String? = null) {

    fun printData() = println("Имя:$name \nНомер:$number \nКомпания:${company ?: "не указано"}")
}

fun main() {

    println("Введите имя контакта:")
    val contactName: String = readln()

    println("Введите номер контакта:")
    val contactNumber = try {
        readln().toLong()
    } catch (e: NumberFormatException) {
        println("Ошибка: ${e::class.simpleName}")
        null
    }

    println("Введите организацию:")
    val contactCompany: String? = readlnOrNull()?.ifEmpty { null }

    val newUser = ContactFolks(contactName, contactNumber, contactCompany)
    newUser.printData()

}