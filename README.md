[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/a2ltKfo0)
# Unit 7 - Working with ArrayLists in Java

## Overview
In this unit, students will learn about working with `ArrayLists`, a dynamic data structure in Java. Students will practice performing various operations such as adding, removing, and modifying elements, as well as reversing, shuffling, and filtering elements from an `ArrayList`. This unit will help students understand how to manually manipulate an `ArrayList` without using advanced libraries or utilities like `Collections`.

## Learning Objectives
- Understand how to declare and manipulate an `ArrayList` in Java.
- Perform operations such as adding, removing, and modifying elements.
- Manually reverse, shuffle, and filter elements in an `ArrayList`.
- Implement logic using only core `ArrayList` methods: `size()`, `add()`, `get()`, `set()`, and `remove()`.

## Key Concepts
- **ArrayList**: A dynamic, resizable array used to store objects of the same type.
- **Autoboxing and Unboxing**: The automatic conversion between primitive types and their wrapper classes (e.g., `int` to `Integer`).
- **Indexing**: Accessing elements using an index, with the first element at index `0`.
- **Modifying Lists**: Using methods like `add()`, `get()`, `set()`, and `remove()` to manipulate the contents of an `ArrayList`.

## Instructions for Students
1. You are required to implement the methods provided in `Unit7.java`.
2. **DO NOT** use the `Collections` class or methods like `contains()`, `removeIf()`, `shuffle()`, or `sort()`. You are limited to using only the following `ArrayList` methods:
   - `size()`
   - `add()`
   - `get()`
   - `set()`
   - `remove()`
3. Write your own logic for reversing, shuffling, and modifying the `ArrayList`.

## Assignment
Complete the following methods in `Unit7.java`:
1. **sumOfElements**: Calculate and return the sum of all elements in the `ArrayList`.
2. **removeAllInstances**: Remove all instances of a specific element from the `ArrayList`.
3. **doubleAllElements**: Double the value of each element in the `ArrayList`.
4. **addIfNotPresent**: Add an element to the `ArrayList` only if it is not already present.
5. **getEvenElements**: Return a new `ArrayList` containing only the even elements from the input list.
6. **removeElementsDivisibleBy5**: Remove all elements that are divisible by 5 from the `ArrayList`.
7. **reverseList**: Reverse the order of elements in the `ArrayList` without using the `Collections` class.
8. **shuffleList**: Shuffle the order of elements in the `ArrayList` manually, without using `Collections.shuffle()`.

## JUnit Tests Description and Points

1. **Test Sum of Elements (10 points)**  
   Verifies that the method correctly calculates the sum of all elements in an `ArrayList`.

2. **Test Remove All Instances (10 points)**  
   Ensures that all instances of a specified element are removed from the `ArrayList`.

3. **Test Double All Elements (10 points)**  
   Checks that all elements in the `ArrayList` are correctly doubled.

4. **Test Add If Not Present (10 points)**  
   Verifies that an element is added to the `ArrayList` only if it is not already present.

5. **Test Get Even Elements (10 points)**  
   Confirms that only even elements are returned in a new `ArrayList`.

6. **Test Remove Elements Divisible by 5 (15 points)**  
   Ensures that all elements divisible by 5 are removed from the `ArrayList`.

7. **Test Reverse List (15 points)**  
   Verifies that the `ArrayList` is correctly reversed.

8. **Test Shuffle List (20 points)**  
   Tests that the `ArrayList` is shuffled in a random order and that the original elements are retained.

## Getting Started
1. Clone the repository containing the Unit 7 project.
2. Open the project in your preferred IDE (such as IntelliJ IDEA or Eclipse).
3. Navigate to `Unit7.java` and implement the required methods.
4. Run the JUnit tests in `Unit7Test.java` to verify your implementations.
5. Ensure all tests pass before submitting your code.

## Submission
Submit your completed `Unit7.java` file through the course's designated submission platform by the due date. Ensure that all tests pass and your code adheres to the style guidelines provided in class.

## Resources
- [Java Documentation](https://docs.oracle.com/javase/8/docs/api/)
- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
- [Java ArrayList Tutorial](https://docs.oracle.com/javase/tutorial/collections/interfaces/list.html)

## Support
If you encounter any issues or have questions about the assignment, please reach out during office hours or post in the course discussion forum.

For additional assistance, contact: **Kevin** at [kevin@csplusplus.com](mailto:kevin@csplusplus.com).

---

**Unit 7 - Working with ArrayLists in Java** is part of the AP Computer Science A course, aimed at building a strong foundation in data structures and list manipulation.

---