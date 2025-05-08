package ExceptionsHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CustomExceptionDemo {
    public void CustomExceptionDemoMethods() {
        try {
            File file = new File("nonexistent.txt");
            FileReader reader = new FileReader(file); // This throws FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        }
        // Catching a generic exception
        catch (Exception e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("This block always executes, regardless of exceptions.");
        }
        System.out.println("Program continues after exception handling.");
    }

    public void ThrowExplicitException() {
        try {
            // Simulating a checked exception
            throw new IOException("Simulated IO Exception");
        } catch (IOException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }
        // Catching a generic exception
        catch (Exception e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("This block always executes, regardless of exceptions.");
        }
    }

    public void ThrowExplicitExceptionAtMethod() throws IOException {
        File file = new File("nonexistent.txt");
        FileReader reader = new FileReader(file); // This throws FileNotFoundException
    }

    public static void main(String[] args) {
        CustomExceptionDemo demo = new CustomExceptionDemo();
        demo.CustomExceptionDemoMethods();
        demo.ThrowExplicitException();
    }
}
