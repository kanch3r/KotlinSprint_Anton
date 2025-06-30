package org.example.Lesson_16

class Order(private val id: Int) {
    var status: String = "Создан"

    fun updateStatus(newStatus: String) {
        status = newStatus
    }
}

fun changeStatusOrderId(orderId: Order, setNewStatus: String) {
    orderId.updateStatus(setNewStatus)
}

fun main() {

    val order1 = Order(1)

    println(order1.status)
    changeStatusOrderId(order1, "В обработке")
    println(order1.status)

}