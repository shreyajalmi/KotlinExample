package com.softmonks.kotlinudemydemo.LearnKotlin

import java.util.*
import kotlin.collections.ArrayList

class PersonClass(var name:String, var age:Int):Comparable<PersonClass>{
    override fun compareTo(other: PersonClass): Int {
        return this.age - other.age
    }
}

fun main(args: Array<String>) {

    /*Sorting of Array list of strings*/
    /*var listOfNames = ArrayList<String>()
    listOfNames.add("Jena")
    listOfNames.add("Laya")
    listOfNames.add("Hussain")

    println("Before Sorting")
    for(name in listOfNames){
        println(name)
    }

    println("After Sorting")
    Collections.sort(listOfNames)
    for(name in listOfNames){
        println(name)
    }*/

    var listOfNames = ArrayList<PersonClass>()
    listOfNames.add(PersonClass("Jena", 3))
    listOfNames.add(PersonClass("Laya", 1))
    listOfNames.add(PersonClass("Hussain", 28))

    println("Before Sorting")
    for(person in listOfNames){
        println("Person Name: ${person.name}")
        println("Person Age: ${person.age}")
    }

    println("After Sorting")
    Collections.sort(listOfNames)

    for(person in listOfNames){
        println("Person Name: ${person.name}")
        println("Person Age: ${person.age}")
    }
}