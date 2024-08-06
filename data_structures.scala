var newList = List(1,2,3,4,5,6) // output: var newList: List[Int] = List(1, 2, 3, 4, 5, 6)
var anotherList = List(7,8,8,9,10) // output: var anotherList: List[Int] = List(7, 8, 8, 9, 10)

print(newList(1))

for (i <- 0 until newList.size){
    println(newList(i))
}

// one line defination
for (i <- 0 until newList.size) println(newList(i))