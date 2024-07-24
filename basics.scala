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

