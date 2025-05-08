import java.util.HashSet;
import java.util.Iterator;
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
    }
}
