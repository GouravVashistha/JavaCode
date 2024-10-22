# What is Java?
Java is a highly popular, object-oriented programming language. This platform independent programming language is utilized for Android development, web development, artificial intelligence, cloud applications, and much more.

### Why Use Java?
- Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.)
- It is one of the most popular programming languages in the world
- It has a large demand in the current job market
- It is easy to learn and simple to use
- It is open-source and free
- It is secure, fast and powerful
- It has huge community support (tens of millions of developers)
- Java is an object oriented language which gives a clear structure to programs and allows code to be reused, lowering development costs
- As Java is close to C++ and C#, it makes it easy for programmers to switch to Java or vice versa

### 1. Variables
A variable is a container for storing data values. In Java, each variable must be declared with a specific type, which determines the kind of data it can hold.

#### Declaration and Initialization
```java
int age; // Declaration
age = 25; // Initialization

// Declaration and initialization in one line
String name = "John";
```

### 2. Data Types
Java has two categories of data types: Primitive Data Types and Reference Data Types.

#### Primitive Data Types
- int: Integer data type (e.g., int age = 25;)
- double: Double-precision floating-point (e.g., double salary = 2500.50;)
- char: A single 16-bit Unicode character (e.g., char grade = 'A';)
- boolean: Represents true or false (e.g., boolean isActive = true;)
- byte: 8-bit signed integer (e.g., byte b = 100;)
- short: 16-bit signed integer (e.g., short s = 10000;)
- long: 64-bit signed integer (e.g., long l = 150000L;)
- float: Single-precision floating-point (e.g., float f = 234.5f;)
#### Reference Data Types
- String: A sequence of characters (e.g., String name = "Alice";)
- Arrays, Classes, Interfaces, etc.
### 3. Operators
Operators are special symbols that perform operations on variables and values.

### #Types of Operators
- Arithmetic Operators: +, -, *, /, %
- Relational Operators: ==, !=, >, <, >=, <=
- Logical Operators: && (AND), || (OR), ! (NOT)
- Assignment Operators: =, +=, -=, *=, /=
- Unary Operators: ++ (increment), -- (decrement)

 ### 4. Conditional Statements
Conditional statements allow you to execute certain parts of code based on whether a condition is true or false.

#### if, else if, and else
``` java
int number = 10;

if (number > 0) {
    System.out.println("Positive number");
} else if (number < 0) {
    System.out.println("Negative number");
} else {
    System.out.println("Zero");
}
```

### 5. Loops

Loops allow you to execute a block of code multiple times.

#### For Loop
``` java
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration " + i);
}
```
#### While Loop
``` java 
int i = 0;
while (i < 5) {
    System.out.println("Iteration " + i);
    i++;
}
```

#### Do-While Loop

``` java
int j = 0;
do {
    System.out.println("Iteration " + j);
    j++;
} while (j < 5);
```
### 6. Break Statement
The break statement is used to exit a loop or a switch statement prematurely.

#### Using break in Loops
``` java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break; // Exit the loop when i is 5
    }
    System.out.println("i = " + i);
}
```
## Question 1 : What is Constructor in Java ?
Constructor is block of code Just like a method  but it is use to insitialize the state of and object.

Every time an object is create with the help of [new] KeyWord, the [Default Constructor]  of  the call is called.

