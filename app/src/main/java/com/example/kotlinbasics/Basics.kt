package com.example.kotlinbasics

fun main() {

    // val cant be overWritten
    val myName = "Nader"

    println("Hello " + myName)

    // var van be overWritten
    var writeUrName = "Write ur name here!"
    println("Hello $writeUrName")

    writeUrName = "My name is Nader Mamdouh"
    println(writeUrName)

    writeUrName = "Nader Mamdouh"

    println("Hello $writeUrName")

    // String

    var myHelloWorld = "Hello World"
    var firstCharInStr = myHelloWorld[0]
    var lastCharInStr = myHelloWorld[myHelloWorld.length - 1]

    print("$myHelloWorld, String length is ${myHelloWorld.length}," +
            " First character is $firstCharInStr, Last character is ${myHelloWorld[myHelloWorld.length - 1]}, " +
            "For make it sure last char is $lastCharInStr")



}