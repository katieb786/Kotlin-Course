package com.bond.firstkotlinprogram

fun main(args: Array<String>) {
    var age = arrayOf(1,2,3)

    println("First element of Array = " + age[0])
    println("Second element of Array = " + age[1])
    println("Third element of Array = " + age[2])

    println("------------------------------------------------")

    var cars = arrayOf("Mercedes", "BMW", "Opel")
    println("------------------------------------------------")
    println("First element of Array = " + cars[0])
    println("First element of Array = " + cars[1])
    println("First element of Array = " + cars[2])

    cars.set(2, "Ford")
    println("------------------------------------------------")
    println("First element of Array = " + cars[0])
    println("First element of Array = " + cars[1])
    println("First element of Array = " + cars[2])

    println("Size of cars array = " + cars.size)

    var carsAndAge = arrayOf("Mercedes", 5, "Opel", 10)
    println("------------------------------------------------")
    println("First element of Array = " + carsAndAge[0])
    println("First element of Array = " + carsAndAge[1])
    println("First element of Array = " + carsAndAge[2])
    println("First element of Array = " + carsAndAge[3])

    carsAndAge.set(4,20)
}