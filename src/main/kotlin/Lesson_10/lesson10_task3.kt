package org.example.Lesson_10

const val LOWER_DIGIT: Char = '0'
const val HIGHER_DIGIT: Char = '9'
const val LOWER_SYMBOL: Char = ' '
const val HIGHER_SYMBOL: Char = '/'

fun generatePassword(passwordLength: Int): String {
    var password = ""
    for (i in 0 until passwordLength) {
        when (i % 2) {
            0 -> password += (LOWER_DIGIT..HIGHER_DIGIT).random()
            1 -> password += (LOWER_SYMBOL..HIGHER_SYMBOL).random()
        }
    }
    return password
}

fun main() {

    println("Введите желаемую длину пароля:")
    println(generatePassword(readln().toInt()))

}

