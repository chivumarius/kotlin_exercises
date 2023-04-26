/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            ________________________________________
                 ○  KOTLIN  EXERCISES  ○
                ________________________________
        - "Ex 3: Swap Two Variables Value between Them" -
            ________________________________________

  ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.kotlinexercises

import java.util.*

fun main(){
    // ♦ Variable Declaration:
    var temp: Int
    println("Please enter the 2 numbers")    // ♦ Displaying a "Message" for "User"

    // ♦ Getting the "Input" from the "User"
    //      → by Using "Scanner()" Object:
    var scanner1 = Scanner(System.`in`)  // ♦ Import Package:  Alt + Shift + Enter

    // ♦ Getting the "First & Second Integer Input" of "scanner1":
    var a = scanner1.nextInt()
     var b = scanner1.nextInt()

     // ♦ Changing (Swapping) Variable Values
    //      → by "Storing Variable Values":
    temp = a
    a = b
    b = temp

    // ♦ Displaying the "Result" for the "User":
    println("The value of a: $a and b: $b")
}