package org.example.Lesson_11

class Member (
    val nickname: String,
    var userPicture: String = nickname.first().toString(),
    var userStatus: String = "muted",
) {
    override fun toString(): String {
        return "Member(nickname=$nickname, userPicture=$userPicture, userStatus=$userStatus"
    }
}

class Room(
    val roomName: String,
    var roomPicture: String = "grey color",
    val participants: MutableList<Member> = mutableListOf(),
) {

    fun addMember(user: Member) = participants.add(user)

    fun updateMemberStatus(user: String, newStatus: String) {
        participants.forEach { if (it.nickname == user) it.userStatus = newStatus }
    }
}

fun main() {

    val kurilka = Room(
        roomName = "Курилка",
    )
    val user1 = Member("Антон")
    val user2 = Member("Вася")

    println(kurilka.participants)
    kurilka.addMember(user1)
    kurilka.addMember(user2)
    kurilka.updateMemberStatus("Антон", "onAir")
    println(kurilka.participants)
    println(user1.userStatus)

}