package com.softmonks.kotlinudemydemo.LearnKotlin

//interface
//having a structure for multiple use

interface CreditCard{
    val cardNumber:String

    fun score(age:Int)
}

class MasterCard(override val cardNumber: String) : CreditCard {
    override fun score(age: Int) {
        if (age > 50){
            println("Negative")
        }
        else{
            println("Positive")
        }
    }

}


class VisaCard(override val cardNumber: String) : CreditCard {
    override fun score(age: Int) {
        if (age > 60){
            println("Negative")
        }
        else{
            println("Positive")
        }
    }

}

class PayPal(client: CreditCard):
    CreditCard by client{
    //depending on what is passed it will inherit,
    //eg. if masterclass is passed anything is master class will be inherited
    //DELEGATION
    fun print(){
        println(this.cardNumber)
    }
}

fun main() {
    val visa = VisaCard("1545454542")
    visa.score(60)

    val masterCard = MasterCard("45565654")
    masterCard.score(60)

    val payPal = PayPal(masterCard)
    println("Card number for Paypal : ${payPal.cardNumber}")
    payPal.print()
}