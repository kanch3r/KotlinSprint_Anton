package org.example.Lesson_20

class Robot(val name: String) {
    val phrases: MutableList<String> = mutableListOf(
        "I'll be back!",
        "Hasta la vista, baby!",
        "Come with me if you want to live.",
        "I need your clothes, your boots, and your motorcycle.",
        "The future is not set."
    )
    var modifiedPhrases: List<String> = phrases

    fun say() = println("$name say: ${modifiedPhrases.random()}")

    fun setModifier(modifier: (String) -> String) {
        modifiedPhrases = phrases.map(modifier)
    }
}

fun main() {
    val terminator = Robot("T-800")
    terminator.say()
    terminator.setModifier { it.uppercase() }
    terminator.say()
    terminator.setModifier { it.reversed() }
    terminator.say()
}

