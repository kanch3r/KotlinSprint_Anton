package org.example.Lesson_18

open class Animal() {
    open fun feed() = "Принимать пищу"
    open fun sleep() = "Zzzz"
}

class Fox(val name: String) : Animal(){
    override fun feed() = "$name ест ягоды."
}
class Dog(val name: String) : Animal() {
    override fun feed() = "$name ест кости."
}
class Cat(val name: String) : Animal() {
    override fun feed() = "$name ест рыбу."
}

fun main() {
    val fox = Fox("Лиса")
    val dog = Dog("Собака")
    val cat = Cat("Кошка")

    val animalList = listOf<Animal>(fox, dog, cat)

    animalList.forEach { println(it.feed()) }
}