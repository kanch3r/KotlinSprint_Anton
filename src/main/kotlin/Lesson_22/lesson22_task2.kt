package org.example.Lesson_22

class RegularBook2nd(val name: String, val author: String)

class RegularBookWithOverride2nd(val name: String, val author: String) {
    override fun equals(other: Any?): Boolean {
        if (other !is RegularBookWithOverride2nd) return false
        return name == other.name && author == other.author
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + author.hashCode()
        return result
    }

    override fun toString(): String {
        return "RegularBookWithOverride2nd(name='$name', author='$author')"
    }
}

data class DataBook2nd(val name: String, val author: String)

fun main() {
    val regularBook1 = RegularBook2nd("Гарри Поттер", "Роулинг")
    val regularBookWithOverride1 = RegularBookWithOverride2nd("Мастер и Маргарита", "Булгаков")
    val dataBook1 = DataBook2nd("Властелин колец", "Толкин")

    println(regularBook1) // строковый вид объекта по умолчанию. Эдакая abracadabra. не информативно, не читабельно
    println(regularBookWithOverride1) // переопределение toString на вывод всей информации объекта. читабельно.
    println(dataBook1) // В data class уже по умолчанию toString переопределён на читабельный вид. Информативно.
}