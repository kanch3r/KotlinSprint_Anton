package org.example.Lesson_22

class RegularBook(val name: String, val author: String)

class RegularBookWithOverride(val name: String, val author: String) {
    override fun equals(other: Any?): Boolean {
        if (other !is RegularBookWithOverride2nd) return false
        return name == other.name && author == other.author
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + author.hashCode()
        return result
    }
}

data class DataBook(val name: String, val author: String)

fun main() {
    val regularBook1 = RegularBook2nd("Гарри Поттер", "Роулинг")
    val regularBook2 = RegularBook2nd("Гарри Поттер", "Роулинг")
    val regularBook3 = regularBook1

    val regularBookWithOverride1 = RegularBookWithOverride2nd("Мастер и Маргарита", "Булгаков")
    val regularBookWithOverride2 = RegularBookWithOverride2nd("Мастер и Маргарита", "Булгаков")
    val regularBookWithOverride3 = regularBookWithOverride1

    val dataBook1 = DataBook2nd("Властелин колец", "Толкин")
    val dataBook2 = DataBook2nd("Властелин колец", "Толкин")
    val dataBook3 = dataBook1

    // стандартный equals в классе, сравнивает ссылки на объекты(аналог '==='), не сравнивает содержимое.
    println(regularBook1 == regularBook2) // false, потому что разные объекты в памяти (разный хэш-код)
    println(regularBook1 == regularBook3) // true, потому что те же объекты в памяти (одинаковый хэш-код)
    println(regularBook1.hashCode()) // 666641942
    println(regularBook2.hashCode()) // 960604060
    println(regularBook3.hashCode()) // 666641942

// Переопределённый equals. Требуется переопределение hashCode для согласованности.
// Можно выбрать, по какому полю сравнивать, если не надо по всем полям.
// Тут мы задали логику сравнения именно по значению в переменной, а не по ссылке в памяти. И сразу все поля.
    println(regularBookWithOverride1 == regularBookWithOverride2) // true, потому что значения одинаковые
    println(regularBookWithOverride1 == regularBookWithOverride3) // true, потому что копия, по факту
    println(regularBookWithOverride1.hashCode()) // -970142207
    println(regularBookWithOverride2.hashCode()) // -970142207
    println(regularBookWithOverride3.hashCode()) // -970142207

    // Data Class уже использует переопределённый equals и hashCode(сразу для всех полей класса).
    // Нет нужны переопределять. Меньше кода - меньше ошибок
    println(dataBook1 == dataBook2) // true
    println(dataBook1 == dataBook3) // true
    println(dataBook1.hashCode()) // 1885907685
    println(dataBook2.hashCode()) // 1885907685
    println(dataBook3.hashCode()) // 1885907685
}