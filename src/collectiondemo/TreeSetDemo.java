package collectiondemo;
/*
 * A TreeSet in Java is a part of the java.util package and is a collection that implements the Set interface. It is backed by a TreeMap and stores elements in sorted order (natural order or a custom comparator). It is a NavigableSet, meaning it provides methods to navigate through the elements in a sorted manner.
 * Key Features of TreeSet:
Sorted Order:

Elements are stored in ascending order by default.
You can provide a custom comparator to define a custom sorting order.
No Duplicates:

Like other Set implementations, TreeSet does not allow duplicate elements.
NavigableSet:

Provides methods like higher(), lower(), ceiling(), and floor() to navigate through the elements.
Performance:

Operations like add(), remove(), and contains() have a time complexity of O(log n) because it uses a balanced tree structure.
Null Handling:

A TreeSet does not allow null elements. Attempting to add null will throw a NullPointerException.
Backed by TreeMap:

Internally, a TreeSet uses a TreeMap to store its elements.
 
When to Use TreeSet:
Sorted Collection:

Use a TreeSet when you need to store elements in a sorted order.
Unique Elements:

When you want to ensure that no duplicate elements are added to your collection.
Range Queries:

When you need to perform range-based operations, such as finding elements greater than or less than a specific value.

Key Takeaway:
Use a TreeSet when you need a collection of unique elements that are automatically sorted.
It is ideal for scenarios like maintaining a sorted list of items, range queries, or when you need to navigate through elements in a sorted manner.
*/


import java.util.TreeSet;
public class TreeSetDemo {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");

        // Display the elements in the TreeSet
        System.out.println("TreeSet elements: " + treeSet);

        // Check if an element exists
        boolean containsApple = treeSet.contains("Apple");
        System.out.println("Contains Apple: " + containsApple);

        // Remove an element
        treeSet.remove("Banana");
        System.out.println("After removing Banana: " + treeSet);
    }
}
