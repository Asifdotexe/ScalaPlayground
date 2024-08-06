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

// appended, prepended and concat
var combinedList = newList ++ anotherList

var combinedList2 = newList.concat(anotherList)