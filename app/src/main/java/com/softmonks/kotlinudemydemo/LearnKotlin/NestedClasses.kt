package com.softmonks.kotlinudemydemo.LearnKotlin

class OuterClass{
    private val name:String?=null
    inner class Nested{
        fun Show(){
            println(name)
        }
    }
}

fun main() {
    var outer = OuterClass()
    var nested = outer.Nested()
    nested.Show()
}