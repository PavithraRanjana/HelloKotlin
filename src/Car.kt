class Car(Brand: String, var model: String, var year: Int, var colour: String) {
    var brand = Brand.uppercase()
    var passengerCapacity = 4

    // asks about the passanger capacity
    init {
        println("current passenger capacity is $passengerCapacity")
        println("do you want to change it (Y/N)")
        val response = readln().uppercase()
        if (response == "Y") {
            println("enter the required number of seats : ")
            val requiredSeats = readln().toInt()
            passengerCapacity = requiredSeats
        }
        else{
            println("We'll continue with $passengerCapacity seats")
        }
    }

    // provide details of the object created
    init {
        println("\n--------------------------")
        println("\n$brand $model $year")
        println("Passenger Capacity : $passengerCapacity")
    }

    override fun toString(): String {
        return "$brand $model $year"
    }
}