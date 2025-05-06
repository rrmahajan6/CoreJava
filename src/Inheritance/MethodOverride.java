package Inheritance;

public class MethodOverride extends MethodOverLoad {
    // Overriding the add method from MethodOverLoad class
    @Override
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("this method is overriden from MethodOverLoad class");
    }

    // Overriding the add method from MethodOverLoad class
    @Override
    public void add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("The sum of " + a + ", " + b + " and " + c + " is: " + sum);
        System.out.println("this method is overriden from MethodOverLoad class");
    }

    public static void main(String[] args) {
        MethodOverride obj = new MethodOverride();
        obj.add(5, 10); // Calls the overridden method
        obj.add(5, 10, 15); // Calls the overridden method
    }
    
}
