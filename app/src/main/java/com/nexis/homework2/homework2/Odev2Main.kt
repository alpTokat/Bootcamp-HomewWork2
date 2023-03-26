package com.nexis.homework2.homework2

fun main() {
    // Soru1
    val odev2 = Odev2()
    val convertedValue= odev2.question1(45)
    println("Convert degree to Fahrenheit  : $convertedValue")
    println("------------------------------------------")
    // Soru2
    val edgeLength = odev2.question2(3,5)
    println("The rectangle circumference :  $edgeLength")
    println("------------------------------------------")
    // Soru3
    val factorialValue = odev2.question3(5)
    println("Calculated Factorial : $factorialValue")
    println("------------------------------------------")
    // Soru4
    val aCount = odev2.question4("Arjantin")
    println("a Count in Word : $aCount")
    println("------------------------------------------")
    // Soru5
    val interiorAngles = odev2.question5(4)
    println("interior angles : $interiorAngles")
    println("------------------------------------------")
    // Soru6
    val salary = odev2.question6(30)
    println("Salary : $salary")
    println("------------------------------------------")
    // Soru7
    val fee = odev2.question7(100)
    println("Fee : $fee")
}