package org.example.Lesson_3

fun main() {

    val dataFromUser = "D2-D4;0"

    val serverData = dataFromUser.split("-", ";")


    val cellFrom = serverData[0]
    val cellTo = serverData[1]
    val moveCounter = serverData[2]

    println(cellFrom)
    println(cellTo)
    println(moveCounter)

}