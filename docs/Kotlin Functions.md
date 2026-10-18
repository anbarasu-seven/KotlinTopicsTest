# Kotlin Functions for Kids! 🚀

#### By [Anbarasu Chinna](mailto:anbarasu.itdev@gmail.com) May 24, 2026

## Why Kotlin is Awesome! ✨

1. Super modern and easy to read
2. Null safety: Stops your program from crashing like a house of cards!
3. Fewer bugs and silly mistakes
4. Short and clear code
5. Super fast at building apps
6. Plays really nicely with Java
7. Combines objects and smart logic functions
8. Share code across phones, computers, and web!

## What is a Function? 🤖

### 1. Basic Function (A Simple Command)
```kotlin
fun greet() {}
```
Think of a function as a mini-robot instruction! When you say `greet()`, the robot says hi.

### 2. Function with Parameters (Giving Information)
```kotlin
fun greet(name: String) {}
```
You tell the robot who to greet: `greet(name = "Alex")`!

### 3. Function with a Return Value (Getting Something Back)
```kotlin
fun sum(a: Int, b: Int): Int {}
```
You give the robot two numbers, and it hands back the total sum!

### 4. Single-Expression Function (Short & Sweet)
```kotlin
fun square(x: Int) = x * x
```
When a function is super tiny, you can write it on one line using `=`: `fun square(x: Int) = x * x`

### 5. Default Parameters (Backup Answers)
```kotlin
fun greet(name: String = "Guest") {}
```
If you don't give a name, it defaults to `"Guest"`!

### 6. Named Arguments (No Confusion!)
```kotlin
greet(name = "A")
```
You can explicitly say which parameter gets which value: `greet(name = "Sam")`

### 7. Unit Return Type (Doing Work Without Handing Back Values)
```kotlin
fun printText(): Unit {}
```
`Unit` means "I did the job, but I don't have anything to give back to you."

### 8. Infix Functions (Reading Like English!)
```kotlin
mapOf("Anbarasu" to 35)
// this is equal to
val myMap = mapOf("Anbarasu".to(35))
```
Infix functions let you skip the dots and brackets so your code reads like a real sentence!

Instead of writing `person.walk(10)`, infix lets you write `person walk 10`.

### 9. Extension Functions (Adding Superpowers!)
```kotlin
fun String.greet() {}
```
This allows us to create a function into a compiled code.

### 10. Higher-Order Functions & Lambdas (Passing Code Like Toys!)
```kotlin
fun fetchUser(callback: (String) -> Unit) {
   val user = "Anbarasu"
   callback(user)
}
```

A **Higher-Order Function** is a function that accepts another function as a parameter, Higher order functions receive only 2 types of function as a parameter, its either namedFunction or unnamedFunction(lambda) function!  

NamedFunction has its own name, so we can use that name as reference to pass it to higher order functions.

There are 2 types of named function:
standard named function and
Lambda named function

Examples:

### 10.1 Passing A standard named function
```kotlin
fun logUser(name: String) {
    println("User fetched: $name")
}

fetchUser(::logUser)
```
- `printUser` —> is named function
- `fetchUser` —> higher order function

`fetchUser(logUser)` —> this is possible only in javascript not kotlin, so we have to use `::` in kotlin

### 10.2 Passing a Lambda named function
A normal lambda expression looks like this:
```kotlin
{ value -> println("User fetched: $name") }
```
A named lambda looks like this:
```kotlin
val logUser = { value -> println("User fetched: $value") }

fetchUser(::logUser)
```

### 10.3 Passing an anonymous (unnamed) function
A function without a name is an anonymous function or unnamed function.
```kotlin
fetchUser(fun(name: String) { println("User fetched: $name") })
```
NOTE: function name `logUser` is removed when passing

### 10.4 Passing a strict lambda - Original Lambda
```kotlin
fetchUser({ name: String -> println("User fetched: $name") })
```
NOTE: function name `logUser` + `fun` key both removed when passing

### 10.5 Passing trailing Lambda
```kotlin
fetchUser() { name -> println("User fetched: $name") }
```
Note: Lambda function goes out of the fun brackets

### 10.6 Most advanced lambda usage
```kotlin
fetchUser { println("User fetched: $it") }
```
`name` parameter is replaced by `it` param by default

Action & callback Functions are similar in kotlin.

There is an interesting thing in kotlin:
**Interesting Thing 1: Functions as object**
Normal `fun` is a keyword, when we compile it won't generate any new object. But when we use lambda the compiled code generate object for Function class, so There is a new class in kotlin called Function.

Example:
Normal lambda before compiling code:
```kotlin
executeNormal { println("Hello") }
```
Lambda converted to function object after we compile it:
```kotlin
// It creates a brand new "Function" object in memory just to hold your code 
Function action = new Function() {
    public void invoke() {
        System.out.println("Hello");
    }
};
executeNormal(action);
```

**Interesting Thing 2: Lambda allow 22 params**
Kotlin limits lambda function to have from 0 to 22 param, we cant add more than 22 param.
But Kotlin 1.3 support more than 23 params.

A **Lambda** is an anonymous function (a function without a name) that you can pass around quickly using `{ }`.

### 11. Inline Functions (Fast Copy & Paste)
```kotlin
fun greet() {}
```
An **Inline Function** tells the compiler to copy-paste the function's code directly where it's called, making execution faster!

### 12. Scope Functions (Quick Helper Tools 🧰)
```kotlin
fun greet() {}
```
Scope functions (`let`, `run`, `with`, `apply`, `also`) give you a temporary playground to work on an object neatly.

| Function | Reference | What it returns | Purpose |
| :--- | :--- | :--- | :--- |
| let | it | lambda | Null check + transforming object |
| run | this | lambda | Work with original object + return lambda |
| with | this | lambda | **This is not a extension function** Work with original object + return lambda |
| apply | this | Object itself | Setup object + return same Ex: New object config |
| also | it | Object itself | Use obj prop + return same Ex: Logging, debugging |

### 13. Vararg Functions (Accepting As Many Items As You Want!)
```kotlin
fun greet() {}
```
The `vararg` keyword lets a function take 1, 5, or 100 items without creating a manual list beforehand!

### 14. Component Functions (Unpacking Objects)
```kotlin
fun greet() {}
```
Used for object  destructuring
Data class has  component function by default,
For normal class we wanted to manually create component function to destructure it.

### 15. Nested Functions (Functions Inside Functions)
```kotlin
fun greet() {}
```
Function inside another function called nested functions

### 16. Tail Recursive Functions (`tailrec`)
```kotlin
fun greet() {}
```
All recursive function should use tailrec keyword in inform compiler so its handled in an efficient way by compiler

### 17. Suspend Functions (Pausing like a Video Game! ⏸️)
```kotlin
fun greet() {}
```
A `suspend` function capable of pausing and resuming its execution later on.

It's not a thread,
it's not asynchronous,
It's not a coroutine, 
