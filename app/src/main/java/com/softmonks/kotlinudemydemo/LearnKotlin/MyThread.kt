package com.softmonks.kotlinudemydemo.LearnKotlin

import java.lang.Exception

fun main(args: Array<String>) {
    var thread1 = thread("thread1")
    thread1.start()
    var thread2 = thread("thread2")
    thread2.start()
    thread2.join()  //wait for all threads to finish executing
    println("Thread is running")
}

class thread():Thread(){
    var nameThread:String = ""

    constructor(nameThread: String):this(){
        this.nameThread = nameThread
    }

    override fun run() {
        var count = 0
        while (count < 10){
            println("$nameThread Count: $count")
            count++
            try {
                sleep(1000)
            }
            catch (ex:Exception){
                println(ex.message)
            }
        }
    }
}