/*
 * 
 * Think of a standard array in Java (int[] arr) like a fixed-size egg carton. If you buy a carton for 6 eggs, you can't put a 7th egg in it; you'd need a new, larger carton.

An ArrayList is like a magical, expandable folder You can add as many pages (elements) as you want, and it automatically grows to make space. It gives you the power of arrays (fast access to any item) without the limitation of a fixed size.

An ArrayList is a resizable array that is part of the Java Collections Framework. It implements the List interface.
 * 
 */

import java.util.ArrayList;


public class array_list {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(23);
        numbers.add(25); // Adds 25 at index 1
        numbers.add(30);
        System.out.println("the list is "+numbers);

    }
    
}
