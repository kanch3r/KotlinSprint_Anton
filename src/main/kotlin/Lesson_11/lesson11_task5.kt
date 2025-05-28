package org.example.Lesson_11

class ForumUser(
    val userId: Int,
    val name: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)

class Forum(
    var registerUserId: Int = 1,
    val listOfForumUsers: MutableList<ForumUser> = mutableListOf(),
    val messageList: MutableList<ForumMessage> = mutableListOf(),
) {

    fun createNewUser(userName: String): ForumUser {
        val newUser = ForumUser(registerUserId, userName)
        registerUserId++
        listOfForumUsers.add(newUser)
        return newUser
    }

    fun createNewMessage(userId: Int, text: String) {
        if (listOfForumUsers.find { (it.userId == userId) } == null) {
            return
        }
        val newMessage = ForumMessage(userId, text)
        messageList.add(newMessage)
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