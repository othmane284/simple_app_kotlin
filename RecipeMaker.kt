package recipeMaker

fun main(args: Array<String>) {
    val ingredients = listOf("Water", "Milk", "Meat", "Vegetables", "Fruits", "Cereal", "Eggs", "Oil", "No more ingredients")
    val selectedIngredients = arrayListOf<Int>()
    var isRunning = true

    while (isRunning) {
        displayMenu()
        val menuChoice = getInput()

        when (menuChoice) {
            1 -> {
                displayIngredients()
                var choosingIngredients = true

                while (choosingIngredients) {
                    val ingredientChoice = getInput()
                    if (ingredientChoice != 9) {
                        println("You selected: ${ingredients[ingredientChoice - 1]}")
                        selectedIngredients.add(ingredientChoice - 1)
                    } else {
                        choosingIngredients = false
                    }
                }
            }
            2 -> {
                println("Your selected ingredients:")
                selectedIngredients.forEach { index -> println(ingredients[index]) }
            }
            3 -> {
                println("Exiting... Bye!")
                selectedIngredients.clear()
                isRunning = false
            }
            else -> println("Invalid option, please try again.")
        }
    }
}

fun displayMenu() {
    println("""
        :: Welcome to Recipe Maker ::
        Select an option:
        1. Make a recipe
        2. View my recipes
        3. Exit
    """.trimIndent())
}

fun displayIngredients() {
    println("""
        Let's create a recipe!
        Choose from the following ingredients:
        1. Water
        2. Milk
        3. Meat
        4. Vegetables
        5. Fruits
        6. Cereal
        7. Eggs
        8. Oil
        9. No more ingredients
    """.trimIndent())
}
println(" card or cash")
var result = readline()
if (recepie)

fun getInput(): Int {
    print("Enter your choice: ")
    return readLine()?.toIntOrNull() ?: 0
}
