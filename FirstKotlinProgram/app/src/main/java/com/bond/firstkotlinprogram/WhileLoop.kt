package com.bond.firstkotlinprogram

import kotlin.random.Random

fun main(args: Array<String>) {
/*

    var i = 5
    while (i > 0)
    {
        println(i)
        i--
    }
*/

    //Factorial is the multiplication of all the numbers in that number
    //eg. 3 --> 3*2*1 factorial = 6
    //5 --> 5*4*3*2*1 factorial = 120

    /*var k = 1
    var fact = 1
    while (k < 6)
    {
        fact *= k // fact = fact * k
        println("$k! = $fact")
        k++
    }*/

    //infinite loop

    val number = Random.nextInt(0, 100)
    println("Please enter a number: ")

    while (true)
    {
        val userGuess:Int = readLine()!!.toInt()
        if (userGuess == number)
        {
            println("Congrats, you know the number in my mind!")
            break
        }
        else if (userGuess < number)
        {
            println("Increase your guess.")
        }
        else
        {
            println("Decrease your guess.")
        }
    }

}