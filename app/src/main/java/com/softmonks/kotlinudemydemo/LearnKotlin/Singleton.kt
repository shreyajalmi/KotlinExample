package com.softmonks.kotlinudemydemo.LearnKotlin

/*Singleton helps define a class
* lazy method calls a object only once
* if another call is made to the same class older created class is made*/
class Singleton{
    var name:String?=null
    private constructor(){
        println("Instance is created")
    }

    companion object{
        val instance : Singleton by lazy {
            Singleton()
        }
    }
}

fun main(args: Array<String>) {
    var s1 = Singleton.instance
    s1.name = "Hussain"
    println(s1.name)

    var s2 = Singleton.instance
    println(s2.name)

    var s3 = Singleton.instance
    println(s3.name)
}