package interfacedemo;
/*
 * An interface in Java is a reference type, similar to a class, 
 * that can contain only abstract methods (methods without a body), default methods, static methods, 
 * and constants (public static final variables). Interfaces cannot be instantiated directly.
 * 
 * Why Use Interfaces?
Abstraction

Interfaces allow you to define a contract for what a class can do, without specifying how it does it.
Multiple Inheritance

Java does not support multiple inheritance with classes, but a class can implement multiple interfaces, allowing for more flexible designs.
Loose Coupling

Interfaces help decouple code, making it easier to change implementations without affecting code that uses the interface.
Polymorphism

You can use interfaces to refer to objects of different classes that implement the same interface, enabling polymorphic behavior.

Summary:
Interfaces are useful for defining a set of methods that multiple classes can implement, promoting abstraction, flexibility, and code reusability.
 */


public interface  InterfaceDemo {
    String name = "InterfaceDemo"; // public static final
    // public static final String name = "InterfaceDemo"; // public static final
    int number = 10; // public static final
    void display(); // public abstract
    // public abstract void display(); // public abstract
    default void show() { // default method
        System.out.println("This is a default method in the interface.");
    }
    static void staticMethod() { // static method
        System.out.println("This is a static method in the interface.");
    }   
}
