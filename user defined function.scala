def incrementer(input_number: Int): Unit = {
    var number = input_number
    while (number <= 10) { 
    println("Incrementing by 1")
    println(number)
    number += 1
    }
}

def helloWorld(name: String): Unit = {
    println(s"Hello, My name is $name!")
}

def helloDarling(name: String, partner_name: String): Unit = {
    println(s"Hello, My name is $name! My home is, $partner_name and I extremely adore her!")
}

/* Practice */

a = 1478

def getNumberSum(input_number: Int): Unit {
    total = 0
    var number = input_number
    var num_string = number.toString
    var length = num_string.length
    for (i <- 0 to length - 1) {
        total = total+= num_string(i).toInt
    }
}

def getNumberSum(input_number: Int): Int = {
  var total = 0
  val num_string = input_number.toString
  val length = num_string.length
  
  for (i <- 0 until length) {
    total += num_string(i).asDigit
  }

  total
}