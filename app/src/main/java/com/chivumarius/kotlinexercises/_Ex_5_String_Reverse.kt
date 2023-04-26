/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            ________________________________________
                 ○  KOTLIN  EXERCISES  ○
                ________________________________
                - "Ex 5: STRING REVERSE" -
            ________________________________________
    ♦ The "downTo" Keyword
        → for "Counting"
        → from the End
        → to the "Starting"
            •► Ex:  -1 downTo 0
  ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.kotlinexercises

import java.util.*

fun main(){
    // ♦ Getting the "Input" from the "User"
    //      → by Using "Scanner()" Object:
    var scanner1 = Scanner(System.`in`) // ♦ Import Package:  Alt + Shift + Enter
    println("Enter a String")    // ♦ Displaying a "Message" for "User"

    // ▬▬▬  "SOLUTION 1"  (OLD) ▬▬▬
    // ♦ "Storing" and "Converting" the "String" → to a "Character Array"
    // var letters = scanner1.nextLine().toCharArray()

    // print("Reversed String: \n")

    // ♦  Storing Variable:
    // var reverse = ""

    // ♦  The "for()" Loop → for "Reversing Array":
    //    for(i in letters.size -1 downTo 0){
    //        reverse += letters[i]
    //    }

    // ♦ Displaying the "Result" for the "User":
    // println(reverse)

    // ▬▬▬  "SOLUTION 2"  (KOTLIN) ▬▬▬
    // ♦ "Storing" the "Text" from the "User":
    var letters = scanner1.nextLine()

    // ♦  The ".reversed()" Method → for "Reversing" the "String":
    var reverse = letters.reversed()

    // ♦ Displaying the "Result" for the "User":
    println(reverse)
}
