package org.example.Lesson_1

fun main() {

    var quantityOfOrders: Int = 75 // переменная, которую можно перезаписывать
    val thanksMessage: String = "Thank you for your purchase!" // неизменяемое сообщение для пользователя

    println(quantityOfOrders)
    println(thanksMessage)

    var quantityOfEmployee: Int = 2000 // количество работников

//    println(quantityOfEmployee)

    quantityOfEmployee = 1999

    println(quantityOfEmployee)

}