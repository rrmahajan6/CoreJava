public class Loops {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Loops loops = new Loops();
        loops.ForLoop();
        loops.WhileLoop();
        loops.DoWhileLoop();
        nestedLoops();
        enhancedForLoop();
        breakAndContinue();
    }

    public void ForLoop() {
        // For loop example
        // initialization; condition; increment/decrement
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + i);
        }
    }
    public void WhileLoop() {
        int j = 0;//initialization
        while (j < 5)// condition
        {
            System.out.println("While loop iteration: " + j);
            j++;//increment/decrement
        }
    }

    public void DoWhileLoop() {
        int k = 0;//initialization
        do {
            System.out.println("Do-while loop iteration: " + k);
            k++;//increment/decrement
        } while (k < 5);//condition
    }
    
    public static void nestedLoops() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Nested loop iteration: i=" + i + ", j=" + j);
            }
        }
    }
    // Enhanced for loop (for-each loop)
    public static void enhancedForLoop() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Enhanced for loop iteration: " + number);
        }
    }
    // Break and continue statements
    public static void breakAndContinue() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Breaking at i=" + i);
                break; // Exit the loop when i is 5
            }
            System.out.println("Loop iteration: " + i);
        }

        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                System.out.println("Continuing at j=" + j);
                continue; // Skip the rest of the loop when j is 5
            }
            System.out.println("Loop iteration: " + j);
        }
    }
    
}
