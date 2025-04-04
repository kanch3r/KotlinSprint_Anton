package org.example.Lesson_2

fun main() {

    val employees: Int = 50
    val salaryEmployee: Int = 30000
    val trainees: Int = 30
    val salaryTrainees: Int = 20000

    val employeeExpenses: Int = employees * salaryEmployee // расходы на сотрудников
    val traineeExpenses: Int = trainees * salaryTrainees // расходы на стажеров
    val totalExpenses: Int = employeeExpenses + traineeExpenses // общие расходы
    val averageSalary: Int = (employeeExpenses + traineeExpenses) / (employees + trainees) // средняя ЗП

    println(employeeExpenses) // 1500000
    println(traineeExpenses) // 600000
    println(totalExpenses) // 2100000
    println(averageSalary) // 26250

}