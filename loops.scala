/* 
    Loops 
    - Do While Loops: For unknown interval of times, executes once -> runs until the condition is true

        do {
            statements
        } while (condition)

    - While Loops: For unknown interval of times, runs until the condition is true

        while (condition) {
            statements
        }

    - For Loops: For fixed interval of time
    - For each Loop: For working with collections (List, Tuple, Map, Array, Set, Factors)
*/

// do while Loops
a = 15

do { 
    println("Starting the loop") 
    println(a)
    a += 1
} while (a <= 10)

// while loops
var a = 1 

while (a <= 10) { 
    println("Loop started")
    println(a)
    a += 1
}

// loop for printing armstrong number
import scala.math as Math

def isArmstrong(input_number: Int): Boolean = {
    val digits = input_number.toString
    val numberOfDigits = digits.length
    var sum = digits.map(digit => Math.pow(digits.toInt, numberOfDigits)).sum
    return sum == input_number
}

def armstrong(input_number: Int): String = {
    var n = input_number
    var sum = 0

    while (n != 0) {
        var r = n%10
        sum = sum + (r*r*r)
        n = n/10
    }

    if (sum == input_number) {
        return "Armstrong"
    } else {
        return "Not Armstrong"
    }
}

def findLength(number: Int): Int = {
    var count = number.toString
    return count.length
}