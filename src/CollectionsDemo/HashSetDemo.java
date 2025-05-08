package CollectionsDemo;
/*
 * 
 * A HashSet in Java is a part of the java.util package and is a collection that implements the Set interface. It is backed by a HashMap and is used to store unique elements in an unordered manner.

Key Features of HashSet:
No Duplicates:

A HashSet does not allow duplicate elements. If you try to add a duplicate, it will simply ignore it.
Unordered:

The elements in a HashSet are not stored in any particular order. The order may change over time.
Fast Operations:

Operations like add(), remove(), and contains() are very fast (average time complexity is O(1)) because they are based on hashing.
Allows Null:

A HashSet allows a single null element.
Backed by HashMap:

Internally, a HashSet uses a HashMap to store its elements as keys.
When to Use HashSet:
Unique Elements:

Use a HashSet when you need to store a collection of unique elements and don't care about the order.
Fast Lookups:

When you need fast operations like checking if an element exists (contains()), adding, or removing elements.
Avoid Duplicates:

When you want to ensure that no duplicate elements are added to your collection.
Example Usage:
Key Takeaway:
Use a HashSet when you need a collection of unique elements with fast operations and don't care about the order of elements.
It is ideal for scenarios like filtering duplicates, fast lookups, and maintaining a set of distinct items.
 */


import java.util.HashSet;
import java.util.ArrayList;

public class HashSetDemo {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // Display the HashSet
        System.out.println("HashSet: " + hashSet);

        // Check if an element exists
        if (hashSet.contains("Banana")) {
            System.out.println("HashSet contains Banana.");
        } else {
            System.out.println("HashSet does not contain Banana.");
        }

        // Remove an element
        hashSet.remove("Apple");
        System.out.println("After removing Apple: " + hashSet);

        // Iterate through the HashSet
        System.out.println("Iterating through the HashSet:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }
        // Check the size of the HashSet
        int size = hashSet.size();
        System.out.println("Size of HashSet: " + size);
        // Check if the HashSet is empty
        boolean isEmpty = hashSet.isEmpty();
        System.out.println("Is HashSet empty? " + isEmpty);
        // Clear the HashSet
        hashSet.clear();
        System.out.println("HashSet after clearing: " + hashSet);
        // Check if the HashSet is empty after clearing
        boolean isEmptyAfterClear = hashSet.isEmpty();
        System.out.println("Is HashSet empty after clearing? " + isEmptyAfterClear);
        // Add elements back to the HashSet
        hashSet.add("Mango");
        hashSet.add("Grapes");
        System.out.println("HashSet after adding new elements: " + hashSet);
        //remove duplicates from a list
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");
        HashSet<String> uniqueElements = new HashSet<>(list);
        System.out.println("Unique elements from the list: " + uniqueElements);
        // Check if the HashSet contains all elements of another collection
    }
}
