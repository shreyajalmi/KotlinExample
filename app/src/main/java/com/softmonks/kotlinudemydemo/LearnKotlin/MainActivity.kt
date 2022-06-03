package com.softmonks.kotlinudemydemo.LearnKotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import com.softmonks.kotlinudemydemo.R

import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val activityName = "Main Activity";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        //main()
        //mathOperations()
        //logicConditions()
        //forLoopFunction()
        //whileDoWhileFunction()
        //nestedLoops()
        //returnAndJumps()
        //arrayDemo()
        //stringFunctionality()
        //arrayListFunction()
        //linkedListFunction()
        //hashMapFunction()
        //mutableImmutableFunction()
        /*var returnSum = addNumbers(3.0,4.0)
        Log.i(activityName,"Return Sum $returnSum")

        returnSum = addNumbers()
        Log.i(activityName,"Return Sum $returnSum")

        returnSum = addNumbers(y=20.0)
        Log.i(activityName,"Return Sum $returnSum")

        Log.i(activityName,"Back to main function")*/

        //displayInfo( names = *arrayOf("Jena","Laya","Dona"))

        var sumValue = lamdaFunction(26,14)
        Log.i(activityName,"Sum $sumValue")

        val listOfNumbers = listOf(10,15,20,25,30)
        listOfNumbers.forEach { number ->
            Log.i(activityName,"Numbers : $number")
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    //Learning Kotlin
    fun main(){
        val constantValue = "Hello World"
        Log.i(activityName, constantValue)

        var variableValue:String
        variableValue = "Hi"
        variableValue = "$variableValue Shreya"
        Log.i(activityName,variableValue)

        var departmentName:String?      //variable can be null
        departmentName = null
        Log.i(activityName,"Department Name : $departmentName")
        departmentName = "Android"
        Log.i(activityName,"Department Name : ${departmentName!! }")        //variable cannot be null !!

        var enterName = readLine().toString()       //take name from user
        Log.i(activityName,"Name is "+enterName)


    }

    fun mathOperations(){
        var yearInDevice = Calendar.getInstance().get(Calendar.YEAR)
        Log.i(activityName,"Current year $yearInDevice")
    }

    fun logicConditions(){
        //logical conditions

        var number:Int
        number = 10

        if (number in 5..9){
            Log.i(activityName,"Number is $number")
        }

        val userInput = 4

        when(userInput){
            1 -> {
                Log.i(activityName,"hi 1")
            }
            2 -> {
                Log.i(activityName,"hi 2")
            }
            3 -> {
                Log.i(activityName,"hi 3")
            }
            4 -> {
                Log.i(activityName,"hi 4")
            }
            else -> {
                Log.i(activityName, "You didn't click 1-4")
            }
        }

        val valueData = 20
        when{
            valueData>=90 -> Log.i(activityName,"90")
            valueData in 0..10 -> Log.i(activityName,"0-10")
            valueData in 10..20 -> Log.i(activityName,"10-20")
            else -> Log.i(activityName,"Fail")
        }

        val isMarried = false
        val gpa = 6.0
        val isQualified = if (isMarried==false && gpa<10) 1 else 0
        Log.i(activityName,"Qualification is $isQualified")
        val isGood = when (gpa){ 6.0 -> true else -> false}
        Log.i(activityName,"Good is $isGood")
    }

    fun forLoopFunction(){
        //loops

        val n = 10
        for (i in 0..n step 2){
            Log.i(activityName,"Value : $i")
        }

        for(i in 10 downTo 0 step 2){
            Log.i(activityName,"Value : $i")
        }
    }

    fun whileDoWhileFunction(){
        var i =0
        while (i<=10){
            Log.i(activityName,"Counter $i")
            i++
        }

        i = 0
        do{
            Log.i(activityName,"Counter Do while $i")
            i++
        }
        while (i<=10)
    }

    fun nestedLoops(){
        var var1 = "Dog"
        var var2 = "Dog2"
        var var3 = "Cat"

    }

    fun returnAndJumps(){
        Log.i(activityName,"Continue Example")
        for(number in 0..5){
            if(number == 3)
                continue
            Log.i(activityName,"Number is $number")
        }
        /*Output : 0 1 2 4 5*/

        Log.i(activityName,"Break Example")
        for(number in 0..5){
            if(number == 2)
                break
            Log.i(activityName,"Number is $number")
        }
        /*Output : 0 1*/


        Log.i(activityName,"Break with label Example")
        firstLoop@ for(number in 0..5){
            Log.i(activityName,"Number is $number")
            for (innerLoop in 0..3) {
                Log.i(activityName,"innerLoop is $innerLoop")
                if (number == 2)
                    break@firstLoop
            }
        }
        /*Gives lable for the loop and breaks it using that label*/
        /*Output :
        * Number is 0
        * innerLoop is 0
        * innerLoop is 1
        * innerLoop is 2*/
        /**/


        Log.i(activityName,"Return Example")
        firstLoop@ for(number in 0..5){
            Log.i(activityName,"Number is $number")
            for (innerLoop in 0..3) {
                Log.i(activityName,"innerLoop is $innerLoop")
                if (number == 2)
                    return
            }
        }
        /*OUTPUT:
        *Return Example
        *Number is 0
        *innerLoop is 0
        *innerLoop is 1
        *innerLoop is 2
        *innerLoop is 3
        *Number is 1
        *innerLoop is 0
        *innerLoop is 1
        *innerLoop is 2
        *innerLoop is 3
        *Number is 2
        *innerLoop is 0
        Back to main function*/
    }

    fun arrayDemo(){
        var listOfPets:Array<String> = Array(3){""}
        val n = 10
        for(i in 0 until n){
        }

        for(i in 0 until n){
            print("Pet $i : {$listOfPets[i]}")
        }
    }

    fun stringFunctionality(){
        val name = "Shreya"
        val message = "How are you"
        val allMessage = "$name , $message"
        val tokens = message.trim().split(" ")
        for (token in tokens){
            if (!token.contains("you") && !token.contains("are"))
                Log.i(activityName,"Token : $token")
        }
    }

    fun arrayListFunction(){
        var listOfPets = arrayListOf<String>()
        listOfPets.add("Dog")
        listOfPets.add("Fish")
        listOfPets.add("Rabbit")
        listOfPets.add("Cat")

        for (pet in listOfPets){
            Log.i(activityName,"Pet is $pet")
        }

        if (listOfPets.contains("Cat")){
            Log.i(activityName,"Meow")
        }
    }

    fun linkedListFunction(){
        var listOfPets = LinkedList<String>()
        listOfPets.add("Dog")
        listOfPets.add("Fish")
        listOfPets.add("Rabbit")
        listOfPets.add("Cat")

        for (pet in listOfPets){
            Log.i(activityName,"Pet is $pet")
        }

        if (listOfPets.contains("Cat")){
            Log.i(activityName,"Meow")
        }
    }

    fun hashMapFunction(){
        var listOfUsers = hashMapOf<String,LinkedList<String>>()
        for (userId in 1..2){
            val name = "name$userId"
            val listOfPets = LinkedList<String>()
            listOfPets.add("Dog")
            listOfPets.add("Fish")
            listOfPets.add("Rabbit")
            listOfPets.add("Cat")
            listOfUsers["$name"] = listOfPets

        }

        for(key in listOfUsers.keys){
            Log.i(activityName,"Name : $key")
            val listOfPets = listOfUsers[key]!!
            for (petName in listOfPets){
                Log.i(activityName,"Pet name : $petName")
            }
        }
    }

    fun mutableImmutableFunction(){
        //mutable: you can update and add
        //immutable: you can't update and add

        //im-mutable list
        val listImMutable = listOf("Jena","Lava")
        for (name in listImMutable){
            Log.i(activityName,"Name : $name")
        }

        //mutable list
        var listMutable = mutableListOf("Jena","Lava")
        listMutable.add(0,"Hussain")
        for (name in listMutable){
            Log.i(activityName,"Mutable Name : $name")
        }

        //im-mutable hashmaps
        val listOfUsersI = mapOf(1 to "hussain", 2 to "jena")

        var listOfUsersM = mutableMapOf(1 to "Hussain", 2 to "Jena")
    }

    fun addNumbers(x:Double=0.0,y:Double=0.0):Double{
        var temp = x+y
        return temp
    }

    fun displayInfo(vararg names: String){
        for(name in names){
            Log.i(activityName,name)
        }
    }

    val lamdaFunction = {number1:Int, number2:Int ->
        number1+number2
    }
}
