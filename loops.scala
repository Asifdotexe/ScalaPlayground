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

// For loop

for (i <- 1 to 10) {
    println(i)
}

for (i <- 1 until 10) {
    println(i)
}

var nm L: Seq[Int] = List(1,2,3,4,5)

var nm L: List[Int] = List(1,2,3,4,5)

for (i <- nm) {
     |  print(i)
     |  print("-----")
     | }


for (i <- 1 to 50) {
    if (i % 3 == 0 || i % 5 == 0) {
        println(s"Divisble by 3 or 5: $i")
    }
}

for (i <- 1 to 50) {
    if (i % 3 == 0) {
        println(s"Divisble by 3: $i")
    }
    else if (i % 5 == 0) {
        println(s"Divisble by 5: $i")
    }
}

for (i <- 2 to 50 by 2) {
    println(i)
} 

for (i <- 1 to 10) {
    println(s"2 X $i = $2*i")}

def table(number: Int, till: Int): Unit = {
    for (i <- 1 to till) {
        println(s"${number} X $i = ${number * i}")
}

def table(number: Int, till: Int): Unit = {
    var count = 1
    while (count-1 != till) {
        println(s"${number} X $count = ${number * count}")
        count += 1
}