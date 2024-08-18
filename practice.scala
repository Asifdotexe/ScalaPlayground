// WRITE A SCALA PRHRAM TO PRINT THE FIBONACCI SERIES UP TO 100.
----------------------------------------------------------------
// ALGORITHM
    // 1. Initialize the first two number of the series as a = 0 and b = 1
    // 2. Print 'a'
    // 3. Calculate the next number as the sum of 'a' and 'b'
    // 4. Update 'a' as 'b' and 'b' as the next number
    // 5. Repeat the step 2-4 while 'a' is less than or equal to 100.

var target: Int = 100
var a: Int = 0
var b: Int = 1

while (a < target) {
    print(a)
    val nextNumber = a + b
    a = b 
    b = nextNumber
}

// WRITE A SCALA PROGRAM TO FIND WHETHER A STRING IS PALINDROME OR NOT 
----------------------------------------------------------------
// ALGORITHM 
    // 1. Define a fucntion that takes a string as input.
    // 2. Reverse the string 
    // 3. Check if the reverse string matches the original string 
    // 4. Return true if they match otherwise return false

def isPalindrome(text: String): Boolean = {
    val reversedText = text.reverse
    reversedText == text
}

// WRITE A SCALA PROGRAM TO DISPLAY FIRST 10 NATURAL NUMBERS AND THEIR SUM
----------------------------------------------------------------
// ALGORITHM
    // 1. Intialize the sum as 0
    // 2. Loop through number 1 to 10
    // 3. Add each number to the sum
    // 4. Print the number and continue the Loop
    // 5. After the loop print the total sum.

var naturalSum = 0
for (i <- 0 until 11) {
    naturalSum += i
    println(i)
}
println(naturalSum)

// WRITE A SCALA PROGRAM TO FIND THE ENTERED YEAR IS A LEAP YEAR OR NOT
----------------------------------------------------------------
// ALGORITHM
    // 1. Take input from the user
    // 2. Check if the input year is divisible by 4 and not divisible by 100 
    // 3. or check if the input year is divisble by 400

def isLeapYear(year: Int): Boolean = {
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
        return true
    } else {
        return false
    }
}