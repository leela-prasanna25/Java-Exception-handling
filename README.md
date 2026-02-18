Java Exception Handling – Complete Guide

This repository contains practical programs and detailed theory
to understand Exception Handling in Java with real-time examples.

📌 Topics Covered

try-catch-finally
throw and throws
Checked and Unchecked Exceptions
Custom Exceptions
Exception Hierarchy
Real-Time Use Cases


🔹 What is an Exception?
An exception is an abnormal condition that occurs during program execution
which interrupts the normal flow of a program.
Examples:
Dividing by zero
Accessing invalid array index
File not found

🔹 Exception Hierarchy in Java

All exceptions are derived from the Throwable class.
Object
  ↓
Throwable
  ↓
----------------
|              |
Exception     Error

Exception → Can be handled by program
Error → Serious system problems (not handled)

Exceptions are of Two Types
**🔹 Checked Exceptions**
Checked exceptions are verified at compile time.
The compiler forces the programmer to handle them.
**Characteristics:**
Must be handled using try-catch or throws
Related to external resources
Examples:
IOException
FileNotFoundException
SQLException

**🔹Unchecked Exceptions**
Unchecked exceptions occur at runtime.
The compiler does not force handling.
**Characteristics:**
Caused by programming mistakes
Subclass of RuntimeException
Examples:
NullPointerException
ArithmeticException
ArrayIndexOutOfBoundsException


**🔹 try-catch Block**
The try-catch block is used to handle exceptions and prevent program termination.
Syntax:
try {
    // risky code
} catch(Exception e) {
    // handling code
}

Benefits:
Prevents program crash
Displays user-friendly messages
Helps debugging

**🔹 finally Block**
The finally block executes always, whether an exception occurs or not.
Usage:
Closing files
Closing database connections
Releasing resources
Example:
finally {
    System.out.println("Cleanup done");
}

**🔹 throw Keyword**
The throw keyword is used to manually create an exception.
Example:
if(age < 18){
    throw new ArithmeticException("Not allowed");
}

**🔹 throws Keyword**
The throws keyword is used to declare exceptions in method signature.
It passes responsibility to the caller.
Example:
void readFile() throws IOException {
    // code
}

**🔹 Custom Exceptions**

Custom exceptions are user-defined exceptions created for specific requirements.
Steps:
Create class extending Exception or RuntimeException
Define constructor
Use throw to generate exception

Example:
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg){
        super(msg);
    }
}
Benefits:
Better error clarity
Improves code readability
Helps in debugging

**🔹 Real-Time Use of Exception Handling**
In real applications, exception handling is used for:
✔ Input validation
✔ Database errors
✔ API failures
✔ File handling
✔ Network errors
Example:
Banking apps → Invalid transaction
E-commerce → Payment failure
Login system → Invalid credentials

**🔹 How to Run the Programs**

Compile the program:javac FileName.java
Run the program:java FileName

