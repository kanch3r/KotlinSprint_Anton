package org.example.Lesson_18

abstract class Dice {
    abstract fun throwDice()
}

class DiceWith4Edges() : Dice() {
    private val range: Int = (1..4).random()
    override fun throwDice() {
        println("Результат на кубике с 4-мя гранями: $range")
    }
}

class DiceWith6Edges() : Dice() {
    private val range: Int = (1..6).random()
    override fun throwDice() {
        println("Результат на кубике с 6-ю гранями: $range")
    }
}

class DiceWith8Edges() : Dice() {
    private val range: Int = (1..8).random()
    override fun throwDice() {
        println("Результат на кубике с 8-ю гранями: $range")
    }
}

fun main() {

    val dice4Edge = DiceWith4Edges()
    val dice6Edge = DiceWith6Edges()
    val dice8Edge = DiceWith8Edges()

    val diceList = listOf<Dice>(dice4Edge, dice6Edge, dice8Edge)

    diceList.forEach { it.throwDice() }
}