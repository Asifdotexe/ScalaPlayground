var newList = List(1,2,3,4,5,6) // output: var newList: List[Int] = List(1, 2, 3, 4, 5, 6)
var anotherList = List(7,8,8,9,10) // output: var anotherList: List[Int] = List(7, 8, 8, 9, 10)

print(newList(1))

for (i <- 0 until newList.size){
    println(newList(i))
}

// one line defination
for (i <- 0 until newList.size) println(newList(i))

for (i <- 0 until newList.size) {
    if (newList(i) % 2 == 0){
        println({newList(i)})
    }
}

def evenNumber(number: Int): Unit = {
    var newNumber = number
    if (newNumber % 2 == 0) {
        println(s"$newNumber is divisible by 2")
    }
}

newList.foreach(evenNumber)
/* output:
2 is divisible by 2
4 is divisible by 2
6 is divisible by 2 */

// appended, prepended and concat
var combinedList = newList ++ anotherList // output: var combinedList: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10)

var combinedList2 = newList.concat(anotherList) // output: var combinedList2: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10)

var listAppended = newList.appended(11) // output: var listAppended: List[Int] = List(1, 2, 3, 4, 5, 6, 11)

var listPrepended = newList.prepended(0) // output: var listPrepended: List[Int] = List(0, 1, 2, 3, 4, 5, 6)