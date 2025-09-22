package com.csplusplus;
import java.util.ArrayList;
import java.util.Random;

public class Unit7 {
    // 1. Method that returns the sum of all elements in the ArrayList
    // Instructions: Traverse the ArrayList and calculate the sum of all integers in the list.
    // DO NOT use the Collections class or any additional methods beyond size(), add(), get(), set(), and remove().
    public static int sumOfElements(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    // 2. Method that removes all instances of a specific element from the ArrayList
    // Instructions: Use a loop to remove all instances of the specified element.
    // DO NOT use removeIf(), Collections, or other methods beyond size(), add(), get(), set(), and remove().
    public static void removeAllInstances(ArrayList<Integer> list, int elementToRemove) {
        // Loop backwards to avoid index shifting issues when removing elements
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == elementToRemove) {
                list.remove(i);
            }
        }
    }

    // 3. Method that doubles each element in the ArrayList
    // Instructions: Multiply each element by 2 and update the list in place.
    // DO NOT use Collections or other methods beyond size(), add(), get(), set(), and remove().
    public static void doubleAllElements(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 2);
        }
    }

    // 4. Method that adds a new element to the list only if it is not already present
    // Instructions: Check manually if the element is already present before adding.
    // DO NOT use contains(), Collections, or other methods beyond size(), add(), get(), set(), and remove().
    public static void addIfNotPresent(ArrayList<Integer> list, int newElement) {
        boolean isPresent = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == newElement) {
               isPresent = true;
               break;
            }
        }
        if (!isPresent) {
            list.add(newElement);
        }
    }

    // 5. Method that returns a new ArrayList containing only the even elements from the input list
    // Instructions: Create a new list and manually collect the even elements.
    // DO NOT use streams, Collections, or other methods beyond size(), add(), get(), set(), and remove().
    public static ArrayList<Integer> getEvenElements(ArrayList<Integer> list) {
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                evenList.add(list.get(i));
            }
        }
        return evenList;
    }

    // 6. Method that removes elements divisible by 5
    // Instructions: Use a loop to remove all elements divisible by 5.
    // DO NOT use removeIf(), Collections, or other methods beyond size(), add(), get(), set(), and remove().
    public static void removeElementsDivisibleBy5(ArrayList<Integer> list) {
        // Loop backwards to avoid index shifting issues when removing elements
        for (int i = list.size() - 1; i >= 0; i--) {
            if(list.get(i) % 5 == 0) {
                list.remove(i);
            }
        }
    }

    // 7. Method that reverses the list without using the Collections class
    // Instructions: Reverse the order of the elements by swapping them manually.
    // DO NOT use Collections or other methods beyond size(), add(), get(), set(), and remove().
    public static void reverseList(ArrayList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;
        
        while (left < right) {
            // Swap elements at left and right positions
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            
            left++;
            right--;
        }
    }

    // 8. Method that shuffles the elements of the list
    // Instructions: Shuffle the elements randomly by swapping them manually.
    // DO NOT use the Collections.shuffle() or other methods beyond size(), add(), get(), set(), and remove().
    public static <T> void shuffleList(ArrayList<T> list) {
        for (int i = list.size() - 1; i > 0; i--) {
           
            int j = (int)(Math.random() * (i + 1));

           
            T temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }
    
    // Test method to demonstrate the functionality
    public static void main(String[] args) {
        // Test sumOfElements
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);
        
        System.out.println("Original list: " + testList);
        System.out.println("Sum: " + sumOfElements(testList));
        
        // Test doubleAllElements
        doubleAllElements(testList);
        System.out.println("After doubling: " + testList);
        
        // Test reverseList
        reverseList(testList);
        System.out.println("After reversing: " + testList);
        
        // Test removeElementsDivisibleBy5
        removeElementsDivisibleBy5(testList);
        System.out.println("After removing divisible by 5: " + testList);
        
        // Test getEvenElements
        ArrayList<Integer> evenElements = getEvenElements(testList);
        System.out.println("Even elements: " + evenElements);
        
        // Test addIfNotPresent
        addIfNotPresent(testList, 6);
        addIfNotPresent(testList, 6); // Should not add duplicate
        System.out.println("After adding 6 (if not present): " + testList);
        
        // Test removeAllInstances
        testList.add(6); // Add another 6
        System.out.println("Before removing all 6s: " + testList);
        removeAllInstances(testList, 6);
        System.out.println("After removing all 6s: " + testList);
        
        // Test shuffleList
        ArrayList<Integer> shuffleTest = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            shuffleTest.add(i);
        }
        System.out.println("Before shuffle: " + shuffleTest);
        shuffleList(shuffleTest);
        System.out.println("After shuffle: " + shuffleTest);
    }
}