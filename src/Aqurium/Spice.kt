package Aqurium

fun main(args: Array<String>) {
    val curry = Curry("pepper", "pepper")
    println(curry.color)
    println("Data Class Object")
    for (element in spiceCabinet)
        println(element.label)
}

sealed class Spice(val name: String, spiciness: String, color: SpiceColor) : SpiceColor by color {
    abstract fun prepareSpice()
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color), Grinder {

    override fun grind() {
        TODO("Not yet implemented")
    }

    override fun prepareSpice() {
        grind()
    }
}

data class SpiceContainer(var spice: Spice) {
    val label = spice.name
}

val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Red Curry", "medium")),
        SpiceContainer(Curry("Green Curry", "spicy")))