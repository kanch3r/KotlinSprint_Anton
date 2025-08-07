package org.example.Lesson_22

data class MainScreenState(val data: String? = null, val isLoading: Boolean = false)

class MainScreenViewModel() {

    var mainScreenState = MainScreenState()

    fun loadData() {
        mainScreenState = mainScreenState.copy(data = "Отсутствие данных")
        println("$mainScreenState")

        mainScreenState = mainScreenState.copy(data = "Загрузка данных", isLoading = true)
        println("$mainScreenState")

        mainScreenState = mainScreenState.copy(data = "Наличие загруженных данных", isLoading = false)
        println("$mainScreenState")
    }
}

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}