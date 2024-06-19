class Hippo : Animal() {
    override val name = "Hippo"
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt Grunt Grunt")
    }

    override fun eat() {
        println("the hippo is eating $food")
    }
}

