package com.bond.firstkotlinprogram

fun main(args: Array<String>) {

    var myCharRange = 'a'.rangeTo('j')
    var myChar = 'k' in myCharRange

    println("myCharRange has k : " + myChar)

}