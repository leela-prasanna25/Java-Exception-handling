# 📘 Java Exception Handling – Complete Guide

This repository contains practical programs and theory to understand Exception Handling in Java with real-time examples.

---

## 📌 Topics Covered
- try-catch-finally
- throw and throws
- Checked and Unchecked Exceptions
- Custom Exceptions
- Exception Hierarchy
- Real-Time Use Cases

---

## 🔹 What is an Exception?
An exception is an abnormal condition that occurs during program execution and interrupts the normal flow of a program.

Examples:
- Dividing by zero
- Accessing invalid array index
- File not found

---

## 🔹 Exception Hierarchy in Java
All exceptions are derived from the `Throwable` class.

Object
↓
Throwable
↓
| |
Exception Error


Exception → Can be handled by program  
Error → Serious system problems (not handled)

---

## 🔹 Types of Exceptions

### ✅ Checked Exceptions
Checked exceptions are verified at compile time. The compiler forces handling using try-catch or throws.

Examples:
- IOException
- FileNotFoundException
- SQLException

---

### ✅ Unchecked Exceptions
Unchecked exceptions occur at runtime and are caused by programming mistakes.

Examples:
- NullPointerException
- ArithmeticException
- ArrayIndexOutOfBoundsException

---

## 🔹 try-catch Block
Used to handle exceptions and prevent program crash.

Syntax:
```java
try {
    // risky code
} catch(Exception e) {
    // handling code
}
Benefits:
Prevents program termination
Shows user-friendly messages
Helps debugging

🔹 finally Block
Executes always whether exception occurs or not. Used for resource cleanup.

Example:

finally {
    System.out.println("Cleanup done");
}

🔹 throw Keyword
Used to manually create an exception.

Example:

if(age < 18){
    throw new ArithmeticException("Not allowed");
}

🔹 throws Keyword
Used to declare exceptions in method signature and pass responsibility to caller.

Example:

void readFile() throws IOException {
    // code
}

🔹 Custom Exceptions
User-defined exceptions created for specific requirements.

Steps:

Extend Exception or RuntimeException
Create constructor
Use throw keyword

Example:

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg){
        super(msg);
    }
}
Benefits:
Clear error handling
Better readability
Easy debugging

🔹 Real-Time Use of Exception Handling
Used in applications for:
✔ Input validation
✔ Database errors
✔ API failures
✔ File handling
✔ Network errors

Examples:
Banking → Invalid transaction
E-commerce → Payment failure
Login → Invalid credentials

🔹 How to Run
Compile:
javac FileName.java
Run:
java FileName
