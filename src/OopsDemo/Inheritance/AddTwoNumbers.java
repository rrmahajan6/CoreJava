package OopsDemo.Inheritance;

public class AddTwoNumbers extends MathOperations {
    public void addTwoNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        MathOperationsMethod();
        // cannot access methods from child class
        // addThreeNumbers(a, b, 0); // Calling the method from AddThreeNumbers class
    }
    public static void number() {
        System.out.println("This is a static method from the AddTwoNumbers class.");
    }
}
