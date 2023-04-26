/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            ________________________________________
                 ○  KOTLIN  EXERCISES  ○
                ________________________________
            - "Ex 8: TAKING THREE NUMBERS FROM THE USER 
            AND PRINTING THE GREATEST NUMBER AMONG THEM" -
            ________________________________________

  ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.kotlinexercises

import java.util.*

fun main(){
    // ♦ Getting the "Input Data" from the "User"
    //      → by Using "Scanner()" Object:
    var scanner1 = Scanner(System.`in`)     // ♦ Import Package:  Alt + Shift + Enter

    // ♦1♦ Displaying "First Message" for "User":
    println("Please enter the 1st number")
    // ♦ Storing "First Integer Input" of "scanner1":
    var x = scanner1.nextInt()

    // ♦2♦ Displaying "Second Message" for "User":
    println("Please enter the 2nd number")
    // ♦ Storing "Second Integer Input" of "scanner1":
    var y = scanner1.nextInt()

    // ♦3♦ Displaying "Third Message" for "User":
    println("Please enter the 3rd number")
    // ♦ Storing "Third Integer Input" of "scanner1":
    var z = scanner1.nextInt()


    // ♦ Checking: If "x" is the "Greatest Number":
    if(x > y) {
        if(x > z) {
            print("$x is the greatest number")
        }
    }

    // ♦ Checking: If "y" is the "Greatest Number":
    if(y > x) {
        if(y > z) {
            print("$y is the greatest number")
        }
    }

    // ♦ Checking: If "z" is the "Greatest Number":
    if(z > x) {
        if(z > y) {
            print("$z is the greatest number")
        }
    }
}
