//a simple class with mutable variable
class Contact(var id: Int, var email: String)

//a simple class with read only variable
class Contact_(val id: Int, val email: String)

//a simple class with constructore param that are not accessed inside class definition
class Contact__(id: Int, email: String)

// all the param inside () are called class header

//a classwith default value constrcutor params
class Contact2(val id: Int, var email: String = "example@gmail.com") {
    val category: String = "work"
}


//DATA CLASS
//usefull for storing data,
//no need to create getter and setter,
//it has aditional member fnction by defualt.

//1. tostring()
//2. equals() or ==
//3. copy()

//Example for .toString()
println(user)
// User(name=Alex, id=1)

//Example for .equals()
//both .equals() and == are doing same in kotlin
val user = User("Alex", 1)
val secondUser = user
val thirdUser = User("Alex", 1)
val fourthUser = User("Alex2", 2)


//RESULT FOR DATA CLASS
// == and .equals() method return true if both the referenec has same content for DATA CALSS
// for normal class, it is different
//user == secondUser: true
//user equals secondUser: true
//user == thirdUser: true
//user equals thirdUser: true
//user == fourthUser: false
//user equals fourthUser: false

//RESULT FOR DATA CLASS
// == and .equals() method return true if both the referenec points to same instance
// for normal class, it is different
//user == secondUser: true
//user equals secondUser: true
//user == thirdUser: false
//user equals thirdUser: false
//user == fourthUser: false
//user equals fourthUser: false

//COPY Instance - works only for data class, same as clone
val user = User("Alex", 1)
val secondUser = User("Alex", 1)
val thirdUser = User("Max", 2)

// Creates an exact copy of user
println(user.copy())

