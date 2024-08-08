// defining a Array
var ar = Array(1,2,3,4,5) // output: var ar: Array[Int] = Array(1, 2, 3, 4, 5)
var ar1 = ar.appended(80) // output: var ar1: Array[Int] = Array(1, 2, 3, 4, 5, 80)
var ar2 = ar.prepended(0) // output: var ar2: Array[Int] = Array(0, 1, 2, 3, 4, 5)

// concati
var ar3 = ar1 ++ ar2 // output: var ar3: Array[Int] = Array(1, 2, 3, 4, 5, 80, 0, 1, 2, 3, 4, 5)
var ar4 = ar1.concat(ar2) // output: var ar4: Array[Int] = Array(1, 2, 3, 4, 5, 80, 0, 1, 2, 3, 4, 5)

// operator append
ar = 5 +: ar
ar = ar :+ 67

// Droping values 
arr.drop(3)

// reverse Droping
arr.reverse.drop(1)

// Droping values from behind
ar = arr.dropRight(5)

// sort values
arr.sorted

//reverse
arr.reverse

// from second elements till end
arr.tail

// first elements
arr.head()

// takes first assigned values
arr.take(15)

// takes elements from right/ behind to assigned elements
arr.takeRight(3)

//append - fort make a variable and then append
arr.appendedAll(arr.take(10))

//conditional count
arr.count(_ % 2 == 0)
arr.count(_ == 1)

//make an array of 20 elements and random value you have to return count of numbers with are divisible by 3
// go through functionalities of array