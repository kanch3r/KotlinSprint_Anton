package org.example.Lesson_15

abstract class User(val id: Int, val name: String) {
    abstract fun writeMessage()
}

class RegularUser(id: Int, name: String): User(id, name) {
    override fun writeMessage() {
        println("Regular user $name writes a message")
    }
}

class AdminUser(id: Int, name: String): User(id, name) {
    override fun writeMessage() {
        println("Admin $name writes an important message")
    }

    fun editMessages() {
        println("Admin $name is editing messages")
    }

    fun editUsers() {
        println("Admin $name is editing users")
    }
}

fun main() {
    val user1 = AdminUser(1, "Moderator")
    val user2 = RegularUser(2, "Participant")
    user2.writeMessage()
    user1.editMessages()
    user1.editUsers()
    user1.writeMessage()
}