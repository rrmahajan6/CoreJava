package interfacedemo;

public class InterfaceImplement implements InterfaceDemo, InterfacePartTwo {
    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }
    public void display() {
        System.out.println("This is the implementation of the display method.");
    }
    public void show() {
        System.out.println("This is the implementation of the show method.");
    }
    public static void main(String[] args) {
        InterfaceImplement obj = new InterfaceImplement();
        obj.add(5, 10); // Calling the add method
        obj.display(); // Calling the display method
        obj.show(); // Calling the show method

        InterfaceDemo obj2=new InterfaceImplement();
        obj2.display(); // Calling the abstract method display
        obj2.show(); // Calling the default method show
        System.out.println("InterfaceDemo name: " + InterfaceDemo.name); // Accessing the interface variable
        System.out.println("InterfaceDemo number: " + InterfaceDemo.number); // Accessing the interface variable
        InterfaceDemo.staticMethod(); // Calling the static method
        // InterfaceDemo obj3=new InterfaceImplement(); // Cannot instantiate an interface
        InterfacePartTwo obj3=new InterfaceImplement();
        obj3.add(5, 10); // Calling the abstract add method
        obj3.display(); // Calling the abstract display method
        obj3.show(); // Calling the default show method
        System.out.println("InterfacePartTwo name: " + InterfacePartTwo.name); // Accessing the interface variable
        System.out.println("InterfacePartTwo age: " + InterfacePartTwo.age); // Accessing the interface variable
    }
}
