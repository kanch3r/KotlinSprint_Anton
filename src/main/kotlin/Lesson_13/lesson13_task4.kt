package org.example.Lesson_13

class ContactEmployee(val name: String, val number: Long, val company: String? = null) {

    fun printData() = println("Имя:$name \nНомер:$number \nКомпания:${company ?: "не указано"}")
}

fun checkNumber(): Long {
    println("Введите номер контакта:")
    return readln().toLongOrNull() ?: run {
        println("Неверный формат! Введите номер ещё раз:")
        checkNumber()
    }
}

fun main() {

    val userList: MutableList<ContactEmployee> = mutableListOf()

    while (true) {

        println("Введите имя контакта(или 'выход' для выхода из меню создания контакта):")
        val contactName: String = readln()
        if (contactName.lowercase() == "выход") break

        val contactNumber: Long = checkNumber()

        println("Введите организацию:")
        val contactCompany: String? = readln().ifEmpty { null }

        val newUser = ContactEmployee(contactName, contactNumber, contactCompany)

        userList.add(newUser)
        println("Контакт успешно добавлен!")
    }

    println("Список сохранённых контактов:")
    if (userList.isEmpty()) println("Список пуст") else {
        userList.forEach { it.printData() }
    }

}