package org.example.Lesson_11

class ForumUser(
    val userId: Int,
    val name: String,
) {
    class Builder {
        var userId: Int = 0
        var name: String = "Unknown"

        fun setUserId(userId: Int): Builder = apply { this.userId = userId }
        fun setName(name: String): Builder = apply { this.name = name }

        fun build(): ForumUser = ForumUser(userId, name)
    }
}

class ForumMessage(
    val authorId: Int,
    val message: String,
) {
    class Builder {
        var authorId: Int = 0
        var message: String = "Empty message"

        fun setAuthorId(authorId: Int): Builder = apply { this.authorId = authorId }
        fun setMessage(message: String): Builder = apply { this.message = message }

        fun build(): ForumMessage = ForumMessage(authorId, message)
    }
}

class Forum(
    var registerUserId: Int = 1,
    val listOfForumUsers: MutableList<ForumUser> = mutableListOf(),
    val messageList: MutableList<ForumMessage> = mutableListOf(),
) {

    fun createNewUser(userName: String): ForumUser {
        val newUser = ForumUser.Builder()
            .setUserId(registerUserId)
            .setName(userName)
            .build()

        registerUserId++
        listOfForumUsers.add(newUser)
        return newUser
    }

    fun createNewMessage(userId: Int, text: String): ForumMessage? {
        val user = listOfForumUsers.find { it.userId == userId }
        return if (user != null) {
            val newMessage = ForumMessage.Builder()
                .setAuthorId(userId)
                .setMessage(text)
                .build()

            messageList.add(newMessage)
            newMessage
        } else {
            println("Только зарегистрированные пользователи могут оставлять сообщения!")
            null
        }
    }

    fun printThread() {
        for (message in messageList) {
            val author = listOfForumUsers.find { it.userId == message.authorId }
            if (author != null) {
                println("${author.name}: ${message.message}")
            } else {
                println("Unknown user: ${message.message}")
            }
        }
    }
}

fun main() {

    val forum = Forum()
    val user1 = forum.createNewUser("Garry")
    val user2 = forum.createNewUser("Ron")

    forum.createNewMessage(user1.userId, "hello")
    forum.createNewMessage(user2.userId, "hi")
    forum.createNewMessage(3, "who am I?")
    forum.createNewMessage(user1.userId, "how are you?")
    forum.createNewMessage(user2.userId, "fine! thanks!")

    forum.printThread()
}