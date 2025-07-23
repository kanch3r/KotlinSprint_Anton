package org.example.Lesson_19

enum class Category(val nameOfCategory: String) {
    CLOTHES("Одежда"),
    STATIONERY("Канцтовары"),
    SUNDRY("Разное");

    fun displayCategoryName(): String {
        return nameOfCategory
    }
}

class Merchandise(val id: Int, val name: String, val category: Category) {
    fun displayInfo() {
        println("ID товара: $id, Имя товара: $name, Категория: ${category.displayCategoryName()}.")
    }
}

fun main() {
    val goods1 = Merchandise(1, "Штаны", Category.CLOTHES)
    val goods2 = Merchandise(2, "Канцелярский нож", Category.STATIONERY)
    val goods3 = Merchandise(3, "Батарейка", Category.SUNDRY)

    goods1.displayInfo()
    goods2.displayInfo()
    goods3.displayInfo()
}

