class Dog (var name: String, var breed: String, var weight: Double) {

    fun Bark(): Unit = println(if (weight > 20.0) "boo boo" else  "woof woof")

}