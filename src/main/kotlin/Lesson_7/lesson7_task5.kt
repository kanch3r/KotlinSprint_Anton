package org.example.Lesson_7

const val SMALL_LETTERS_FROM: Char = 'a'
const val SMALL_LETTERS_TO: Char = 'z'
const val BIG_LETTERS_FROM: Char = 'A'
const val BIG_LETTERS_TO: Char = 'Z'
const val NUMBERS_START: Char = '0'
const val NUMBERS_END: Char = '9'
const val BASE_QTY_OF_SYMBOLS: Int = 3

fun main() {

    println("Укажите желаемую длину пароля (не менее 6 символов):")
    val userInputPasswordLength = readln().toInt()

    var passwordGenerated = ""

    passwordGenerated += (SMALL_LETTERS_FROM..SMALL_LETTERS_TO).random()
    passwordGenerated += (BIG_LETTERS_FROM..BIG_LETTERS_TO).random()
    passwordGenerated += (NUMBERS_START..NUMBERS_END).random()

    repeat(userInputPasswordLength - BASE_QTY_OF_SYMBOLS) {
        val allChars = (SMALL_LETTERS_FROM..SMALL_LETTERS_TO) + (BIG_LETTERS_FROM..BIG_LETTERS_TO) +
                (NUMBERS_START..NUMBERS_END).random()
        val randomElement = allChars.random()
        passwordGenerated += randomElement
    }

    println(passwordGenerated.toList().shuffled().joinToString(""))

}