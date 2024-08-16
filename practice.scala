// 1. Write a scala program to print fibonacci series up to 100

val n = 100
var a = 0
var b = 1

while (a <= n) {
    println(a)
    val next = a + b
    a = b
    b = next
}

// 2. Write a Scala program to find wheather a string is palindrome or Not

def isPalindrome(str: String): Boolean = {
    var input_str = str
    input_str == input_str.reverse
}

// 3. Write a scala program to display first 10 natural numbers and their sum

var sum = 0
for (i <- 1 until 11) {
    sum += i
    println(i)
}
print(sum)

// 4. Write a Scala program fidn that entered year is leap year or not

def find_leap_year(year: Int) = {
    var input_year = year
    if ((input_year % 4 == 0 && input_year % 100 != 0) || (input_year % 400 == 0)) {
        print(s"$input_year is a leap year")
    } else {
        print(s"$input_year is not a leap year")
    }
}

// 5. Write a scala program to check if number is a prime number

import scala.math.sqrt
def find_prime_number(input_number: Int) = {

    var num = input_number
    var numsqrt = sqrt(num.toInt)

    for (i <- 2 until numsqrt.toInt) {
        if (num % i == 0) {
            println("It is a not prime number")
        } else {
            println("It is a prime number")
        }
    }
}

// Write a scala program to reverse a given number