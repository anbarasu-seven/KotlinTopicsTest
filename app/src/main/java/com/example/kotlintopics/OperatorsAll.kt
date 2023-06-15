package com.example.kotlintopics



//TO operator
val readOnlyAccountBalances = mapOf(1 to 100, 2 to 100, 3 to 100)

//IN operator
val readOnlyShapes = listOf("triangle", "square", "circle")
println("circle" in readOnlyShapes)

//OPERATOR operator

//TYPE check operator
//IS operators
if (obj is String) {
    print(obj.length)
}

//!IS operators
if (obj !is String) { // same as !(obj is String)
    print("Not a String")
}

//SMART CASTS
if (x is String) {
    print(x.length) // x is automatically cast to String
}

//MANUAL CASTS (AS keyword)
x as String

//performing casting on nullable throws exception.  this can be avoided by safe casting
val y : String? = x as? String


