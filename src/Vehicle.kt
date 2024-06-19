open class Vehicle(var make: String, var model: String, var year: Int) {
    open fun Drive() {
        println("The Vehicle is Driving")
    }

    open fun Stop() {
        println("The Vehicle is Stopped")
    }
}