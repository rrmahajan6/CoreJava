public class Demo {
    /**
     * The difference between a for loop and an enhanced for loop in Java lies in their syntax, use cases, and how they iterate over elements:

For Loop
Syntax: The traditional for loop requires you to explicitly define the loop variable, its starting value, the condition for termination, and the increment/decrement step.
Use Case: It is more flexible and can be used for a variety of scenarios, such as iterating over arrays, performing operations with custom conditions, or skipping elements.
     * 
     * 
     * 
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Demo loops = new Demo();
        // loops.simpleForLoop();
        loops.enhancedForLoop();
    }
    public void simpleForLoop(){
        //we work on index to fetch the elements
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + numbers[i]);
        }
    }
    public void enhancedForLoop() {
        //we work on elements to fetch the elements
        int[] numbers = {9, 8, 7, 6, 5};
        for (int number : numbers) {
            System.out.println("Enhanced for loop iteration: " + number);
        }
    }
}
