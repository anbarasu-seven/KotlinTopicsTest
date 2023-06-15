//use `with` as a alyternate to `if`

//There is no ternary operator
// condition ? then : else in Kotlin

//Instead, if can be used as an expression. When using if as an expression, there are no curly braces {}
val a = 1
val b = 2
println(if (a > b) a else b)

//`WHEN` EXAMPLE
val obj = "Hello"

when (obj) {
    // Checks whether obj equals to "1"
    "1" -> println("One")
    // Checks whether obj equals to "Hello"
    "Hello" -> println("Greeting")
    // Default statement
    else -> println("Unknown")
}


//WHEN WITH RETURNING RESULT
val obj = "Hello"

val result = when (obj) {
    // If obj equals "1", sets result to "one"
    "1" -> "One"
    // If obj equals "Hello", sets result to "Greeting"
    "Hello" -> "Greeting"
    // Sets result to "Unknown" if no previous condition is satisfied
    else -> "Unknown"
}
println(result)
//NOTE: when looks like scoped function but it is not a scoped function actually

//else block is mandatory in with
//in java - switch
//in kotlin - when


//RANGES
//until KEYWORD
1 until 4  result ->  1, 2, 3
4 downTo 1  result -> 4, 3, 2, 1
1..5 step 2  result -> 1, 3, 5
'a'..'d' result->  'a', 'b', 'c', 'd'
'z' downTo 's' step 2 result-> 'z', 'x', 'v', 't'


//for LOOP
for (number in 1..5) {
    // number is the iterator and 1..5 is the range
    print(number)
}


val cakes = listOf("carrot", "cheese", "chocolate")
for (cake in cakes) {
    println("Yummy, it's a $cake cake!")
}

