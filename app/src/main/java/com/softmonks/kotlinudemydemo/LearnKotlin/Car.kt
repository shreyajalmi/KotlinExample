package com.softmonks.kotlinudemydemo.LearnKotlin

class Car(val type:String, val model: Int, val price:Double, val miles:Int, val owner:String){
    init {
        println("Object created")
    }

    fun getCarPrice():Double{
        return this.price-(this.miles.toDouble()*10)
    }

}

fun main() {
    /*val carObj = Car("BMW",2015,20000.0,120,"Joel")
    println("Type : ${carObj.type}")
    println("Owner : ${carObj.owner}")

    val carObj1 = Car("Toyota",2019,15000.0,210,"Noel")
    println("Type : ${carObj1.type}")
    println("Owner : ${carObj1.owner}")

    println("Type : ${carObj.type}")
    println("Type : ${carObj.getCarPrice()}")*/

    val listOfCar = arrayListOf<Car>()
    listOfCar.add(Car("BMW", 2015, 20000.0, 120, "Joel"))
    listOfCar.add(Car("Toyota", 2019, 15000.0, 210, "Noel"))

    for (car in listOfCar){
        println("--------Car-------")
        println(car.owner)
        println(car.price)
    }
}