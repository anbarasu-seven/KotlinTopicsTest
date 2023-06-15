//normal functions
fun sum(x: Int, y: Int) {
    print(x + y)
}

//above function return type is Unit, ie equal to void in hava

//normal functions with return type
fun sum_(x: Int, y: Int): Int {
    return x + y
}

//Named arguments
//when we call a fucntion we map arguemnt to a variable, ie named argument.
fun main() {
    sum(x = 10, y = 19)
}

//Default parameter values
//when declaring a function with parameter, we can give default value to parameter, those parameters are
//called default parameter, because they are holding default value.
// so when calling a function it is optional to send default parameter value
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}
//optional second parameter
printMessageWithPrefix("Hello")
//
printMessageWithPrefix("Hello", "Log")

//Single-expression functions
fun sum(x: Int, y: Int) = x + y


//LAMBDA EXPRESSIONS
{ string: String -> string.uppercase() }

//assigning LAMBDA EXPRESSIONS to variable
val upperCaseString = { string: String -> string.uppercase() }
println(upperCaseString("hello"))

//calling LAMBDA EXPRESSIONS directly
{ string: String -> string.uppercase() }("hello")


//Pass to LAMBDA EXPRESSIONS to another function
val numbers = listOf(1, -2, 3, -4, 5, -6)
val positives = numbers.filter { x -> x > 0 }
println(positives)
// [1, 3, 5]
val numbers = listOf(1, -2, 3, -4, 5, -6)
val doubled = numbers.map { x -> x * 2 }
println(doubled)
// [2, -4, 6, -8, 10, -12]

//Return LAMBDA EXPRESSIONS from a function
//Int return type example
fun name_() : Int = 0

//LAMBDA EXPRESSIONS return type example
fun returnLambda() : () -> Int = {
    return { value -> value * 60 * 60 }
}

//Trailing LAMBDA EXPRESSIONS
listOf(1, 2, 3).fold(0, { x, item -> x + item })

//if a function receives a last parameter as a LAMBDA expression, it can be simplified as follows
println(listOf(1, 2, 3).fold(0) { x, item -> x + item })














