package CollectionsDemo;
/*
 * In Java, an ArrayList is a part of the java.util package and is a resizable array implementation of the List interface. Unlike arrays, which have a fixed size, an ArrayList can dynamically grow or shrink as elements are added or removed.
 Why Use ArrayList?
Dynamic Size:

Unlike arrays, which have a fixed size, an ArrayList can automatically resize itself when elements are added or removed.
Ease of Use:

Provides built-in methods like add(), remove(), get(), and size() for easy manipulation of elements.
Random Access:

Allows fast access to elements using an index, similar to arrays.
Flexibility:

Can store duplicate elements.
Can store null values.
Part of Java Collections Framework:

Integrates seamlessly with other collection classes and utilities.
 
Key Features of ArrayList:
Implements: List, RandomAccess, Cloneable, Serializable.
Default Capacity: Starts with an initial capacity of 10 and grows dynamically.
Order: Maintains the insertion order of elements.
Type-Safe: Can be made type-safe using generics (e.g., ArrayList<String>). 

When to Use ArrayList:
When you need a dynamic array that can grow or shrink.
When you need fast random access to elements.
When you want to maintain the insertion order of elements.
Limitations:
Not Synchronized: ArrayList is not thread-safe. Use Vector or Collections.synchronizedList() for thread safety.
Performance: Slower than arrays for primitive types due to boxing/unboxing overhead. Use ArrayList<Integer> instead of int[] for primitive types.
 */

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Print the ArrayList
        System.out.println("ArrayList: " + list);

        // Access an element from the ArrayList
        String fruit = list.get(1);
        System.out.println("Element at index 1: " + fruit);

        // Remove an element from the ArrayList
        list.remove("Banana");
        System.out.println("ArrayList after removal: " + list);

        // Get the size of the ArrayList
        int size = list.size();
        System.out.println("Size of ArrayList: " + size);
        // Check if the ArrayList contains an element
        boolean containsApple = list.contains("Apple");
        System.out.println("ArrayList contains Apple: " + containsApple);
        // Iterate through the ArrayList
        System.out.println("Iterating through ArrayList:");
        for (String item : list) {
            System.out.println(item);
        }
        // Clear the ArrayList
        list.clear();
        System.out.println("ArrayList after clearing: " + list);
        // Check if the ArrayList is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is ArrayList empty? " + isEmpty);
        // Add elements back to the ArrayList
        list.add("Mango");
        // add elments to specific index
        list.add(0, "Pineapple");
        list.add(1, "Grapes");
        System.out.println("ArrayList after adding elements: " + list);
        // Get the index of an element
        int index = list.indexOf("Mango");
        System.out.println("Index of Mango: " + index);
        // Get the last index of an element
        int lastIndex = list.lastIndexOf("Mango");
        System.out.println("Last index of Mango: " + lastIndex);
        // check if list contains all elements of another list
        ArrayList<String> anotherList = new ArrayList<>();
        anotherList.add("Pineapple");
        anotherList.add("Grapes");
        boolean containsAll = list.containsAll(anotherList);
        System.out.println("ArrayList contains all elements of another list: " + containsAll);
        // Get a sublist from the ArrayList
        ArrayList<String> sublist = new ArrayList<>(list.subList(0, 2));
        System.out.println("Sublist: " + sublist);
        // Convert ArrayList to Array
        String[] array = new String[list.size()];
        list.toArray(array);
        System.out.println("Array from ArrayList: ");
        for (String item : array) {
            System.out.println(item);
        }
        // Sort the ArrayList
        list.sort(String::compareTo);
        System.out.println("Sorted ArrayList: " + list);
        // Reverse the ArrayList
        ArrayList<String> reversedList = new ArrayList<>(list);
        for (int i = 0; i < reversedList.size() / 2; i++) {
            String temp = reversedList.get(i);
            reversedList.set(i, reversedList.get(reversedList.size() - 1 - i));
            reversedList.set(reversedList.size() - 1 - i, temp);
        }
        System.out.println("Reversed ArrayList: " + reversedList);

        // iterate using forEach
        System.out.println("Iterating using forEach:");
        for (String item : list) {
            System.out.println(item);
        }
        // iterate using lambda expression
        System.out.println("Iterating using lambda expression:");
        list.forEach(item -> System.out.println(item));
        // iterate using Iterator
        System.out.println("Iterating using Iterator:");
        java.util.Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
        // iterate using ListIterator
        System.out.println("Iterating using ListIterator:");
        java.util.ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String item = listIterator.next();
            System.out.println(item);
        }
    }
}