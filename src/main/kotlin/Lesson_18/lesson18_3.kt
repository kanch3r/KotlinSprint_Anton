package org.example.Lesson_18

abstract class Animal() {
    abstract fun feed(): String
    open fun sleep() = "спит"
}

class Fox(val name: String) : Animal() {
    override fun feed() = "$name ест ягоды."
    override fun sleep() = "$name ${super.sleep()}."
}

class Dog(val name: String) : Animal() {
    override fun feed() = "$name ест кости."
    override fun sleep() = "$name ${super.sleep()}."
}

class Cat(val name: String) : Animal() {
    override fun feed() = "$name ест рыбу."
    override fun sleep() = "$name ${super.sleep()}."
}

fun main() {
    val fox = Fox("Лиса")
    val dog = Dog("Собака")
    val cat = Cat("Кошка")

    val animalList = listOf<Animal>(fox, dog, cat)

    animalList.forEach { println(it.feed()) }
    animalList.forEach { println(it.sleep()) }
}