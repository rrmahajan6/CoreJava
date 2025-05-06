package Inheritance;

public class MethodOverLoad {
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }

    public void add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("The sum of " + a + ", " + b + " and " + c + " is: " + sum);
    }

    public static void main(String[] args) {
        MethodOverLoad obj = new MethodOverLoad();
        obj.add(5, 10);
        obj.add(5, 10, 15);
    }
}
