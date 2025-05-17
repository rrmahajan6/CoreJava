package exceptionhandler;

/*
 * A custom exception in Java is a user-defined exception class that extends the Exception class 
 * (for checked exceptions) or the RuntimeException class (for unchecked exceptions). 
 * Custom exceptions are used when you want to represent specific error conditions in your application 
 * that are not covered by Java’s built-in exceptions.
 * 
 * 
 */
    public class CustomExceptionDemo {
        public void checkAge(int age) throws MyCheckedException {
            if (age < 18) {
                throw new MyCheckedException("Age must be 18 or above.");
            }
        }
    }

