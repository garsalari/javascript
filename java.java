/*
----------------------------
----------------------------
----------------------------
----------------------------
---------------------------- How to sort HashSet of integers?

This is a tricky question, as the Set is by default an unordered structure. So the answer is simply no unless we use an additional data structure.

Starting from this question, it’s possible to:

Investigate the candidate's knowledge of Java collections. TreeSet, LinkedHashSet, and List are only some of the possible solutions.
Proceed further with HashSet's internal checks. Why do you think Sets are unordered? Why is it called a HASH set?

---------------------------- testing pyramid

The testing pyramid is a concept that allows us to verify several levels of a candidate’s knowledge.
Being able to identify all the layers (unit testing, integration testing, UI testing) should be enough for a junior developer,
but for more experienced candidates, it’s better to make sure they have also implemented some of those using different tools or technologies.

---------------------------- Merge vs rebase

When it’s not possible to merge two branches because of conflicts, developers have two options: merging or rebasing.
A rebase may be needed when reserving a clean Git history is important. Rebasing means to move the base of a branch on top of the leaf of another.
Instead of having branches intersect multiple times, you can have a clean Git history, as long as everyone follows the golden rule of rebasing:
never rebase a public branch.

----------------------------ARRAYLIST VS LINKEDLIST

ArrayList
        Internally, ArrayList is using an array to implement the List interface.
        As arrays are fixed size in Java, ArrayList creates an array with some initial capacity.
        Along the way, if we need to store more items than that default capacity, it will replace that array with a new and more spacious one.
LinkedList
        LinkedList, as its name suggests, uses a collection of linked nodes to store and retrieve elements.
        Each node maintains two pointers: one pointing to the next element and another referring to the previous one.
        Expanding on this, the doubly linked list has two pointers pointing to the first and last items.

---------------------------- CHARACTERISTICS OF GOOD TEST

Fast
    As you learn more about tests in the context of full-stack web applications, you will find that some types of tests,
    called unit tests, are fast, while other tests, called integration tests, are slower.
    If your test suite contains a large collection of integration tests, and few unit tests,
    you may end up waiting a few minutes or even hours for your test suite to execute.
Complete
    A test suite that covers 100% of your codebase will catch any errors that arise from changing or adding code application.
    A complete test suite provides you with confidence that your software is working as expected.
    This characteristic can often run in conflict with building a fast test suite — as you investigate testing further,
    you will learn about strategies that help you optimize your test suite for speed and completeness.
Reliable
    A reliable test suite is one that provides consistent feedback, regardless of changes that may occur outside the scope of a given test.
    An unreliable test suite may have tests that fail intermittently, with no helpful feedback about changes you’ve made to your application.
Isolated
    An isolated test suite contains tests that run without impacting other tests in the suite.
    This may require you to cleanup persisting data after you run a test in your suite.
Maintainable
    A maintainable test suite is easy to manipulate — you should be able to add, change, or remove tests with ease.
    If you don’t know how to add tests to run against new features, your test suite may become incomplete and ineffective.
Expressive
    The easy-to-read nature of test suites make them a great form of documentation.
    You should always write code that is descriptive of the features you are testing.

---------------------------- SPRING PROFILE

allowing us to map our beans to different profiles — for example, dev, test, and prod.

---------------------------- DEPENDENCY INJECTION

1. Inversion Of Control Principle : In simple words, it is simply externalizing the creation & management of objects.
2. Dependency Injection : Dependency injection is basically wiring various objects altogether to support a single cause.

---------------------------- HASHSET AND TREESET

HashSet stores the objects in random order, whereas TreeSet applies the natural order of the elements.
Another difference is that HashSet can store null objects, while TreeSet does not allow them.
Simply put, HashSet is faster than the TreeSet.
HashSet provides constant-time performance for most operations like add(), remove() and contains(), versus the log(n) time offered by the TreeSet.

Both TreeSet and HashSet guarantee a duplicate-free collection of elements, as it is a part of the generic Set interface.

----------------------------GABAGE COLLECTION

Automatic garbage collection is the process of looking at heap memory, identifying which objects are in use and which are not,
and deleting the unused objects.
An in use object, or a referenced object, means that some part of your program still maintains a pointer to that object.
An unused object, or unreferenced object, is no longer referenced by any part of your program.
So the memory used by an unreferenced object can be reclaimed.

garbage collection is triggered automatically by the JVM (Java Virtual Machine)
when it determines that the heap is getting full or when a certain amount of time has passed.

----------------------------OBJECT-ORIENTED PROGRAMING PRINCIPLES

Encapsulation
  Encapsulation is a process of wrapping code and data together into a single unit.
  This can be achieved by using private access modifiers that can’t be accessed by anything outside the class.
  In order to access private states safely, we have to provide public getter and setter methods.
  (In Java, these methods should follow JavaBeans naming standards.)
Inheritance
  Inheritance is a mechanism in which one object acquires all the states and behaviors of a parent object.
  Inheritance uses a parent-child relationship
Abstraction
  Abstraction is a process of hiding the implementation details and showing only functionality to the user
Polymorphism
  Polymorphism is the ability of an object to take on many forms.

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
