/*
----------------------------
----------------------------
----------------------------
----------------------------
----------------------------
----------------------------
---------------------------- EXCEPTION TYPES

USE-DEFINED EXCEPTION 
  => Sometimes, the built-in exceptions in Java are not able to describe a certain situation. In such cases, users can also create exceptions, which are called ‘user-defined Exceptions’.

BUILD-IN EXCEPTION =>
  => Built-in exceptions are the exceptions that are available in Java libraries. These exceptions are suitable to explain certain error situations.

    => Checked Exceptions:
      Checked exceptions are called compile-time exceptions because these exceptions are checked at compile-time by the compiler.
 
    => Unchecked Exceptions:
      The unchecked exceptions are just opposite to the checked exceptions.
      The compiler will not check these exceptions at compile time. In simple words, if a program throws an unchecked exception,
      and even if we didn’t handle or declare it, the program would not give a compilation error.

---------------------------- EXCEPTIONS IN JAVA

xception Handling in Java is one of the effective means to handle runtime errors
Exception is an unwanted or unexpected event, which occurs during the execution of a program

Errors represent irrecoverable conditions such as Java virtual machine (JVM) running out of memory, memory leaks, stack overflow errors, library incompatibility, infinite recursion, etc.
Errors are usually beyond the control of the programmer, and we should not try to handle errors.

Error: An Error indicates a serious problem that a reasonable application should not try to catch.
Exception: Exception indicates conditions that a reasonable application might try to catch.

---------------------------- COPY CONSTRUCTOR

A copy constructor in a Java class is a constructor that creates an object using another object of the same Java class

---------------------------- CONSTRUCTOR OVERLOADING

Java supports Constructor Overloading in addition to overloading methods. In Java, overloaded constructor is called based on the parameters specified when a new is executed.
For example, the Thread class has 8 types of constructors

---------------------------- CONSTRUCTOR

A constructor in java is a special method that is used to initialize objects, The constructor is called when an object of a class is created.
It is a special type of method that is used to initialize the object.
NOTE [It is no necessary to write a constructor for a class. Because the java compiler creates a default constructor with no arg]

----------------------------

  Features
  ---open source
  ---high performance
  ---multithreaded
  ---secured
  ---platform independent
  ---portability
  ---object oriented
  ---bobust

------------------------------
    Variable
    variable is a container that holds the value while java program is being executed

    3 Types od variable
    *local     => variable declared inside the body of a method is called local variable you can use it only within that method [local can not be defined with static]
    *instance  => variable declared inside the class but outside the body of the method 
    *static    => it means that the variable belongs to the class itself rather than to any specific instance of the class
------------------------------
    datatypes
    int      2 Bytes
    float    4
    double   8
    long     8
    char     2
    short    1
    byte     1
    boolean  1
---------------------------------
    operators in java
    Unary operator        => are the types that need only one operand to perform any operation like increment, decrement, negation, etc //
      // Main driver method
    public static void main(String[] args)
    {
        // Declaring a custom variable
        int n1 = 20;
 
        // Printing the above variable
        System.out.println("Number = " + n1);  // 20
 
        // Performing unary operation
        n1 = -n1;
 
        // Printing the above result number
        // after unary operation
        System.out.println("Result = " + n1);  // -20
    }
    
  */
