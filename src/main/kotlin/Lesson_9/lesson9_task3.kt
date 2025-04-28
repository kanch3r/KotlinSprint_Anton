package org.example.Lesson_9

fun main() {

    val baseQtyForOmelet = listOf(2, 50, 15)

    println("Сколько порций омлета вы хотите приготовоить?")
    val userPortions = readln().toInt()

    val newRecipeForOmelet = baseQtyForOmelet.map { it * userPortions }

    println("На $userPortions порций вас понадобится: " +
            "Яиц - ${newRecipeForOmelet[0]} шт," +
            "молока - ${newRecipeForOmelet[1]} мл, " +
            "сливочного масла - ${newRecipeForOmelet[2]} гр."
    )

}