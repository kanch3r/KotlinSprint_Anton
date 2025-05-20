package org.example.Lesson_11

class Member (
    val nickname: String,
    var onAir: Boolean = false,
    var micOn: Boolean = false,
    var muted: Boolean = true,
)

class Room(
    val roomName: String,
    var roomPicture: String = "grey color",
    val participants: MutableList<String> = mutableListOf(),
) {
    fun addMember(user: Member) {
        participants += user.nickname
    }

    fun getMemberStatus(user: Member) {
        if (user.nickname in participants) {
            user.micOn = true
            user.muted =false
            println("Микрофон включен: ${user.micOn}")
        }
    }
}

fun main() {

    val kurilka = Room(
        roomName = "Курилка",
    )
    val user = Member("Антон")

    println(kurilka.participants)
    kurilka.addMember(user)
    println(kurilka.participants)
    println(kurilka.getMemberStatus(user))

}
