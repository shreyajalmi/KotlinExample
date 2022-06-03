package com.softmonks.kotlinudemydemo.LearnKotlin

class UserAdmins<UserDefined>(credit:UserDefined){
    init {
        println("Credit : $credit")
    }
}

fun <UserDefined> display(process:UserDefined){
    println("Process : $process")
}

fun main(args:Array<String>){
    var userAdmin = UserAdmins<String>("hussain")
    var userAdmin2 = UserAdmins<Int>(123)
    var userAdmin3 = UserAdmins<Double>(123.123)

    display<Int>(22)
    display<String>("Tomato")
    display<Double>(3.14)
}