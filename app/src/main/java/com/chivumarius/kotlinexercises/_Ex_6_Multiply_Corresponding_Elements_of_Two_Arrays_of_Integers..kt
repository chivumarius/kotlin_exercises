/* ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
            ________________________________________
                 ○  KOTLIN  EXERCISES  ○
                ________________________________
          - "Ex 6: MULTIPLY THE CORESPONDING ELEMENTS 
                 OF TWO ARRAYS OF INTEGERS" -
            ________________________________________
    

  ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.kotlinexercises

fun main(){
    // ♦ Arrays:
    var array1 = arrayOf(1, 3, -5, 4)
    var array2 = arrayOf(1, 4, -5, -2)

    var result = " "

    // ♦ "Multiplication" of the "First Element" of the "First Array"
    //  → to the "First Element" of the "Second Array":
    for(i in array1.withIndex()){
        result += array1[i.index] * array2[i.index]
        result += " "
    }

    // ♦ Displaying the "Result" for the "User":
    print("Result: $result")
}
