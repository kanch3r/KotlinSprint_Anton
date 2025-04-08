package org.example.Lesson_4

fun main() {

    val cargoWeightMin: Int = 35
    val cargoWeightMax: Int = 100
    val cargoVolumeMax: Int = 100

    val cargo1Weight: Int = 20
    val cargo1Volume: Int = 80

    val cargo2Weight: Int = 50
    val cargo2Volume: Int = 100


    println("Груз с весом $cargo1Weight кг и объёмом $cargo1Volume л соответвует категории 'Average': " +
            "${(cargo1Weight > cargoWeightMin) && (cargo1Weight <= cargoWeightMax) && (cargo1Volume < cargoVolumeMax)}")
    println("Груз с весом $cargo2Weight кг и объёмом $cargo2Volume л соответвует категории 'Average': " +
            "${(cargo2Weight > cargoWeightMin) && (cargo2Weight <= cargoWeightMax) && (cargo2Volume < cargoVolumeMax)}")

}