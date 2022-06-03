package com.softmonks.kotlinudemydemo.LearnKotlin

//has only data and no function

data class Person(val name:String, val age:Int, val gender:String)

fun main(){
    val person = Person("Hussain", 30, "Male")
    println("person's name : ${person.name}")
    println("person's age : ${person.age}")
    println("person's gender : ${person.gender}")
}