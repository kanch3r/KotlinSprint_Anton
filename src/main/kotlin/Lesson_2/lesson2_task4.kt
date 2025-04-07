package org.example.Lesson_2

const val BUFF: Float = 0.2f

fun main() {

    val ironOre: Int = 7
    val crystalOre: Int = 11

    val ironOreBuffed: Float = ironOre * BUFF
    val crystalOreBuffed: Float = crystalOre * BUFF

    println(String.format("%.0f", ironOreBuffed))
    println(String.format("%.0f", crystalOreBuffed))

}