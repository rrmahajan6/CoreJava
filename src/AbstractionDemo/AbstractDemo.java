/*
 Abstraction in Java is a process of hiding the implementation details and showing only the essential features of an object. It focuses on what an object does rather than how it does it. Abstraction is achieved in Java using abstract classes and interfaces.

Key Points about Abstraction:
Abstract Class:

A class declared with the abstract keyword.
It can have both abstract methods (methods without a body) and concrete methods (methods with a body).
Abstract classes cannot be instantiated directly.
Subclasses must provide implementations for all abstract methods unless they are also declared abstract.

Interface:

A blueprint for a class that contains only abstract methods (prior to Java 8).
From Java 8 onwards, interfaces can also have default and static methods with implementations.
A class can implement multiple interfaces, enabling multiple inheritance.
 
Advantages of Abstraction:
Improves Code Maintainability: By hiding implementation details, changes to the implementation do not affect the code that uses the abstraction.
Enhances Security: Sensitive implementation details are hidden from the user.
Promotes Reusability: Abstract classes and interfaces can be reused across different parts of the application.

An abstract class in Java hides implementation details by defining abstract methods—methods that have no body (implementation) in the abstract class itself. These methods act as a contract, specifying what a subclass must do, but not how it should do it. The actual implementation of these methods is deferred to the subclasses.

How Abstract Classes Hide Implementation Details:
Abstract Methods:

Declared using the abstract keyword.
Contain only the method signature (name, return type, and parameters) without any implementation.
Subclasses are required to provide the implementation for these methods.
 * Concrete Methods:

Abstract classes can also have concrete methods (methods with a body).
These methods provide shared functionality that subclasses can use without needing to know how they work.
 
Instantiation Restriction:

Abstract classes cannot be instantiated directly. This ensures that users cannot access incomplete implementations.

Key Takeaway:
Abstract classes hide implementation details by:

Forcing subclasses to implement abstract methods.
Providing concrete methods that encapsulate shared functionality. This ensures that the focus remains on what needs to be done, while the how is either deferred to subclasses or encapsulated in concrete methods.

Abstract classes enhance security in Java by hiding implementation details and exposing only the necessary functionality to the user. This encapsulation ensures that sensitive or complex logic is not directly accessible, reducing the risk of misuse or unintended modifications.

How Abstract Classes Enhance Security:
Hiding Implementation Details:

Abstract methods define what needs to be done but hide how it is done.
The actual implementation is provided in subclasses, and users of the abstract class cannot directly access or modify the implementation.

Restricting Instantiation:

Abstract classes cannot be instantiated directly. This prevents users from creating objects of the abstract class and accessing incomplete or sensitive functionality.

Controlled Access:

Abstract classes can define concrete methods that encapsulate shared functionality. These methods can be marked as protected or private to restrict access, ensuring that only subclasses or the class itself can use them.

Enforcing a Contract:

Abstract classes enforce a contract through abstract methods, ensuring that subclasses implement specific behavior. This prevents unauthorized or incomplete implementations.

Encapsulation of Sensitive Logic:

Abstract classes can include concrete methods that encapsulate sensitive logic, ensuring that the logic is not exposed to the user.

By hiding implementation details, restricting access, and enforcing a contract, abstract classes ensure that only authorized and controlled behavior is exposed, enhancing the overall security of the application.
*/

package AbstractionDemo;

public abstract class AbstractDemo {
    public abstract void display(); // Abstract method with no body

    public void show() { // Concrete method with a body
        System.out.println("This is a concrete method in the abstract class.");
    }

    public static void main(String[] args) {
        // AbstractDemo obj = new AbstractDemo(); // Cannot instantiate abstract class
        // obj.display(); // This will cause a compile-time error
        // obj.show(); // This will cause a compile-time error
    }
}
