package exceptionhandler;

/*
 * An unchecked exception in Java is an exception that is not checked at compile-time. These exceptions occur at runtime and are subclasses of RuntimeException. The compiler does not require you to handle or declare them in your code.
 * ArithmeticException (e.g., division by zero)
NullPointerException (e.g., accessing a method on a null object)
ArrayIndexOutOfBoundsException (e.g., accessing an invalid array index)
ClassCastException
IllegalArgumentException

Unchecked exceptions are usually caused by programming errors.
They can be caught using try-catch, but handling them is optional.
They are subclasses of RuntimeException.

 * 
 */
public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        // This will throw an unchecked exception
        try {
            int result = 10 / 0; // ArithmeticException: Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        } catch (ClassCastException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        } catch (Throwable e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        } finally {
            System.out.println("This block always executes, regardless of exceptions.");
        }
    }
}
