# Java Beginner Programs

A collection of simple **Java programs** created while learning the fundamentals of Java programming. This repository contains basic programs covering arithmetic operations, conditionals, loops, methods, recursion, strings, and number-based problems.

## 📚 Programs Included

| #  | Program              | Description                                                               |
| -- | -------------------- | ------------------------------------------------------------------------- |
| 1  | `Cal.java`           | Simple calculator for addition, subtraction, multiplication, and division |
| 2  | `EvenOdd.java`       | Checks whether a number is even or odd                                    |
| 3  | `Factorial.java`     | Calculates the factorial of a number                                      |
| 4  | `Fibonacci.java`     | Calculates the Fibonacci value at a given position using recursion        |
| 5  | `Hello.java`         | Takes two numbers and calculates their sum                                |
| 6  | `PalindromeNum.java` | Checks whether a number is a palindrome                                   |
| 7  | `PalindromeW.java`   | Checks whether a word is a palindrome                                     |
| 8  | `Prime.java`         | Checks whether a number is prime                                          |
| 9  | `Rev.java`           | Reverses a given number                                                   |
| 10 | `SOD.java`           | Calculates the sum of the digits of a number                              |
| 11 | `Table.java`         | Prints the multiplication table of a number                               |
| 12 | `Table2.java`        | Prints a multiplication table using a class method                        |

---

## 📝 Program Details

### 1. Cal.java — Calculator

A basic calculator that performs four arithmetic operations:

* Addition
* Subtraction
* Multiplication
* Division

The program uses separate methods for each operation and allows the user to select an operation.

It also:

* Validates the operation choice.
* Prevents division by zero.
* Uses `DecimalFormat` to display results up to two decimal places.

**Concepts used:**

* Methods
* `switch`
* `while` loop
* `if-else`
* `Scanner`
* `DecimalFormat`
* Input validation

---

### 2. EvenOdd.java — Even or Odd

Takes an integer from the user and determines whether it is **even** or **odd** using the modulo (`%`) operator.

**Concepts used:**

* `Scanner`
* `if-else`
* Modulo operator
* Conditional statements

---

### 3. Factorial.java — Factorial

Calculates the factorial of a given number.

For example:

```text
5! = 5 × 4 × 3 × 2 × 1 = 120
```

The factorial calculation is implemented using a separate `fact()` method and a `for` loop.

**Concepts used:**

* Methods
* `for` loop
* Variables
* User input

---

### 4. Fibonacci.java — Fibonacci

Calculates the Fibonacci value at a given position using a **recursive method**.

The Fibonacci sequence starts with:

```text
0, 1, 1, 2, 3, 5, 8, 13, ...
```

The program uses the following recursive idea:

```text
fib(n) = fib(n-1) + fib(n-2)
```

**Concepts used:**

* Methods
* Recursion
* `if` statements
* User input

---

### 5. Hello.java — Sum of Two Numbers

A simple beginner program that takes two numbers from the user and calculates their sum.

**Concepts used:**

* `Scanner`
* Variables
* Arithmetic operators
* User input
* Output

---

### 6. PalindromeNum.java — Number Palindrome

Checks whether a given number reads the same forwards and backwards.

For example:

```text
121 → 121
```

Therefore, `121` is a palindrome.

The program reverses the number and compares the reversed value with the original number.

**Concepts used:**

* Methods
* `for` loop
* Modulo operator
* Integer division
* Conditional statements

---

### 7. PalindromeW.java — Word Palindrome

Checks whether a given word is a palindrome.

For example:

```text
madam → madam
```

The program reverses the word character by character and compares it with the original word.

**Concepts used:**

* Strings
* `charAt()`
* `length()`
* `for` loop
* `equals()`
* Methods

---

### 8. Prime.java — Prime Number

Checks whether a given number is a prime number.

A prime number is a number greater than `1` that has no divisors other than `1` and itself.

The program checks whether the number is divisible by any number from `2` to `n-1`.

**Concepts used:**

* Methods
* `for` loop
* `boolean`
* Modulo operator
* Conditional statements

---

### 9. Rev.java — Reverse a Number

Takes a number from the user and reverses its digits.

For example:

```text
Input: 12345
Output: 54321
```

The program extracts each digit using the modulo operator and builds the reversed number.

**Concepts used:**

* Methods
* `for` loop
* Modulo operator
* Integer division
* Arithmetic operations

---

### 10. SOD.java — Sum of Digits

SOD stands for **Sum of Digits**.

The program calculates the sum of all digits in a given number.

For example:

```text
Input: 1234

1 + 2 + 3 + 4 = 10
```

**Concepts used:**

* Classes and objects
* Methods
* `for` loop
* Modulo operator
* Integer division

---

### 11. Table.java — Multiplication Table

Takes a number from the user and prints its multiplication table from `1` to `10`.

Example:

```text
Enter number to print the table for:
5

5 X 1 = 5
5 X 2 = 10
5 X 3 = 15
...
5 X 10 = 50
```

**Concepts used:**

* `for` loop
* `Scanner`
* Arithmetic operators
* User input

---

### 12. Table2.java — Multiplication Table Using Method

Similar to `Table.java`, but the table-printing logic is placed inside a separate `print()` method.

An object of the `Table2` class is created and the method is called to print the table.

**Concepts used:**

* Classes
* Objects
* Methods
* `for` loop
* `Scanner`
* Object creation

---

## 🧠 Java Concepts Practiced

These programs cover several fundamental Java concepts:

* Variables and data types
* User input using `Scanner`
* Arithmetic operators
* Modulo operator (`%`)
* `if-else` statements
* `switch` statements
* `for` loops
* `while` loops
* Methods
* Classes and objects
* Recursion
* Strings
* Boolean values
* Basic input validation
* Number manipulation

---

## ▶️ How to Run

### 1. Install Java

Make sure Java is installed on your system.

Check your Java installation using:

```bash
java --version
```

You can also check the Java compiler:

```bash
javac --version
```

### 2. Clone the Repository

```bash
git clone <your-repository-url>
```

### 3. Navigate to the Project

```bash
cd <repository-name>
```

### 4. Compile a Program

For example:

```bash
javac EvenOdd.java
```

### 5. Run the Program

```bash
java EvenOdd
```

The same process can be used for the other programs.

For example:

```bash
javac Factorial.java
java Factorial
```

---

## 📂 Repository Structure

```text
Java-Beginner-Programs/
│
├── Cal.java
├── EvenOdd.java
├── Factorial.java
├── Fibonacci.java
├── Hello.java
├── PalindromeNum.java
├── PalindromeW.java
├── Prime.java
├── Rev.java
├── SOD.java
├── Table.java
├── Table2.java
│
└── README.md
```

---

## 🎯 Purpose

The purpose of this repository is to practice and understand the **basics of Java programming** through small, simple programs.

These programs are part of my learning journey as I explore Java fundamentals and improve my programming and problem-solving skills.

More programs and concepts will be added as I continue learning Java.

---

## 🚀 Learning Journey

This repository represents my **beginner-level Java practice**. The programs start with simple input and arithmetic operations and gradually introduce concepts such as loops, methods, classes, objects, strings, and recursion.

> Learning Java one program at a time. ☕
