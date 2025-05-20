package org.example.Lesson_11

class СategoryOfRecipe (
    val nameOfCategory: String,
    val icon: String,
    val shortDescription: String,
)

class Recipe (
    val nameOfRecipe: String,
    val icon: String,
)

class Ingredients(
    val dishName: String,
    val icon: String,
    val ingredients: List<String>,
    val quantity: Float,
    val units: String,
    var portions: Int,
    val preparationProcess: String,
    var inFavorites: Boolean = false,
) {
    fun addToFavorites() {
        inFavorites = true
    }
}

class Favorites(
    val name: String,
    val listOfFavorites: MutableList<String>,
)