package org.example.Lesson_5

const val MATCH_NEEDED: Int = 3
const val MIN_RANGE: Int = 0
const val MAX_RANGE: Int = 42
const val JACKPOT: Int = 3
const val GOOD_PRIZE: Int = 2
const val SMALL_PRIZE: Int = 1
const val FAIL: Int = 0

fun main() {

    val randomNumbersList = List<Int>(3) { (MIN_RANGE..MAX_RANGE).random() }

    println("Для победы в лотерее вам нужно угадать $MATCH_NEEDED разных числа от 0 до 42!")
    println("Введите $MATCH_NEEDED числа через Enter от 0 до 42:")

    val userNumberList = List<Int>(3) { readln().toInt() }

    val result = randomNumbersList.intersect(userNumberList)

    when (result.size) {
        JACKPOT -> println("Вы угадали все числа и выиграли джекпот!")
        GOOD_PRIZE -> println("Вы угадали два числа и получаете суперприз!")
        SMALL_PRIZE -> println("Вы угадали одно числа и получаете утешительный приз!")
        FAIL -> println("Вы не угадали ни одного числа.")
    }

    println("Выиграшные числа: ${randomNumbersList.joinToString()}")

}