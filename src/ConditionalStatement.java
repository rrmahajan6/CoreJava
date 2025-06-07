
public class ConditionalStatement {
    /*
     * Conditional statements in Java are used to perform different actions based on
     * different conditions.
     * They allow the program to make decisions and execute specific blocks of code
     * depending on whether a condition evaluates to true or false.
     * The main types of conditional statements in Java are:
     * 1. if statement: The if statement is used to execute a block of code if a
     * specified condition is true.
     * 2. if-else statement: The if-else statement is used to execute one block of
     * code if a condition is true and another block of code if it is false.
     * 3. else-if statement: The else-if statement is used to check multiple
     * conditions. It allows you to specify a new condition if the previous
     * condition is false.
     * 4. switch statement: The switch statement is used to execute one block of
     * code among many alternatives based on the value of a variable or expression.
     * 5. ternary operator: The ternary operator is a shorthand for the if-else
     * statement. It takes three operands and returns one of two values based on a
     * condition.
     */
    public static void main(String[] args) {
        System.out.println(App.Color.Rahul);
        int number = 10;

        // if statement
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // if-else statement
        if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is non-negative.");
        }

        // switch statement
        switch (number) {
            case 1:
                System.out.println("The number is one.");
                break;
            case 2:
                System.out.println("The number is two.");
                break;
            default:
                System.out.println("The number is neither one nor two.");
                break;
        }
        // ternary operator
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is " + result + ".");
        // nested if statement
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("The number is positive and even.");
            } else {
                System.out.println("The number is positive and odd.");
            }
        } else {
            System.out.println("The number is not positive.");
        }
        // if-else if statement
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
