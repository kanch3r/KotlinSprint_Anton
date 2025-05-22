package org.example.Lesson_11

class Сategory(
    val nameOfCategory: String,
    val idCategory: Int,
    val pictureCategory: String,
    val shortDescription: String? = null,
    val recipeOfCategory: List<Recipe>? = null,
)

class Recipe(
    val nameOfRecipe: String,
    val idRecipe: Int,
    val pictureRecipe: String,
    val ingredientsOfRecipe: List<Ingredient>,
    val preparationProcess: String,
    var portions: Int = 1,
    var inFavorites: Boolean = false,
)

class Ingredient(
    val nameOfIngredient: String,
    val quantityOfIngredient: Int,
    val unitsOfMeasure: String,
)