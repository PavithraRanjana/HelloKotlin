class Dinosaur(val breed: String, val diet: String, val lifespan: Int, weightInPoundsParam: Int) {

    var weightInPounds: Int = weightInPoundsParam
//        set(value) {
//            if (value > 0) field = 0
//        }

        set(value): Unit = if (value > 0) field = value else {}

    val weightInPoundsString : String
        get() = "$weightInPounds Pounds"

    val weightInKg: String
        get() =  "${weightInPounds / 2.2} Kg"

    override fun toString(): String {
        return "$breed"
    }
}