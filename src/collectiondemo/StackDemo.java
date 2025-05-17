package collectiondemo;

/*
 * A Stack in Java is a Last In, First Out (LIFO) data structure, meaning the last element added to the stack is the first one to be removed. It is part of the java.util package and extends the Vector class.

Key Features of Stack:
LIFO Behavior:

Elements are added and removed from the same end (the top of the stack).
The last element added is the first to be removed.
Methods in Stack:

push(E item): Adds an element to the top of the stack.
pop(): Removes and returns the top element of the stack.
peek(): Returns the top element without removing it.
isEmpty(): Checks if the stack is empty.
search(Object o): Returns the position of an element in the stack (1-based index).
Implements:

The Stack class implements the List interface, so it can be used like a list but with stack-specific operations.
 
Why Use a Stack in Java?
Reversing Data:

Stacks are useful for reversing strings, numbers, or other data structures.
Expression Evaluation:

Used in evaluating and converting expressions (e.g., infix to postfix).
Backtracking:

Helps in algorithms like maze solving, undo operations, or navigating browser history.
Function Call Management:

The call stack in Java uses a stack to manage method calls and returns.
Parsing:

Used in parsing expressions, syntax trees, and compilers.

Key Takeaway:
Use a Stack when you need LIFO behavior.
It is ideal for scenarios like backtracking, expression evaluation, and function call management.

*/
import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        // Create a Stack
        Stack<String> stack = new Stack<>();

        // Push elements onto the Stack
        stack.push("Element1");
        stack.push("Element2");
        stack.push("Element3");

        // Print the Stack
        System.out.println("Stack: " + stack);

        // Pop an element from the Stack
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Peek at the top element of the Stack
        String topElement = stack.peek();
        System.out.println("Top element after pop: " + topElement);

        // Check if the Stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the Stack empty? " + isEmpty);

        // Search for an element in the Stack
        int position = stack.search("Element2");
        System.out.println("Position of Element2 in the Stack: " + position);
        // Iterate through the Stack
        System.out.println("Iterating through Stack:");
        for (String item : stack) {
            System.out.println(item);
        }
        // Clear the Stack
        stack.clear();
        System.out.println("Stack after clearing: " + stack);
        // Check if the Stack is empty after clearing
        boolean isEmptyAfterClear = stack.isEmpty();
        System.out.println("Is the Stack empty after clearing? " + isEmptyAfterClear);
        // Add elements back to the Stack
        stack.push("NewElement1");
        stack.push("NewElement2");
        System.out.println("Stack after adding new elements: " + stack);
        // Check the size of the Stack
        int size = stack.size();
        System.out.println("Size of Stack: " + size);
        // Check if the Stack contains an element
        boolean containsElement1 = stack.contains("NewElement1");
        System.out.println("Stack contains NewElement1: " + containsElement1);
        // Check if the Stack contains all elements of another collection
        List<String> anotherCollection = Arrays.asList("NewElement1", "NewElement2");
        boolean containsAll = stack.containsAll(anotherCollection);
        System.out.println("Stack contains all elements of another collection: " + containsAll);
    }
}
