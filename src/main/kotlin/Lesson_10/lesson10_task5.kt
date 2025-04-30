package org.example.Lesson_10

const val SMALL_START: Char = 'a'
const val SMALL_END: Char = 'z'
const val BIG_START: Char = 'A'
const val BIG_END: Char = 'Z'
const val DIGIT_START: Char = '0'
const val DIGIT_END: Char = '9'
const val TOKEN_LENGTH: Int = 32
const val LOGIN: String = "Senior Pomidor"
const val PASSWORD: String = "qwerty"


fun generateToken(): String {
    val pool = (SMALL_START..SMALL_END) + (BIG_START..BIG_END) + (DIGIT_START..DIGIT_END)
    var token = ""
    repeat(TOKEN_LENGTH) {
        token += pool.random()
    }
    return token
}

fun authentication(name: String, password: String): String? {
    return if (name.equals(LOGIN) && password.equals(PASSWORD)) {
        generateToken()
    } else {
        null
    }
}

fun getUserBasket(userToken: String?): String {
    return if (userToken != null) {
        userBasket().toString()
    } else {
        "Неверный логин или пароль!"
    }
}

fun userBasket(): MutableList<String> {
    val basket = mutableListOf("хлеб", "сыр", "колбаса")
    return basket
}


fun main() {

    println("Введите ваш логин для входа:")
    val userName = readln()
    println("Введите ваш пароль для входа:")
    val userPassword = readln()

    val userAccess = authentication(userName, userPassword)

    println(getUserBasket(userAccess))

}