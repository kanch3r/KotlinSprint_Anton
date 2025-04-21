package org.example.Lesson_7

const val LETTERS_FROM: Char = 'a'
const val LETTERS_TO: Char = 'z'
const val NUMBERS_FROM: Int = 0
const val NUMBERS_TO: Int = 9
const val QTY_OF_EACH_ELEMENT: Int = 3

fun main() {

    var passwordGenerated: String = ""

    repeat(QTY_OF_EACH_ELEMENT) {
        passwordGenerated += (LETTERS_FROM..LETTERS_TO).random()
        passwordGenerated += (NUMBERS_FROM..NUMBERS_TO).random()
    }

    println(passwordGenerated)

}