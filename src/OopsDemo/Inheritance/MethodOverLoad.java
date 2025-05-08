/**
 * Definition: Polymorphism allows objects to take on multiple forms. It enables a single interface to represent different underlying forms (data types or classes).
Types:
Compile-time Polymorphism (Method Overloading): Same method name but different parameter lists.
Runtime Polymorphism (Method Overriding): Subclass provides a specific implementation of a method defined in the parent class.
 * 
 * 
 */


package OopsDemo.Inheritance;

public class MethodOverLoad {
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }

    public void add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("The sum of " + a + ", " + b + " and " + c + " is: " + sum);
    }

    public static void main(String[] args) {
        MethodOverLoad obj = new MethodOverLoad();
        obj.add(5, 10);
        obj.add(5, 10, 15);
    }
}
