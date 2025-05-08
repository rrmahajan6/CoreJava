/*
 * A LinkedHashMap in Java is a part of the java.util package and is a collection that implements the Map interface. It is similar to a HashMap, but with one key difference: it maintains the insertion order of its key-value pairs. Internally, it is backed by a combination of a HashMap and a doubly-linked list to achieve this behavior.
Key Features of LinkedHashMap:
Maintains Insertion Order:

Unlike HashMap, which does not guarantee any order, a LinkedHashMap maintains the order in which key-value pairs were added.
Key-Value Pairs:

Each entry in a LinkedHashMap consists of a key and a value.
Keys must be unique, but values can be duplicated.
Fast Operations:

Operations like put(), get(), remove(), and containsKey() have an average time complexity of O(1) due to hashing.
Allows Null:

A LinkedHashMap allows one null key and multiple null values.
Access Order (Optional):

By default, it maintains insertion order.
It can also be configured to maintain access order (i.e., the order in which keys are accessed) by passing true to the constructor.
Non-Synchronized:

Like HashMap, LinkedHashMap is not thread-safe. Use Collections.synchronizedMap() for thread-safe operations.

When to Use LinkedHashMap:
Order Matters:

Use a LinkedHashMap when you need to maintain the insertion order of key-value pairs.
Fast Lookups with Order:


When you need fast operations like checking if a key exists, adding, or removing elements, while preserving insertion or access order.
Cache Implementation:

It is ideal for implementing LRU (Least Recently Used) caches by enabling access order.
 
Key Takeaway:
Use a LinkedHashMap when you need a collection of key-value pairs that maintains insertion order or access order.
It is ideal for scenarios like caching, maintaining a history of operations, or when the order of elements is important.

*/

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashmap {
    // LinkedHashMap is a part of the Java Collections Framework and is used to
    // store key-value pairs in a hash table, while maintaining the insertion order.
    // It is similar to HashMap but with predictable iteration order.

    // Example of using LinkedHashMap
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Adding key-value pairs
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);

        // Iterating through the LinkedHashMap
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        // Accessing a value by key
        int value = linkedHashMap.get("Two");
        System.out.println("Value for key 'Two': " + value);
        // Checking if a key exists
        boolean containsKey = linkedHashMap.containsKey("Three");
        System.out.println("Contains key 'Three': " + containsKey);
        // Checking if a value exists
        boolean containsValue = linkedHashMap.containsValue(2);
        System.out.println("Contains value 2: " + containsValue);
        // Removing a key-value pair
        linkedHashMap.remove("One");
        System.out.println("After removing key 'One': " + linkedHashMap);
        // Getting the size of the LinkedHashMap
        int size = linkedHashMap.size();
        System.out.println("Size of LinkedHashMap: " + size);
        // Clearing the LinkedHashMap
        linkedHashMap.clear();
        System.out.println("After clearing, size of LinkedHashMap: " + linkedHashMap.size());
        // Checking if the LinkedHashMap is empty
        boolean isEmpty = linkedHashMap.isEmpty();
        System.out.println("Is LinkedHashMap empty? " + isEmpty);
        // Adding elements again
        linkedHashMap.put("Four", 4);
        linkedHashMap.put("Five", 5);

        Set<Map.Entry<String, Integer>> entries = linkedHashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        Set<String> keys = linkedHashMap.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key);
        }
        Collection<Integer> values = linkedHashMap.values();
        for (Integer s : values) {
            System.out.println("Value: " + s);
        }
        // adding duplicate key
        linkedHashMap.put("Four", 6);
        System.out.println("After adding duplicate key 'Four': " + linkedHashMap);
    }
}
