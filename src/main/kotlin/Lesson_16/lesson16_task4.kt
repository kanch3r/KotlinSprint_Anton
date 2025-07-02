package org.example.Lesson_16

class Order(val id: Int) {
    private var status: String = "Создан"

    private fun updateStatus(newStatus: String) {
        status = newStatus
    }

    fun requestToChangeStatusOrderId(setNewStatus: String) {
        updateStatus(setNewStatus)
    }

    fun getStatus() {
        println("Заказ №$id: Статус:$status")
    }
}

fun main() {

    val order1 = Order(1)
    val order2 = Order(2)

    order1.getStatus()
    order2.getStatus()
    order1.requestToChangeStatusOrderId("В обработке")
    order2.requestToChangeStatusOrderId("В пути")
    order1.getStatus()
    order2.getStatus()
}