public class Variables {
   /*
    * what is a variable?
    * A variable is a symbolic name associated with a value and whose associated
    * value may be changed.
    * In programming, a variable is a named storage location in memory that holds a
    * value.
    * Variables allow you to store, retrieve, and manipulate data during the
    * execution of a program.
    * 
    * Types of variables:
    * 1. Instance variables: Instance variables are non-static variables defined in
    * a class.
    * Each instance of the class has its own copy of the instance variable.
    * 2. Static variables: Static variables are class-level variables that are
    * shared among all instances of the class.
    * They are defined using the static keyword and are associated with the class
    * itself rather than with any specific instance.
    * 3. Final variables: Final variables are constants that cannot be changed once
    * they are assigned a value.
    * They are defined using the final keyword and can be either instance variables
    * or static variables.
    * 4. Local variables: Local variables are variables defined within a method or
    * block of code.
    * They are only accessible within that method or block and are not visible
    * outside of it.
    * 5. Parameters: Parameters are variables that are passed to a method when it
    * is called.
    * They are used to pass data into methods and are defined in the method
    * signature.
    * 
    * why instance variable are needed to call using object in static method while
    * in non static method we can call them without object
    * In Java, instance variables are tied to a specific instance (object) of a
    * class,
    * while static methods belong to the class itself rather than any particular
    * instance. This distinction explains why instance variables need to be
    * accessed differently in static and non-static methods.
    * 
    * Key Points:
    * Static Methods:
    * 
    * A static method belongs to the class, not to any specific object.
    * It can be called without creating an instance of the class.
    * Since static methods are not tied to any instance, they cannot directly
    * access instance variables (which are tied to specific objects).
    * 
    * Why?
    * Instance variables exist only when an object is created.
    * A static method does not have any reference to an object (like this), so it
    * cannot determine which object's instance variables to access.
    * Example:
    * 
    * Non-Static Methods:
    * 
    * A non-static method is tied to a specific instance of the class.
    * It can directly access instance variables because it is implicitly associated
    * with the object that called it.
    * Inside a non-static method, the this keyword refers to the current object,
    * allowing direct access to instance variables.
    * Example:
    * 
    * Why the Difference?
    * Static Context: In a static method, there is no this reference because the
    * method is not tied to any object. Therefore, you must explicitly create an
    * object and use it to access instance variables.
    * Non-Static Context: In a non-static method, the this reference is available,
    * so the method knows which object's instance variables to access.
    * Example from Your Code:
    * In main (a static method), you need to create an object (App app = new
    * App();) to access the instance variable name.
    * In test (a non-static method), you can directly access name because the
    * method is tied to the object that called it.
    * 
    * Summary:
    * Static methods cannot directly access instance variables because they are not
    * tied to any specific object.
    * Non-static methods can directly access instance variables because they are
    * tied to the object that invoked them.
    */

   // Instance variables
   public String name = "John Doe";
   public int age = 30;
   public double salary = 50000.0;
   public char grade = 'A';
   public boolean isEmployed = true;
   public float height = 5.9f;
   public long phoneNumber = 1234567890L;
   public byte level = 1;
   public short year = 2023;

   // static variables
   public static String companyName = "Tech Corp";

   // final variables
   public final String country = "USA";

   public static void main(String[] args) {
      System.out.println("Hello, World!");
      Variables var = new Variables();
      System.out.println("Instance variable name: " + var.name);
      System.out.println("Static variable companyName: " + Variables.companyName);
      System.out.println("Final variable country: " + var.country);
   }

   public void test() {
      System.out.println("Instance variable name: " + name);
      System.out.println("Static variable companyName: " + companyName);
   }
}
