package com.softmonks.kotlinudemydemo.LearnKotlin

import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {
    println("Write text")
    var str:String = readLine().toString()
    WriteToFile(str)
    readFromFile()
}

fun WriteToFile(str:String){
    try {
        var fo = FileWriter("TEST.TXT",true)
        fo.write(str)
        fo.close()
    }
    catch (ex:Exception){
        println(ex.message)
    }
}

fun readFromFile(){
    try {
        var fin = FileReader("TEST.TXT")
        var c:Int?
        do {
            c = fin.read()
            print("${c.toChar()}")
        }while (c != -1)
    }
    catch (ex:Exception){
        println(ex.message)
    }
}