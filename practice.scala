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

