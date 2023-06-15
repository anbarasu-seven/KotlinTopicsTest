package com.example.kotlintopics


//appending strings followed by any data type will be considered as string only
val s = "abc" + 1
println(s + "def")
//abc1def

//RAW string covered with 3", it will maintail newline and spacing
val text = """
    for (c in "foo")
        print(c)
"""
//trimMargin() function will remove left and right spacing in all line.