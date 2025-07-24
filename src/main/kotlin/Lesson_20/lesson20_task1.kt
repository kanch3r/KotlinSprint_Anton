package org.example.Lesson_20

fun main() {
    val userName = "Антон"
    val splashScreen: (String) -> String = { it: String ->
        "C наступающим новым годом, $userName!"
    }
    println(splashScreen(userName))
}