package org.example.Lesson_22

data class GalacticGuide(
    val place: String,
    val placeDescription: String,
    val occasionTime: String,
    val distanceToEarthInLightYears: Double,
) {
    override fun toString(): String {
        return "Место: $place,\nОписание: $placeDescription,\nВремя события: $occasionTime,\n" +
                "Расстояние в световых годах от Земли: $distanceToEarthInLightYears"
    }
}

fun main() {
    val alphaCentauri = GalacticGuide(
        place = "Alpha Centauri",
        placeDescription =
            "Ближайшая к Солнцу звездная система, состоящая из трех звезд:" +
                    " Alpha Centauri A, Alpha Centauri B и Proxima Centauri",
        occasionTime = "Постоянная система (не событие)",
        distanceToEarthInLightYears = 4.37
    )
    println(alphaCentauri)
}