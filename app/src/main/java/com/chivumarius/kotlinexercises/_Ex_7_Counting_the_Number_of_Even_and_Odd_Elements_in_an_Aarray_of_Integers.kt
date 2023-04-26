/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            ________________________________________
                 ○  KOTLIN  EXERCISES  ○
                ________________________________
               - "Ex 7: COUNTING THE NUMBER 
                  OF EVEN & ODD ELEMENTS 
                 IN AN ARRAY OF INTEGERS" -
            ________________________________________

  ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.kotlinexercises

fun main(){
    // ♦ "Array":
    var numbers = arrayOf(5, 3, 2, 6, 8, 1)

    // ♦ "Counters":
    var even_counter = 0
    var odd_counter = 0

    for(i in numbers){
        // ♦ Checking: If There is an "Even Number":
        if(i % 2 == 0){
            even_counter++
        } else {
            // ♦ Otherwise There is an "Odd Number":
            odd_counter++
        }
    }

    // ♦ Displaying the "Result" for the "User":
    print("Number of Even: $even_counter and number of Odd: $odd_counter")
}
