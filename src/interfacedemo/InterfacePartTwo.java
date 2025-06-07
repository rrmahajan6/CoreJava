package interfacedemo;

public interface  InterfacePartTwo {
    String name = "InterfacePartTwo"; // Implicitly public, static, and final
    int age = 30; // Implicitly public, static, and final
    // Abstract method
    void add(int a, int b); // Implicitly public and abstract
    void display();

    // Default method
    default void show() {
        System.out.println("This is a default method in the interface.");
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method in the interface.");
    }
}
