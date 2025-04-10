package org.example.Lesson_5

const val MIN_RANGE: Int = 0
const val MAX_RANGE: Int = 42
const val JACKPOT: Int = 3
const val GOOD_PRIZE: Int = 2
const val SMALL_PRIZE: Int = 1
const val FAIL: Int = 0

fun main() {

    val randomNumber1: Int = (MIN_RANGE..MAX_RANGE).random()
    val randomNumber2: Int = (MIN_RANGE..MAX_RANGE).random()
    val randomNumber3: Int = (MIN_RANGE..MAX_RANGE).random()

    val randomNumbersList = buildList<Int> {
        add(randomNumber1)
        add(randomNumber2)
        add(randomNumber3)
    }

    println("Для победы в лотерее вам нужно угадать три разных числа от 0 до 42!")
    println("Введите первое любое число от 0 до 42:")
    val inputUserNumber1: Int = readln().toInt()

    println("Введите второе любое число от 0 до 42:")
    val inputUserNumber2: Int = readln().toInt()

    println("Введите третье любое число от 0 до 42:")
    val inputUserNumber3: Int = readln().toInt()

    val userNumberList = buildList<Int> {
        add(inputUserNumber1)
        add(inputUserNumber2)
        add(inputUserNumber3)
    }

    val result = randomNumbersList.intersect(userNumberList)

    when (result.size) {
        JACKPOT -> println("Вы угадали все числа и выиграли джекпот!")
        GOOD_PRIZE -> println("Вы угадали два числа и получаете суперприз!")
        SMALL_PRIZE -> println("Вы угадали одно числа и получаете утешительный приз!")
        FAIL -> println("Вы не угадали ни одного числа.")
    }

    println("Выиграшные числа: ${randomNumbersList.joinToString()}")

}