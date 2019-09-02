package com.train
import  java.util.*

fun main() {
    val scanner =Scanner(System.`in`)
    println("Please enter number of tickets:")
    var number1 = scanner.next()
    println("How many round-trip tickets:")
    var number2 = scanner.nextInt()

    var stu = Ticket1(number1,number2)

    println("Total tickets:"+number1)
    println("Round-trip:"+number2)
    println("Total:"+stu.print())







}
class Ticket1(var number1: String, var number2:Int){
    fun print(){
        println((number1.toInt()-number2)*1000+((number2*2000)*0.9).toInt())
    }
}


