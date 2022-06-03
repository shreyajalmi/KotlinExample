package com.softmonks.kotlinudemydemo.LearnKotlin

abstract class Credit(){
    fun creditId():String {
        return "2323323"
    }
    abstract fun newCredit()
}

class UserInfo(): Credit(){
    fun getInfo():String{
        return creditId()
    }

    override fun newCredit(){
        println("New credit created")
    }
}

fun main(args:Array<String>) {
    //var credit = Credit()
    //println(credit.creditId())
    var user = UserInfo()
    println(user.getInfo())
    println(user.newCredit())
}