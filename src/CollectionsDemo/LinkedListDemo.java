package CollectionsDemo;

/*
 * A LinkedList in Java is a part of the java.util package and is a doubly-linked list implementation of the List and Deque interfaces. It is a linear data structure where each element (node) contains a reference to the next and previous nodes, making it efficient for certain operations like insertion and deletion.

Key Features of LinkedList:
Implements: List, Deque, Queue, Cloneable, Serializable.
Dynamic Size: Like ArrayList, it can grow or shrink dynamically.
Node-Based Structure: Each element (node) contains:
The data.
A reference to the next node.
A reference to the previous node (in the case of a doubly-linked list).
Order: Maintains the insertion order of elements.

When to Use LinkedList:
When you need frequent insertions or deletions in the middle of the list.
When you don't need fast random access to elements.

Key Takeaway:
Use ArrayList when you need fast random access and fewer insertions/deletions.
Use LinkedList when you need frequent insertions/deletions and don't require random access.

 */
import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Node1");
        linkedList.add("Node2");
        linkedList.add("Node3");

        // Print the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Access an element from the LinkedList
        String node = linkedList.get(1);
        System.out.println("Element at index 1: " + node);

        // Remove an element from the LinkedList
        linkedList.remove("Node2");
        System.out.println("LinkedList after removal: " + linkedList);

        // Get the size of the LinkedList
        int size = linkedList.size();
        System.out.println("Size of LinkedList: " + size);
        // Check if the LinkedList contains an element
        boolean containsNode1 = linkedList.contains("Node1");
        System.out.println("LinkedList contains Node1: " + containsNode1);
        // get first and last elements
        String firstElement = linkedList.getFirst();
        String lastElement = linkedList.getLast();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
        // set element at index
        linkedList.set(0, "UpdatedNode1");
        System.out.println("LinkedList after updating first element: " + linkedList);
        // Iterate through the LinkedList
        System.out.println("Iterating through LinkedList:");
        for (String item : linkedList) {
            System.out.println(item);
        }
        // Clear the LinkedList
        linkedList.clear();
        System.out.println("LinkedList after clearing: " + linkedList);
        // Check if the LinkedList is empty
        boolean isEmpty = linkedList.isEmpty();
        System.out.println("Is LinkedList empty? " + isEmpty);
        // Add elements back to the LinkedList
        linkedList.add("NodeA");
        linkedList.add("NodeB");
        // add elements to specific index
        linkedList.add(0, "NodeC");
        // add null value
        linkedList.add(null);
        // add other data types
        // linkedList.add(111);compile time error
        // linkedList.add(1.11);compile time error
        // linkedList.add(true);compile time error
        // iterate using iterator
        System.out.println("Iterating through LinkedList using iterator:");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
        // Iterate using list iterator
        System.out.println("Iterating through LinkedList using list iterator:");
        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            String item = listIterator.next();
            System.out.println(item);
        }
        // Iterate using forEach
        System.out.println("Iterating through LinkedList using forEach:");
        for (String string : linkedList) {
            System.out.println(string);
        }
        // Iterate using lambda expression
        System.out.println("Iterating through LinkedList using lambda expression:");
        linkedList.forEach(item -> {
            System.out.println(item);
        });
    }
}
