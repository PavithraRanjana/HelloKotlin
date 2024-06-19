class SmartPhone(var brand: String, var model: String, var simType: String) {
    var price: Int

    init {
        println("What's the price in USD ? ")
        price = readln().toInt()
    }

    override fun toString(): String {
        return "$brand $model - $price USD"
    }
}