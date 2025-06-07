package oopsdemo.AbstractionDemo;

public class ConcreteDemo extends AbstractDemo {
    @Override
    public void display() { // Implementing the abstract method
        System.out.println("This is the implementation of the abstract method.");
    }

public void sample() {
        System.out.println("This is a concrete method in the ConcreteDemo class.");
    }
    public static void main(String[] args) {
        ConcreteDemo obj = new ConcreteDemo();
        obj.display(); // Calling the implemented method
        obj.show(); // Calling the concrete method from the abstract class
        AbstractDemo.staticMethod();
        AbstractDemo obj2 = new ConcreteDemo();
        obj2.display(); // Calling the implemented method through the abstract class reference
        obj2.show(); // Calling the concrete method from the abstract class through the reference
        obj2.number();
        // obj2.sample(); // This will cause a compile-time error because sample() is not defined in AbstractDemo
        }
}
