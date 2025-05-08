package CollectionsDemo;
import java.util.*;

/**
 * This program demonstrates the use of a Queue in Java.
 * It shows how to create a queue, add elements, remove elements,
 * and peek at the front element of the queue.
 * A Queue in Java is a First In, First Out (FIFO) data structure, meaning the
 * first element added to the queue is the first one to be removed. It is part
 * of the java.util package and is implemented through various classes like
 * LinkedList, PriorityQueue, and ArrayDeque.
 * 
 * Key Features of Queue:
 * FIFO Behavior:
 * 
 * Elements are added at the rear and removed from the front.
 * The first element added is the first to be removed.
 * Common Methods:
 * 
 * add(E e): Adds an element to the queue (throws an exception if the queue is
 * full).
 * offer(E e): Adds an element to the queue (returns false if the queue is
 * full).
 * remove(): Removes and returns the front element (throws an exception if the
 * queue is empty).
 * poll(): Removes and returns the front element (returns null if the queue is
 * empty).
 * peek(): Returns the front element without removing it (returns null if the
 * queue is empty).
 * element(): Returns the front element without removing it (throws an exception
 * if the queue is empty).
 * Implementations:
 * 
 * LinkedList: Implements a queue as a doubly-linked list.
 * PriorityQueue: Implements a priority-based queue where elements are ordered
 * based on their natural order or a custom comparator.
 * ArrayDeque: Implements a double-ended queue (Deque) for efficient insertion
 * and removal at both ends.
 * When to Use a Queue:
 * Task Scheduling:
 * 
 * Used in scenarios like job scheduling, where tasks are processed in the order
 * they arrive.
 * Breadth-First Search (BFS):
 * 
 * Used in graph and tree traversal algorithms.
 * Producer-Consumer Problems:
 * 
 * Used in multithreading to manage tasks between producer and consumer threads.
 * Order Processing:
 * 
 * Useful in scenarios like ticket booking systems or customer service queues.
 * 
 * Key Takeaway:
 * Use a Queue when you need FIFO behavior.
 * It is ideal for scenarios like task scheduling, BFS traversal, and order
 * processing.
 */
public class QueueDemo {
    public static void main(String[] args) {
        // Create a queue
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");

        // Display the queue
        System.out.println("Queue: " + queue);
        // Access the front element of the queue
        String front = queue.peek();
        System.out.println("Front Element: " + front);

        // Access the size of the queue
        int size = queue.size();
        System.out.println("Size of Queue: " + size);
        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the Queue empty? " + isEmpty);
        // Check if the queue contains an element
        boolean containsElement = queue.contains("Element 2");
        System.out.println("Does the Queue contain 'Element 2'? " + containsElement);
        // Iterate through the queue
        System.out.println("Iterating through Queue:");
        for (String element : queue) {
            System.out.println(element);
        }
        // Clear the queue
        queue.clear();
        System.out.println("Queue after clearing: " + queue);
        // Check if the queue is empty after clearing
        boolean isEmptyAfterClear = queue.isEmpty();
        System.out.println("Is the Queue empty after clearing? " + isEmptyAfterClear);
        // Add elements back to the queue
        queue.add("New Element 1");
        queue.add("New Element 2");
        System.out.println("Queue after adding new elements: " + queue);

        // Remove an element from the queue
        String removedElement = queue.remove();
        System.out.println("Removed Element: " + removedElement);

        // Display the updated queue
        System.out.println("Updated Queue: " + queue);

        // Peek at the front element of the queue
        String frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement);

        // poll an element from the queue
        String polledElement = queue.poll();
        System.out.println("Polled Element: " + polledElement);
        // Display the updated queue after polling
        System.out.println("Updated Queue after polling: " + queue);
        // Check the size of the queue
        int queueSize = queue.size();
        System.out.println("Size of Queue: " + queueSize);
        // Iterate through the queue
        System.out.println("Iterating through Queue:");
        for (String element : queue) {
            System.out.println(element);
        }
    }
}
