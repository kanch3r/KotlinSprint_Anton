package org.example.Lesson_15

abstract class Creatures : Swimming {
    abstract val name: String
    abstract fun printInfo()

}

class Seagull(override val name: String) : Creatures(), Flying, Walking {
    override fun printInfo() {
        println("$name умеет: ${walking()}, ${flying()}, ${swimming()}")
    }
}

class CruсianCarp(override val name: String) : Creatures() {
    override fun printInfo() {
        println("$name умеет: ${swimming()}")
    }
}

class Duck(override val name: String) : Creatures(), Flying, Walking {
    override fun printInfo() {
        println("$name умеет: ${walking()}, ${flying()}, ${swimming()}")
    }
}

interface Swimming {
    fun swimming(): String = "плавать"
}
interface Flying {
    fun flying(): String  = "летать"
}
interface Walking {
    fun walking(): String = "ходить"
}

fun main() {
    val seagull = Seagull("Чайка")
    val crucianCarp = CruсianCarp("Карась")
    val duck = Duck("Утка")
    seagull.printInfo()
    crucianCarp.printInfo()
    duck.printInfo()
}
