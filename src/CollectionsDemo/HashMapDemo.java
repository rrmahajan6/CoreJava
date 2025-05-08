package CollectionsDemo;
/*
 * A HashMap in Java is a part of the java.util package and is a collection that implements the Map interface. It is used to store key-value pairs, where each key is unique, and each key maps to exactly one value. Internally, it uses a hashing mechanism to store and retrieve elements efficiently.
 * Key Features of HashMap:
Key-Value Pairs:

Each entry in a HashMap consists of a key and a value.
Keys must be unique, but values can be duplicated.
No Order:

The elements in a HashMap are not stored in any particular order. The order may change over time.
Allows Null:

A HashMap allows one null key and multiple null values.
Fast Operations:

Operations like put(), get(), remove(), and containsKey() have an average time complexity of O(1) due to hashing.
Non-Synchronized:

HashMap is not thread-safe. For thread-safe operations, use Collections.synchronizedMap() or ConcurrentHashMap.

When to Use HashMap:
Key-Based Access:

Use a HashMap when you need to store and retrieve data based on unique keys.
Fast Lookups:

When you need fast operations like checking if a key exists, adding, or removing elements.
Unordered Data:

When the order of elements is not important.

Key Methods in HashMap:
put(K key, V value): Adds a key-value pair to the map.
get(Object key): Retrieves the value associated with the specified key.
remove(Object key): Removes the key-value pair for the specified key.
containsKey(Object key): Checks if the map contains the specified key.
containsValue(Object value): Checks if the map contains the specified value.
keySet(): Returns a set of all keys in the map.
values(): Returns a collection of all values in the map.
entrySet(): Returns a set of all key-value pairs in the map.
 * 
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Orange", 3);

        // Display the HashMap
        System.out.println("HashMap: " + hashMap);

        // Check if a key exists
        if (hashMap.containsKey("Banana")) {
            System.out.println("HashMap contains Banana.");
        } else {
            System.out.println("HashMap does not contain Banana.");
        }

        // Remove a key-value pair
        hashMap.remove("Apple");
        System.out.println("After removing Apple: " + hashMap);

        // Iterate through the HashMap
        System.out.println("Iterating through the HashMap:");
        for (String key : hashMap.keySet()) {
            System.out.println(key + ": " + hashMap.get(key));
        }

        // Check the size of the HashMap
        int size = hashMap.size();
        System.out.println("Size of HashMap: " + size);

        // Check if the HashMap is empty
        boolean isEmpty = hashMap.isEmpty();
        System.out.println("Is HashMap empty? " + isEmpty);

        // Clear the HashMap
        hashMap.clear();
        System.out.println("HashMap after clearing: " + hashMap);

        // Check if the HashMap is empty after clearing
        boolean isEmptyAfterClear = hashMap.isEmpty();
        System.out.println("Is HashMap empty after clearing? " + isEmptyAfterClear);

        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Orange", 3);
        System.out.println("HashMap after adding new elements: " + hashMap);
        // Get the value associated with a key
        int value = hashMap.get("Banana");
        System.out.println("Value associated with Banana: " + value);
        // Check if the HashMap contains a value
        boolean containsValue = hashMap.containsValue(2);
        System.out.println("HashMap contains value 2: " + containsValue);
        // Get all keys
        System.out.println("Keys in HashMap: " + hashMap.keySet());
        // Get all values
        System.out.println("Values in HashMap: " + hashMap.values());
        // Get all key-value pairs
        System.out.println("Key-Value pairs in HashMap: " + hashMap.entrySet());

        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        Set<String> keys = hashMap.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key);
        }
        Collection<Integer> values = hashMap.values();
        for (Integer s : values) {
            System.out.println("Value: " + s);
        }
    }
}
