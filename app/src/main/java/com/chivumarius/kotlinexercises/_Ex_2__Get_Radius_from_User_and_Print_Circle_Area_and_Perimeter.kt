/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            ________________________________________
                 ○  KOTLIN  EXERCISES  ○
                ________________________________
            - "Ex 2: Get Radius from User 
                and Print Circle Area and Perimeter" -
            ________________________________________

  ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.kotlinexercises

import java.util.*

fun main(){
    // ♦ Getting the "Input" from the "User"
    //      → by Using "Scanner()" Object:
    var scanner1 = Scanner(System.`in`) // ♦ Import Package:  Alt + Shift + Enter
    println("Please enter the radius")    // ♦ Displaying a "Message" for "User"

    // ♦ Getting the "Radius Integer Input" of "scanner1":
    var radius = scanner1.nextInt()

    // ♦ "Calculating" → the "Perimeter" of the "Circle":
    var perimeter:  Double = 2 * 3.1415 * radius

    // ♦ "Calculating" → the "Area" of the "Circle":
    var area:  Double = radius * radius * 3.1415

    // ♦ Displaying the "Result" for the "User":
    println("The area: $area, the perimeter: $perimeter")
}