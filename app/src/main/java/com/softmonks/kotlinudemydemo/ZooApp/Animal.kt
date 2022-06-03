package com.softmonks.kotlinudemydemo.ZooApp

class Animal{
    var name:String?=null
    var description:String?=null
    var image:Int?=null
    var isKiller:Boolean = false

    constructor(name:String, description:String, image:Int, isKiller:Boolean){
        this.name = name
        this.description = description
        this.image = image
        this.isKiller = isKiller
    }
}