package org.example.Lesson_17

class Quiz (question: String, answer: String) {
    val questionQuiz = question
        get() {
            println(field)
            return field
        }
    var answerQuiz = answer
        get() {
            println("Правильный ответ: $field")
            return field
        }
        set(value) {
            if (value == field) println("Верно!") else println("Ответ неверный.")
        }

}

fun main() {
    val quiz = Quiz("Столица Тайланда?", "Банкок")
    quiz.questionQuiz
    quiz.answerQuiz = "Пхукет"
    quiz.answerQuiz
}