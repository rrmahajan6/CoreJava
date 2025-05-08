package OopsDemo.AbstractionDemo;

public class ConcreteDemo extends AbstractDemo {
    @Override
    public void display() { // Implementing the abstract method
        System.out.println("This is the implementation of the abstract method.");
    }

    public static void main(String[] args) {
        ConcreteDemo obj = new ConcreteDemo();
        obj.display(); // Calling the implemented method
        obj.show(); // Calling the concrete method from the abstract class
    }
}
