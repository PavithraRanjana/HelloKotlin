class Vet () {

    fun giveShot(animal: Array<Animal>) {
        animal.forEach {
            it.makeNoise()
            println("there you go. Shot complete for Mr $it.")
            println()
        }
    }

}