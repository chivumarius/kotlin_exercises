/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            ________________________________________
                 ○  KOTLIN  EXERCISES  ○
                ________________________________
        - "Ex 4: COUNTING LETTERS, SPACES, NUMBERS & OTHERS 
                CHARACTERS FROM AN INPUT STRING" -
            ________________________________________

  ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.kotlinexercises

import java.util.*

fun main(){
    // ♦ Getting the "Input" from the "User"
    //      → by Using "Scanner()" Object:
    var scanner1 = Scanner(System.`in`)     // ♦ Import Package:  Alt + Shift + Enter

    // ♦ "Storing" the "Text" from the "User":
    var text = scanner1.nextLine()

    // ♦  Calling the "count()" Method:
    count(text)
}

// ♦  The "count()" Method
//      → which will Return the "Number of Letters",
//      → "Spaces" of the User's "Input String":
fun count(text: String){
    // ♦ "STRING EXAMINATION" ♦
    // ♦ Converting a "String" into a "Character Array":
    var character = text.toCharArray()

    // ♦  Counters Variables:
    var letter = 0
    var space = 0
    var number = 0
    var others = 0

    // ♦ The "for()" Loop
    //      → to Loop through All the "Elements", "Digits", "Letters"
    //      → Inside the "String":
    for (ch in character.withIndex()){
        // ♦ "Checking": If it is a "Letter":
        if(Character.isLetter(ch.value)){
            letter++    // ♦ "Increasing" the "Number" of "Letters"
        } else if(Character.isDigit(ch.value)){
            // ♦ "Checking": If it is a "Letter":
            number++    // ♦ "Increasing" the "Number" of "Digits"
        } else if(Character.isSpaceChar(ch.value)){
            // ♦ "Checking": If it is a "Space Character":
            space++    // ♦ "Increasing" the "Number" of "Space"
        } else {
            // ♦ "Checking": If it is a "Others Character":
            others++    // ♦ "Increasing" the "Number" of "Othesr"
        }
    }

    // ♦ Displaying the "Result" for the "User":
    println("Letters: $letter \n Spaces: $space \n Numbers: $number \n Others: $others")
}