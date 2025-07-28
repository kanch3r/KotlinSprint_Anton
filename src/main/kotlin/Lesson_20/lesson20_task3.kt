package org.example.Lesson_20

class QuestPlayer(val playerName: String) {
    val playerHasKey: Boolean = true
}

fun main() {
    val questPlayer = QuestPlayer("Sherlock")

    val checkDoor: (QuestPlayer) -> String = { player: QuestPlayer ->
        if (player.playerHasKey) "${player.playerName} открыл дверь" else "Дверь заперта"
    }
    println(checkDoor(questPlayer))
}


