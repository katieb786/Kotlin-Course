package com.bond.objectorientedprogramming

fun main(args: Array<String>) {

    //Creating and object from class
/*  var myCar = Cars()
    myCar.name = "Tesla"
    myCar.model = 2022

    var myCar2 = Cars()
    myCar2.name = "Mercedes"
    myCar2.model = 2020

    println("My car's name is ${myCar.name} and its model is ${myCar.model}.")
    println("My car's name is ${myCar2.name} and its model is ${myCar2.model}.")*/

    //Primary Constructor
    //var myNewCar = MyCars("Tesla", 2022)
    //println("My car's name is ${myNewCar.name} and its model is ${myNewCar.model}.")

    //Secondary Constructor
    var mySecondCar = MySecondCars("Tesla", 2022)

    mySecondCar.name = "Opel"
    mySecondCar.model = 2010 //set

    println("My car's name is ${mySecondCar.name} and its model is ${mySecondCar.model}.") //get

}