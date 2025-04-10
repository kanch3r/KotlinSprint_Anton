package org.example.Lesson_4

const val DELIMITER_TO_FIND_ODD: Int = 2

fun main() {

    val trainingDay: Int = 5

    val dayForHandAndPress = trainingDay % DELIMITER_TO_FIND_ODD == 1

    println(
        """
Упражения для рук:     ${dayForHandAndPress}
Упражнения для ног:    ${!dayForHandAndPress}
Упражнения для спины:  ${!dayForHandAndPress}
Упражнения для пресса: ${dayForHandAndPress}
    """.trimMargin()
    )

}