/*
 * ⚠️ FULLY AI-GENERATED FILE ⚠️
 *
 * This entire file was generated using AI as part of my Java learning process.
 *
 * It is included for:
 * - Understanding how Java code is structured
 * - Learning how logic and syntax work in practice
 * - Comparing future improvements against generated examples
 *
 * This file may be replaced or rewritten later with my own implementation.
 */

package Month_1;

import java.util.ArrayList;

public class ArrayExamples {
    public static void main(String[] args) {
        
        // ---------------------------------------------------------
        // Example 1: Simple String array (list of names)
        // ---------------------------------------------------------
        String[] names = {"Alice", "Bob", "Charlie"};
        
        // Get individual items using their position (index)
        System.out.println("First name: " + names[0]);  // prints "Alice"
        System.out.println("Second name: " + names[1]); // prints "Bob"
        System.out.println("Third name: " + names[2]);  // prints "Charlie"
        
        // ---------------------------------------------------------
        // Example 2: Simple int array (list of numbers)
        // ---------------------------------------------------------
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("First number: " + numbers[0]);  // prints 10
        System.out.println("Third number: " + numbers[2]);  // prints 30
        
        // ---------------------------------------------------------
        // Example 3: Loop through an array
        // ---------------------------------------------------------
        String[] fruits = {"Apple", "Banana", "Cherry"};
        
        // Print each fruit using a for loop
        // 
        // for (int i = 0; i < fruits.length; i++) {
        //      ^       ^    ^              ^
        //      |       |    |              |
        //      |       |    |              +-- i++: add 1 to i each time (i = i + 1)
        //      |       |    +-- fruits.length: keep going while i is less than 3
        //      |       +-- i < fruits.length: the condition to check each time
        //      +-- int i = 0: start i at 0 (first position in array)
        //
        // The loop runs like this:
        //   i=0: print fruits[0] -> "Apple"
        //   i=1: print fruits[1] -> "Banana"
        //   i=2: print fruits[2] -> "Cherry"
        //   i=3: stop! (3 is not less than 3)
        //
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit #" + i + " is " + fruits[i]);
        }
        
        // ---------------------------------------------------------
        // Example 4: 2D array (like a table)
        // ---------------------------------------------------------
        // This is a grid with 2 rows and 3 columns
        String[][] grid = {
            {"A", "B", "C"},  // row 0
            {"D", "E", "F"}   // row 1
        };
        
        System.out.println("Top left: " + grid[0][0]);  // prints "A"
        System.out.println("Bottom right: " + grid[1][2]); // prints "F"
        
        // ---------------------------------------------------------
        // Example 5: ArrayList (dynamic list with no size limit)
        // ---------------------------------------------------------
        // Unlike regular arrays, ArrayList can grow as you add items
        // Great when you don't know how many items you'll have
        ArrayList<String> todoList = new ArrayList<String>();
        
        // Add items one by one
        todoList.add("Buy groceries");  // adds to the list
        todoList.add("Walk the dog");
        todoList.add("Finish homework");
        
        // Loop through and print
        System.out.println("\nMy Todo List:");
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println((i + 1) + ". " + todoList.get(i));
        }
        
        // Remove an item
        todoList.remove(0);  // removes first item ("Buy groceries")
        
        // Print again after removing
        System.out.println("\nAfter removing first item:");
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println((i + 1) + ". " + todoList.get(i));
        }
        
    }
}