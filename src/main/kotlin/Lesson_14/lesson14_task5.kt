package org.example.Lesson_14

open class Message(
    open val idMessage: Int,
    open val text: String,
    open val author: String,
)

class ChildMessage(
    override val idMessage: Int,
    override val text: String,
    override val author: String,
    val parentMessageId: Int,
) : Message(idMessage, text, author)

class Chat() {
    val chat: MutableList<Message> = mutableListOf()
    var messageId: Int = 0

    fun addMessage(text: String, author: String) {
        chat.add(Message(++messageId, text, author))
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int) {
        chat.add(ChildMessage(++messageId, text, author, parentMessageId))

    }

    fun printChat() {
        val repliesByParent = chat.filter { it is ChildMessage }.groupBy { (it as ChildMessage).parentMessageId }

        chat.forEach {
            if (it !is ChildMessage) {
                println("${it.author}: ${it.text}")
            }
            repliesByParent[it.idMessage]?.forEach {
                println("\t${it.author}: ${it.text}")
            }
        }
    }
}


fun main() {
    val chat = Chat()
    chat.addMessage("Hello my dear friends!", "Germiona")
    chat.addMessage("Hi!", "Garry")
    chat.addThreadMessage("Hi, Germiona!", "Ron", 1)
    chat.addMessage("Welcome!", "Hagrid")
    chat.addThreadMessage("Dirty blood!", "Drako", 1)

    chat.printChat()
}