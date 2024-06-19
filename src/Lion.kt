class Lion() : Feline() {
    override val name = "Lion"
    override val image = "Lion.jpg"
    override val food = "meat"
    override val habitat = "grasslands"

    override fun makeNoise() {
        println("Grrrr Grrr Grrr")
    }

    override fun eat() {
        println("Lion is eating $food")
    }
}