package org.example.Lesson_22

data class MainScreenState(val data: String = "", val isLoading: Boolean = false)

class MainScreenViewModel() {

    val mainScreenStateInitial = MainScreenState()
    var mainScreenStateProcess = MainScreenState()
    var mainScreenStateFinal = MainScreenState()

    fun loadData() {
        println("Отсутствие данных")

        mainScreenStateProcess = mainScreenStateInitial.copy(isLoading = true)
        println("Загрузка данных")

        mainScreenStateFinal = mainScreenStateProcess.copy(data = "Какие-то данные", isLoading = false)
        println("наличие загруженных данных")
    }
}

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}