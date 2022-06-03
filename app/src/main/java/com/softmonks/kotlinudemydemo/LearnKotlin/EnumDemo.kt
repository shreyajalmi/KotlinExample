package com.softmonks.kotlinudemydemo.LearnKotlin

enum class Direction{
    NORTH,SOUTH,EAST,WEST
}

fun main(args:Array<String>) {
    var userDirection = Direction.SOUTH

    if (userDirection == Direction.SOUTH){
        println("He went to SOUTH")
    }
    else {
        println("IDK where he went")
    }
}