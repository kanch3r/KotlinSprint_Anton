package org.example.Lesson_18

abstract class Dice(private val diceOriginal: Int) {
    val range = 1..diceOriginal
    fun throwDice() {
        println("Результат кубика $diceOriginal: ${range.random()}.")
    }
}

class DiceWith4Edges() : Dice(4)
class DiceWith6Edges() : Dice(6)
class DiceWith8Edges() : Dice(8)

fun main() {

    val dice4Edge = DiceWith4Edges()
    val dice6Edge = DiceWith6Edges()
    val dice8Edge = DiceWith8Edges()

    val diceList = listOf<Dice>(dice4Edge, dice6Edge, dice8Edge)

    diceList.forEach { it.throwDice() }
}