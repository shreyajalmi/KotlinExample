package com.softmonks.kotlinudemydemo.LearnKotlin

open class CarConstructor(){
    var type:String? = null
    var model: Int? = null
    private var price:Double? =null
    var miles:Int? = 0
    var owner:String? = null

    constructor(type:String, model: Int, price:Double, miles:Int, owner:String):this(){
        this.type = type
        this.model = model
        this.price = price
        this.miles = miles
        this.owner = owner
    }
    constructor(type:String, model: Int, price:Double, miles:Int):this(){
        this.type = type
        this.model = model
        this.price = price
        this.miles = miles
        this.owner = owner
    }

    open fun getCarPrice():Double{
        return this.price!!
    }

    fun getPrice():Double{
        return this.price!!
    }

}

fun main() {
    val carObj = CarConstructor("BMW", 2015, 20000.0, 120, "Noel")
    println("Type : ${carObj.type}")
    println("Owner : ${carObj.owner}")

    val carObj1 = CarConstructor("Toyota", 2019, 15000.0, 210)
    println("Type : ${carObj1.type}")
    println("Owner : ${carObj1.owner}")

    println("Type : ${carObj.type}")
    println("Type : ${carObj.getCarPrice()}")
}
