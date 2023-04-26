/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            ________________________________________
                 ○  KOTLIN  EXERCISES  ○
                ________________________________
            - "Ex 1: Result of Dividing Two Numbers 
                with Remainder of Division" -
            ________________________________________


  ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.kotlinexercises

import java.util.Scanner

fun main(){
    // ♦ Getting the "Input" from the "User"
    //      → by Using "Scanner()" Object:
    var scanner1 = Scanner(System.`in`)     // ♦ Import Package:  Alt + Shift + Enter
    println("Please enter a number")    // ♦ Displaying a "Message" for "User"

    // ♦ Getting the "First Integer Input" of "scanner1":
    var x = scanner1.nextInt()
    println("Please enter a number")    // ♦ Displaying a "Message" for "User"

    // ♦ Getting the "Second Integer Input" of "scanner1":
    var y = scanner1.nextInt()

    // ♦ Getting "Division Result" ("/"):
    var divisionResult = x / y

    // ♦ Getting "Remainder" of "Division" ("%"):
    var reminder = x % y

    // ♦ Displaying the "Result" for the "User":
    println("The result = $divisionResult and the remainder is $reminder")
}