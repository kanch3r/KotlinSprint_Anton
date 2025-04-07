package org.example.Lesson_2

fun main() {

    val employees: Int = 50
    val salaryEmployee: Int = 30000
    val trainees: Int = 30
    val salaryTrainees: Int = 20000

    val employeeExpenses: Int = employees * salaryEmployee
    val traineeExpenses: Int = trainees * salaryTrainees
    val totalExpenses: Int = employeeExpenses + traineeExpenses
    val averageSalary: Int = (employeeExpenses + traineeExpenses) / (employees + trainees)

    println(employeeExpenses)
    println(traineeExpenses)
    println(totalExpenses)
    println(averageSalary)

}