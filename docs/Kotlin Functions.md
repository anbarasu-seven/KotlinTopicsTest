

# **Kotlin Functions for Kids\! 🚀**

#### By [Anbarasu Chinna](mailto:anbarasu.itdev@gmail.com)May 24, 2026

# 

# Why Kotlin is Awesome\! ✨

1. Super modern and easy to read  
2. Null safety: Stops your program from crashing like a house of cards\!  
3. Fewer bugs and silly mistakes  
4. Short and clear code  
5. Super fast at building apps  
6. Plays really nicely with Java  
7. Combines objects and smart logic functions  
8. Share code across phones, computers, and web\!

   

   # What is a Function? 🤖

   

### 1\. Basic Function (A Simple Command)

Think of a function as a mini-robot instruction\! When you say \`greet()\`, the robot says hi.

### 2\. Function with Parameters (Giving Information)

You tell the robot who to greet: \`greet(name \= "Alex")\`\!

### 3\. Function with a Return Value (Getting Something Back)

You give the robot two numbers, and it hands back the total sum\!

### 4\. Single-Expression Function (Short & Sweet)

When a function is super tiny, you can write it on one line using \`=\`: \`fun square(x: Int) \= x \* x\`

### 5\. Default Parameters (Backup Answers)

If you don't give a name, it defaults to \`"Guest"\`\!

### 6\. Named Arguments (No Confusion\!)

You can explicitly say which parameter gets which value: \`greet(name \= "Sam")\`

### 7\. Unit Return Type (Doing Work Without Handing Back Values)

\`Unit\` means "I did the job, but I don't have anything to give back to you."

### 8\. Infix Functions (Reading Like English\!)

Infix functions let you skip the dots and brackets so your code reads like a real sentence\!

Instead of writing \`person.walk(10)\`, infix lets you write \`person walk 10\`.

### 9\. Extension Functions (Adding Superpowers\!)

Extension functions let you add brand new powers to existing types like \`String\` without modifying their original code\!

### 10\. Higher-Order Functions & Lambdas (Passing Code Like Toys\!)

A \*\*Higher-Order Function\*\* is a function that accepts another function as a parameter—just like handing a toy to a friend\!  
A \*\*Lambda\*\* is an anonymous function (a function without a name) that you can pass around quickly using \`{ }\`.

### 11\. Inline Functions (Fast Copy & Paste)

An \*\*Inline Function\*\* tells the compiler to copy-paste the function's code directly where it's called, making execution faster\!

### 12\. Scope Functions (Quick Helper Tools 🧰)

Scope functions (\`let\`, \`run\`, \`with\`, \`apply\`, \`also\`) give you a temporary playground to work on an object neatly.

| Function  | Reference | What it returns | Purpose |
| :---- | :---- | :---- | :---- |
| let | it | lambda | Null check \+ transforming object |
| run | this | lambda | Work with original object \+ return lambda |
| with | this | lambda | **This is not a extension function**   Work with original object \+ return lambda |
| apply  | this | Object itself | Setup object \+ return same Ex: New object config |
| also | it | Object itself | Use obj prop \+ return sameEx: Logging, debugging |

### 13\. Vararg Functions (Accepting As Many Items As You Want\!)

### The \`vararg\` keyword lets a function take 1, 5, or 100 items without creating a manual list beforehand\!

### 14\. Component Functions (Unpacking Objects)

Component functions allow you to easily unpack an object's properties into separate variables, like unpacking a backpack\!

### 15\. Nested Functions (Functions Inside Functions)

You can hide a helper function inside another function so no one else bothers it\!

### 16\. Tail Recursive Functions (\`tailrec\`)

When a function calls itself repeatedly, adding \`tailrec\` helps Kotlin optimize memory so your app never runs out of space\!

### 17\. Suspend Functions (Pausing like a Video Game\! ⏸️)

A \`suspend\` function can pause its work to wait for data (like downloading a game level) and resume when ready without freezing the rest of your app\!

