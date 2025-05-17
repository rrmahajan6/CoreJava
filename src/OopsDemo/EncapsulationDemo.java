package oopsdemo;
/*Example of encapsulation in a class
Encapsulation is a fundamental concept in object-oriented programming (OOP) that restricts direct access to an object's data and methods.
It allows you to control how the data is accessed and modified, promoting data hiding and abstraction.
In Java, encapsulation is achieved using access modifiers (private, public, protected) and getter/setter methods.
By making instance variables private and providing public getter and setter methods, you can control access to the data.
This way, you can enforce validation rules, restrict access to sensitive data, and maintain the integrity of the object's state.
Encapsulation
Definition: Encapsulation is the process of bundling data (variables) and methods (functions) that operate on the data into a single unit, typically a class. It also involves restricting direct access to some of the object's components to ensure controlled interaction.
Key Features:
Use of access modifiers (private, protected, public) to control access to class members.
Provides getter and setter methods to access and modify private variables.
*/
public class EncapsulationDemo {
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age > 0) { // Basic validation
            this.age = age;
        } else {
            System.out.println("Please enter a valid age.");
        }
    }

    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setName("John Doe");
        obj.setAge(25);

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
