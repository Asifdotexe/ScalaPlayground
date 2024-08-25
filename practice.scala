// 1. WRITE A SCALA PRHRAM TO PRINT THE FIBONACCI SERIES UP TO 100.
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

while (a < 100) {
    println(a)
    val nextNumber = a + b
    a = b 
    b = nextNumber
}

// 2. WRITE A SCALA PROGRAM TO FIND WHETHER A STRING IS PALINDROME OR NOT 
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

// 3. WRITE A SCALA PROGRAM TO DISPLAY FIRST 10 NATURAL NUMBERS AND THEIR SUM
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

// 4. WRITE A SCALA PROGRAM TO FIND THE ENTERED YEAR IS A LEAP YEAR OR NOT
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

// 5. WRITE A SCALA PROGRAM TO FIND WHETHER A GIVEN NUMBER IS PRIME OR NOT.
----------------------------------------------------------------
// ALGORITHM
    // 1. Define the function tha takes a number as input
    // 2. Calculate the square root of the number.
    // 3. Loop through the number starting from 2 up to the square root.
    // 4. If any number divides the input number, it is not a prime number.
    // 5. if no divisor are found, it is a prime number.

import scala.math.sqrt

def find_prime_number(num: Int) = {
    if (num <= 1) {
        println(s"$num is not a prime number")
    } else {
        var isPrime = true
        val limit = sqrt(num.toInt).toInt
        for (i <- 2 to limit if isPrime) {
            if (num % i == 0) {
                isPrime = false
            }
        }
        if (isPrime) println(s"$num is a prime number") else println(s"$num is not a prime number")
    }
}

// 6. WRITE A SCALA PROGRAM TO REVERSE A GIVEN NUMBER.
----------------------------------------------------------------
// ALGORITHM
    // 1. WHY DO WE NEED TO WRITE AN ALGORITHM FOR THIS :P

def reverseNum(number: Int): Int = {
    number.toString.reverse.toInt
}

// 7. WRITE A SCAL A PROGRAM TO CHECK WHETHER TWO POSITVE INTEGRERS HAVE THE SAME LAST DIGIT
----------------------------------------------------------------
// ALGORITHM
    // 1. Define a function that takes two numbers as input.
    // 2. Get the last digits of both by using % operator.
    // 3. Compare the last digits.
    // 4. If they are equal, return true. Otherwise, return false.

def sameLastDigit(number1: Int, number2: Int): Boolean = {
    number1 % 10 == number2 % 10
}

// 8. WRITE A SCALA PROGRAM TO CALCULATE THE SUM OF DIGITS IN A GIVEN NUMBER.
----------------------------------------------------------------
// ALGORITHM
    // 1. Define a function that takes a number as input.
    // 2. Convert the number into a string
    // 3. Map each character to it's integer value.
    // 4. Sum all the integer values.
    // 5. Return the sum.

def sumOfDigits(number: Int): Int = {
    number.toString.map(_.asDigit).sum
}

// 9. WRITE A SCALA PROGRAM TO CHECK IF A NUMBER IS A PALINDROME
----------------------------------------------------------------
// ALGORITHM
    // 1. Define a function to take a number as an input
    // 2. Conver the number to a string
    // 3. Reverse the string
    // 4. Compare the original string with the reversed string
    // 5. If they are equal, return true. Otherwise, return false.

def isNumPalindrome(number: Int): Boolean = {
    number.toString == number.toString.reverse
}

// 10. WRITE A SCALA PROGRAM TO COUNT THE NUMBER OF VOWELS IN A GIVEN STRING USING IF-ELSE STATEMENT AND PATTERN MATCHING.
----------------------------------------------------------------
// ALGORITHM
    // 1. Define a function that takes a string as an input
    // 2. Initialize a counter for vowels.
    // 3. Loop through each character in the string of the string
    // 4. Use if else to check if the character is a vowel
    // 5. if it is, increment the counter
    // 6. Return the counter.

def countVowels(text: String): Int = {
    var vowelCount = 0
    for (char <- text) {
        char.toLower match {
            case 'a'|'e'|'i'|'o'|'u' => vowelCount += 1
            case _ => 
        }
    }
    vowelCount
}

// 11. WRITE A SCALA PROGRAM TO CHECK IF EITHER OF TWO GIVEN INTEGERS IS IN THE RANGE OF 100 - 200 INCLUSIVE
------------------------------------------------------------------------------
// ALGORITHM
    // 1. Define a function that takes two numbers as input.
    // 2. Check if either number falls within the range 100 to 200
    // 3. Return true if either is within the range, otherwise return false

def inRange(number1: Int, number2: Int): Boolean = {
    (number1 >= 100 && number1 <= 200) || (number2 >= 100 && number2 <= 200)
}

// 12. WRITE A SCALA PROGRAM TO CHECK IF A NUMBER IS DIVISIBLE BY 3 OR 5
----------------------------------------------------------------
// ALGORITHM
    // 1. NOPE... TO EASY FOR ADDING AN ALGORITHM

def div_by_3_or_5(number: Int): Boolean = {
    number % 3 == 0 || number % 5 == 0
}

// 13. Write a Scala Program to Check  if Two Given Integers Meet Specific Conditions
// Check if either number is 50, or if their sum equals 50.
--------------------------------------------------------------------
def check_fifty(a: Int, b: Int): Boolean = {
    a == 50 || b == 50 || (a + b == 50)
}

// 14. WRITE A SCALA PROGRAM TO CREATE A NEW STRING WHERE 'HI' IS ADDED TO THE FRONT OF A GIVEN STRING. 
// IF THE STRING ALREADY BEGINS WITH 'HI', RETURN THE STRING UNCHANGED.
----------------------------------------------------------------
// ALGORITHM
    // 1. Define a function that takes string as input.
    // 2. Convert the string to lowercase for case-insensitive check.
    // 3. Check if the lowercase string starts with 'hi'
    // 4. If it does, return the original string.
    // 5. If it does not, return the lowercase string concatenated with 'hi'.

def add_hi(text: String): String = {        
    if (text.toLowerCase.startsWith("hi")) {
        text
    } else {
        "hi" + text
    }
}

// 15. WRITE A SCALA PROGRAM TO CREATE A NEW STRING WHICH IS 3 COPIES OF THE 2 FRONT CHARACTERS OF A GIVEN STRING.
// IF THE GIVE STRING IS LESS THAN 2 RETURN THE ORIGINAL STRING
----------------------------------------------------------------
// ALGORITHM
		// 1. Define a function that takes a string as input.
		// 2. Check if the length of the string is less than 2.
		// 3. If it is, then return the original string.
		// 4. Otherwise, extract the first 2 characters.
		// 5. Concatenate these characteres three times to create new string
		// 6. Return the new string

def create_new_string(text: String): String = {
		if (text.length <= 2) {
				text
		} else {
				val front = text.substring(0,2)
				front*3
		}
}

// 16. WRITE A SCALA PROGRAM TO CHECK WHETHER A GIVEN NUMBER IS A MULTIPLE OF 3 OR A MULTIPLE OF 7
// ALGORITHM
------------------------------------------------------------------------------------------------
    // 1. Define a function that takes an integer as input.
    // 2. Check if the number is divisible by 3 or 7 using the modulus operator (%).
    // 3. If it is divisible by either 3 or 7, return true. Otherwise, return false.

def multiple_of_3_or_7(number: Int): Boolean = {
    number % 3 == 0 || number % 7 == 0
}

// 17. WRITE A SCALA PROGRAM TO CREATE A NEW STRING TAKING THE FIRST 3 CHAR OF A GIVEN STRING AND RETURN THE 
// STRING WITH THE 3 CHAR ADDED AT BOTH FRONT, IF THE GIVEN STRING LENGTH IS LESS THAN 3
// USE WHATEVER CHARACTERS ARE THERE
------------------------------------------------------------------------------------------------
// ALGORITHM
    // 1. Define a function that takes a string as input.
    // 2. Check if the length of the string is less than 3.
    // 3. If it is, return the original string.
    // 4. Otherwise, extract the first 3 characters.
    // 5. Concatenate these characters at the front and back.
    // 6. Return the new string.

def addPrefixSuffix(text: String): String = {
    val prefix = if (text.length < 3) text else text.substring(0, 3)
    prefix + text + prefix
}

// 18. WRITE A SCALA PROGRAM TO CHECK WHETHER THREE GIVEN INTEGER VALUES ARE IN THE RANGE OF 20 TO 50 INCLUSIVE
// RETURN "VALID" IF 1 OR MORE OF THEM ARE IN THE SAID RANGE OTHERWISE "INVALID"
------------------------------------------------------------------------------------------------
// ALGORITHM
    // 1. Define a function that takes three integers as input.
    // 2. Check if any of the numbers falls within the range 20 to 50.
    // 3. If any number is within the range, return "VALID". Otherwise, return "INVALID".

def check_range_define_validity(number1: Int, number2: Int, number3: Int): Unit = {
    if ((number1 >= 20 && number1 <= 50) || (number2 >= 20 && number2 <= 50) || (number3 >= 20 && number3 <= 50)) {
        println("Valid")
    } else {
        println("Invalid")
    }
}

// 19. WRITE A SCALA PROGRAM TO CHECK WHETHER A GIVEN CHARACTER PRESENTS IN THE STRING BETWEEN 2 TO 4 times
------------------------------------------------------------------------------------------------
// ALGORITHM
    // 1. Define a function that takes a string and a character as input.
    // 2. Check if the length of the string is between 2 and 4.
    // 3. If it is, iterate through the string and count the occurrences of the given character.
    // 4. If the count is between 2 and 4, return true. Otherwise, return false.

def characterOccuerence(character: Char, text: String): Boolean = {
    val charCount = text.count(_ == character)
    charCount >= 2 && charCount <= 4
}

// 20 WRITE A SCALA PROGRAM TO CONVERT THE LAST 4 CHARACTER OF A GIVEN STRING IN UPPERCASE, IF THE LENGTH OF THE STRING HAS LESS THAN 4 THEN UPPERCASE ALL THE CHARACTERS

// ALGORITHM
    // 1. Define a function that takes a string as input.
    // 2. Check if the length of the string is less than 4.
    // 3. If it is, convert all characters in the string to uppercase.

def convertLastFourToUppercase(text: String): String = {
    if (text.length < 4) {
        text.toUpperCase
    } else {
        text.substring(0, text.length - 4) + text.substring(text.length - 4, text.length).toUpperCase
    }
}

// 21. WRITE A SCALA PROGRAM TO CREATE A MAP AND FIND THE SUM OF ALL VALUES IN THE MAP

// ALGORITHM
    // 1. Create a map with key-value pairs where keys are unique identifiers, and values are integers.
    // 2. Use the `.values` method to extract all the values from the map.
    // 3. Use the `.sum` method to calculate the sum of all the values in the map.
    // 4. Return or print the sum.

def sumOfValues(map: Map[String, Int]): Int = {
    map.values.sum
}

// 22. Write a SCALA program to create a map and find the difference between two maps

def keyDifference(map1: Map[String, Int], map2: Map[String, Int]): Set[String] = {
    map1.keySet -- map2.keySet
}