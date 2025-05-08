package ExceptionsHandler;

public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        // This will throw an unchecked exception
        int result = 10 / 0; // ArithmeticException: Division by zero
        System.out.println("Result: " + result);// This line will not be executed, as the exception will terminate the program
    }
    }
