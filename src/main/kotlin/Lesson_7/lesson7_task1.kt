package org.example.Lesson_7

const val LETTERS_FROM: Char = 'a'
const val LETTERS_TO: Char = 'z'
const val NUMBERS_FROM: Int = 0
const val NUMBERS_TO: Int = 9

fun main() {
    for (i in 1..3) {
        print((LETTERS_FROM..LETTERS_TO).random())
        print((NUMBERS_FROM..NUMBERS_TO).random())
    }
}