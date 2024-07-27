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
