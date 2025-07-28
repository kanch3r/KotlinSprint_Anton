package org.example.Lesson_20

class Player(val playerName: String) {
    val maxHealthPoints: Int = 100
    var currentHealthPoints: Int = maxHealthPoints
}

fun main() {
    val player1 = Player("Garry")

    val getDamage: (Player, Int) -> String = { player: Player, damage: Int ->
        player.currentHealthPoints = player.currentHealthPoints - damage
        "Игрок ${player.playerName} получил $damage едениц урона. Текущее здоровье ${player.currentHealthPoints}"
    }

    val useHealingPotion: (Player) -> String = { player: Player ->
        player.currentHealthPoints = player.maxHealthPoints
        "Игрок ${player.playerName} востановил своё здоровье до максимума. " +
                "Текущее здоровье ${player.currentHealthPoints}"
    }
    println(getDamage(player1, 30))
    println(useHealingPotion(player1))
}


