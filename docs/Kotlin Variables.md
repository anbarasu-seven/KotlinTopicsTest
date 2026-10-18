# **Kotlin Variables: Complete Guide**

#### Author: [Anbarasu Chinna](mailto:anbarasu.itdev@gmail.com) | Last Updated: Oct 18, 2026

# Key Highlights of Kotlin

1. **Modern & Expressive:** Clean syntax designed for modern development.  
2. **Null Safety:** Type system designed to eliminate NullPointerExceptions.  
3. **Concise Code:** Reduces boilerplate code significantly compared to traditional languages.  
4. **Interoperable:** Fully interoperable with Java and the JVM ecosystem.  
5. **Multi-paradigm:** Combines Object-Oriented and Functional programming paradigms.  
   **Cross-platform:** Share code between platforms using Kotlin Multiplatform / Native.

   # Variables Overview

   ## Mutable Variables (var) vs Immutable Variables (val)

### 1\. Mutable Variable (var)

A variable declared with **var** is mutable. Its value can be reassigned at runtime after initialization.

```kotlin
var age = 25
age = 26 // Allowed: Value modified at runtime
```

### 2\. Read-Only Variable (val)

A variable declared with **val** is read-only (immutable reference). Once assigned at runtime, it cannot be reassigned.

```kotlin
val age = 25
// age = 26 // Compilation Error: Val cannot be reassigned
```

## Compile-Time Constants (const val)

Compile-time constants are declared using **const val**. Their values are determined at compile time and inlined directly into the bytecode.

### Why const var is Invalid

Combining **const** and **var** creates a logical contradiction:

1. **var:** Allows value modification at runtime.  
2. **const:** Hardcodes the value into the bytecode during compilation.  
   Because a value hardcoded at compile time cannot be changed dynamically, **const var is strictly prohibited** in Kotlin.

### Why const val is Valid

Both terms complement each other for fixed compile-time constants:

3. **val:** Guarantees immutability.  
4. **const:** Ensures the constant value is evaluated at compile time.

### Assigning Function Return Values to Variables

Both class-level and function-level variables (declared with **var** or **val**) can store the result of a function call at runtime.  
**Note:** A **const val** cannot be assigned the return value of a function call, as function evaluation occurs at runtime while **const** requires value resolution at compile time.

## Constructor Parameters Without var or val

Parameters declared in a primary constructor without **var** or **val** are treated as plain constructor arguments rather than member properties.

```kotlin
class User(name: String) // 'name' is a parameter, not a class property
```

These constructor parameters are only accessible within three contexts:

1. Passed directly to superclass constructors.  
2. Used inside **init** blocks during initialization.  
3. Used to initialize class properties declared within the class body.  
   Once object initialization finishes, these parameters are no longer accessible on the instance (e.g., **user.name** produces a compilation error).

   ## Late Initialization (lateinit)

   The **lateinit** modifier allows initializing a non-null property after object construction.

### lateinit var vs lateinit val

5. **lateinit var is allowed:** Informs the compiler that the non-null variable will be assigned before first access. Because **var** represents a mutable field, late assignment is valid.  
6. **lateinit val is NOT allowed:** Properties declared with **val** generate a final backing field during object initialization. Allowing late assignment on a final property would violate immutability rules.

   ## Lazy Property Delegation (by lazy)

   Lazy initialization defers property computation until its first read access.

### Why lazy val is allowed and lazy var is not

7. **lazy val (Valid):** The \`lazy\` delegate implements only a getter (\`getValue()\`), satisfying the read-only requirement of \`val\`.  
8. **lazy var (Invalid):** Mutable \`var\` properties require both getter and setter implementation (\`setValue()\`). Standard \`lazy\` delegates do not provide a setter.

   ## Backing Fields & Properties

### 1\. Implicit Backing Field (field)

Kotlin automatically generates an implicit backing field (\`field\`) for properties that use custom accessors when actual memory storage is required.

```kotlin
class User {
    var age: Int = 0
        get() {
            println("Reading age")
            return field // 'field' accesses the actual backing storage
        }
        set(value) {
            println("Updating age to $value")
            field = if (value < 0) 0 else value
        }
}
```

### 2\. Explicit Backing Property Pattern

Used widely in Android architecture (e.g., ViewModels) to expose an immutable read-only property publicly while maintaining a mutable private backing state.

```kotlin
class GameViewModel : ViewModel() {
    // Private mutable backing property
    private val _score = MutableStateFlow(0)

    // Public immutable read-only interface
    val score: StateFlow<Int> get() = _score
}
```

## Delegated Properties

Property delegation hands over the getting and setting logic of a property to another object.

### Common Built-in Delegates

9. **lazy:** Computes property value upon first access and caches it.  
10. **Delegates.observable():** Triggers a callback whenever the property value changes.  
11. **Map delegate:** Stores and reads property values from a map instance using property names as keys.  
    

```kotlin
// Observable Delegate Example
var name: String by Delegates.observable("<initial>") { _, old, new ->
    println("Value changed from '$old' to '$new'")
}

// Map Delegate Example
val userMap = mapOf("name" to "John", "age" to 30)
val userName: String by userMap
```

    ## Destructuring Declarations

    Destructuring allows decomposing an object into multiple variables simultaneously.

    

```kotlin
val (name, age) = user
```

12. **Data Classes:** Automatically generate \`componentN()\` functions required for destructuring.  
13. **Standard Classes:** Require explicit \`operator fun componentN()\` declarations to support destructuring.

    ## Reference vs State Immutability in val

    The **val** keyword guarantees that the variable reference cannot be reassigned to a new memory instance. However, it does **not** prevent modification of internal object state for mutable objects.  
    

```kotlin
val list = mutableListOf(1, 2)
list.add(3) // Valid: Internal state of object is modified
// list = mutableListOf(4, 5) // Error: Cannot reassign 'val' reference
```

    ## Special Variable Declarations & Annotations

### 1\. Companion Object Constants

Companion objects define class-level static members, similar to Java's \`public static\` fields.

```kotlin
class User {
    companion object {
        const val TAG = "User"
    }
}
```

### 2\. Enum Class Variables

```kotlin
enum class Direction { NORTH, SOUTH, EAST, WEST }

enum class Status(val code: Int) {
    SUCCESS(200),
    ERROR(500)
}
```

### 3\. Thread-Safe Variables (@Volatile)

Annotating a variable with **@Volatile** ensures that writes to the property are immediately visible to all CPU cores and threads by bypassing local CPU caches.

```kotlin
@Volatile
var isRunning = true
```

### 4\. Implicit & Explicit Scope Variables

```kotlin
// Implicit scoped variable 'it'
list.forEach { println(it) }

// Explicit named lambda variable
list.forEach { item -> println(item) }
```

### 5\. Type Inference

Kotlin automatically infers data types based on the assigned value, avoiding explicit type declarations when obvious.

```kotlin
val name = "Kotlin" // Inferred as String
val nameExplicit: String = "Kotlin" // Explicit type definition
```

