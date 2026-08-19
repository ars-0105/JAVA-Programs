# 🎓 Student Grade Management System – V2

A **Java-based Student Grade Management System** that allows users to create and manage student databases through a console-based menu.

This is **Version 2** of my Student Grade Management System. The project builds upon the features of the first version and introduces **input validation, search functionality, class statistics, exception handling, and file handling/data persistence**.

The project uses **Java, ArrayList, File Handling, BufferedReader, BufferedWriter, Scanner, Comparator, and Exception Handling**.

---

## ✨ Features

### 📁 Database Management

* 🆕 **Create New Database**
  * Create a new student database as a `.txt` file.
  * Prevents creating a database with a name that already exists.

* 📂 **Load Existing Database**
  * Displays all available `.txt` databases.
  * Allows the user to select a database from the list.
  * Loads all student records from the selected file into an `ArrayList`.

* 💾 **Automatic Data Persistence**
  * Student records are saved to the database file after adding, removing, or updating students.
  * Data remains available even after closing and reopening the program.

---

### ➕ Add Student

* Add a student using:
  * Student ID
  * Student Name
  * Marks
* Prevents duplicate Student IDs.
* Validates student names.
* Validates marks between `0` and `100`.

---

### 🗑️ Remove Student

* Remove a student using their unique Student ID.
* Displays the student's details before removal.
* Shows a confirmation message after successful removal.

---

### 🔍 Search Student

* Search for a student using their Student ID.
* Displays:
  * Student ID
  * Name
  * Marks
  * Grade

---

### 👀 View All Students

* Displays all students in a formatted table.
* Shows:
  * Student ID
  * Name
  * Marks
  * Grade

---

### ✏️ Update Marks

* Update the marks of an existing student using their Student ID.
* Validates the new marks between `0` and `100`.
* The student's grade automatically changes according to the updated marks.
* Changes are automatically saved to the database.

---

### 📊 Class Statistics

The system provides basic statistics for the loaded database:

* Total number of students
* Number of passed students
* Number of failed students
* Average marks
* Highest marks
* Lowest marks

The average marks are displayed up to **2 decimal places**.

---

### 🎓 Automatic Grade Assignment

Grades are assigned according to the student's marks:

| Marks | Grade |
|-------|-------|
| 90–100 | A (PASS) |
| 80–89 | B (PASS) |
| 70–79 | C (PASS) |
| 60–69 | D (PASS) |
| Below 60 | F (FAIL) |

---

### 🔤 Automatic Sorting

Students are automatically sorted in **ascending order by Student ID** after adding a student.

---

### 🛡️ Input Validation & Exception Handling

The program handles invalid user input using:

* `InputMismatchException`
* Validation for Student IDs
* Validation for Student Names
* Validation for Marks
* Validation for Menu Choices
* Duplicate Student ID checking
* Invalid database selection handling

This prevents the program from crashing because of common invalid inputs.

---

## 🚀 Upgrades from Version 1

Version 2 introduces several major improvements over the first version.

| Upgrade | Status |
|---------|--------|
| ✅ Input Validation | **Completed** |
| ✅ Search Student | **Completed** |
| ✅ Class Statistics | **Completed** |
| ✅ Exception Handling | **Completed** |
| ✅ File Handling / Data Persistence | **Completed** |

### 🆕 What was added in V2?

**1. Input Validation**  
The program now validates user input such as IDs, names, marks, and menu choices.

**2. Search Student**  
Students can now be searched using their Student ID.

**3. Class Statistics**  
The system now calculates total students, passed students, failed students, average marks, highest marks, and lowest marks.

**4. Exception Handling**  
`InputMismatchException` and input validation are used to handle invalid user input without crashing the program.

**5. File Handling / Data Persistence**  
Student databases can now be created, loaded, read, and updated using `.txt` files. Changes are automatically saved so that student records persist after the program is closed.

---

## 🛠️ Technologies Used

* **Java**
* **ArrayList**
* **Scanner**
* **Comparator**
* **Lambda Expressions**
* **File Handling**
* **FileReader**
* **FileWriter**
* **BufferedReader**
* **BufferedWriter**
* **Exception Handling**
* **InputMismatchException**
* **Object-Oriented Programming (OOP)**

---

## 📁 Project Structure

```text
Student-Grade-Management-System/
│
├── SGMS_V2.java
├── Database/
│   └── *.txt
└── README.md
