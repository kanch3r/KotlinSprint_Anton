package org.example.Lesson_17

class Quiz(question: String, answer: String) {
    val questionQuiz = question
        get() = field
    var answerQuiz = answer
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val quiz = Quiz("Столица Тайланда?", "Банкок")
    println(quiz.questionQuiz)
    quiz.answerQuiz = "Пхукет"
    println(quiz.answerQuiz)
}