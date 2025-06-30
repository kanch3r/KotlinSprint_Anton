package org.example.Lesson_15

abstract class MusiciansGoods(
    val id: Int,
    val name: String,
    val stockQuantity: Int,
)

class MusicInstrument(
    id: Int,
    name: String,
    stockQuantity: Int,
    val components: List<MusicComponent>
) : MusiciansGoods(id, name, stockQuantity), Search {
    override fun searchingForComponent() {
        components.forEach { println("${it.name} is ${it.stockQuantity} pieces.")}
    }
}

class MusicComponent(
    id: Int,
    name: String,
    stockQuantity: Int,
) : MusiciansGoods(id, name, stockQuantity)

interface Search {
    fun searchingForComponent()
}

fun main() {

    val guitarStrings = MusicComponent(1, "Guitar Strings", 100)
    val pick = MusicComponent(2, "Guitar Pick", 50)

    val guitar = MusicInstrument(
        1,
        "Acoustic Guitar",
        10,
        listOf(guitarStrings, pick)
    )

    guitar.searchingForComponent()
}