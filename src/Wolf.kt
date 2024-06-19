class Wolf() : Canine() {
    override val name = "Wolf"
    override val image = "Wolf.jpg"
    override val food = "meat"
    override val habitat = "forest"

    override fun makeNoise() {
        println("Wooooo Wooooo Wooooo")
    }

    override fun eat() {
        println("Wolf is eating $food")
    }

}