Sure! Here's a **Java mini-project-style task** that covers **Arrays & Strings**, including:

* 1D & 2D Arrays
* String, StringBuilder
* Common String & Array methods
* Iteration

---

## ✅ **🧪 Task: Student Gradebook System**

### 🎯 **Objective**:

Create a program that stores the marks of students in a 2D array and performs string-based analysis on student names.

---

### 🧾 **Requirements**:

1. **Input**:

   * Ask the user for the number of students.
   * For each student:

     * Input the **name** (`String`)
     * Input marks for 3 subjects (store in a **2D array**)

2. **Process**:

   * Calculate the **average marks** for each student.
   * Identify the **top scorer**.
   * Use `String` methods to:

     * Find students whose names contain a specific character (e.g., 'a')
     * Convert all names to uppercase

3. **Output**:

   * Display student names and their average marks
   * Highlight the top scorer
   * Print names that contain 'a' and their index using `indexOf()`
   * Print all names in uppercase using `toUpperCase()`

---

### 🧪 **Extra Challenge (Optional)**:

* Use `StringBuilder` to build and display a custom message:

  > "Student \[NAME] scored an average of \[AVG]"

---

### 🔁 Example Input:

```
Enter number of students: 2

Enter name of student 1: Alice
Enter 3 marks: 90 85 92

Enter name of student 2: Bob
Enter 3 marks: 78 88 84
```

---

### ✅ Example Output:

```
Student Alice - Average: 89.0
Student Bob - Average: 83.33
Top Scorer: Alice
Students with 'a' in name: Alice (index 0)
Names in uppercase: ALICE, BOB
```

---

Would you like me to provide the full working code for this task in Java?
