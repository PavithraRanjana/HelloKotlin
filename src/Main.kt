// when statement 1
fun whenStatement1(){
    // when statement
    val day = 2
    when(day){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Not a valid number")
    }
}

// when statement2
fun whenStatement2(){
    // when statement
    var planet = ""
    when(planet){
        "Pluto" -> println("Pluto is safe to enter")
        "Mercury" -> println("Mercury is safe to enter")
        "Mars" -> println("Mars is safe to enter")
        "Jupiter" -> println("Jupiter is safe to enter")
        else -> println("Unknow planet do not enter")
    }
}

// when statement 3
fun WhenStatement3(){
    // when statement
    val num1 = 100
    val num2: Int = 100

    when{
        num1 > num2 -> println("num1 is higher than num2")
        num1 < num2 -> println("num2 is higher than num1")
        num1 == num2 -> println("num1 is equal to num2")
    }
}

// if expression | assign a value to variable using if expression
fun ifExpression(): Unit{
    var greeting: String? = null
    greeting = "Hello Sir"
    val greetingToPrint = if (greeting != null) greeting else "Hey man"
    println(greetingToPrint)

}


// when expression | assign a value to variable using when expression
fun WhenExpression(): Unit{
    var favoriteFood: String? = null

    when{
        favoriteFood == null -> favoriteFood = "Ice Cream"
    }
}


// when expression | assign a value to variable using when expression
fun assingValueWithWhenExpression(){
    var favoriteFood: String? = null

    var foodToBuy = when(favoriteFood){
        null -> "Yogurt"
        else -> favoriteFood
    }
    println(foodToBuy)
}


// a basic function
fun sayHi(): Unit {
    println("Hi User")
}

// functions with a return type
fun funWithReturn() {
    fun sum(): Int {
        return 10+50
    }
    println(sum())
}

// function with a parameter
fun funWithPara() {
    fun add(num1:Double, num2:Double): Double {
        val result = num1 + num2
        return result
    }
    println(add(10.0, 100.0))
}

// arrays
fun array1(){
    val movies = arrayOf("The Town", "The Tailor", "Angry Birds")
    println("size of array is ${movies.size}")
    println("item at index 1 is \"${movies[2]}\"")
    println("item at index 0 is \"${movies.get(0)}\"")

}

// for loops
fun myForLoop() {
    val numbers = arrayOf(5,7,8,10,15,20)
    for (number in numbers){
        println("${number * 10}")
    }
}

// for each loop
fun myForeachLoop(){
    val tvShows = arrayOf("Braking bad", "Dan vs", "Marco Polo")
    tvShows.forEach { show -> println(show.uppercase()) }
//    tvShows.forEach { println(it.uppercase()) }
}

// getting user input
fun usrInput() {
    print("Please enter your name: ")
    val name= readLine()

    if (name != null && name.isNotEmpty()){
        println("hello $name")
    }
    else{
        println("you didnt enter the name")
    }
}

// lists
fun myList(){
    var pcBrands = mutableListOf("lenovo", "Samsung", "Apple", "Razor")
    pcBrands.addLast("Asus")


    pcBrands.forEach { println(it) }
}

// map
fun myMap1(){
    val immutableMap = mapOf(
        1 to "January",
        2 to "February",
        3 to "March",
        4 to "April",
        5 to "May",
        6 to "June",
        7 to "July",
        8 to "August",
        9 to "September",
        10 to "October",
        11 to "November",
        12 to "December"
    )

    for ((key, value) in immutableMap ) {
        println("$key --> $value")
    }
}

// using a foreach loop on a map
fun myMap2() {
    val productToManufacturer = mapOf(
        "iphone" to "Apple",
        "Playstation" to "Sony",
        "Legion Laptop" to "Lenovo",
        "Alienware Laptop" to "Dell"
    )

    productToManufacturer.forEach { (key, value) -> println("$value --> $key")}
}

// collection type as parameter for a function
fun collectionParameter() {

    val members = listOf("Daniel", "James", "Andrew", "Mason")

    fun sayHello(name: List<String>) {
        for (member in members) {
            println(member)
        }
    }

    // calling sayHi function
    sayHello(members)
}

// vararg 1
fun vararg1() {

    val numbers = intArrayOf(100, 200, 300, 400, 500)

    fun printNumbers(vararg numbers: Int) {
        for (number in numbers) {
            println(number)
        }
    }

    // calling printNumbers function
//    printNumbers(10, 20, 30, 0, 15)
    printNumbers(*numbers)
}

// named arguments
fun namedArguments() {

    fun welcome(name: String, age: Int) {
        println("Welcome $name. You are $age years old")
    }

    welcome(name = "Frank", age = 28)
    welcome(age = 30, name = "Woods")

}

// named Arguments with default values
fun defaultArguments() {

    fun bankAcc(accountType: String = "Savings", balance: Double = 15000.0) {
        println("Welcome! your account info\n$accountType -- $balance")
    }

//    bankAcc() // calling with default values
//    bankAcc(accountType = "Super Saver", balance = 100000.0) // calling with both named arguments
    bankAcc(balance = 45300.0)

}

// Dog class 1
fun DogClass() {

    var dog1 = Dog("Max", "German Sheperd", 70.0)
    var dog2 = Dog("Max", "German Sheperd", 15.0)

    dog1.Bark()
    println("dog1's name is ${dog1.name}")
    println("dog1's breed is ${dog1.breed}")
    println("dog1's wight is ${dog1.weight}")

}

// array of objects
fun arrayOfObjects() {
    var dog1 = Dog("Luna", "Great Dane", 120.0)
    var dog2 = Dog("Lucy", "Husky", 60.0)
    var dog3 = Dog("Charlie", "Golden Reviewer", 80.0)

    var dogHouse = arrayOf(dog1, dog2, dog3)
    dogHouse.forEach { dog -> println("${dog.name.padEnd(8)} | ${dog.breed.padEnd(15)} | ${dog.weight}") }
}

// Book object
fun bookObject() {

    var harryPotter1 = Book("Harry Potter and the Philosopher's Stone", "JK Rowling", 223, "Fantasy")
    var gameOfThrones = Book("Game of Thrones: Ice and Fire", "George RR Martin", 694, "Fantasy")
    var twilight = Book("Twilight", "Stephenie Meyer", 416, "Fantasy")

    var bookshelf = arrayOf(harryPotter1, gameOfThrones, twilight)

    bookshelf.forEach { println(it) }
}

// properties in the class body
fun propInClassBody() {
    var car1 = Car("Toyota", "Supra", 2024, "Blue")
    println(car1)

    println("Passenger Capacity - ${car1.passengerCapacity}")
}

// Initializer blocks
fun initializerBlocks() {
    var myCar1 = Car("Rolls Royce", "Phantom", 2025, "Maroon")

}

// initialize properties in a initializer block
fun propInitialization() {

    var phone1 = SmartPhone("Xiaomi", "Note 9s", "Nano Sim")
    println(phone1)

}

// creating duck objects with empty constructor
fun emptyConstructor() {
    var myDuck1 = Duck()
    println(myDuck1)
}

// getters
fun Getters() {
    var dino1 = Dinosaur("Spinosaurus", "Meat", 30, 44000,)
    println(dino1.weightInPoundsString)
    println(dino1.weightInKg)
}

// setters
fun Setters() {
    var dino1 = Dinosaur("Velociraptor", "Meat", 20, 43)
    println(dino1.weightInPoundsString)
    dino1.weightInPounds = 500
    println(dino1.weightInPoundsString)

    println("I'm a $dino1")
}

// single expression if statement
fun singleExpressionIfStatement(): Unit {
    println("Enter a number")
    val number = readln().toInt()

    val isGreaterThan10  = if (number > 10) "higher than 10" else {}
    println(isGreaterThan10)
}

// Inheritance1 - overriding val
fun Inheritance1() {

}

// Inheritance2 - overriding var
fun Inheritance2() {

}

// using the Animal Class
fun animalClass() {
    val animal1 : Animal = Wolf()
    println(animal1.image)
    animal1.roam()
    animal1.sleep()
    animal1.makeNoise()

    println()

    var animal2 : Animal = Hippo()
    println(animal2.image)
    animal2.roam()
    animal2.sleep()
    animal2.makeNoise()

}

// putting different animals in an array
fun animalArray() {

    val wolf1 = Wolf()
    val lion1 = Lion()
    val hippo1 = Hippo()

    val animals = arrayOf(wolf1, lion1, hippo1)

    for (animal in animals) {
        animal.eat()
    }

}

// calling giveShot function in Vet Class
fun vet() {

    var vet1 = Vet()
    var animals : Array<Animal> = arrayOf(Wolf(), Lion(), Hippo())

    vet1.giveShot(animals)

}
fun main() {

//    whenStatement1()
//    whenStatement2()
//    sayHi()
//    funWithReturn()
//    funWithPara()
//    array1()
//    myForLoop()
//    myForeachLoop()
//    usrInput()
//    myList()
//    myMap1()
//    myMap2()
//    collectionParameter()
//    vararg1()
//    namedArguments()
//    defaultArguments()
//    DogClass()
//    arrayOfObjects()
//    bookObject()
//    propInClassBody()
//    initializerBlocks()
//    propInitialization()
//    emptyConstructor()
//    Getters()
//    singleExpressionIfStatement()
//    Setters()
//    animalClass()
//    animalArray()
//    vet()


}

