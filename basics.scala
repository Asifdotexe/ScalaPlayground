// variables
var a: Int = 5 // var a: Int = 5

var b = 5 // var b: Int = 5

var b = 5.5 // var b: Double = 5.5

var b = 5.5f // var b: Float = 5.5

var c = a + b // var c: Float = 10.5

var c = b + a // var c: Float = 10.5

var c = a + 10.9 // var c: Double = 15.9

// String

var name = 'Asif' // will not work
/* -- Error: ----------------------------------------------------------------------
1 |var name = 'Asif'
  |           ^
  |symbol literal 'Asif is no longer supported,
  |use a string literal "Asif" or an application Symbol("Asif") instead,
  |or enclose in braces '{Asif} if you want a quoted expression.
  |For now, you can also `import language.deprecated.symbolLiterals` to accept
  |the idiom, but this possibility might no longer be available in the future.
-- Error: ----------------------------------------------------------------------
1 |var name = 'Asif'
  |                ^
  |                unclosed character literal */


var name = "Asif" // output:var name: String = Asif

// operations

var sum = a + b // output: var sum: Float = 10.5

var product = a * b // output: var product: Float = 27.5

var divide = a / b // output: var divide: Float = 0.90909094

var module = a % b // output: var module: Float = 5.0

5.0 / 0 // output: val res0: Double = Infinity

5 / 0 // output: java.lang.ArithmeticException: / by zero  ... 32 elided

a = 19 // mutating a -> output: a: Int = 19

c // getting out the value of c -> output: val res3: Double = 15.9

var c = a + res3 // using res3 to do an operation -> output: var c: Double = 34.9

res3 = 69 // output: trying to mutate res3 ->
/* -- [E052] Type Error: ----------------------------------------------------------
1 |res3 = 69 // trying to mutate res3
  |^^^^^^^^^
  |Reassignment to val res3
  |
  | longer explanation available when compiling with `-explain`
1 error found */

