/*
A LinkedHashSet in Java is a part of the java.util package and is a collection that implements the Set interface. It is similar to a HashSet, but with one key difference: it maintains the insertion order of elements. Internally, it is backed by a combination of a HashMap and a doubly-linked list to achieve this behavior.
Key Features of LinkedHashSet:
No Duplicates:

Like HashSet, a LinkedHashSet does not allow duplicate elements. If you try to add a duplicate, it will ignore it.
Maintains Insertion Order:

Unlike HashSet, which does not guarantee any order, a LinkedHashSet maintains the order in which elements were inserted.
Fast Operations:

Operations like add(), remove(), and contains() are relatively fast, with an average time complexity of O(1).
Allows Null:

A LinkedHashSet allows a single null element.
Backed by HashMap and Linked List:

Internally, it uses a HashMap to store elements and a doubly-linked list to maintain the insertion order.
When to Use LinkedHashSet:
Order Matters:

Use a LinkedHashSet when you need to store unique elements and maintain the order in which they were added.
Avoid Duplicates:

When you want to ensure that no duplicate elements are added to your collection.
Fast Lookups with Order:

When you need fast operations like checking if an element exists (contains()), adding, or removing elements, while preserving insertion order.

Key Takeaway:
Use a LinkedHashSet when you need a collection of unique elements and want to preserve the insertion order.
It is ideal for scenarios where both uniqueness and order are important, such as maintaining a history of visited URLs or processing unique items in the order they were added.

 */
import java.util.LinkedHashSet;
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Date");

        // Display the elements in the LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Check if an element exists
        boolean containsBanana = linkedHashSet.contains("Banana");
        System.out.println("Contains Banana: " + containsBanana);

        // Remove an element
        linkedHashSet.remove("Cherry");
        System.out.println("After removing Cherry: " + linkedHashSet);

        // Iterate through the LinkedHashSet
        System.out.println("Iterating through LinkedHashSet:");
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }
    }
}
