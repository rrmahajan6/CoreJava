package oopsdemo.Inheritance;

public class MethodOverride extends MethodOverLoad {
    // Overriding the add method from MethodOverLoad class
    @Override
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("this method is overriden from MethodOverLoad class");
        super.add(a, b); // Calling the parent class method
    }

    // Overriding the add method from MethodOverLoad class
    @Override
    public void add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("this method is overriden from MethodOverLoad class");
        super.add(a, b, c); // Calling the parent class method
    }
    public void methodNotOverridden() {
        System.out.println("This method is not overridden in the MethodOverride class.");
    }

    public static void number() {
        System.out.println("This is a static method from the MethodOverride class.");
    }
    public static void main(String[] args) {
        MethodOverride obj = new MethodOverride();
        obj.add(5, 10);
        obj.add(5, 10, 15);
        System.out.println("-----------------------------");
        MethodOverLoad obj2 = new MethodOverride();
        obj2.add(20, 30);
        obj2.add(20, 30, 40);
        System.out.println("-----------------------------");
        number(); // Calling the static method from MethodOverride class
        MethodOverLoad.number(); // Calling the static method from MethodOverLoad class
        obj.number();
        obj2.number();
        }
}
