package com.bond.firstkotlinprogram

fun main(args: Array<String>) {

    //immutable
    println("------immutableMapOf----------")
    var age = mapOf<String,Int>("David" to 20, "Ronaldo" to 25)

    println("Age of David : " + age["David"])
    println("Age of Ronaldo : " + age["Ronaldo"])

    //mutable
    println("--------mutableMapOf----------")
    var mutableAge = mutableMapOf<String,Int>("David" to 20, "Ronaldo" to 25)

    mutableAge.put("Buffon", 30)

    println("Age of David : " + age["David"])
    println("Age of Ronaldo : " + age["Ronaldo"])
    println("Age of Buffon : " + mutableAge["Buffon"])

}