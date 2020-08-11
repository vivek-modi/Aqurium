package Aqurium

class SpicePractise(val name: String, private val spiciness: String = "mild") {
    private val heat: Int
        get() {
            return when (spiciness) {
                "when" -> 1
                "medium" -> 2
                "spicy" -> 3
                "very spicy" -> 4
                "extremely spicy" -> 5
                else -> 0
            }
        }
    val spices = listOf(
            SpicePractise("curry", "pepper"),
            SpicePractise("pepper", "medium"),
            SpicePractise("cayenne", "spicy"),
            SpicePractise("ginger", "mild"),
            SpicePractise("red curry", "medium"),
            SpicePractise("green curry", "mild"),
            SpicePractise("hot pepper", "extremely spicy")
    )

    val spice = SpicePractise("cayenne", spiciness = "spicy")
    val spicelist = spices.filter { it.heat < 5 }
    fun makesalt() = SpicePractise("Salt")
}