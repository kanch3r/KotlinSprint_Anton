package org.example.Lesson_18

class Order(val oderNumber: Int) {

    fun displayOrderItems(goods: String) {
        println("Заказан товар: $goods")
    }

    fun displayOrderItems(goods: List<String>) {
        println("Заказаны следующие товары: $goods")
    }
}

fun main() {
    val order1 = Order(1)
    val order2 = Order(2)

    order1.displayOrderItems("Морковь")
    order2.displayOrderItems(listOf("Свекла", "Моковь", "Лук"))

}