package oopsdemo.Inheritance;

public class AddThreeNumbers extends AddTwoNumbers {
    public void addThreeNumbers(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("The sum of " + a + ", " + b + " and " + c + " is: " + sum);
        // accessing parent class method
        addTwoNumbers(a, b);
        // accessing grandparent class method
        MathOperationsMethod();
        // accessing grandparent class static method
        number();
        // accessing child class static method
        AddTwoNumbers.number();
        // accessing grandparent class static method
        MathOperations.number();
    }

    public static void main(String[] args) {
        AddThreeNumbers obj = new AddThreeNumbers();
        obj.addThreeNumbers(5, 10, 15);
        obj.addTwoNumbers(0, 0);
        obj.MathOperationsMethod();
        MathOperations obj2 = new AddTwoNumbers();
        // MathOperations is reference type, obj2 will access only methods which are
        // declared in
        // MathOperationsMethod class
        // obj2.MathOperationsMethod();
        /*
         * In Java, when you declare a reference variable of a parent class type (in
         * this case,
         * MathOperations obj2), you can only call methods that are defined in the
         * parent class,
         * even if the actual object is of a subclass type
         * eference Type Determines Accessible Methods:
         * In Java, the methods that can be called on an object are determined by the
         * reference type,
         * not the actual object type.
         */
        // obj2.AddTwoNumbers(0, 0);
        obj2.MathOperationsMethod();
        // obj2.addThreeNumbers(0, 0, 0); // This will cause a compile-time error
    }

    public void addTwoNumbers(int a, int b) {
        // This method is not accessible here because it is not defined in the
        // MathOperations class
        // int sum = a + b;
        // System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        super.addTwoNumbers(a, b);
        number();
    }
    public static void number() {
        System.out.println("This is a static method from the AddThreeNumbers class.");
    }
}
