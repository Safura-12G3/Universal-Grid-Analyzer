Universal Grid Analyzer
---
Name: Safura Saif
-- Class: 12G3 - F3

---
**Project Overview**

The Universal Grid Analyzer is a Java program that works with 2D arrays to perform multiple algorithms on a grid of data.

The program is designed to be flexible, meaning it can handle **any grid size (6×6 or larger)** and is not limited to a specific type of data.

Users interact with the system through a **menu-driven interface**, allowing them to choose different operations to analyze the grid.

---
**Features & Algorithms**

1. Display Grid
- Prints the grid in a clear row-by-row format.

2. Row & Column Sums
- Calculates the sum of each row and each column.

3. Maximum & Minimum
- Finds the largest and smallest values along with their positions.

4. Frequency Check
- Counts how many times a value appears
- Counts how many values are greater than a threshold

5. Pattern Detection
- Checks if any row is strictly increasing.

6. Grid Transformations
- Rotate a row to the right
- Swap two rows
- Reverse a column

7. Subgrid Processing
- Finds the **sum and maximum value** in a selected subgrid.

8. Boundary & Diagonals
Displays:
- Boundary elements
- Main diagonal
- Secondary diagonal

9. Validation
- Checks if any row contains duplicate values.

10. Menu System
- Allows the user to navigate and run all features easily.

---
**Challenges Faced**

- Fixing several errors in pattern detection
- Debugging loops and conditions
- Making sure the program works for any grid size
- Handling user input correctly for subgrid ranges
- Ensuring all menu options run smoothly without crashing

---
**How to Run**

```
cd ~/Desktop/"mini project"
javac UniversalGridAnalyzer.java
java UniversalGridAnalyzer
```

**Installed Extensions**
- Debugger for Java
- Java Extension Pack
- Java Platform Extension for Visual Studio Code
- Language support for Java for Visual Studio Code

---
**What I Learned**

- How to use 2D arrays
- Writing code using methods
- Debugging errors
- Designing a menu-driven system
- Improving code readability with comments and structure

---

**Sample Input**

Enter rows: 6
Enter cols: 6

Enter Values: 
1 2 3 4 5 6

7 8 9 10 11 12

13 14 15 16 17 18

19 20 21 22 23 24

25 26 27 28 29 30

31 32 33 34 35 36

---
**Sample Outputs**

Row sums:
21 57 93 129 165 201
Column sums:
96 102 108 114 120 126
Row with highest sum: 5 (Sum: 201)
Column with lowest sum: 0 (Sum: 96)

Max: 36 at (5,5)
Min: 1 at (0,0)

Occurrences of 10: 1
Values > 15:21

Row 0 is strictly increasing.

Subgrid sum: 144
Subgrid max: 23

Any row has duplicates: false

---

**Final Notes**

This project demonstrates strong use of logic, structure, and problem-solving using Java.

All algorithms were implemented using only 2D arrays and nested loops, as required.

