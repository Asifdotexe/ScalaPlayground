def incrementer(input_number: Int): Unit = {
    var number = input_number
    while (number <= 10) { 
    println("Incrementing by 1")
    println(number)
    number += 1
    }
}