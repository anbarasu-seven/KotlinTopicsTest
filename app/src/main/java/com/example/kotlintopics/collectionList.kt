
//List - Ordered collections of items
//To create a read-only list (List), or listOf() function.
//
//To create a mutable list (MutableList), or mutableListOf() function.
//example

// Read only list
val readOnlyShapes = listOf("triangle", "square", "circle")
// Mutable list with explicit type declaration
val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")

// to give read only access to mutable list, do following
val shapes_: MutableList<String> = mutableListOf("triangle", "square", "circle")
val shapesLocked: List<String> = shapes_

//shapes reference is the mutable type, shapesLocked reference is readonly type
// this way will avoid unwanted modification on readonly property



