package com.softmonks.kotlinudemydemo.LearnKotlin

class Truck: CarConstructor {

    var subType:String? = null

    constructor(type:String, model: Int, price:Double, miles:Int, owner:String, subtype: String):super(type, model, price, miles, owner){
        this.subType = subType
    }
    constructor(type:String, model: Int, price:Double, miles:Int, subtype: String):super(type, model, price, miles){
        this.subType = subType
    }

    override fun getCarPrice():Double{
        return this.getPrice()+10
    }
}

//extension to the class
fun Truck.getCarPriceWrapper():Double{
    return this.getCarPrice()
    //return super.getCarPrice()
}

fun main() {
    val truck1 = Truck("BMW", 2015, 20000.0, 120, "Noel", "Dump")
    println("Type : ${truck1.type}")
    println("Owner : ${truck1.owner}")
    println("Price : ${truck1.getCarPriceWrapper()}")

    val truck2 = Truck("Toyota", 2019, 15000.0, 210, "Garbage")
    println("Type : ${truck2.type}")
    println("Owner : ${truck2.owner}")
    println("Price : ${truck2.getCarPrice()}")
}