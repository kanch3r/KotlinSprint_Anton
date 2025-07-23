package org.example.Lesson_19

enum class Gender(val genderName: List<String>) {
    MALE(listOf("мужской", "м", "муж")),
    FEMALE(listOf("женский", "ж", "жен")),
    NULL(listOf("пол не определён"))
}

fun getGenderName(userGender: String): Gender {
    for (gender in Gender.entries) {
        if (userGender in gender.genderName)
            return gender
    }
    return Gender.NULL
}

class Person(val name: String, val gender: String) {
    fun getPersonInfo(): String {
        return "$name, $gender"
    }
}

fun main() {

    val userList: MutableList<Person> = mutableListOf()
    var count = 0

    println(
        "Введите имя и пол построчно. Пол можеть быть только мужской или женский." +
                "'Точку' в конце ставить не нужно:"
    )

    repeat(1) {
        val name = readln().trim()
        val gender = getGenderName(readln().lowercase().trim())
        val user = Person(name, gender.genderName[0])

        userList.add(user)
        println("${++count} человек добавлен!")
    }

    println("Общий список:")
    userList.forEach { (println(it.getPersonInfo())) }
}