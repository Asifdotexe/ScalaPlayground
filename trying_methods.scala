
var newList = List(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21)

newList = newList.drop(1) // output: newList: List[Int] = List(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21)
newList = newList.dropRight(1) // output: newList: List[Int] = List(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
newList = newList.dropWhile(_ != 0) // output: newList: List[Int] = List(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
newList.getClass() // output: val res7: Class[? <: List[Int]] = class scala.collection.immutable.$colon$colon
newList.min // output: val res0: Int = 1
newList.max // output: val res1: Int = 21
newList.permuations // output: val res3: Iterator[List[Int]] = <iterator>
newList.toArray() // output: val res4: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21)
newList.toIndexedSeq // output: val res6: IndexedSeq[Int] = Vector(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21)
newList.toBuffer // output: val res7: scala.collection.mutable.Buffer[Int] = ArrayBuffer(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21)
newList.toStream // output: val res9: Stream[Int] = Stream(1, <not computed>)
