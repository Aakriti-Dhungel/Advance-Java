# Advance-Java

This repository contains Java practice programs.

## Topics Covered
- Java Template
- Access Modifiers
- Array and Collections
- Inheritance
- Threads and Thread Synchronization
## Project Structure
```

Advance-Java/
src/
javatemplate/
accessmodifier/
arrayandcollection/
Inheritance(Single/Multiple)
Threads and Thread Synchronization
.gitignore
README.md

```

## How to Run
1. Clone the repository:
``` 
git clone https://github.com/Aakriti-Dhungel/Advance-Java.git

```
2. Open the project in Eclipse.
3. Run the Java files from the `src` folder.

## Notes
- The `bin` folder and compiled `.class` files are ignored.
```

## Inheritance in Java

Inheritance allows one class to acquire the properties and methods of another, promoting reusability.

### Single Inheritance

Single inheritance occurs when a class inherits from **one parent class**.

**Example:**
`Calculator` extends `MyMath`.

### Multiple Inheritance (Using Interfaces)

Multiple inheritance occurs when a class inherits from **multiple interfaces**.

**Example:**
`Calculator` implements both `Addition` and `Subtraction`.

---

### Short Definitions

* **Single Inheritance:** A child class inherits from one parent class.
* **Multiple Inheritance:** A class implements multiple interfaces.

---
## Threads in Java

This section demonstrates how to work with threads in Java:

1. **Using `Runnable` Interface**:
   Creates a thread by implementing the `Runnable` interface and defining the `run()` method.

2. **Extending `Thread` Class**:
   Creates a thread by extending the `Thread` class and overriding the `run()` method.

3. **Synchronization**:
   Uses the `synchronized` keyword to ensure thread safety when multiple threads access shared resources (e.g., withdrawing money from an account).

Key Concepts:

* Thread creation and execution
* Ensuring thread safety using synchronization

---
